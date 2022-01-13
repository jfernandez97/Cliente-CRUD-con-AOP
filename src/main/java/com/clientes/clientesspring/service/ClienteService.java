package com.clientes.clientesspring.service;

import com.clientes.clientesspring.annotations.CustomMethodAnnotation;
import com.clientes.clientesspring.handle.ClienteException;
import com.clientes.clientesspring.model.Cliente;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    Logger logger = LogManager.getLogger(ClienteService.class);
    public void getClientes (){
        logger.info("Se devuelve una Lista de clientes");
    }
    public void createCliente(){
        logger.info("Se crea un cliente");
    }
    @CustomMethodAnnotation
    public void updateCliente(Cliente c,Long id) throws ClienteException {
        if(c.getName() == "" || c.getName()==null){
            throw new ClienteException("Nombre de cliente vacio");
        }
        logger.info("Se actualiza un cliente"+c);
    }
    public void getClienteId(Long id){
        logger.info("Se devuelve cliente con ID: "+id);
    }
    @CustomMethodAnnotation
    public void deleteCliente(Long id){
        logger.info("Se borra un cliente con el ID: "+id);
    }

}
