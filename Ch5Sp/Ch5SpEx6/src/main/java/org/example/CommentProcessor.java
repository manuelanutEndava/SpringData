package org.example;

import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;
//    private Comment comment;
//
//    public void setComment(Comment comment){
//        this.comment = comment;
//    }
//
//    public void getComment(){
//        return this.comment;
//    }
//    public void getComment(){
//
//    }
//    public void validateComment{
//
//    }
}
