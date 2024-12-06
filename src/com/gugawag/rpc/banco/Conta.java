package com.gugawag.rpc.banco;

import java.io.Serializable;

public class Conta implements Serializable {
    public String id;
    public double saldo;

    public Conta(String id) {
        this.id = id;
        this.saldo = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta -> " +
                "numero='" + id + '\'' +
                ", saldo=" + saldo;
    }
}
