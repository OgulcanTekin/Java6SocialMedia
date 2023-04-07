package com.ogulcan.service;

import com.ogulcan.repository.IDislikeRepository;
import com.ogulcan.repository.entity.Dislike;
import com.ogulcan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class DislikeService extends ServiceManager<Dislike, String> {

    private final IDislikeRepository dislikeRepository;

    public DislikeService(IDislikeRepository dislikeRepository) {
        super(dislikeRepository);
        this.dislikeRepository = dislikeRepository;
    }
}
