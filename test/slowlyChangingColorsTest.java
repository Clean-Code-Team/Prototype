import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import java.time.LocalTime;

public class slowlyChangingColorsTest {

    // ------------------------------ ORIGINAL METHODS ------------------------------ //

    private Color slowlyChangingColors(String color) {
		String sec = Integer.toString(LocalTime.now().getSecond());
		char c = sec.charAt(sec.length() - 1);
		if (color == "GREEN") {
			if (c == '0') return new Color(0, 75, 0);
			if (c == '1') return new Color(0, 100, 0);
			if (c == '2') return new Color(0, 125, 0);
			if (c == '3') return new Color(0, 150, 0);
			if (c == '4') return new Color(0, 175, 0);
			if (c == '5') return new Color(0, 205, 0);
			if (c == '6') return new Color(0, 225, 0);
			if (c == '7') return new Color(0, 254, 0);
			if (c == '8') return new Color(0, 55, 0);
			if (c == '9') return new Color(0, 65, 0);
		}
		if (color == "GRAY") {
			if (c == '0') return new Color(75, 75, 75);
			if (c == '1') return new Color(85, 85, 85);
			if (c == '2') return new Color(105, 105, 105);
			if (c == '3') return new Color(130, 130, 130);
			if (c == '4') return new Color(155, 155, 155);
			if (c == '5') return new Color(180, 180, 180);
			if (c == '6') return new Color(205, 205, 205);
			if (c == '7') return new Color(225, 225, 225);
			if (c == '8') return new Color(55, 55, 55);
			if (c == '9') return new Color(65, 65, 65);
		}
		if (color == "RANDOM") {
			Color[] rndColors = new Color[] {
				new Color(240, 240, 60), new Color(140, 140, 230), 
				new Color(45, 230, 240), new Color(45, 50, 240), 
				new Color(120, 240, 10), new Color(100, 60, 160), 
				new Color(230, 240, 240), new Color(240, 150, 50), 
				new Color(150, 50, 230), new Color(230, 50, 150)};
			return rndColors[Character.getNumericValue(c)];
		}
		return Color.WHITE;
	}



    // ---------- LIBRARY TEST ---------- //

    @Test
    public void library_test() {
        assertEquals(1 + 1, 2);
    }



    // ------------------------- UNIT TEST -------------------------

    @Test
    public void green_color_test() {
		if (slowlyChangingColors("GREEN").getGreen() < 55 || 
		slowlyChangingColors("GREEN").getGreen() == 255) {
			assertEquals(1, 2);
		}
		else {
			assertEquals(1, 1);
		}
	}

	@Test
    public void gray_color_test() {
		if (slowlyChangingColors("GRAY").getGreen() < 55 || 
		slowlyChangingColors("GRAY").getGreen() > 225) {
			assertEquals(1, 2);
		}
		else {
			assertEquals(1, 1);
		}
	}

	@Test
	public void random_color_test() {
		if (slowlyChangingColors("RANDOM").getRed() < 45 || 
		slowlyChangingColors("RANDOM").getRed() > 240) { assertEquals(1, 2); }
		if (slowlyChangingColors("RANDOM").getGreen() < 50 || 
		slowlyChangingColors("RANDOM").getGreen() > 240) { assertEquals(1, 2); }
		if (slowlyChangingColors("RANDOM").getBlue() < 10 || 
		slowlyChangingColors("RANDOM").getBlue() > 240) { assertEquals(1, 2); }
	}

}
