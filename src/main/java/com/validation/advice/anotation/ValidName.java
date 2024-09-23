package com.validation.advice.anotation;

import com.validation.advice.validator.ValidNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented // es para documentar la aplicación, es de la metadata de sprint, tod queda en el javadoc
@Constraint(validatedBy = ValidNameValidator.class) // esto une esta anotación con la funcionalidad
@Retention(RetentionPolicy.RUNTIME) // esto es para convertir tod esto en un array de byte y tenerlo en memoria y se va a ejecutar esta anotación cuando la aplicación se ejecute */
@Target({ElementType.FIELD, ElementType.METHOD}) // esto indica que se puede usar tanto en métodos como en campos de atributos
public @interface ValidName { // el @ se utiliza para indicar que es una anotación
    String message() default "{custom.validation.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
