package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Ivan", 46, "Yaroslavl");
        Man man2 = new Man("Bred", 30, "Murmansk");

        Woman woman1 = new Woman("Margaret", 43, "Oslo");
        Woman woman2 = new Woman("Victoria", 25, "Rome");
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }
}
