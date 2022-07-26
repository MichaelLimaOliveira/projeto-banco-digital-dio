package entidades.contas;

import entidades.clientes.Clientes;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(Clientes clientes) {
        super(clientes);
    }

    @Override
    public void verSaldo() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
