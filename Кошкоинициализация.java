package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    String address;
    String color;
    int age;
    int weight;

    public void initialize(String name) {
        this.name = name;
        this.address = null;
        this.color = "Black";
        this.age = 5;
        this.weight = 3;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.address = null;
        this.color = "White";
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.address = null;
        this.color = "Orange";
        this.age = age;
        this.weight = 3;
    }

    public void initialize(int weight, String color) {
        this.name = null;
        this.address = null;
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.address = address;
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
