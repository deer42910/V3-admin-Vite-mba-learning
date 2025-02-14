package com.mba.learning.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @Id
    private Long id;

    private String username;
    private String password;
    private String email;
    private String fullName;
    private String phoneNumber;
    private String role;
    private String status;
}
