package org.example;

import org.example.conf.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Parrot p= new Parrot();
        // to specify witch perrot context you need to use, use the bean name
        Perrot p= context.getBean("perrot2", Perrot.class);
        System.out.println(p.getName());

        String s= context.getBean(String.class);
        System.out.println(s);

        Integer n= context.getBean(Integer.class);
        System.out.println(n);

    }
}