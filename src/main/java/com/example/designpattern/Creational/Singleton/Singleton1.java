package com.example.designpattern.Creational.Singleton;

// 1. Eager Initialization 방식
// 싱글턴 클래스의 인스턴스를 클래스 로딩 단계에서 생성하는 방법.
// 어플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 자칫 낭비가 발생할 수 있음.
// File System, Database Connection 등 큰 리소스들을 다루는 싱글톤을 구현할 때는
// getInstance() 메소드가 호출될 때까지 싱글톤 인스턴스를 생성하지 않는 것이 더 좋음
public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    // private constructor to avoid client applications to use constructor
    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }
}
