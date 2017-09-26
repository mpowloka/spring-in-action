package autowiringplus;


import autowiringplus.desserts.Dessert;
import autowiringplus.desserts.IceCream;
import autowiringplus.desserts.LavaCake;
import autowiringplus.desserts.dessertannotations.Chocolate;
import autowiringplus.desserts.dessertannotations.Cold;
import autowiringplus.desserts.dessertannotations.Hot;
import autowiringplus.maincourses.FishAndChips;
import autowiringplus.maincourses.MainCourse;
import autowiringplus.soups.Soup;
import autowiringplus.soups.Zurek;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"desserts", "maincourses", "soups"})
public class Config {

    @Bean
    @Primary
    public Soup soup() {
        return new Zurek();
    }

    @Bean
    @Qualifier("fishy")
    public MainCourse fishAndChips() {
        return new FishAndChips();
    }

    @Bean
    @Hot
    @Chocolate
    public Dessert lavaCake() {
        return new LavaCake();
    }

    @Bean
    @Cold
    public Dessert iceCream() {
        return new IceCream();
    }

}
