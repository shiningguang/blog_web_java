package com.chen.login.dao.impl;

import com.chen.entity.User;
import com.chen.login.dao.UserDao;
import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Author ： chen
 * Date ： 16/8/21
 * Time : 下午4:15
 */
public class UserDaoImpl extends GenericDAOImpl<User,String> implements UserDao {



    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public User findByid(String uid) {
        String hql = "from User u where u.id=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, uid);

        return (User)query.uniqueResult();
    }

    @Override
    public List<User> findAllUser() {
        return findAll();
    }

}
