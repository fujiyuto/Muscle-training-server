package com.muscletraining.validation.PasswordMatches;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    private String fieldName;
    private String checkFieldName;

    @Override
    public void initialize(PasswordMatches passwordMatchesAnnotation) {
        this.fieldName      = passwordMatchesAnnotation.fieldName();
        this.checkFieldName = passwordMatchesAnnotation.checkFieldName();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(value);
        Object fieldValue = beanWrapper.getPropertyValue(fieldName);
        Object checkFieldValue = beanWrapper.getPropertyValue(checkFieldName);

        // どちらかがNullならチェックしない
        if ( fieldValue == null || checkFieldValue == null ) {
            return true;
        }

        // 2つの値が等しいかチェック
        return fieldValue.equals(checkFieldValue);
    }
}
