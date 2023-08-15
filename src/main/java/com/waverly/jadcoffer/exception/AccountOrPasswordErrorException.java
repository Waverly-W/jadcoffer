package com.waverly.jadcoffer.exception;

/**
 * 账号不存在异常
 */
public class AccountOrPasswordErrorException extends BaseException {

    public AccountOrPasswordErrorException() {
    }

    public AccountOrPasswordErrorException(String msg) {
        super(msg);
    }

}
