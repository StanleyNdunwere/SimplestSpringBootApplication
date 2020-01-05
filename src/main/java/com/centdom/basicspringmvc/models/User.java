package com.centdom.basicspringmvc.models;

import com.centdom.basicspringmvc.annotationsInterfaces.BeginsWith;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
@Data
public class User {

    @NotNull
    @NotEmpty
    @Size(min = 1, message = "Please Enter a valid name")
    private String name;

    @NotNull
    @NotEmpty
    @Length(min = 1, message = "Please Enter a valid address")
    private String address;

    @NotNull
    @NumberFormat
    @Length(min = 3, max = 6, message = "Please Enter a valid postcode ")
    private String postcode;

    @NotNull
    @Email(message = "Please enter a valid email address")
    @Length(min = 3, message = "Enter a valid email address")
    private String email;

    @NotEmpty
    @NotNull
    @BeginsWith(startsWith = "npr", message = "must begin with npr")
    private String countryCode;

}


