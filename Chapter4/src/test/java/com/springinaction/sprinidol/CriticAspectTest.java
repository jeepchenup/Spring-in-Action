package com.springinaction.sprinidol;

import org.junit.Test;
import xml.concert.Performance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/aspectj-beans.xml")
public class CriticAspectTest {
    @Autowired
    private Performance performance;

    @Test
    public void testCriticAspect() {
        performance.perform();
    }
}
