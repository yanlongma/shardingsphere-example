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
public class Order {
    private int id;
    private int userId;
    private int productId;
    private String price;
    private int quantity;
    private Date createdAt;
    private Date updatedAt;
}
