package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringQueueTest {
    private StringQueue queue;

    @BeforeEach
    public void setup() {
        queue = new StringQueue(5);
    }
    /**
     * offer method is tested
     */
    @Test
    public void trueOfferTest() {
        Assertions.assertTrue(queue.offer("blabla"));
    }
    /**
     * offer method is tested with too many offers
     */
    @Test
    public void overkillOfferTest() {
        queue.offer("drink1");
        queue.offer("drink1");
        queue.offer("drink1");
        queue.offer("drink1");
        queue.offer("drink1");
        Assertions.assertFalse(queue.offer("drink2"));
    }
    /**
     * poll method is tested by trying to poll nothing
     */
    @Test
    public void nothingPollTest() {
        Assertions.assertNull(queue.poll());
    }
    /**
     * poll method is tested by polling a String from queue
     */
    @Test
    public void somethingPollTest() {
        queue.offer("drink1");
        Assertions.assertEquals("drink1", queue.poll());
    }
}
