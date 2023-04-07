package com.ogulcan.mapper;

import com.ogulcan.dto.request.NewCreateUserRequestDto;
import com.ogulcan.dto.request.UpdateEmailOrUsernameRequestDto;
import com.ogulcan.dto.request.UserProfileUpdateRequestDto;
import com.ogulcan.rabbitmq.model.RegisterElasticModel;
import com.ogulcan.rabbitmq.model.RegisterModel;
import com.ogulcan.repository.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {


    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    UserProfile toUserProfile(final NewCreateUserRequestDto dto);

    UserProfile toUserProfile(final RegisterModel model);

    NewCreateUserRequestDto toNewCreateUserRequestDto(final  RegisterModel model);

    UpdateEmailOrUsernameRequestDto toUpdateEmailOrUsernameRequestDto(final UserProfileUpdateRequestDto dto);

    RegisterElasticModel toRegisterElasticModel(final UserProfile userProfile);


}
