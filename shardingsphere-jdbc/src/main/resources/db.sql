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