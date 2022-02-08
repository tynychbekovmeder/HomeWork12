package com.example.homework12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork12Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person me = context.getBean("me", Person.class);
        Person myFriend = context.getBean("myFriend", Person.class);

        System.out.println(me);
        me.getAnimal().animalPlus();
        me.getAnimal().animalMinus();
        System.out.println(myFriend);
        myFriend.getAnimal().animalPlus();
        myFriend.getAnimal().animalMinus();
    }
}
