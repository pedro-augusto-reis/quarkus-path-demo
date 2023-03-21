package br.com.alltech.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sistema-b")
public class SistemaB {

    @GET
    public String sistemaA(){
        return "Alltech Soluções em Tecnologia - Bem vindo ao sistema >>B<<";
    }
}
