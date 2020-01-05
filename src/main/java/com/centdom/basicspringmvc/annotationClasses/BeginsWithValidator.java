package com.centdom.basicspringmvc.annotationClasses;

import com.centdom.basicspringmvc.annotationsInterfaces.BeginsWith;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BeginsWithValidator implements ConstraintValidator<BeginsWith, String> {
    private String code;

    @Override
    public void initialize(BeginsWith constraintAnnotation) {
        code = constraintAnnotation.startsWith();

    }

    @Override
    public boolean isValid(String entry, ConstraintValidatorContext constraintValidatorContext) {
        return entry.toLowerCase().startsWith(code);
    }
}
