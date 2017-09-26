package conditionalsdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class Config {

    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    @Conditional(conditionalsdemo.conditions.MapCondition.class)
    public Map<String, Integer> map() {
        return new LinkedHashMap<>();
    }

    @Bean
    @Conditional(conditionalsdemo.conditions.SetCondition.class)
    public Set<String> set() {
        return new TreeSet<>();
    }

    @Bean
    @Conditional(conditionalsdemo.conditions.ListCondition.class)
    public List<String> list() {
        return new ArrayList<>();
    }
}
