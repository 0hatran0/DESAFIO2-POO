package app;

import domain.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Venilton","111.111.111-11");
        c1.setTelefone("(11) 91111-1111");
        Cliente c2 = new Cliente("Luan","222.222.222-22");
        c2.setTelefone("(22) 92222-2222");

        Conta cc = new ContaCorrente(c1);

        Conta cp = new ContaPoupanca(c2);

        Banco banco = new Banco();

        banco.addContas(cc);

        banco.addContas(cp);

        banco.retornarContas();


        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}