package com.honor.web.com.honor.web.controller;

import com.honor.api.UserApi;
import com.honor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 *
 *  Honor Technology
 *  File: UserController
 *
 *  Honor, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *  用户
 *
 *  Notes:
 * 	$Id: UserController 72642 2009-01-01 20:01:57Z Honor\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月19日		Administrator		Initial.
 *
 * </pre>
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserApi userApi;

    @GetMapping("/get")
    public User getUser(@RequestParam String userId){
       User user=userApi.getUserById(userId);
       return user;
    }
}

/*
 *$Log: av-env.bat,v $
 */