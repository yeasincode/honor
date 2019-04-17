package com.honor.api;

import com.honor.model.User;

/**
 * <pre>
 *
 *  Honor Technology
 *  File: UserApi
 *
 *  Honor, Inc.
 *  Copyright (C): 2019
 *
 *  Description:
 *  用户Api
 *
 *  Notes:
 * 	$Id: UserApi 72642 2009-01-01 20:01:57Z Honor\Administrator $
 *
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2019年04月17日		Administrator		Initial.
 *
 * </pre>
 */
public interface UserApi {

    User getUserById(String userId);
}

/*
 *$Log: av-env.bat,v $
 */