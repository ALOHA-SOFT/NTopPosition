package com.aloha.company.service.users;

import org.springframework.stereotype.Service;
import com.aloha.company.domain.users.UserAuth;
import com.aloha.company.mapper.users.UserAuthMapper;
import com.aloha.company.service.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserAuthServiceImpl extends BaseServiceImpl<UserAuth, UserAuthMapper> implements UserAuthService {

}
