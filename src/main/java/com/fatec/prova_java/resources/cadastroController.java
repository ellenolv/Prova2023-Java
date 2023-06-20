package com.fatec.prova_java.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.prova_java.entities.Empresas;

@RestController
public class cadastroController {

    @GetMapping("cadastro-empresa")
    public Empresas cadastroEmpresa(){
        Empresas e = new Empresas();

        e.setId(1);
        e.setRazaoSocial("SUBWAY DO BRASIL LTDA");
        e.setCnpj("02.891.567/0001-20");
        e.setDelivery(true);
        e.setEndereco("Av. Dr. Ermelindo Maffei, 1199 - São Luiz, Itu - SP, 13304-305");
        e.setNumber(15151515);
     
        return e;
    }
}
