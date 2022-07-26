package entidades.banco;

import entidades.contas.ContaBancaria;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private String name;
    private List<ContaBancaria> contas = new LinkedList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }

    public void adicionarConta(ContaBancaria contaBancaria) {
        contas.add(contaBancaria);
    }

    public void exibirContas() {
        for (ContaBancaria conta : contas ) {
            System.out.println("Titular: "
                    + conta.getCliente().getName()
                    + " Agencia: "
                    + conta.getAngencia()
                    + " Conta: "
                    + conta.getConta());

        }
    }
}
