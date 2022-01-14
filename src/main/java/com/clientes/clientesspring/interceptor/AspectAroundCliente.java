package com.clientes.clientesspring.interceptor;

import com.clientes.clientesspring.annotations.CustomMethodAnnotation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Aspect
@Component
public class AspectAroundCliente {

        Logger logger = LogManager.getLogger(AspectAfterCliente.class);

//        @Pointcut("execution(* com.clientes.clientesspring.service.ClienteService.*(..))")
        @Pointcut("execution(* com.clientes.clientesspring.service.ClienteService.*(..))  "
                + "&& !execution(* com.clientes.clientesspring.service.ClienteService.deleteCliente(..))")
        void servicesClassMethods() {}

        @Around("servicesClassMethods()")
        Object aroundAdviceMethod(ProceedingJoinPoint joinPoint) throws Throwable {
            long start = System.nanoTime();
            Object ret = joinPoint.proceed();
            long end = System.nanoTime();

            logger.info("Se ejecutó el metodo con una duración de {} ms", TimeUnit.NANOSECONDS.toMillis(end - start));
            return ret;
        }

}
