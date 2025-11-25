package org.example;

import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var comment = new Comment();

comment.setAuthor("Laurentiu");
comment.setText("Demo comment");

var commentService= context.getBean(CommentService.class);
commentService.publishComment(comment);
    }
}