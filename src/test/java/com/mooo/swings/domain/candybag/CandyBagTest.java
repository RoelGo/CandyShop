package com.mooo.swings.domain.candybag;

import com.mooo.swings.domain.candy.Candy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by roelg on 6/03/2017.
 */
public class CandyBagTest {

    private Candy smurfjes, rolaCola, jellyBelly, candy4, candy5, candy6, candy7;
    private CandyBag pietersBag, seppesBag;

    @Before
    public void setUp() throws Exception {
        smurfjes = new Candy("smurfjes", 4.99, 0.5);
        rolaCola = new Candy("Rola cola", 9.99, 0.5);
        jellyBelly = new Candy("Jelly Belly", 2.99, 0.25);
        pietersBag = new CandyBag(smurfjes, smurfjes, smurfjes);
        seppesBag = new CandyBag(rolaCola, rolaCola, rolaCola, rolaCola, rolaCola, rolaCola, rolaCola, smurfjes, smurfjes);
    }

    @Test
    public void bag_should_contain_candy() throws Exception {
        assertThat(pietersBag.getCandies()).contains(smurfjes);
        assertThat(pietersBag.getCandies()).doesNotContain(rolaCola);
        assertThat(seppesBag.getCandies()).contains(rolaCola);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void a_bags_content_should_not_be_changed() throws Exception {
        List<Candy> candies = pietersBag.getCandies();
        candies.add(rolaCola);
    }

    @Test
    public void candy_bag_has_a_price() throws Exception {
        assertThat(pietersBag.getPrice()).isEqualTo(3*4.99);
    }
    @Test
    public void candy_bag_has_a_weight() throws Exception {
        assertThat(pietersBag.getWeight()).isEqualTo(3*0.50);
    }
    @Test
    public void candy_bag_has_an_amount() throws Exception {
        assertThat(pietersBag.getAmount()).isEqualTo(3);
    }
}