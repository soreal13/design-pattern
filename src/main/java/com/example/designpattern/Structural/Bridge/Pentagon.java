package com.example.designpattern.Structural.Bridge;

public class Pentagon extends Shape {

    public Pentagon (Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon filled with color");
        color.applyColor();
    }
}
