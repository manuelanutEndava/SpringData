package org.example;

import org.example.proxies.CommentNotificationProxy;
import org.example.proxies.CommentPushNotificationProxy;
import org.example.repositories.CommentRepository;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Primary
    @Bean
    public CommentRepository commentRepository(){
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy(){
        return new CommentPushNotificationProxy();
    }

    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy){
        return new CommentService(commentRepository, commentNotificationProxy);
    }

}
