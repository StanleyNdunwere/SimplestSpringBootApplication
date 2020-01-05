package com.centdom.basicspringmvc.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {

    private String name;
    private String address;
    private String postcode;
    private String email;


}


