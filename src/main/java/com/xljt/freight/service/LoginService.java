package com.xljt.freight.service;

/**
 * The interface Login service.
 *
 * @author xu
 * @date 2020.04.10
 */
public interface LoginService {

    /**
     * 登录请求，获取token
     *
     * @return the string
     * @author xu
     * @date 2020.04.10
     */
    String login() throws Exception;

}
