package org.main;

import fruits.Apple;
import fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Box <Apple> appleBox = new Box<Apple>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Коробка яблок 1: " + appleBox.getWeight());

        Box <Apple> appleBox2 = new Box<Apple>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        System.out.println("Коробка яблок 2: " + appleBox2.getWeight());

        appleBox.transferFruit(appleBox2);

        System.out.println("Новая Коробка яблок 1: " + appleBox.getWeight());
        System.out.println("Новая Коробка яблок 2: " + appleBox2.getWeight());

        Box <Orange> orangeBox = new Box<Orange>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println("Коробка апельсинов 1: " + orangeBox.getWeight());

        System.out.println(appleBox.compareBox(orangeBox));
        appleBox2.transferFruit(orangeBox);
        System.out.println("Коробка апельсинов 1: " + orangeBox.getWeight());
    }
}