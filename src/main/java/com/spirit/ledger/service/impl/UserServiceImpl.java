package com.spirit.ledger.service.impl;

import com.spirit.ledger.mbg.mapper.UserMapper;
import com.spirit.ledger.mbg.model.User;
import com.spirit.ledger.mbg.model.UserExample;
import com.spirit.ledger.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.selectByExample(new UserExample());
    }
}
