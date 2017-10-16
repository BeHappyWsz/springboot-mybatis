package com.mybatis.dao;

import com.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author wsz
 * @Des:
 * @Date: 19:55 2017/10/16
 */
@Repository
@Mapper
public interface UserDao {

    List<User> findAllUser();

    User findById(@Param("id") Long id);

    Long saveUser(User user);

    Long updateUser(User user);

    Long deleteUser(User user);
}
