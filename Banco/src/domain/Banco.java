package domain;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public List<Conta> getContas() {
//        return contas;
//    }

    public void retornarContas() {
        for (Conta conta : contas) {
            conta.imprimirInfosComuns();
            System.out.println();
        }
    }

    public void addContas(Conta conta) {
        this.contas.add(conta);
    }

}
