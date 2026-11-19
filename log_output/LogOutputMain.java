import java.time.ZonedDateTime;
import java.util.UUID;

void main() throws InterruptedException {
    final var str = UUID.randomUUID().toString();

    while (true) {
        System.out.println(ZonedDateTime.now() + ": " + str);

        Thread.sleep(5000);
    }
}
