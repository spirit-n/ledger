package com.spirit.ledger.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.spirit.ledger.dto.enums.UserLevelEnum;
import com.spirit.ledger.mbg.mapper.UserMapper;
import com.spirit.ledger.mbg.model.User;
import com.spirit.ledger.mbg.model.UserExample;
import com.spirit.ledger.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public List<User> queryAllUser() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User register(User userParam) {
        User user = new User();
        BeanUtils.copyProperties(userParam, user);
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());
        user.setLevel(UserLevelEnum.USER.getValue());
        user.setIsDelete("0");
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> userList = userMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(userList)){
            return null;
        }

        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        userMapper.insert(user);
        return user;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }
}
