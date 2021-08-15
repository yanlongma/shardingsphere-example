package com.mayanlong.shardingsphere.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String mobile;
    private String password;
    private String nickname;
    private int sex;
    private Date createdAt;
    private Date updatedAt;
}
