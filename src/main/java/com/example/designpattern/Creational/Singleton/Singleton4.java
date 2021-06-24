package com.example.designpattern.Creational.Singleton;

// 4. Thread Safe Singleton
// getInstance() 메소드에 synchronized를 걸어두는 방식.
// synchronized 키워드는 임계 영역(Critical Section)을 형성해 해당 영역에 오직 하나의 쓰레드만 접근 가능하게 함.
// 그러나 synchronized 키워드 비용이 크기 때문에 싱글톤 인스턴스 호출이 잦은 어플리케이션에서 성능 저하.
// -> Double Checked Locking 방식이 나옴
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4(){}

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
