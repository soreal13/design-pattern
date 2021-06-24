package com.example.designpattern.Creational.Builder;


/**
 * Builder pattern
 * 별도의 Builder 클래스를 만들어 필수 값에 대해서는 생성자를 통해,
 * 선택적인 값들에 대해서는 메소드를 통해 step-by-step으로 값을 입력받은 후에
 * build() 메소드를 통해 최종적으로 하나의 인스턴스를 리턴하는 방식.
 */
public class Computer {

    // required parameters
    private String HDD;
    private String RAM;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Builder 패턴 구현 방법
    // 1. 빌더 클래스를 Static Nested Class로 생성. 관례적으로 생성하고자 하는 클래스 이름 뒤에 Builder를 붙임.
    // 2. 빌더 클래스의 생성자는 public으로 하며, 필수 값들에 대해 생성자의 파라미터로 받음.
    // 3. 옵셔널한 값들에 대해서는 각각의 속성마다 메소드로 제공. 이 때, 메소드의 리턴 값이 빌더 객체 자신.
    // 4. 빌더 클래스 내에 build() 메소드를 정의하여 클라이언트 프로그램에게 최종 생성된 결과물을 제공.
    //    build()를 통해서만 객체 생성을 제공하기 때문에 생성 대상이 되는 클래스의 생성자는 private으로 정의

    // Builder Class
    public static class ComputerBuilder {

        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        // Computer 객체를 얻기 위해 ComputerBuilder 클래스를 사용하고 있으며
        // 필수 값인 HDD와 RAM 속성에 대해서는 생성자로 받고
        // Optional한 값인 BluetoothEnabled와 GraphicsCardEnabled에 대해서는
        // 메소드를 통해 선택적으로 입력 받고 있다.


        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}