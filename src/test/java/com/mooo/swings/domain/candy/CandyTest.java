package com.mooo.swings.domain.candy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Created by roelg on 6/03/2017.
 */
public class CandyTest {
    private Candy candy;

    @Before
    public void setUp() throws Exception {
        candy = new Candy("Smurfjes",4.99,0.5);
    }

    @Test
    public void candy_should_have_a_name() throws Exception {
        assertThat(candy.getName()).isEqualTo("Smurfjes");
    }
    @Test
    public void candy_should_have_a_price() throws Exception {
        assertThat(candy.getPrice()).isEqualTo(4.99);
    }
    @Test
    public void candy_should_have_a_weight() throws Exception {
        assertThat(candy.getWeight()).isEqualTo(0.5);
    }
}