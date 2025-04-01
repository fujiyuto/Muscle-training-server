CREATE TABLE IF NOT EXISTS training_menus
(
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) UNIQUE NOT NULL COMMENT 'トレーニング名',
    explanation TEXT COMMENT '説明',
    video_url TEXT COMMENT '動画URL',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) COMMENT 'トレーニングメニューテーブル';