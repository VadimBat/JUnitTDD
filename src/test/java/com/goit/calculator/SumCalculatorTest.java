package com.goit.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class SumCalculatorTest {
    private SumCalculator calculator;

    //Given
    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    void testThatSumWorksCorrectOnValueOne() {

        //When
        int actual = calculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrectOnValueThree() {

        //When
        int actual = calculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrectOnValueZero() {

        //When & Then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.sum(0)
        );
    }

    @Test
    void testThatSumWorksCorrect() {

        //When
        Map<Integer, Integer> testCases = new HashMap<>();
        testCases.put(37, 703);
        testCases.put(56, 1596);
        testCases.put(137, 9453);
        testCases.put(1215, 738720);

        //Then
        testCases.forEach((actual, expected) -> {
            Assertions.assertEquals(
                    expected,
                    calculator.sum(actual));
        });
    }
}
