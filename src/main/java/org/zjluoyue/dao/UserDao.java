package org.zjluoyue.dao;

import org.zjluoyue.base.DaoBase;
import org.zjluoyue.model.User;

/**
 * Created by zjluoyue on 2016/8/17.
 */
public interface UserDao extends DaoBase<User>{


    User getByUsername(String userName);
}
