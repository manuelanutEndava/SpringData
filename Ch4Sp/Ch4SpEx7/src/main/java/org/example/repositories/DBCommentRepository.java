package org.example.repositories;

import org.example.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//for the last example we change the annotation componenet to repository
@Repository
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment:" + comment.getText());
    }
}
