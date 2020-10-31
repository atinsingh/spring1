package io.pragra.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean( "person2" , Person.class);

        System.out.println(person);
        System.out.println(person2);

    }
}
