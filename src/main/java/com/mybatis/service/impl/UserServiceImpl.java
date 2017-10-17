package com.mybatis.service.impl;

import com.mybatis.dao.UserDao;
import com.mybatis.domain.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wsz
 * @Des:
 * @Date: 20:05 2017/10/16
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAllUser();
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> searchByName(String name) {
        return userDao.searchByName(name);
    }

    @Override
    public Long insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public Long updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public Long deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

}
