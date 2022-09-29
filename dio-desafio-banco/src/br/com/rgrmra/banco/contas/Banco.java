package br.com.rgrmra.banco.contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<ContaCorrente> contasCorrentes = new ArrayList<>();
    private List<ContaPoupanca> contasPoupancas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void criarConta(TipoConta conta) {
        if (conta == TipoConta.CORRENTE) {
            ContaCorrente contaCorrente = new ContaCorrente();
            contasCorrentes.add(contaCorrente);
        } else if (conta == TipoConta.POUPANCA){
            ContaPoupanca contaPoupanca = new ContaPoupanca();
            contasPoupancas.add(contaPoupanca);
        }
    }

    public void imprimirContas() {
        System.out.println("EXTRATO DO " + nome.toUpperCase());
        for (Conta conta : contasCorrentes) {
            conta.imprimirExtrato();
        }
        for (Conta conta : contasPoupancas) {
            conta.imprimirExtrato();
        }
    }


}
