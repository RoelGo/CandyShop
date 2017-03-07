package com.mooo.swings.domain.candy;

/**
 * Created by roelg on 6/03/2017.
 */
public class Candy {


    private String name;
    private double weight;
    private double price;

    public Candy(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
