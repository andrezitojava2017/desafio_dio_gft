package com.dio.banco.gft.model;

public class Poupanca extends Conta{

    public Poupanca() {
    }

    public Poupanca(int numeroConta, int numeroAgencia, Correntista correntista) {
        super(numeroConta, numeroAgencia, correntista);
    }
}
