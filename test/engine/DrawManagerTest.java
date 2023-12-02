package engine;

import entity.Coin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import screen.GameScreen;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DrawManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDrawGhost() { //448 520
        Color testColor = Color.ORANGE;
        GameState gameState = new GameState(1, 0, new Coin(0, 0),
                3, 0, 0, false, Color.blue,
                "B U Y", null,null, 99);
        DrawManager.getInstance().drawGhost(false, 0, testColor);
        Color shipColor = gameState.getShipColor();

        assertEquals(testColor, shipColor);
    }

    @Test
    void testDrawGhost_2p() {
    }
}