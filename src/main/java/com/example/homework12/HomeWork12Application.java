package com.example.homework12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork12Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dolphin dolphin = context.getBean("dolphin", Dolphin.class);
        Person person = context.getBean("person", Person.class);

        System.out.println("person's name: "+person.getName()+"\nperson's age: "+person.getAge());
        System.out.println("\nanimal's name: "+dolphin.getName()+"\nanimal's age: "+dolphin.getAge());
        dolphin.animalPlus();
        dolphin.animalMinus();
    }
}
