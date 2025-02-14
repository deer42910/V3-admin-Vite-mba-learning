package com.mba.learning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mba.learning.entity.po.User;


public interface UserMapper extends BaseMapper<User> {
    User selectByUsername(String username);
}
