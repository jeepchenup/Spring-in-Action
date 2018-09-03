package com.springinaction.runtimeInject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.springinaction.runtimeInject.ELRuntimeInjectConfig.class)
public class ELAnnotationRuntimeInjectTest {

    @Autowired
    Teacher teacher;

    @Test
    public void teacherShouldNotNull() {
        assertNotNull(teacher);
        System.out.println(teacher);
    }
}
