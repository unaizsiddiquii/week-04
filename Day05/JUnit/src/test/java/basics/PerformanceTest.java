package basics;

import com.Performance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void longRunningTaskTest() throws InterruptedException {

        Assertions.assertTrue(Performance.longRunningTask());

    }
}
