package com.validation.advice.validator;

import com.validation.advice.anotation.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public void initialize(ValidName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override // acá se van a hacer las validaciones
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null || value.isEmpty() || value.length() > 15 || value.length() < 3 || !Character.isUpperCase(value.charAt(0))) {
            return false;
        }
/*
        // el valor no puede ser nulo
        if(value == null) {
            return false;
        }
        // el valor no puede estar vacio
        if(value.isEmpty()) {
            return false;
        }
        // el valor no puede ser mayor a 15 caracteres
        if(value.length() > 15) {
            return false;
        }
        //el valor no puede ser menor a 3
        if(value.length() < 3) {
            return false;
        }
        // el valor debe tener el primer caracter en mayúscula
        if(!Character.isUpperCase(value.charAt(0))) { // si el primer caracter no es mayúscula
            return false
        }
        */
        return true;
    }
}
