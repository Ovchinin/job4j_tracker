package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    public String name() {
        String parentName = super.name();
        return super.name() + " + extra tomato";
    }
}
