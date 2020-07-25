package org.spring.annotation;

import org.spring.di.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String args[]) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Car car = (Car)ac.getBean("car");
        //Car car = (Car)ac.getBean(Car.class);
        car.run();
    }
}
