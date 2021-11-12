package com.hunan.normal.controller.vo;

import lombok.Data;

/**
 * @program: WeNeedYou
 * @description:
 * @author: machitao
 * @create: 2021-11-12 22:34
 **/
@Data
public class AccountRegisterReq {
    private String name;
    private String company;
    private String password;
}
