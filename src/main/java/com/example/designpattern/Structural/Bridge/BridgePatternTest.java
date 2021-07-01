package com.example.designpattern.Structural.Bridge;

public class BridgePatternTest {

    // 브릿지 패턴(Bridge Pattern)은 두 인터페이스에 계층 구조(Hierarchy)를 가지고 있을 때
    // 인터페이스를 구현(implements)으로부터 분리하고 클라이언트 프로그램으로부터 구현 세부사항을 숨기기 위해 사용되는 패턴
    // 추상화(abstraction)를 구현으로부터 분리하여 각각 독립적으로 변화할 수 있도록 하는 패턴

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
