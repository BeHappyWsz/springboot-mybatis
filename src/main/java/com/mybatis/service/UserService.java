package com.mybatis.service;

import com.mybatis.domain.User;

/**
 * @Author wsz
 * @Des:
 * @Date: 20:04 2017/10/16
 */
public interface UserService {

    User findById(Long id);

}
