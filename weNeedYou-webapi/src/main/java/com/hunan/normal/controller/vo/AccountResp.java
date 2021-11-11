package com.hunan.normal.controller.vo;

import lombok.Data;

/**
 * @program: WeNeedYou
 * @description: 账户相关的返回体
 * @author: machitao
 * @create: 2021-11-09 23:40
 **/
@Data
public class AccountResp <T> {
    /** code */
    public int code;

    /** code说明 */
    public String message;

    /** 数据 */
    public T date;

    public AccountResp(T date) {
        this.date = date;
    }
}
