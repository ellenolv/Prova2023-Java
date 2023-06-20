package com.fatec.prova_java.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.prova_java.entities.Empresas;

@RestController
public class cadastroController {

    @GetMapping("empresa")
    public Empresas cadastroEmpresa(){
        Empresas e = new Empresas(1, "BK BRASIL OPERACAO E ASSESSORIA A RESTAURANTES S.A.", 56565656, false, "13.574.594/0001-96"," Avenida Puglisi, 153 Pitangueiras Guaruja, SP CEP: 11.410-001");

        e.setId(1);
        e.setRazaoSocial("SUBWAY DO BRASIL LTDA");
        e.setCnpj("02.891.567/0001-20");
        e.setDelivery(true);
        e.setEndereco("Av. Dr. Ermelindo Maffei, 1199 - São Luiz, Itu - SP, 13304-305");
        e.setNumber(15151515);
     
        return e;
    }

@GetMapping("empresas")
public List<Empresas> getEmpresas() {
    List <Empresas> empresas = new ArrayList<Empresas>();

    Empresas e1 = new Empresas(1, "BK BRASIL OPERACAO E ASSESSORIA A RESTAURANTES S.A.", 15151515, true, "13.574.594/0001-96", "endereco Avenida Puglisi, 153 Pitangueiras Guaruja, SP CEP: 11.410-001");
    Empresas e2 = new Empresas(2, "Arcos Dourados Comercio de Alimentos Ltda", 989514651, false, "42.591.651/0760-42", "Av Francisco Prestes Maia, 1061, Santa Terezinha, Sao Bernardo Do Campo SP, CEP 09770-000 Brasil");
    empresas.add(e1);
    empresas.add(e2);
    return empresas;
}
}
