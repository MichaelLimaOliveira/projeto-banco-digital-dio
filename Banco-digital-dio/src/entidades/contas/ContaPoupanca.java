package entidades.contas;

import entidades.clientes.Clientes;

public class ContaPoupanca extends  ContaBancaria {
    public ContaPoupanca(Clientes cliente) {
        super(cliente);
    }

    @Override
    public void verSaldo() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
