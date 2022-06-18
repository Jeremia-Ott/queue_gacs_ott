package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class StringQueueTest {
    private IQueue queue;

    @BeforeEach
    public void setup() {
        queue = new StringQueue(5);
    }

    /**
     * tests a simple case of remove
     * also test if the Drink got removed from the queue
     */
    @Test
    public void simpleRemoveTest(){
        var msg = "hello world";
        queue.offer(msg);
        Assertions.assertEquals(msg, queue.remove());
        Assertions.assertNull(queue.peek());
    }

    /**
     * tests if remove throws an exception if the queue is empty
     */
    @Test
    public void nullRemoveTest(){
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }

    /**
     * tests a simple case of peek
     */
    @Test
    public void simplePeekTest(){
        var msg = "hello world";
        queue.offer(msg);
        Assertions.assertEquals(msg, queue.peek());
    }

    /**
     * tests if peek return null if queue is empty
     */
    @Test
    public void nullPeekTest(){
        Assertions.assertNull(queue.peek());
    }

    /**
     * tests a simple case of element
     */
    @Test
    public void simpleElementTest(){
        var msg = "hello world";
        queue.offer(msg);
        Assertions.assertEquals(msg, queue.element());
    }


    /**
     * tests if element throws an exception if the queue is empty
     */
    @Test
    public void nullElementTest(){
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
    }
}
