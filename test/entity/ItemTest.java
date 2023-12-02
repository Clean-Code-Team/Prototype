package entity;

import org.junit.jupiter.api.*;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    private final Item sample = new Item(0,0);

    @Test
    @DisplayName("setStripe Color Test")
    void test_setSprite() {
        // if(type < 0.2) -> expected: GREEN color
        sample.setSprite(0.19);
        assertEquals(sample.getColor(), Color.GREEN);

        // if(type < 0.4) -> expected: GRAY color
        sample.setSprite(0.39);
        assertEquals(sample.getColor(), Color.GRAY);

        // if(type < 0.5) -> expected: BLUE color
        sample.setSprite(0.49);
        assertEquals(sample.getColor(), Color.BLUE);

        // if(type < 0.6) -> expected: magenta color
        sample.setSprite(0.59);
        assertEquals(sample.getColor(), Color.magenta);

        // else -> expected: YELLOW color
        sample.setSprite(0.6);
        assertEquals(sample.getColor(), Color.YELLOW);
    }
}
