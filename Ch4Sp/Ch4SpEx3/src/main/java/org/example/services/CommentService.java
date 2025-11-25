package org.example.services;

import org.example.Comment;
import org.example.proxies.CommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @Autowired
    private  CommentRepository commentRepository;
    @Autowired
    private  CommentNotificationProxy commentNotificationProxy;
//for example 3 we remove the constructor and add autowired and remove fina from the repositories
//    public CommentService(
//            CommentRepository commentRepository,
//            CommentNotificationProxy commentNotificationProxy){
//        this.commentRepository= commentRepository;
//        this.commentNotificationProxy= commentNotificationProxy;
//    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
