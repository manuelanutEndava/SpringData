package org.example.repositories;


import org.example.Comment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public interface CommentRepository {
    void storeComment(Comment comment);
}
