package com.example.rjwm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjwm.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
