package com.ogulcan.service;

import com.ogulcan.repository.ILikeRepository;
import com.ogulcan.repository.entity.Like;
import com.ogulcan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class LikeService extends ServiceManager<Like, String> {

    private final ILikeRepository likeRepository;

    public LikeService(ILikeRepository likeRepository) {
        super(likeRepository);
        this.likeRepository = likeRepository;
    }
}
