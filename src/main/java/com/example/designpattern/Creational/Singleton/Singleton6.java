package com.example.designpattern.Creational.Singleton;

// 6. Enum Singleton
// 앞선 방식들 java의 Relection 통해 싱글톤 파괴 가능한 점을 보완.
// 그러나 사용하지 않을 경우 메모리 문제 해결하지 못한 점과 유연성이 떨어진다는 문제점 있음.
public enum Singleton6 {

    INSTANCE;

    public static void doSomething(){
        // do something
    }
}
