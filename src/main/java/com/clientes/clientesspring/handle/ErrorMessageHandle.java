package com.clientes.clientesspring.handle;

import com.clientes.clientesspring.service.ClienteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorMessageHandle {
    Logger logger = LogManager.getLogger(ClienteService.class);

    @ResponseBody
    @ExceptionHandler(ClienteException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ErrorMessage messageErrorHandle(ClienteException ex){
        logger.error(ex);
        return new ErrorMessage(ex.getMessage());
    }

}
