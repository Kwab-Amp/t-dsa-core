package CodeWarsStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbToHexTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void rgb() {
        assertEquals("000000", RgbToHex.rgb(0, 0, 0));
    }

    @Test
    void padding() {
        assertEquals("010203", RgbToHex.rgb(1, 2, 3));
    }

    @Test
    void alpha() {
        assertEquals("FFFFFF", RgbToHex.rgb(255, 255, 255));
        assertEquals("FEFDFC", RgbToHex.rgb(254, 253, 252));
    }

    @Test
    void negatives() {
        assertEquals("00FF7D", RgbToHex.rgb(-20, 275, 125));
    }
}