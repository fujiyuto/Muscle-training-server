CREATE TABLE IF NOT EXISTS training_menu_body_parts
(
    id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    training_menu_id BIGINT UNSIGNED NOT NULL COMMENT 'トレーニングメニューID',
    body_part_id BIGINT UNSIGNED NOT NULL COMMENT '部位ID',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (training_menu_id)
        REFERENCES training_menus(id)
        ON DELETE CASCADE,
    FOREIGN KEY (body_part_id)
        REFERENCES body_parts(id)
        ON DELETE CASCADE
) COMMENT 'トレーニングメニューテーブルと部位マスタの中間テーブル';