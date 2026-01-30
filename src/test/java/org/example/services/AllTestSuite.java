package org.example.services;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        BankingServiceTest.class,
        CalculatorServiceTest.class
})
public class AllTestSuite {
}
