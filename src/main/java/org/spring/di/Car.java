package org.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
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
