package SingletonPattern.test.Singleton;

import SingletonPattern.Logger;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class MultiThreadedLoggerTest {
    @Test
    public void testMultiThreadedAccess() throws InterruptedException {
        final int numThreads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        // Create a Runnable task that accesses the Logger instance
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.debug("Debug log from thread: " + Thread.currentThread().getName());
            logger.info("Info log from thread: " + Thread.currentThread().getName());
            logger.warn("Warn log from thread: " + Thread.currentThread().getName());
            logger.error("Error log from thread: " + Thread.currentThread().getName());
        };

        // Submit tasks to the executor
        for (int i = 0; i < numThreads; i++) {
            executorService.submit(task);
        }

        // Shutdown the executor and wait for all tasks to complete
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // Verify that only one instance of Logger was created
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertSame(logger1, logger2, "Both instances should be the same.");
    }
}
