package com.bosch.example.impl;

import com.bosch.example.services.CPFValidator;

public class DefaultCPFValidator implements CPFValidator {
    @Override
    public Boolean validate(String cpf) {
        //bla bla bla
        System.out.println("Validate");
        return true;
    }
}
