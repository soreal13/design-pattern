package com.example.designpattern.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        // read all employees from database and put into the list
        empList.add("Lisa");
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
    }
    public List<String> getEmpList() {
        return empList;
    }

    // 깊은 복사 구현

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.empList) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
