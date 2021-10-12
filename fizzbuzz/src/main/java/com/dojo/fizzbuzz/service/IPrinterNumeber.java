package com.dojo.fizzbuzz.service;

public interface IPrinterNumeber extends Comparable {

    boolean isPrintable(int number);

    String text(int number);
}
