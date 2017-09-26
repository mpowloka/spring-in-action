package externalproperties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@ComponentScan
@PropertySource("externalproperties\\values.properties")
public class Config {

    @Bean
    PropertySourcesPlaceholderConfigurer sourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
