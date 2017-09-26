package profilesdemo;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
@ActiveProfiles(profiles = "prod")
public class CarsTest {

    @Autowired
    Car car;

    @Test
    public void isDevProfileActive_true() {
        System.out.println(car.getClass().getSimpleName());
        assertTrue(car.getClass().getSimpleName().equals("Combi"));
    }

}
