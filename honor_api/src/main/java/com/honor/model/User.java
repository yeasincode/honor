package com.honor.model;

import java.io.Serializable;

/**
 * <pre>
 *
 *  Honor Technology
 *  File: User
 *
 *  Honor, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *
 *
 *  Notes:
 * 	$Id: User 72642 2009-01-01 20:01:57Z Honor\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月17日		Administrator		Initial.
 *
 * </pre>
 */
public class User implements Serializable {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

/*
 *$Log: av-env.bat,v $
 */