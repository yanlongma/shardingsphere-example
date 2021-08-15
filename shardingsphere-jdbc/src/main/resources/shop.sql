
CREATE TABLE `pre_code` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '',
    `code` varchar(100) NOT NULL DEFAULT '' COMMENT '',
    `door_clock` varchar(100) DEFAULT NULL COMMENT '',
    `created_at` int(11) NOT NULL DEFAULT '0' COMMENT '',
    `updated_at` int(11) NOT NULL DEFAULT '0' COMMENT '',
    PRIMARY KEY (`id`),
    UNIQUE KEY `code` (`code`),
    UNIQUE KEY `door_clock` (`door_clock`),
    KEY `ind_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='';

CREATE TABLE `pre_user` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `mobile` CHAR(11) NOT NULL DEFAULT '' COMMENT '手机号',
    `password` VARCHAR(50)  NOT NULL DEFAULT '' COMMENT '密码',
    `nickname` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '昵称',
    `sex` TINYINT NOT NULL DEFAULT 0 COMMENT '性别 0.未知 1.男 2.女',
    `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY `pk_id` (`id`),
    UNIQUE KEY `uk_mobile` (`mobile`),
    KEY `idx_nickname` (`nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE `pre_order` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户ID',
    `product_id` INT(11) NOT NULL DEFAULT 0 COMMENT '产品ID',
    `price` DECIMAL(10,2) NOT NULL DEFAULT 0 COMMENT '单价 单位：元',
    `quantity` INT(11) NOT NULL DEFAULT 0 COMMENT '数量',
    `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY `pk_id` (`id`),
    KEY `idx_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';