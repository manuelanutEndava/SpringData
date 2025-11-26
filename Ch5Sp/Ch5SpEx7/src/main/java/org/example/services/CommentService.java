package org.example.services;

import org.example.repositories.CommenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommenRepository commenRepository;

    public  CommenRepository getCommenRepository(){
        return  commenRepository;
    }
}
