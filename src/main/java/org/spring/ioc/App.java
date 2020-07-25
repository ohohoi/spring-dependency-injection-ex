package org.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        UserBean userBean = (UserBean)ac.getBean("userBean");   //applicationContext.xml에서 인자 일치하는 id를 찾는다.
        userBean.setName("ohohoi");
        userBean.setAge(23);

        System.out.println(userBean.getName());

    }
}
