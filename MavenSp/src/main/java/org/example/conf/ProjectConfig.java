package org.example.conf;

import org.example.Perrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
//example of declaring bean 1
    @Bean
    Perrot perrot(){
        var p = new Perrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Perrot perrot2(){
        var p = new Perrot();
        p.setName("Mimi");
        return p;
    }

    @Bean
    Perrot perrot3(){
        var p = new Perrot();
        p.setName("Lili");
        return p;
    }
//example of declaring bean 2
    @Bean
    String hello(){
        return "Hello";
    }
//example of declaring bean 3
    @Bean
    Integer ten(){
        return 10;
    }

}
