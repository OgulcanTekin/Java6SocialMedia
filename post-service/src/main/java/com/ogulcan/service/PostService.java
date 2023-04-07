package com.ogulcan.service;

import com.ogulcan.dto.request.CreateNewPostRequestDto;
import com.ogulcan.mapper.IPostMapper;
import com.ogulcan.repository.IPostRepository;
import com.ogulcan.repository.entity.Post;
import com.ogulcan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PostService extends ServiceManager<Post, String> {

    private final IPostRepository postRepository;

    public PostService( IPostRepository postRepository) {
        super(postRepository);
        this.postRepository = postRepository;
    }

    public Post createPost(CreateNewPostRequestDto dto) {
        return save(IPostMapper.INSTANCE.toPost(dto));
    }
}
