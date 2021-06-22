package com.example.designpattern.Creational.AbstractFactory;

public class ComputerFactory {
    // 컨슈머 클래스

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
