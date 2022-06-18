package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Class for testing DrinkQueue.java
 *
 * @author bence
 * @author
 */
public class DrinkQueueTest {
    private DrinkQueue queue;
    private SimpleDrink drink1;

    private SimpleDrink drink2;

    @BeforeEach
    public void setup() {
        queue = new DrinkQueue(5);
        drink1 = new SimpleDrink("Drink1", new Liquid("Liquid1", 1, 10));
        drink2 = new SimpleDrink("Drink2", new Liquid("Liquid2", 2, 20));
    }

    /**
     * offer method is tested
     */
    @Test
    public void trueOfferTest() {
        Assertions.assertTrue(queue.offer(drink1));
    }
    /**
     * offer method is tested with too many offers
     */
    @Test
    public void overkillOfferTest() {
        queue.offer(drink1);
        queue.offer(drink1);
        queue.offer(drink1);
        queue.offer(drink1);
        queue.offer(drink1);
        Assertions.assertFalse(queue.offer(drink2));
    }
    /**
     * poll method is tested by trying to poll nothing
     */
    @Test
    public void nothingPollTest() {
        Assertions.assertNull(queue.poll());
    }

    /**
     * poll method is tested by polling a drink from queue
     */
    @Test
    public void somethingPollTest() {
        queue.offer(drink1);
        Assertions.assertEquals(drink1, queue.poll());
    }
}
