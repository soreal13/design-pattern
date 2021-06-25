package com.example.designpattern.Creational.Prototype;

import java.util.List;


// 프로토타입 사용시 1회의 DB 접근을 통해 가져온 데이터 복사하여 사용.
// 네트워크 접근이나 DB 접근보다 객체 복사가 비용이 더 싸다.

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        // Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);

    }
}
