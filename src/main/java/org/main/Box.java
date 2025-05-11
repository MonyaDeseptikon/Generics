package org.main;


import fruits.Fruit;

import java.util.ArrayList;

public class Box <F extends Fruit> {
    private static final Box EMPTY_BOX = new Box<>();//Или сделать null
    private final ArrayList<F> fruits = new ArrayList<>();
    private float weightFruit;

    public <T extends Fruit>void transferFruit(Box<T> fruitBox) {
        if (fruits.getFirst().getClass().equals(fruitBox.getBox().getFirst().getClass())) {
            for (F fruit : this.fruits) {
                fruitBox.addFruit((T) fruit);
            }
            this.fruits.clear();
        } else {
            System.out.println("переложить немогу, т.к. разные типы фруктов");
        }
    }

    public float getWeight() {

        return fruits.size() * weightFruit;

    }

    public <T extends Fruit>boolean compareBox(Box<T> fruitBox) {
        return this.getWeight() == fruitBox.getWeight();
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
        weightFruit = fruit.getFruitWeight();
    }

    public ArrayList<F> getBox() {
        return fruits;
    }

    public Box<F> emptyBox() {
        return EMPTY_BOX;
    }

}
