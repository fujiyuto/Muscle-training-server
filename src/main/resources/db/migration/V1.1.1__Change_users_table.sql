ALTER TABLE users ADD user_name VARCHAR(50) UNIQUE NOT NULL COMMENT 'ユーザー名';
ALTER TABLE users MODIFY sex ENUM('1', '2') COMMENT '性別（1:男性、2:女性）';