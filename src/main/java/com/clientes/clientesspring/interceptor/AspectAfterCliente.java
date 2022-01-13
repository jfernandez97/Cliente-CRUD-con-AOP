package com.clientes.clientesspring.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAfterCliente {

    Logger logger = LogManager.getLogger(AspectAfterCliente.class);

//    @Pointcut("@within(org.springframework.web.bind.annotation.CustomMethodAnnotation)")
    void deleteCliente(){

    }
//    @Pointcut("within(@org.springframework.web.bind.annotation.CustomMethodAnnotation *)")
     void updateCliente(){

    }
}
