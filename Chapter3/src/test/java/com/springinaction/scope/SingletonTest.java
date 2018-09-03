package com.springinaction.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScopeBeanConfig.class)
public class SingletonTest {

    @Autowired
    SingletonBean singletonBean_1;

    @Autowired
    SingletonBean singletonBean_2;

    @Test
    public void testSingletonBean() {
        assertEquals(singletonBean_1, singletonBean_2);
    }

}
