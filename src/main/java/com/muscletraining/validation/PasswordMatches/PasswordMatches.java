package com.muscletraining.validation.PasswordMatches;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint(validatedBy = PasswordMatchesValidator.class)
@Target( {ElementType.TYPE} )
public @interface PasswordMatches {
    String message() default "{validation.password.mismatch}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String fieldName();
    String checkFieldName();
}
