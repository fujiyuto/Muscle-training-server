CREATE TABLE IF NOT EXISTS training_records
(
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    training_date DATE NOT NULL COMMENT 'トレーニング日',
    training_time TIME NOT NULL COMMENT 'トレーニング時間',
    training_menu_id BIGINT UNSIGNED NOT NULL COMMENT 'トレーニングメニューID',
    repetitions INT UNSIGNED NOT NULL COMMENT '回数',
    weight DECIMAL(5,2) NOT NULL COMMENT '重量',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (training_menu_id) 
        REFERENCES training_menus(id)
        ON DELETE CASCADE
) COMMENT 'トレーニング記録テーブル';