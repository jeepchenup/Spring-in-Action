package com.springinaction.runtimeInject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.springinaction.runtimeInject.RuntimeInjectConfig.class)
public class RuntimeInjectConfigTest {

    @Autowired
    Student student;

    @Test
    public void studentShouldNotBeNull() {
        assertNotNull(student);
        System.out.println(student);
    }
}
