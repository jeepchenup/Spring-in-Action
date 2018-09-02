package com.springinaction.conditionbean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionBeanConfig.class)
public class ConditionBeanConfigTest {

    @Autowired
    MagicBean magicBean;

    @Test
    public void magicBeanShouldNotBeNull() {
        System.out.println("start to test.");
        assertNotNull(magicBean);
        magicBean.say();
    }
}
