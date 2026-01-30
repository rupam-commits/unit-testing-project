package org.example.services;

public class BankingService {
    static int divideTwoNumber(int a , int b) {
        if(b==0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return a/b;
    }
}
