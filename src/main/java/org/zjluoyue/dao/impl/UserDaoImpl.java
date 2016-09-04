package org.zjluoyue.dao.impl;

import org.springframework.stereotype.Repository;
import org.zjluoyue.base.DaoBaseImpl;
import org.zjluoyue.dao.UserDao;
import org.zjluoyue.model.User;

/**
 * Created by zjluoyue on 2016/8/17.
 */
@SuppressWarnings("unchecked")
@Repository("UserDao")
public class UserDaoImpl extends DaoBaseImpl<User> implements UserDao {

    @Override
    public User getByUsername(String userName) {
        return (User) getSession()
                .createQuery("from User where username=?")
                .setParameter(0, userName)
                .uniqueResult();
    }
}
