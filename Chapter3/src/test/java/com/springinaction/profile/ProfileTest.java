package com.springinaction.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/profiles-bean.xml")
@ActiveProfiles("Dev")
//@ActiveProfiles("QA")
public class ProfileTest {

    @Autowired
    private Profile profile;

    @Test
    public void testProfile() {
        assertNotNull(profile);
        profile.say();
    }
}