package com.example.designpattern.Structural.Decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Adding features of Sports Car.");
    }
}
