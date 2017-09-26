package profilesdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    @Profile(value = "dev")
    public Car liftbag() {
        return new Liftbag();
    }

    @Bean
    @Profile(value = "prod")
    public Car combi() {
        return new Combi();
    }

}
