package com.example.designpattern.Structural.Flyweight;


// Flyweigh 패턴: 많은 수의 객체를 생성해야 할 때 사용하는 패턴. 공유(sharing)를 통해 대량의 객체들을 효과적으로 지원하는 방법.
// 공유 객체에 의해 메모리에 로드 되는 객체의 개수 줄일 수 있음.

// 1. 어플리케이션에 의해 생성되는 객체의 수가 많아야 한다.
// 2. 생성된 객체가 오래도록 메로리에 상주하며 사용되는 횟수가 많다.
// 3. 객체의 특성을 내적속성과 외적 속성으로나눴을 때 객체의 외적 특성이 클라이언트 프로그램으로 정의되어야 한다.
// 객체의 내적 속성은 객체를 유니크하게 하는 것이고 외적 속성은 클라이언트의 코드로부터 설정되어 다른 동작을 수행하도록 사용되는 특성. ex) Circle 객체는 color, width 외적 속성.

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOTFILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }

        return shapeImpl;
    }


    public static enum ShapeType {
        OVAL_FILL, OVAL_NOTFILL, LINE
    }
}
