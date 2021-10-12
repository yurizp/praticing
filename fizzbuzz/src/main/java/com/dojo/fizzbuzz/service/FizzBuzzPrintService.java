package com.dojo.fizzbuzz.service;

import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FizzBuzzPrintService {

    private SortedSet<IPrinterNumeber> printerNumeberList;

    public FizzBuzzPrintService() {
        this.printerNumeberList = new TreeSet<>();
        this.printerNumeberList.add(new PrinterDivisibleByNumber(3, "Fizz"));
        this.printerNumeberList.add(new PrinterDivisibleByNumber(5, "Buzz"));
    }

    public String getNumber(int number) {
        return printerNumeberList.stream()
                .filter(printer -> printer.isPrintable(number))
                .map(printer -> printer.text(number))
                .collect(Collectors.joining());
    }
}

class PrinterDivisibleByNumber implements IPrinterNumeber{

    private Integer number;
    private String printText;

    public PrinterDivisibleByNumber(Integer number, String printText) {
        this.number = number;
        this.printText = printText;
    }

    @Override
    public boolean isPrintable(int number) {
        return (number % this.number == 0 || String.valueOf(number).contains(String.valueOf(this.number)));
    }

    @Override
    public String text(int number) {
        return printText;
    }

    @Override
    public int compareTo(Object o) {
        var object = (PrinterDivisibleByNumber) o;
            return number - object.getNumber();
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrinterDivisibleByNumber that = (PrinterDivisibleByNumber) o;
        return number.equals(that.number) && printText.equals(that.printText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, printText);
    }
}
