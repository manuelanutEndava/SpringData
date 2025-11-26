package org.example;

import org.example.config.ProjectConfig;
import org.example.services.CommentService;
import org.example.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
var c= new AnnotationConfigApplicationContext(ProjectConfig.class);

var s1=c.getBean(CommentService.class);
var s2=c.getBean(UserService.class);

boolean b= s1.getCommentRepository() ==s2.getCommentRepository();

System.out.println(b);
    }
}