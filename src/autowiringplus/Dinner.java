package autowiringplus;

import autowiringplus.desserts.Dessert;
import autowiringplus.desserts.dessertannotations.Chocolate;
import autowiringplus.desserts.dessertannotations.Hot;
import autowiringplus.maincourses.MainCourse;
import autowiringplus.soups.Soup;
import  static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = autowiringplus.Config.class)
public class Dinner {


    @Autowired
    Soup soup;

    @Autowired
    @Qualifier("fishy")
    MainCourse mainCourse;

    @Autowired
    @Hot
    @Chocolate
    Dessert dessert;


    @Override
    public String toString() {
        return "Soup: " + soup.getClass().getSimpleName() + ", main course: " + mainCourse.getClass().getSimpleName() + ", dessert: " + dessert.getClass().getSimpleName();
    }


    @Test
    public void test() {
        System.out.println(toString());
        assertTrue(true);
    }

}