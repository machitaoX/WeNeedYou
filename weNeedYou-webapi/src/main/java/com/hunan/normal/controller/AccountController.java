package com.hunan.normal.controller;

import com.hunan.normal.vo.AccountInfo;
import com.hunan.normal.vo.AccountResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: WeNeedYou
 * @description: 账户相关
 * @author: machitao
 * @create: 2021-11-09 23:30
 **/
@RestController
@RequestMapping("/hunan/account")
public class AccountController {

    final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public AccountResp<AccountInfo> register() {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setName("register");
        logger.info(accountInfo.toString());
        return new AccountResp<>(accountInfo);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AccountResp<AccountInfo> login() {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setName("login");
        logger.info(accountInfo.toString());
        return new AccountResp<>(accountInfo);
    }
}
