package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;

public class DrinkQueueTest {
    private DrinkQueue queue;

    @BeforeEach
    public void setup() {
        queue = new DrinkQueue(5);
    }
}
