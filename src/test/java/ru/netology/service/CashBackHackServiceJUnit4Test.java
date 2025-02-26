package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashBackHackServiceJUnit4Test {

    @Test
    public void testRemainWhenAmountIs900() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenAmountIs1100() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }
}