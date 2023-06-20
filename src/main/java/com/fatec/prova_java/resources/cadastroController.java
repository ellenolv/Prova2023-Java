package com.fatec.prova_java.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cadastroController {
    @GetMapping("cadastro-empresa")
    public String cadastroEmpresa(){
        return "end point";
    }
}
