package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    public String name() {
        String parentName = super.name();
        return super.name() + " + extra cheese";
    }
}
