package com.spirit.ledger.controller;

import com.spirit.ledger.common.api.CommonResult;
import com.spirit.ledger.service.CommonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@Api(tags = "CommonController", description = "通用服务接口")
@RequestMapping("/common")
public class CommonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonController.class);

    @Resource
    private CommonService commonService;
    @ApiOperation("下发短信验证码")
    @RequestMapping(value = "/sendSmsCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult sendSmsCode(@RequestParam String telephone) {

        return commonService.sendSmsCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifySmsCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return commonService.verifyAuthCode(telephone,authCode);
    }
}
