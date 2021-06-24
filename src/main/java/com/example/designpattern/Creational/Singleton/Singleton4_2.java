package com.example.designpattern.Creational.Singleton;

//double checked locking 방식
//getInstance() 메소드 수준에 lock을 걸지 않고 instance가 null일 경우에만 synchronized가 동작하도록 함
public class Singleton4_2 {
    private static Singleton4_2 instance;

    private Singleton4_2(){}

    public static Singleton4_2 getInstance() {
        if (instance == null) {
            synchronized (Singleton4_2.class) {
                if (instance == null) {
                    instance = new Singleton4_2();
                }
            }
        }
        return instance;
    }
}
