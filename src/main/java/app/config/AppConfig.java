package app.config;

import app.model.Animal;
import app.model.Cat;
import app.model.Dog;
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
    @Scope("prototype")
    public Cat getCat() {
        Animal cat = new Cat();
        return (Cat) cat;
    }
}
