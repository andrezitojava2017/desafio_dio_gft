package com.dio.banco.gft.model;

public class DepositosConta {

    private double valorDeposito;
    private String data;
    private String descricao;

    public DepositosConta() {
    }

    public DepositosConta(double valorDeposito, String data, String descricao) {
        this.valorDeposito = valorDeposito;
        this.data = data;
        this.descricao = descricao;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
