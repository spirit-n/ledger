package com.spirit.ledger.service;

import com.spirit.ledger.mbg.model.User;

import java.util.List;

public interface UserService {
    List<User> queryAllUser();

    User getUserByUsername(String username);

    User register(User umsAdminParam);

    String login(String username, String password);
}
