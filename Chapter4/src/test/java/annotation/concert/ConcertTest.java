package annotation.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {

    @Autowired
    Performance performance;

    @Test
    public void performanceShouldNotBeNull() {
        assertNotNull(performance);
    }

    @Test
    public void audienceTest() {
        performance.perform();
    }

    @Test
    public void introduceTest() {
        assertTrue(performance instanceof Encoreable);

        ((Encoreable)performance).performEncore();
    }
}
