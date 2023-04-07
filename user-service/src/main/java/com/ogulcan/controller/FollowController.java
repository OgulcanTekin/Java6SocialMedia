package com.ogulcan.controller;

import com.ogulcan.dto.request.CreateFollowRequestDto;
import com.ogulcan.repository.entity.Follow;
import com.ogulcan.service.FollowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ogulcan.constant.ApiUrls.FINDALL;
import static com.ogulcan.constant.ApiUrls.FOLLOW;

@RestController
@RequiredArgsConstructor
@RequestMapping(FOLLOW)
public class FollowController {

    private final FollowService followService;

    @PostMapping
    public ResponseEntity<?> createFollow(@RequestBody CreateFollowRequestDto dto){

        return ResponseEntity.ok(followService.createFollow(dto));
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Follow>> findAll(){
        return ResponseEntity.ok(followService.findAll());
    }

}
