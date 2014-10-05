package com.github.qw3rtrun.valnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Msg obj = context.getBean("helloWorld", Msg.class);

        System.out.println(obj.getMessage());

        System.out.println(context.getBean("commandBus"));
        System.out.println(context.getBean("eventBus"));
    }
}
