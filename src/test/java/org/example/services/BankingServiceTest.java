package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankingServiceTest {
    @Test
    void divideTwoNumbersTest(){
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> BankingService.divideTwoNumber(23, 0)
        );

    }
}
