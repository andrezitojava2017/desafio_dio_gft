package com.dio.banco.gft.model;

import java.util.List;

public class Conta {

    private int numeroConta;
    private int numeroAgencia;
    private Correntista correntista;
    private double saldo;
    private List<DebitosConta> debitos;
    private List<DepositosConta> depositos;

    public Conta() {
    }

    public Conta(int numeroConta, int numeroAgencia, Correntista correntista) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.correntista = correntista;
    }

    public Conta(int numeroConta, int numeroAgencia) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<DebitosConta> getDebitos() {
        return debitos;
    }

    public void setDebitos(List<DebitosConta> debitos) {
        this.debitos = debitos;
    }

    public List<DepositosConta> getDepositos() {
        return depositos;
    }

    public void setDepositos(List<DepositosConta> depositos) {
        this.depositos = depositos;
    }
}
