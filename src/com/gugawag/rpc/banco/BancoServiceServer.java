package com.gugawag.rpc.banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class BancoServiceServer extends UnicastRemoteObject implements BancoServiceIF {


    private List<Conta> contas;

    public BancoServiceServer() throws RemoteException {
        contas = new ArrayList<Conta>();
    }


    @Override
    public double saldo(String conta) throws RemoteException {
        return this.pesquisa(conta).saldo;
    }

    @Override
    public int quantidade() throws RemoteException {
        return contas.size();
    }

    @Override
    public void adicionar(String numero){
        Conta conta = new Conta(numero);
        contas.add(conta);
    }

    @Override
    public Conta pesquisa(String conta){
        Conta contaEncontrada  = this.contas.stream().filter(x -> x.getId().equals(conta))
                .findFirst().orElseThrow();
        System.out.println("Conta encontrada de ID " + contaEncontrada.getId());
        return contaEncontrada;
    }

    @Override
    public boolean remove(String id){
        boolean removeu = this.contas.removeIf(x->x.getId().equals(id));
        return removeu;
    }

}
