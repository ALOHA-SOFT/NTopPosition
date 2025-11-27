package com.aloha.company.mapper.users;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.aloha.company.domain.users.UserAuth;

@Mapper
public interface UserAuthMapper extends BaseMapper<UserAuth> {

}
