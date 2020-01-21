package com.company;

import java.util.Random;

public class Dog extends Animal implements Dogsmethode {
    private int age;
    String name;

    public int getAge() {
        return age;
    }

    public Dog(int age, String name) {


        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 1) {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Dog() {
    }

    public String getName() {
        return name;


    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        getName();
    }

    @Override
    public void bark() {
        System.out.println("bark");
    }

    private void giveBirthToOffspring() {
        Random random = new Random();
        System.out.println(random.nextInt(6) + 1);
    }
}
