package com.centdom.basicspringmvc.annotationsInterfaces;

import com.centdom.basicspringmvc.annotationClasses.BeginsWithValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = BeginsWithValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BeginsWith {

    //data to validate against
    public String startsWith() default "NGR";

    //message in case validation fails
    public String message() default  "Must start with NGR";

    //groups
    public Class<?>[] groups() default {};

    //payload
    public Class<? extends Payload>[] payload() default {};
}
