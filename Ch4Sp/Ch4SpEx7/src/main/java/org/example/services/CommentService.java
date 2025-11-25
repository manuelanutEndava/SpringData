package org.example.services;

import org.example.Comment;
import org.example.proxies.CommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
//for the last example we change tehe annotation from componenet to service
public class CommentService {

    private  CommentRepository commentRepository;
    private  CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy){
        this.commentRepository=commentRepository;
        this.commentNotificationProxy= commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
    //for example 4 we remove the annotations for component and autowired and add the constructor back

}
