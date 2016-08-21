package com.chen.login.dao;

import com.chen.entity.User;
import com.googlecode.genericdao.dao.hibernate.GenericDAO;

import java.util.List;

/**
 * Author ： chen
 * Date ： 16/8/21
 * Time : 下午4:15
 */
public interface UserDao extends GenericDAO<User,String>{

    User findByid(String uid);

    List<User> findAllUser();
}
