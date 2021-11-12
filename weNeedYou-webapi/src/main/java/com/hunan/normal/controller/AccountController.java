package com.hunan.normal.controller;

import com.hunan.normal.controller.vo.AccountInfo;
import com.hunan.normal.controller.vo.AccountLoginReq;
import com.hunan.normal.controller.vo.AccountRegisterReq;
import com.hunan.normal.controller.vo.AccountResp;
import com.hunan.normal.mapper.UserMapper;
import com.hunan.normal.mapper.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public AccountResp<AccountInfo> register(@RequestBody AccountRegisterReq accountRegisterReq) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(accountRegisterReq.getName());
        userEntity.setCompany(accountRegisterReq.getCompany());
        userEntity.setPassword(accountRegisterReq.getPassword());
        try {
            userMapper.insert(userEntity);
        } catch (Exception e) {
            logger.info(e.toString());
            return null;
        }
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setName(accountRegisterReq.getName());
        accountInfo.setCompany(accountInfo.getCompany());
        return new AccountResp<>(accountInfo);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AccountResp<AccountInfo> login(@RequestBody AccountLoginReq accountLoginReq) {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setName("login");
        logger.info(accountInfo.toString());
        return new AccountResp<>(accountInfo);
    }
}
