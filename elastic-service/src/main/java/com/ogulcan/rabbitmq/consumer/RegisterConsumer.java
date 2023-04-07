package com.ogulcan.rabbitmq.consumer;

import com.ogulcan.rabbitmq.model.RegisterElasticModel;

import com.ogulcan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j// console a log info çıktısı vermek için kullanılan kutuphane
public class RegisterConsumer {

    private final UserProfileService userProfileService;

    @RabbitListener(queues = ("${rabbitmq.queueregisterelastic}"))
    public void newUserCreate(RegisterElasticModel model){
        log.info("User {}",model.toString());
        userProfileService.createUserWithRabbitMq(model);

    }

}
