package com.mooo.swings.domain.shop;

import com.mooo.swings.domain.candy.Candy;
import com.mooo.swings.domain.candybag.CandyBag;
import com.mooo.swings.supplier.SupplierInterface;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by roelg on 6/03/2017.
 */
public class ShopTest {


    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @InjectMocks
    private Shop shop;
    @Mock
    private SupplierInterface supplier;


    private Candy smurfjes;
    private Candy rolaCola;
    private Candy jellyBelly;
    private CandyBag pietersBag;
    private CandyBag seppesBag;
    private CandyBag emptyBag;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        smurfjes = new Candy("smurfjes", 4.99, 0.5);
        rolaCola = new Candy("Rola cola", 9.99, 0.5);
        jellyBelly = new Candy("Jelly Belly", 2.99, 0.25);
        pietersBag = new CandyBag(smurfjes, smurfjes, smurfjes);
        seppesBag = new CandyBag(rolaCola, rolaCola, rolaCola, rolaCola, rolaCola, rolaCola, rolaCola, smurfjes, smurfjes);
        emptyBag = new CandyBag();
    }

    @Test
    public void a_new_shop_has_an_empty_non_null_supply() throws Exception {
        assertThat(shop.getSupply()).isNotEqualTo(null);
        assertThat(shop.getSupply().size()).isEqualTo(0);
    }

    @Test
    public void a_shop_can_store_bags_in_its_supply() throws Exception {
        shop.addBagsToSupply(pietersBag, pietersBag, seppesBag);
        assertThat(shop.getSupply()).contains(pietersBag);
    }

    @Test
    public void a_shop_can_store_bags_from_a_supplier() throws Exception {

        int before = shop.getSupply().size();


        when(supplier.orderCandyBags(5)).thenReturn(Arrays.asList(emptyBag, emptyBag, emptyBag, emptyBag, emptyBag));
        shop.addBagsFromSupplierToSupply(5, supplier);

        verify(supplier).orderCandyBags(5);

        assertThat(shop.getSupply().size()).isEqualTo(before + 5);
    }
}