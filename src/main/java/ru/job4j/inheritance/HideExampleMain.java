package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat2();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat2.staticInvoke();
    }
}