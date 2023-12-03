import engine.GameState;
import entity.Coin;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class shipColorTest {
    @Test
    void setColor() {
        ArrayList<GameState> gameStates = new ArrayList<GameState>();
        for (int i = 0; i < 3; i++) {
            gameStates.add(new GameState(1, 0, new Coin(0, 0),
                    0, 0, 0, false, Color.WHITE,
                    "B U Y", null, null, 99));
            gameStates.get(i).setPlayerColor();
        }
        Color color = gameStates.get(0).getShipColor();
        boolean isTrue = false;
        for (int j = 1; j < 3; j++)
            if (!gameStates.get(j).getShipColor().equals(color)) isTrue = true;
        assertTrue(isTrue);
    }
}