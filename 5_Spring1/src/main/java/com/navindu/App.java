package com.navindu;

import com.navindu.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // Create the container

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt.compile();



//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create a container. Not just creating a container, it's specifying that go to the spring.xml file and create all the objects which ara mentioned with the bean tag.
//
//        Alien obj1 = context.getBean("alien", Alien.class);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Computer com = context.getBean(Computer.class);
//
//        Desktop obj = context.getBean(Desktop.class);
    }
}
