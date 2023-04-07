package com.ogulcan.mapper;

import com.ogulcan.dto.request.NewCreateUserRequestDto;
import com.ogulcan.dto.request.RegisterRequestDto;
import com.ogulcan.dto.response.RegisterResponseDto;
import com.ogulcan.rabbitmq.model.RegisterMailModel;
import com.ogulcan.rabbitmq.model.RegisterModel;
import com.ogulcan.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {


    IAuthMapper INSTANCE= Mappers.getMapper(IAuthMapper.class);


    Auth toAuth(final RegisterRequestDto dto);
    RegisterResponseDto toRegisterResponseDto(final Auth auth);

    @Mapping(source = "id",target = "authId")
    NewCreateUserRequestDto toNewCreateUserRequestDto(final Auth auth);
    @Mapping(source = "id",target = "authId")
    RegisterModel toRegisterModel(final Auth auth);

    RegisterMailModel toRegisterMailModel(final Auth auth);

}
