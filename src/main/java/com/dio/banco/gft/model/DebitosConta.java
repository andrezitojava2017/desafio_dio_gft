package com.dio.banco.gft.model;

import java.util.ArrayList;
import java.util.List;

public class DebitosConta{

    private double valorDebito;
    private String data;
    private List<DebitosConta> debitos;

    public DebitosConta() {
        this.debitos = new ArrayList<>();
        DebitosConta debt1 = new DebitosConta(200.00, "01/02/2022");
        DebitosConta debt2 = new DebitosConta(20.00, "02/02/2022");
        DebitosConta debt3 = new DebitosConta(2.00, "02/02/2022");
        DebitosConta debt4 = new DebitosConta(150.10, "01/02/2022");
        DebitosConta debt5 = new DebitosConta(45.20, "01/02/2022");
        DebitosConta debt6 = new DebitosConta(81.00, "06/02/2022");
        DebitosConta debt7 = new DebitosConta(12.10, "06/02/2022");

        debitos.add(debt1);
        debitos.add(debt2);
        debitos.add(debt3);
        debitos.add(debt4);
        debitos.add(debt5);
        debitos.add(debt6);
        debitos.add(debt7);

    }

    public DebitosConta(double valorDebito, String data) {
        this.valorDebito = valorDebito;
        this.data = data;
    }

    public double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<DebitosConta> getDebitos() {
        return debitos;
    }

    /**
     * Calcula os debitos da conta
     * @return Double total
     */
    public double getTotalDebitos(){
        double total = 0;

        total = debitos.stream().
                mapToDouble(db -> db.valorDebito)
                .sum();

        return total;
    }

}
