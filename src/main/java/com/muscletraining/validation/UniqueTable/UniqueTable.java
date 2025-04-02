package com.muscletraining.validation.UniqueTable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = UniqueTableValidator.class)
@Target( {ElementType.FIELD, ElementType.ANNOTATION_TYPE} )
public @interface UniqueTable {
    String message() default "{validation.unique}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String tableName();
    String columnName();
}
