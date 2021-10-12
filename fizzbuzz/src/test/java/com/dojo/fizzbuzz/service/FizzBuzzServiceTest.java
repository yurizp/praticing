package com.dojo.fizzbuzz.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    private FizzBuzzPrintService service;

    public FizzBuzzServiceTest() {
        this.service = new FizzBuzzPrintService();
    }

    @ParameterizedTest(name = "Test Fizz when divisible by three is {0}.")
    @ValueSource(ints = {3,9,21,6})
    public void shouldReturnFizzWhenDivisibleByThree(int divisibleByThree){
        String printNumber = service.getNumber(divisibleByThree);
        assertEquals("Fizz", printNumber);
    }

    @ParameterizedTest(name = "Test Fizz when divisible by five is {0}.")
    @ValueSource(ints = {5,10,50})
    public void shouldReturnFizzWhenDivisibleByFive(int divisibleByFive){
        String printNumber = service.getNumber(divisibleByFive);
        assertEquals("Buzz",printNumber);
    }

    @ParameterizedTest(name = "Test FizzBuzz when divisible by five and three is {0}.")
    @ValueSource(ints = {15,30})
    public void shouldReturnBuzzFizzWhenDivisibleByFiveAndThree(int divisibleByFiveAndThree){
        String printNumber = service.getNumber(divisibleByFiveAndThree);
        assertEquals("FizzBuzz",printNumber);
    }

    @ParameterizedTest(name = "Test Fizz when exists a 3 in it {0}.")
    @ValueSource(ints = {23,73,63})
    public void shouldReturnFizzWhenExistsNumberThreeInIt(int divisibleByThree){
        String printNumber = service.getNumber(divisibleByThree);
        assertEquals("Fizz",printNumber);
    }

    @ParameterizedTest(name = "Test Fizz when exists a 3 in it {0}.")
    @ValueSource(ints = {25,52,59})
    public void shouldReturnFizzWhenExistsNumberFiveInIt(int divisibleByThree){
        String printNumber = service.getNumber(divisibleByThree);
        assertEquals("Buzz",printNumber);
    }

    @ParameterizedTest(name = "Test Fizz when exists a 3 and 5 in it {0}.")
    @ValueSource(ints = {35,53,253})
    public void shouldReturnFizzWhenExistsNumberThreeAndFiveInIt(int divisibleByThree){
        String printNumber = service.getNumber(divisibleByThree);
        assertEquals("FizzBuzz",printNumber);
    }

}
