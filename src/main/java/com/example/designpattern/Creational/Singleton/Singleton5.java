package com.example.designpattern.Creational.Singleton;

// 5. Bill Pugh Singleton Implementation (가장 널리 쓰임)
// inner static helper class를 사용하는 방식
// SingletonHelper 클래스는 Singleton 클래스가 Load 될 때에도 Load 되지 않다가
// getInstance()가 호출됐을 때 비로소 JVM 메모리에 로드되고, 인스턴스를 생성.

public class Singleton5 {

    private Singleton5(){}

    private static class SingletonHelper{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
