package org.example.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceTest {
    CalculatorService calculatorService;
    @BeforeAll
    static void init(){
        System.out.println("This is the beforeAll method");
    }
    @BeforeEach
    void setUp() {
        // runs before EACH test
        calculatorService = new CalculatorService();
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() {
        // runs after EACH test
        calculatorService = null;
        System.out.println("After each test");
    }
    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "4, 5, 9",
            "10, 20, 30"
    })
    void addTwoNumbersTest(int a, int b, int expected) {
        int result = calculatorService.addTwoNumbers(a, b);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void addTwoNumbersTest(){
        int result = calculatorService.addTwoNumbers(2,3);
        int expectedResult = 5;
        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    void  multiplyTwoNumbersTest(){
        int result = calculatorService.multiplyTwoNumbers(4,5);
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult,result);

    }
    @AfterAll
    static void cleanup(){
        System.out.println("I am the afterAll method");
    }
}
