package com.example.demo.mappers;

import com.example.demo.Dto.UserDto;
import com.example.demo.Dto.UserInputDto;
import com.example.demo.Entities.UserEntity;
import org.mapstruct.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Mapper (
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        componentModel = "spring"
)
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    UserEntity copy(UserInputDto userInputDto);

    @Mapping(target = "username", source = "name")
    UserEntity mapToUserEntity(UserInputDto userInputDto);

    UserDto mapToDTO(UserEntity userEntity);



    public void mapToUserEntity(@MappingTarget UserEntity userEntity, UserDto userDto);
}
