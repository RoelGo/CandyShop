package com.mooo.swings.domain.shop;

import com.mooo.swings.domain.candy.Candy;
import com.mooo.swings.domain.candybag.CandyBag;
import com.mooo.swings.supplier.SupplierInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by roelg on 6/03/2017.
 */
public class Shop {
    private List<CandyBag> supply = new ArrayList<>();

    public List<CandyBag> getSupply() {
        return supply;
    }

    public void addBagsToSupply(CandyBag... candyBags) {
        supply.addAll(Arrays.asList(candyBags));
    }

    public void addBagsFromSupplierToSupply(int numberOfBags, SupplierInterface supplier) {
        supply.addAll(supplier.orderCandyBags(numberOfBags));
    }
}
