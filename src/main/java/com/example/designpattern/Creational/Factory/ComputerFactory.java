package com.example.designpattern.Creational.Factory;

public class ComputerFactory {

    // 팩토리 메소드 패턴을 사용하게 된다면 인스턴스를 필요로 하는 Application에서
    // Computer의 Sub 클래스에 대한 정보는 모른 채 인스턴스를 생성할 수 있게 된다.

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
