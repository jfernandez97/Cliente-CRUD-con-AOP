package com.clientes.clientesspring.handle;

public class ClienteException extends Exception{
    private String message;

    public ClienteException(String message){
        super(message);
    }
}
