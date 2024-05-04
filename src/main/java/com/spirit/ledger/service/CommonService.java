package com.spirit.ledger.service;

import com.spirit.ledger.common.api.CommonResult;

public interface CommonService {

    /**
     * 下发短信验证码
     */
    CommonResult sendSmsCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
