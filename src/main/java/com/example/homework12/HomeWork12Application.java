package com.example.homework12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork12Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);

        System.out.println(person);
        person.getAnimal().animalPlus();
        person.getAnimal().animalMinus();
    }
}
