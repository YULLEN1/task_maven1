package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    void shouldCalculateForSmallNumbers(int income, int expenses, int threshold, int expected) {
        MoneyService service = new MoneyService();
        // int income = 10_000;
        // int expenses = 3_000;
        // int threshold = 20_000;
        // int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    //@Test
    // void shouldCalculateForBigNumbers() {
    //    MoneyService service = new MoneyService();
    //    int income = 100_000;
    //    int expenses = 60_000;
    //    int threshold = 150_000;
    //    int expected = 2;

    // вызываем целевой метод:
    //    int actual = service.calculate(income, expenses, threshold);

    // производим проверку (сравниваем ожидаемый и фактический):
    //    Assertions.assertEquals(expected, actual);
    //}
}
