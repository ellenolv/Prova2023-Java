package com.fatec.prova_java.entities;

public class Empresas {
    private int id;
    private String razaoSocial;
    private int number;
    private boolean delivery;
    private String cnpj;
    private String endereco;


    public Empresas(int id, String razaoSocial, int number, boolean delivery, String cnpj, String endereco) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.number = number;
        this.delivery = delivery;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isDelivery() {
        return delivery;
    }
    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
