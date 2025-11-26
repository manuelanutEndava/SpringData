package org.example;

import org.example.config.ProjectConfig;
import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
var c= new AnnotationConfigApplicationContext(ProjectConfig.class);
var cs1= c.getBean("commentService", CommentService.class);
var cs2 =c.getBean("commentService", CommentService.class);

boolean b1=cs1==cs2;
System.out.println(b1);
    }
}