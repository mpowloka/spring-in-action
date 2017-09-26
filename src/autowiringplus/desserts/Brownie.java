package autowiringplus.desserts;

import autowiringplus.desserts.dessertannotations.Chocolate;
import autowiringplus.desserts.dessertannotations.Cold;
import org.springframework.stereotype.Component;

@Component
@Cold
@Chocolate
public class Brownie implements Dessert {
}
