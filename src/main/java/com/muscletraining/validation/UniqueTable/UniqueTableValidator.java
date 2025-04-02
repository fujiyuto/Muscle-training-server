package com.muscletraining.validation.UniqueTable;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueTableValidator implements ConstraintValidator<UniqueTable,String> {
    private String tableName;
    private String columnName;

    @Override
    public void initialize(UniqueTable annotation) {
        this.tableName  = annotation.tableName();
        this.columnName = annotation.columnName();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if ( tableName.isEmpty() || columnName.isEmpty() ) return false;

        // tableNameとcolumnNameからデータの取得を行い、valueが一意であるかチェック
    }
}
