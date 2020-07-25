package org.spring.di;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("engine is constructed.");
    }

    public void execute() {
        System.out.println("engine running...");
    }
}
