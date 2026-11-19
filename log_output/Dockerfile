# syntax=docker/dockerfile:1

FROM eclipse-temurin:25
WORKDIR /app
COPY /LogOutputMain.java LogOutputMain.java

EXPOSE 8080
ENTRYPOINT ["java", "LogOutputMain.java"]
