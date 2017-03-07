package com.mooo.swings.supplier;

import com.mooo.swings.domain.candybag.CandyBag;

import java.util.List;

/**
 * Created by roelg on 6/03/2017.
 */
public interface SupplierInterface {

    List<CandyBag> orderCandyBags(int numberOfBags);

}
