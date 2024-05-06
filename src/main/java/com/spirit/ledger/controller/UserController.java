package com.spirit.ledger.controller;

import com.alibaba.fastjson.JSON;
import com.spirit.ledger.common.api.CommonResult;
import com.spirit.ledger.dto.UserLoginParam;
import com.spirit.ledger.mbg.model.User;
import com.spirit.ledger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @ApiOperation(value = "查询所有用户")
    @RequestMapping(value = "/queryAllUser", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryAllUser() {
        List<User> userList = userService.queryAllUser();
        if (userList == null) {
            return CommonResult.failed();
        }
        LOGGER.info("UserController.queryAllUser,userList={}", JSON.toJSONString(userList));
        return CommonResult.success(userList);
    }

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<User> register(@RequestBody User userParam, BindingResult result) {
        User user = userService.register(userParam);
        if (user == null) {
            CommonResult.failed();
        }
        return CommonResult.success(user);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UserLoginParam umsAdminLoginParam, BindingResult result) {
        String token = userService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

}
