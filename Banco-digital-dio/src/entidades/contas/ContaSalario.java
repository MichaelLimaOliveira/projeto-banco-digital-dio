package entidades.contas;

import entidades.clientes.Clientes;

import javax.swing.*;

public class ContaSalario extends ContaBancaria {

    public ContaSalario(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void verSaldo() {
        System.out.println("=== Extrato Conta Salario ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void trasferencia(double valor, ContaBancaria contaDestino) {
        JOptionPane.showMessageDialog(null, "Imposivel fazer trasferencia em conta salario");
    }


}
