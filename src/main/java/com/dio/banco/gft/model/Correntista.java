package com.dio.banco.gft.model;

public class Correntista {

    private String nomeCorrentista;
    private String cpfCorrentista;

    public Correntista(String nomeCorrentista, String cpfCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
        this.cpfCorrentista = cpfCorrentista;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public String getCpfCorrentista() {
        return cpfCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public void setCpfCorrentista(String cpfCorrentista) {
        this.cpfCorrentista = cpfCorrentista;
    }
}
