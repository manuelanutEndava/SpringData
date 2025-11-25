package org.example;

import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
var commentRepository = new DBCommentRepository();
var commentNotificationProxy = new EmailCommentNotificationProxy();

var commentService= new CommentService(commentRepository, commentNotificationProxy);

var comment = new Comment();
comment.setAuthor("Laurentiu");
comment.setText("Demo comment");

commentService.publishComment(comment);
    }
}