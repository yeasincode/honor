package com.honor.service.system.business;

import com.honor.api.UserApi;
import com.honor.model.User;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *
 *  BoShang Technology
 *  File: UserBusiness
 *
 *  BoShang, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *  用户业务类
 *
 *  Notes:
 * 	$Id: UserBusiness 72642 2009-01-01 20:01:57Z BoShang\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月17日		Administrator		Initial.
 *
 * </pre>
 */
public class UserBusiness implements UserApi {

    @Override
    public User getUserById(String userId) {
        User user =new User();
        user.setPassword("32412");
        user.setUserName("admin");
        return user;
    }
}

/*
 *$Log: av-env.bat,v $
 */