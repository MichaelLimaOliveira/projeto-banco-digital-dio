package entidades.contas;

import entidades.clientes.Clientes;
import entidades.interfaces.IConta;
public abstract class ContaBancaria implements IConta {
    private static int SEQUENCIAL = 1;
    private static final Integer AGENCIA_PADRAO = 1441;
    protected Integer angencia;
    protected Integer conta;
    protected double saldo;
    protected Clientes cliente;

    public ContaBancaria(Clientes cliente) {
        this.angencia = ContaBancaria.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public Integer getAngencia() {
        return angencia;
    }

    public Integer getConta() {
        return conta;
    }

    public Clientes getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + this.cliente.getName());
        System.out.printf("Agencia: %d%n", this.angencia);
        System.out.printf("Conta: %d%n", this.conta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void trasferencia(double valor, ContaBancaria contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
