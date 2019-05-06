package com.nacos.demo.mapper;

import com.nacos.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    User findById(@Param("id") int id);

}
