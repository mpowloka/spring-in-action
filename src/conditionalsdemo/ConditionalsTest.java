package conditionalsdemo;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class ConditionalsTest {

    @Autowired
    Map map;
    @Autowired
    List list;
    @Autowired
    Set set;

    @Test
    public void mapInstantiated_true() {
        assertTrue(null != map);
    }

    @Test
    public void setInstantiated_true() {
        assertTrue(null != set);
    }

    @Test
    public void listInstantiated_true() {
        assertTrue(null != list);
    }

}
