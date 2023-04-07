package com.ogulcan.mapper;

import com.ogulcan.dto.request.CreateFollowRequestDto;
import com.ogulcan.repository.entity.Follow;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-28T12:23:23+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class IFollowMapperImpl implements IFollowMapper {

    @Override
    public Follow toFollow(CreateFollowRequestDto dto, String userId) {
        if ( dto == null && userId == null ) {
            return null;
        }

        Follow.FollowBuilder<?, ?> follow = Follow.builder();

        if ( dto != null ) {
            follow.followId( dto.getFollowId() );
        }
        follow.userId( userId );

        return follow.build();
    }
}
