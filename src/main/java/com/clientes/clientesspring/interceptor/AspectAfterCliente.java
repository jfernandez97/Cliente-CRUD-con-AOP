package com.clientes.clientesspring.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAfterCliente {

    Logger logger = LogManager.getLogger(AspectAfterCliente.class);


//    @Pointcut("@annotation(com.clientes.clientesspring.annotations.CustomMethodAnnotation)")
//     void updateDeleteClient(){
//    }
//    @After("updateDeleteClient()")
//    void afterUpdateDelete(){
//        logger.info("Se ejecutó el after advice luego de la ejecución del método update o delete");
//    }
}
