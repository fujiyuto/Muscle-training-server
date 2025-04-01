CREATE TABLE IF NOT EXISTS users
(
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    email VARCHAR(255) UNIQUE NOT NULL COMMENT 'メールアドレス',
    password VARCHAR(64) NOT NULL COMMENT 'パスワード',
    last_name VARCHAR(20) NOT NULL COMMENT '姓',
    first_name VARCHAR(20) NOT NULL COMMENT '名',
    sex ENUM('Men', 'Women') NOT NULL COMMENT '性別',
    phone_number VARCHAR(13) NOT NULL COMMENT '電話番号',
    body_height DECIMAL(4,1) NOT NULL COMMENT '身長',
    body_weight DECIMAL(4,1) NOT NULL COMMENT '体重',
    birthday DATE NOT NULL COMMENT '生年月日',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    INDEX email_idx (email)
) COMMENT 'ユーザーテーブル';