package org.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
/*
        Engine engine = new Engine();
        Car car = new Car();
        car.setEngine(engine);
        car.run();
 */

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Car car = (Car)ac.getBean("car");
        car.run();

    }
}
