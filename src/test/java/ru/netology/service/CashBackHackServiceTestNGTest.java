package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashBackHackServiceTestNGTest {

    @Test
    public void testRemainWhenAmountIs900() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs1100() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }
}