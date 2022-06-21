package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Class for testing Liquid.java
 *
 * @author ott
 */
public class LiquidTest {
    private Liquid liquid;

    @BeforeEach
    public void setup() {
        liquid =  new Liquid("Liquid", 1, 10);
    }

    /**
     * test if the methode getName works as intended
     */
    @Test
    public void simpleGetNameTest() {
        Assertions.assertEquals("Liquid", liquid.getName());
    }

    /**
     * test if the methode getName works as intended
     */
    @Test
    public void simpleSetNameTest() {
        liquid.setName("newLiquid");
        Assertions.assertEquals("newLiquid", liquid.getName());
    }

    /**
     * test if the methode getVolume works as intended
     */
    @Test
    public void simpleGetVolumeTest() {
        Assertions.assertEquals(1, liquid.getVolume());
    }

    /**
     * test if the methode getVolume works as intended
     */
    @Test
    public void simpleSetVolumeTest() {
        liquid.setVolume(12);
        Assertions.assertEquals(12, liquid.getVolume());
    }

    /**
     * test if the methode getAlcoholPercent works as intended
     */
    @Test
    public void simpleGetAlcoholPercentTest() {
        Assertions.assertEquals(10, liquid.getAlcoholPercent());
    }

    /**
     * test if the methode getAlcoholPercent works as intended
     */
    @Test
    public void simpleSetAlcoholPercentTest() {
        liquid.setAlcoholPercent(15);
        Assertions.assertEquals(15, liquid.getAlcoholPercent());
    }
}
