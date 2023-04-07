package com.ogulcan.controller;


import com.ogulcan.dto.request.CreateNewPostRequestDto;
import com.ogulcan.repository.entity.Post;
import com.ogulcan.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ogulcan.constant.ApiUrls.FINDALL;
import static com.ogulcan.constant.ApiUrls.POST;

@RestController
@RequiredArgsConstructor
@RequestMapping(POST)
public class PostController {

    private final PostService postService;
    @PostMapping("/create")
    public ResponseEntity<?> createPost (@RequestBody CreateNewPostRequestDto dto){
        return ResponseEntity.ok(postService.createPost(dto));
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<Post>> findAll(){
        return ResponseEntity.ok(postService.findAll());
    }
}
