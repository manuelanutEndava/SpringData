package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot(){
        Parrot p=new Parrot();
        p.setName("Koko");
        return p;
    }

//   @Bean
//   public Person person(){
//        Person p =new Person();
//        p.setName("Ella");
//        p.setParrot(parrot());
//        return p;
//   }

    //modification to use a parameter instead of calling the @Bean method directly

    @Bean
    public Person person(Parrot parrot){
        Person p= new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }

}
