package com.mba.learning.service;

import com.mba.learning.entity.po.User;

public interface UserService {

    User login(String username, String password);

}
