package soundsystem;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.disks.CompactDisk;

// @RunWith(SpringJUnit4ClassRunner.class)
public class SoundSystemXMLTest {

    private static ClassPathXmlApplicationContext context;

    @BeforeClass
    public static void instantiateContext() {
        context = new ClassPathXmlApplicationContext("soundsystem\\config\\main_config.xml");

    }

  //  @Autowired
    private CompactDisk chuckDisc = (CompactDisk) context.getBean("chuckDisc");

    @Test
    public void context_NotNull() {
        assertNotNull(context);
    }

    @Test
    public void chuckDisc_NotNull() {
        chuckDisc.play();
        assertNotNull(chuckDisc);
    }

    @Test
    public void dummy() {
        assertTrue(true);
    }
}
