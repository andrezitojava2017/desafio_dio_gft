package com.dio.banco.gft.model;

public class Corrente extends Conta{

    public Corrente() {
    }

    public Corrente(int numeroConta, int numeroAgencia, Correntista correntista) {
        super(numeroConta, numeroAgencia, correntista);
    }
}
