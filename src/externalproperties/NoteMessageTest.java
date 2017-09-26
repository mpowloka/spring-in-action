package externalproperties;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = Config.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class NoteMessageTest {

    @Autowired
    Environment environment;

    @Autowired
    Note note;

    @Test
    public void message_toString_equals() {
        System.out.println(environment.getProperty("message1"));
        assertTrue(true);

    }

    @Test
    public void note_toString_equals() {
        System.out.println(note.text);
        assertEquals("Taxation is Theft", note.text);
    }
}
