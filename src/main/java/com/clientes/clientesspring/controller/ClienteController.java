package com.clientes.clientesspring.controller;

import com.clientes.clientesspring.handle.ClienteException;
import com.clientes.clientesspring.model.Cliente;
import com.clientes.clientesspring.service.ClienteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    Logger logger = LogManager.getLogger(ClienteService.class);

    @Autowired
    ClienteService clienteService;


    @GetMapping
    public void getClientes(){
        clienteService.getClientes();
    }
    @GetMapping("/{id}")
    public void getbyId(@PathVariable Long id){
        clienteService.getClienteId(id);
    }

    @PostMapping
    public void createCliente(Cliente cliente){
        clienteService.createCliente();
    }
    @PutMapping("/{id}")
    public void updateCliente(@PathVariable Long id,@RequestBody Cliente c) throws ClienteException {
        clienteService.updateCliente(c,id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }




}
