package com.example.designpattern.Creational.Singleton;

// 3. Lazy Initialization
// 나중에 초기화하는 방법. global access 한 getInstance() 메소드를 호출할 때에 인스턴스가 없다면 생성
// 문제점: multi-thread 환경에서 동기화 문제.
// 인스턴스가 생성되지 않은 시점에서 여러 쓰레드가 동시에 getInstance()를 호출한다면 예상치 못한 결과를 얻을 수 있음
//  이 방법으로 구현을 해도 괜찮은 경우는 single-thread 환경이 보장됐을 때
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
