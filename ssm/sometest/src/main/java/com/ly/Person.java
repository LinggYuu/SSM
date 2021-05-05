package com.ly;

public class Person {
    private String name;
    private int age;
    private static int eyes =2;

    public static int getEyes() {
        return eyes;
    }

    public static void setEyes(int eyes) {
        Person.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public void ml(){
        System.out.println("good");
    }

}
