package org.example.services;

import org.example.Comment;
import org.example.CommentProcessor;
import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class CommentService {
//Using CommentProcessor as prototype bean
// @Autowired
//    private ApplicationContext context;
//
// public void sendComment(Comment c){
//     CommentProcessor p=
//             context.getBean(CommentProcessor.class);
//
//     p.setComment(c);
//     p.processComment(c);
//     p.validateComment(c);
//
//     c=p.getComment();
// }
//Injecting a prototype into a singleton
    @Autowired
    private CommentProcessor p;

    public void sendComment(Comment c){
        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c= p.getComment();
    }

}
