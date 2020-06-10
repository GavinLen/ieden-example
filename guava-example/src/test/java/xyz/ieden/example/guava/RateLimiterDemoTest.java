package xyz.ieden.example.guava;

import com.google.common.util.concurrent.RateLimiter;
import org.junit.Test;

public class RateLimiterDemoTest {

    @Test
    public void test() throws InterruptedException {
        RateLimiter rateLimiter = RateLimiter.create(1);
        for (int i = 1; i < 100; i++) {
            double waitTime = rateLimiter.acquire(i);
            System.out.println("cutTime=" + System.currentTimeMillis() + " acq:" + i + " waitTime:" + waitTime);
            Thread.sleep(1000);
        }
    }

}