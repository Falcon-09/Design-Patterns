package SingletonPattern.test.Singleton;

import SingletonPattern.Logger;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class MultiThreadedLoggerTest {
    @Test
    public void testMultiThreadedAccess() throws InterruptedException {
        final int numThreads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        Set<Logger> instanceSet = Collections.synchronizedSet(new HashSet<>());

        // Create a Runnable task that accesses the Logger instance
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            instanceSet.add(logger); // Store instance
            logger.debug("Debug log from thread: " + Thread.currentThread().getName());
        };

        // Submit tasks to the executor
        for (int i = 0; i < numThreads; i++) {
            executorService.submit(task);
        }

        // Shutdown the executor and wait for all tasks to complete
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        // Verify that only one instance of Logger was created
        assertEquals(1, instanceSet.size(), "All threads should get the same Logger instance.");
    }
}
