package com.dio.banco.gft.model;

public class Banco {

    private int numeroBanco;
    private String cnpj;
    private String contato;

    public Banco(int numeroBanco, String cnpj, String contato) {
        this.numeroBanco = numeroBanco;
        this.cnpj = cnpj;
        this.contato = contato;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getContato() {
        return contato;
    }
}
