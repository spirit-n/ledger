package com.spirit.ledger.controller;

import com.alibaba.fastjson.JSON;
import com.spirit.ledger.common.api.CommonResult;
import com.spirit.ledger.mbg.model.User;
import com.spirit.ledger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

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

}
