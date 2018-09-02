package com.springinaction.addressAmbiguity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/desserts-bean.xml")
public class DessertConfigTest {

    @Autowired
    private Dessert dessert;

    @Autowired
    private PersonalDessert personalDessert;

    @Test
    public void dessertShouldNotBeNull() {
        assertNotNull(dessert);
        dessert.say();
    }

    @Test
    public void shouldBeIceCream() {
        assertNotNull(personalDessert);
        personalDessert.showDessert();
    }
}
