package org.spring.di;

public class Car {
    private Engine engine;

    public Car() {
        System.out.println("car is constructed.");
    }

    public void setEngine(Engine engine) {  //DI
        this.engine = engine;
    }

    public void run() {
        System.out.println("car running...");
        engine.execute();
    }
}
