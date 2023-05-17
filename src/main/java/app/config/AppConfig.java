package app.config;

import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name="dog")
    public Dog getDog() {
        Animal dog = new Dog();
        return (Dog) dog;
    }

    @Bean(name="cat")
    public Cat getCat() {
        Animal cat = new Cat();
        return (Cat) cat;
    }

    @Bean(name="timer")
    @Scope("prototype")
    public Timer getTimer() {
        Timer timer = new Timer();
        return (Timer) timer;
    }
}
