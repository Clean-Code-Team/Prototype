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
        BufferedImage backBuffer = new BufferedImage(448, 520, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = backBuffer.createGraphics();

        Color testColor = Color.ORANGE;
        GameState gameState = new GameState(1, 0, new Coin(0, 0), 3, 0, 0, false, testColor, "B U Y", null,null, 99);
        Color shipColor = gameState.getShipColor();
        DrawManager.getInstance().ghostPostionX = 50;
        DrawManager.getInstance().ghostPostionY = 50;
        DrawManager.getInstance().drawGhost(false, 0, testColor);
        int color = backBuffer.getRGB(DrawManager.getInstance().ghostPostionX, DrawManager.getInstance().ghostPostionY);
        Color ghostColor = new Color(color);
        assertEquals(testColor, shipColor);
    }

    @Test
    void testDrawGhost_2p() {
    }
}