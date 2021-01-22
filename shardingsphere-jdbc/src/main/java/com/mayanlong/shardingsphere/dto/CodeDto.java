package com.mayanlong.shardingsphere.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CodeDto {

    private int id;

    private int user_id;

    private String code;

    private String door_clock;

    private int created_at;

    private int updated_at;
}
