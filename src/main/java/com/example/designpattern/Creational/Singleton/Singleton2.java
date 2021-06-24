package com.example.designpattern.Creational.Singleton;

// 2. Static Block Initialization
// Eager Initialization과 유사하지만 static block을 통해서 Exception Handling에 대한 옵션을 제공.
// 클래스 로딩 단계에서 인스턴스를 생성하기 때문에 여전히 큰 리소스를 다루는 경우에는 적합하지 않음
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    //static block initialization for exception handling
    static {
        try {
            instance = new Singleton2();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
