package br.com.alltech.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sistema-a")
public class SistemaA {

    @GET
    public String sistemaA(){
        return "Alltech Soluções em Tecnologia - Bem vindo ao sistema >>A<<";
    }
}