package org.main;


import fruits.Fruit;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private static final Box EMPTY_BOX = new Box<>();//Или сделать null
    private ArrayList<F> fruits = new ArrayList<F>();
    private float weightFruit;

    public void transferFruit(Box<F> fruitBox) {
        if (fruits.getFirst().getClass().equals(fruitBox.getBox().getFirst().getClass())) {
            for (F fruit : this.fruits) {
                fruitBox.addFruit(fruit);
            }
            this.fruits.clear();
        } else {
            System.out.println("переложить немогу, т.к. разные типы фруктов");
        }
    }

    public float getWeight() {

        return fruits.size() * weightFruit;

    }

    public boolean compareBox(Box<F> fruitBox) {
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
