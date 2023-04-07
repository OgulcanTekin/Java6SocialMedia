package com.ogulcan.controller;

import static com.ogulcan.constant.ApiUrls.*;

import com.ogulcan.repository.entity.UserProfile;
import com.ogulcan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

    @GetMapping(FINDALL)
    public ResponseEntity<Iterable<UserProfile>> findAll(){
        return  ResponseEntity.ok(userProfileService.findAll());
    }
}
