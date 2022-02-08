package com.example.homework12;

public class Dolphin implements Animal {
    @Override
    public void animalPlus() {
        System.out.println("Дельфин очень умное создание. У дельфинов есть более 14 тыс. слов");
    }

    @Override
    public void animalMinus() {
        System.out.println("Не имеет никаких минусов!");
    }

    private String name;
    private int age;

    public Dolphin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dolphin:" +
                "name:" + name + '\'' +
                "age=" + age;
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
}
