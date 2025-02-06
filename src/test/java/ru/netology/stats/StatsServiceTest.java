package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        long actual = service.calculateAvg(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldSumMaxMonth() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.sumMaxMonth(maxMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSumMinMonth() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.sumMinMonth(minMonth);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAmountMonthUnderAvg() {
        StatsService service = new StatsService();
        long[] amountMonthUnderAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.amountMonthUnderAvg(amountMonthUnderAvg);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAmountMonthOverAvg() {
        StatsService service = new StatsService();
        long[] amountMonthOverAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.amountMonthOverAvg(amountMonthOverAvg);

        assertEquals(expected, actual);
    }
}
