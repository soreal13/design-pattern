package com.example.designpattern.Structural.Bridge;

public abstract class Shape {

    // Composition
    protected Color color;

    // Constuctor with implementor as input argument
    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
