package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Class for testing Drink.java
 *
 * @author ott
 */
public class DrinkTest {
    private Drink drink;

    @BeforeEach
    public void setup() {
        drink = new SimpleDrink("Drink", new Liquid("Liquid1", 1, 10));
    }

    /**
     * test if the methode getName works as intended
     */
    @Test
    public void simpleGetNameTest() {
        Assertions.assertEquals("Drink", drink.getName());
    }

    /**
     * test if the methode getName works as intended
     */
    @Test
    public void simpleSetNameTest() {
        drink.setName("newDrink");
        Assertions.assertEquals("newDrink", drink.getName());
    }
}
