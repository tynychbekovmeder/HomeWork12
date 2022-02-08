package com.example.homework12;

public class Dog implements Animal{
    @Override
    public void animalPlus() {
        System.out.println("Защищает дом");
    }

    @Override
    public void animalMinus() {
        System.out.println("Кусается!");
    }

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nDog: " +
                "\n     name: " + name + '\'' +
                "\n     age=" + age;
    }
}
