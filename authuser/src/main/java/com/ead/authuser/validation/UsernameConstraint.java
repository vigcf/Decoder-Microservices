package com.ead.authuser.validation;

import com.ead.authuser.validation.impl.UsernameConstraintImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/*
 Interface responsável por criar a anotação UsernameContraint
 *@Constraint -> Classe que vai conter essa validação especifica
 *@Target -> Qual será o alvo dessas anotações / metódos e campos
 *@Retention -> Quando irá ocorrer (em tempo de execução / Runtime)
 * */
@Documented
@Constraint(validatedBy = UsernameConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UsernameConstraint {

    /*
    Parâmetros default:
    * message -> Mensagem que retornará ao ocorrer determinado erro
    * groups -> Grupo de validação, caso precise definir
    * payload -> Nível que ocorrerá determinado erro
    * */
    String message() default "Invalid username";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
