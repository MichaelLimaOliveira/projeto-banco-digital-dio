package entidades.interfaces;

import entidades.contas.ContaBancaria;

public interface IConta {
    void sacar(double valor);

    void verSaldo();

    void depositar(double valor);

    void trasferencia(double valor, ContaBancaria contaDestino);
}
