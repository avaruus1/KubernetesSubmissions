package io._0551.theproject

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 8080

    embeddedServer(Netty, port = port, host = "0.0.0.0", module = { module(port) })
        .start(wait = true)
}

fun Application.module(port: Int) {
    configureHtmlDsl()
    configureRouting()

    monitor.subscribe(ApplicationStarted) {
        println("Server started in port $port")
    }
}
