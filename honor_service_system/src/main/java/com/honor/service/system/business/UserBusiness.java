package com.honor.service.system.business;

import com.honor.api.UserApi;
import com.honor.jdbc.DatabaseManager;
import com.honor.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <pre>
 *
 *  Honor Technology
 *  File: UserBusiness
 *
 *  Honor, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *  用户业务类
 *
 *  Notes:
 * 	$Id: UserBusiness 72642 2009-01-01 20:01:57Z Honor\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月17日		Administrator		Initial.
 *
 * </pre>
 */
@Component
public class UserBusiness implements UserApi {

    DatabaseManager databaseManager;

    @Override
    public User getUserById(String userId) {
//        User user =new User();
//        user.setPassword("32412");
//        user.setUserName("admin");
        List<User> list=databaseManager.getModelWhere("username","yeasin",User.class);
        return list.get(0);
//        return user;
    }
}

/*
 *$Log: av-env.bat,v $
 */