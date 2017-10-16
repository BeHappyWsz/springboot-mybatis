package com.mybatis.service.impl;

import com.mybatis.dao.UserDao;
import com.mybatis.domain.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wsz
 * @Des:
 * @Date: 20:05 2017/10/16
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }
}
