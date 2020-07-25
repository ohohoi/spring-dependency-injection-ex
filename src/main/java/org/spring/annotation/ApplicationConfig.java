package org.spring.annotation;

import org.spring.di.Car;
import org.spring.di.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Car car(Engine engine) {
        Car car = new Car();
        car.setEngine(engine);
        return car;
    }

    @Bean
    public Engine engine() {
        Engine engine = new Engine();
        return engine;
    }
}
