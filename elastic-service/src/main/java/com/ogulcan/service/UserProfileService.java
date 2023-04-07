package com.ogulcan.service;


import com.ogulcan.mapper.IElasticMapper;
import com.ogulcan.rabbitmq.model.RegisterElasticModel;
import com.ogulcan.repository.IUserProfileRepository;
import com.ogulcan.repository.entity.UserProfile;

import com.ogulcan.utility.ServiceManager;

import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile,String> {

    private final IUserProfileRepository userProfileRepository;


    public UserProfileService(IUserProfileRepository userProfileRepository) {
        super(userProfileRepository);
        this.userProfileRepository = userProfileRepository;

    }


    public UserProfile createUserWithRabbitMq(RegisterElasticModel model) {
        return  save(IElasticMapper.INSTANCE.toUserProfile(model));
    }
}
