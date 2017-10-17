package com.mybatis.service;

import com.mybatis.domain.User;

import java.util.List;

/**
 * @author  wsz
 * @Des:
 * @Date: 20:04 2017/10/16
 */
public interface UserService {

    /**
     * 查询所有用户
     * @param
     * @return List<User>
     */
    List<User> findAll();

    /**
     * 查询某一个用户
     * @param id
     * @return User
     */
    User findById(Long id);

    /**
     * 根据用户名查询
     * @param name
     * @return
     */
    List<User> searchByName(String name);

    /**
     * 插入新用户
     * @param user
     * @return
     */
    Long insertUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    Long updateUser(User user);

    /**
     * 删除某一个用户
     * @param id
     * @return
     */
    Long deleteUser(Long id);
}
