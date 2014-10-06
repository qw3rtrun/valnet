package com.github.qw3rtrun.valnet;

import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.gateway.DefaultCommandGateway;
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

        CommandBus bus = context.getBean("commandBus", CommandBus.class);
        DefaultCommandGateway gateway = new DefaultCommandGateway(bus);

        gateway.send(new AssociateCommand("a", 1));
    }
}
