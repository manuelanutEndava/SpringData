package org.example;

import org.example.conf.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class MainExampleSupplier {
    public static void main(String[] args){
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        //using registerBean example
        Perrot x= new Perrot();
        x.setName("Kiki");
        Supplier<Perrot> perrotSupplier=() -> x;

        context.registerBean("perrot2", Perrot.class, perrotSupplier);

        Perrot p = context.getBean("perrot2", Perrot.class); //remember to speciffy the bean name
        System.out.println(p.getName());

    }
}
