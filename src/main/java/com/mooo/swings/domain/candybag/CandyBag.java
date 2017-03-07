package com.mooo.swings.domain.candybag;

import com.mooo.swings.domain.candy.Candy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by roelg on 6/03/2017.
 */
public class CandyBag {
    private List<Candy> candyList;

    public CandyBag(Candy... candy) {
        candyList = Arrays.asList(candy);
    }


    public List<Candy> getCandies() {
        return candyList;
    }

    public double getPrice() {
        double totalPrice = 0.0;
        for (Candy candy : candyList) {
            totalPrice += candy.getPrice();
        }
        return totalPrice;
    }

    public double getWeight() {
        double totalWeight = 0.0;
        for (Candy candy : candyList) {
            totalWeight += candy.getWeight();
        }
        return totalWeight;
    }

    public int getAmount() {
        return candyList.size();
    }
}
