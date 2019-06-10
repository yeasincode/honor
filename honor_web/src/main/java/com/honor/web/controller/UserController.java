package com.honor.web.controller;

import com.google.gson.Gson;
import com.honor.api.UserApi;
import com.honor.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
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

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private AmqpTemplate amqpTemplate;


    @GetMapping("/send/message")
    public void sendMessage(){


    }


    @GetMapping("/get")
    public User getUser(@RequestParam String userId) {
        User user = userApi.getUserById(userId);

        Gson gson = new Gson();

        set(user.getUserName(), gson.toJson(user), 1000);

        User user2=gson.fromJson(get(user.getUserName()),User.class);

        Boolean istrue=user.equals(user2);
        System.out.println(istrue);

        return user;
    }


    public boolean set(String key, String value, long validTime) {
        boolean result = (boolean) this.redisTemplate.execute((RedisCallback<Boolean>) connection -> {
            RedisSerializer<String> serializer = UserController.this.redisTemplate.getStringSerializer();
            connection.set(serializer.serialize(key), serializer.serialize(value));
            connection.expire(serializer.serialize(key), validTime);
            return true;
        });
        return result;
    }

    public String get(String key) {
        String result = (String) this.redisTemplate.execute((RedisCallback<String>) connection -> {
            RedisSerializer<String> serializer = UserController.this.redisTemplate.getStringSerializer();
            byte[] value = connection.get(serializer.serialize(key));
            return serializer.deserialize(value);
        });
        return result;
    }
}

/*
 *$Log: av-env.bat,v $
 */