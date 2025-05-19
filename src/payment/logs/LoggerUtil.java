package payment.logs;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class LoggerUtil {
    private static final String LOG_FILE = "payment_logs.log";

    public static void log(String message) {
        try ( FileWriter fw = new FileWriter(LOG_FILE, true)) {
            fw.write(LocalDateTime.now() + " - " + message + "\n");

        }
        catch (IOException e) {
            System.out.println("Failed to write log" + e.getMessage());
        }
    }
}