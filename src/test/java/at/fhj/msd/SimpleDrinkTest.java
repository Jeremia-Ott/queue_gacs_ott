package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Class for testing SimpleDrink.java
 *
 * @author ott
 */
public class SimpleDrinkTest {
    private SimpleDrink simpleDrink;

    @BeforeEach
    public void setup() {
        simpleDrink = new SimpleDrink("Drink", new Liquid("Liquid1", 1, 10));
    }

    /**
     * test if the methode getVolume works as intended
     */
    @Test
    public void simpleGetVolumeTest() {
        Assertions.assertEquals(1, simpleDrink.getVolume());
    }

    /**
     * test if the methode getAlcoholPercent works as intended
     */
    @Test
    public void simpleGetAlcoholPercentTest() {
        Assertions.assertEquals(10, simpleDrink.getAlcoholPercent());
    }

    /**
     * test if the methode isAlcoholic returns true as intended
     */
    @Test
    public void trueIsAlcoholicTest() {
        Assertions.assertTrue(simpleDrink.isAlcoholic());
    }

    /**
     * test if the methode isAlcoholic returns false as intended
     */
    @Test
    public void falseIsAlcoholicTest() {
        simpleDrink = new SimpleDrink("Drink", new Liquid(
                "Liquid1", 1, 0));
        Assertions.assertFalse(simpleDrink.isAlcoholic());
    }


}
