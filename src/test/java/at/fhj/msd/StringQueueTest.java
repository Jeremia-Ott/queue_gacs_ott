package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;

public class StringQueueTest {
    private StringQueue queue;

    @BeforeEach
    public void setup() {
        queue = new StringQueue(5);
    }
}
