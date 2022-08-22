package com.ead.authuser.specifications;

import com.ead.authuser.models.UserModel;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

/*
 * Path -> Qual será o atributo de UserModel que será filtrado (userType)
 * Spec -> Define o tipo do specification, tipo Equal para valores exatos
 * e tipo Like verifica se tem algum dado com aquele valor da busca.
 */
public class SpecificationTemplate {

    @And({
            @Spec(path = "email", spec = Like.class),
            @Spec(path = "userType", spec = Equal.class),
            @Spec(path = "userStatus", spec = Equal.class)

    })
    public interface UserSpec extends Specification<UserModel> {
    }
}