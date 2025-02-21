package SingletonPattern;

public class Logger {
    // Private constructor to prevent instantiation
    private Logger() {
        // Initialize logger configuration (e.g., file, console, etc.)
        System.out.println("Logger instance created.");
    }
    // Bill Pugh Singleton Implementation
    private static class LoggerHelper {
        private static final Logger INSTANCE = new Logger();
    }
    // Global access point
    public static Logger getInstance() {
        return LoggerHelper.INSTANCE;
    }
    // Log a debug message
    public void debug(String message) {
        System.out.println("[DEBUG] " + message);
    }

    // Log an info message
    public void info(String message) {
        System.out.println("[INFO] " + message);
    }

    // Log a warning message
    public void warn(String message) {
        System.out.println("[WARN] " + message);
    }

    // Log an error message
    public void error(String message) {
        System.out.println("[ERROR] " + message);
    }
}
