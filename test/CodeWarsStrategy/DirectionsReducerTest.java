package CodeWarsStrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DirectionsReducerTest {
    DirectionsReducer reducer;
    @BeforeEach
    void setUp() {
        reducer = new DirectionsReducer();
    }

    @Test
    void dirReduc() {
        var input = new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"};
        assertArrayEquals(new String[]{}, DirectionsReducer.dirReduc(input));
        System.out.println(Arrays.toString(DirectionsReducer.dirReduc(input)));
    }

    @Test
    public void testSimpleDirReduc() {
        var input = new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        assertArrayEquals(new String[]{"WEST"}, DirectionsReducer.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        System.out.println(Arrays.toString(DirectionsReducer.dirReduc(input)));
    }

    @Test
    public void northWestSoutEast() {
        var input = new String[] {"NORTH", "WEST", "SOUTH", "EAST"};
        assertArrayEquals(new String[] {"NORTH", "WEST", "SOUTH", "EAST"},  DirectionsReducer.dirReduc(input));
        System.out.println(Arrays.toString(DirectionsReducer.dirReduc(input)));
    }
}