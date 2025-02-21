package SingletonPattern.test.Singleton;

import SingletonPattern.Logger;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {
    @Test
    public void testSingletonInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both instances are the same
        assertSame(logger1, logger2, "Both instances should be the same.");
    }

    @Test
    public void testLogMethods() {
        Logger logger = Logger.getInstance();

        // Test debug method
        logger.debug("Test debug message.");

        // Test info method
        logger.info("Test info message.");

        // Test warn method
        logger.warn("Test warn message.");

        // Test error method
        logger.error("Test error message.");
    }
}
