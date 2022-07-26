import entidades.banco.Banco;
import entidades.clientes.Clientes;
import entidades.contas.ContaBancaria;
import entidades.contas.ContaCorrente;
import entidades.contas.ContaPoupanca;
import entidades.contas.ContaSalario;

public class Main {
    public static void main(String[] args) {
        Clientes michael = new Clientes();
        michael.setName("Michael");

        Clientes adriana = new Clientes();
        adriana.setName("Adriana");

        ContaBancaria cc = new ContaCorrente(michael);
        ContaBancaria cp = new ContaPoupanca(michael);
        ContaBancaria cs = new ContaSalario(adriana);

        Banco banco = new Banco();
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cs);
        banco.exibirContas();

        cc.depositar(150);
        cc.trasferencia(100, cp);

        cc.verSaldo();
        cp.verSaldo();
        cs.verSaldo();
        cs.trasferencia(100, cp);
    }
}
