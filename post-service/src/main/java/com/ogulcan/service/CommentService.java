package com.ogulcan.service;

import com.ogulcan.repository.ICommentRepository;
import com.ogulcan.repository.entity.Comment;
import com.ogulcan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends ServiceManager<Comment, String> {

    private final ICommentRepository commentRepository;

    public CommentService(ICommentRepository commentRepository) {
        super(commentRepository);
        this.commentRepository = commentRepository;
    }
}
