package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.montsOfRestServic;

public class monthsOfRestServicTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")
    public void testmonthsOfrRst(int expected, int threshold, int income, int expense) {
        montsOfRestServic service = new montsOfRestServic();

        int actual = service.calculate(threshold, income, expense);

        Assertions.assertEquals(expected, actual);
    }

}
