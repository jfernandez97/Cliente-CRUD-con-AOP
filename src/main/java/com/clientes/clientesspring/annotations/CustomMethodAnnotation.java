package com.clientes.clientesspring.annotations;

import java.lang.annotation.*;

@Documented
@Target(value={ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomMethodAnnotation {
}
