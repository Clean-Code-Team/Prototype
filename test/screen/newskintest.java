package screen;


import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertSame;

class newskintest {

    @Test
    void upgradeSkin() {
        for (int score = 0; score < 7000; score += 200) {
            if (score > 5000)
                assertSame(scoreNewColor(score), Color.ORANGE);
            else if (score > 3000)
                assertSame(scoreNewColor(score), Color.MAGENTA);
            else if (score > 1000) {
                assertSame(scoreNewColor(score), Color.GREEN);
            }
        }
    }

    public Color scoreNewColor(int score) {
        if (score > 5000)
            return Color.ORANGE;
        else if (score > 3000)
            return Color.MAGENTA;
        else if (score > 1000)
            return Color.GREEN;

        return null;
    }
}