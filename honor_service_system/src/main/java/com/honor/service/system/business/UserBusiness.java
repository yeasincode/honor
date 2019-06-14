package com.honor.service.system.business;

import com.honor.api.UserApi;
import com.honor.dubbo.AppDubbo;
import com.honor.jdbc.DatabaseManager;
import com.honor.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
public class UserBusiness extends AppDubbo implements UserApi {

    private static Log log=LogFactory.getLog(UserBusiness.class);

    @Autowired
    DatabaseManager databaseManager;

    @Override
    public User getUserById(String userId) {
        User user = databaseManager.get(1, User.class);
        return user;
    }
}

/*
 *$Log: av-env.bat,v $
 */
