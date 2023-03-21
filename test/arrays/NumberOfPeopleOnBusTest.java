package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfPeopleOnBusTest {

    NumberOfPeopleOnBus peopleOnBus;
    @BeforeEach
    void setUp() {
        peopleOnBus = new NumberOfPeopleOnBus();
    }

    @Test
    @DisplayName("Should return 5 people")
    void shouldReturnFivePeople() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, peopleOnBus.countPassengerMapToInt(list));
    }

    @Test
    public void test1() {
        ArrayList<int[]> list = generateList();
        assertEquals(solve(list),peopleOnBus.countPassengerMapToInt(list));
    }
    @Test
    public void test2() {
        ArrayList<int[]> list = generateList();
        assertEquals(solve(list),peopleOnBus.countPassengerMapToInt(list));
    }
    @Test
    public void test3() {
        ArrayList<int[]> list = generateList();
        assertEquals(solve(list),peopleOnBus.countPassengerMapToInt(list));
    }
    @Test
    public void test4() {
        ArrayList<int[]> list = generateList();
        assertEquals(solve(list),peopleOnBus.countPassengerMapToInt(list));
    }
    @Test
    public void test5() {
        ArrayList<int[]> list = generateList();
        assertEquals(solve(list),peopleOnBus.countPassengerMapToInt(list));
    }

    private ArrayList<int[]> generateList()
    {
        Random _random = new Random();
        ArrayList<int[]> myList = new ArrayList<int[]>();
        int totalNumber = 0;
        int[] firstStation = new int[] {_random.nextInt(26)+5, 0};
        myList.add(firstStation);
        totalNumber = firstStation[0];
        for (int i = 0; i < _random.nextInt(14)+1; i++)
        {
            int[] station = new int[] {_random.nextInt(11), _random.nextInt(totalNumber)};
            totalNumber = totalNumber + station[0] - station[1];
            myList.add(station);
        }
        return myList;
    }

    private int solve(ArrayList<int[]> list) {
        int x = 0;
        for (int[] item : list) {
            x+=item[0]-item[1];
        }
        return x;
    }
}