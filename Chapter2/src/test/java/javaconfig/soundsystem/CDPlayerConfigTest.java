package javaconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerConfigTest {

    @Autowired
    CompactDisc cd;

    @Autowired
    CDPlayer cdPlayer;

    @Autowired
    CDPlayer cdPlayer2;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void cdPlayerShouldNotBeNull() {
        assertNotNull(cdPlayer);
        cdPlayer.play();
    }

    @Test
    public void cdPlayerDefaultIsSingleton() {
        assertEquals(cdPlayer, cdPlayer2);
    }
}
