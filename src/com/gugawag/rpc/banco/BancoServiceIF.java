package com.gugawag.rpc.banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoServiceIF extends Remote {

    double saldo(String conta) throws RemoteException;
    int quantidade() throws RemoteException;

    void adicionar(String id) throws RemoteException;

    Conta pesquisa(String id) throws RemoteException;

    boolean remove(String id) throws RemoteException;
}
