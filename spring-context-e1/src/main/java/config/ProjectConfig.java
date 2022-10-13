package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {
    
    // @Bean
    // public Cat cat() {
    //     Cat cat = new Cat();
    //     cat.setName("Tom");
    //     return cat;
    // }

    // @Bean
    // public Owner owner(Cat cat) {
    //     Owner owner = new Owner();
    //     owner.setCat(cat);
    //     return owner;
    // }

}
