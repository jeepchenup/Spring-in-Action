package com.springinaction.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/scope-bean.xml")
public class PrototypeTest {

    @Autowired
    PrototypeBean prototypeBean_1;

    @Autowired
    PrototypeBean prototypeBean_2;

    @Test
    public void testPrototypeBean() {
        assertNotEquals(prototypeBean_1, prototypeBean_2);
    }
}
