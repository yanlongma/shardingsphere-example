package com.mayanlong.shardingsphere.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Code {
    private int id;
    private int user_id;
    private String code;
    private String door_clock;
    private int created_at;
    private int updated_at;
}
