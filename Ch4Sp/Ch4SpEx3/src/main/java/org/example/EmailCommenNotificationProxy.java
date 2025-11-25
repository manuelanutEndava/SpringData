package org.example;

import org.example.proxies.CommentNotificationProxy;
import org.springframework.stereotype.Component;

@Component
public class EmailCommenNotificationProxy  implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment:" + comment.getText());
    }
}
