package br.com.rgrmra.banco;

import br.com.rgrmra.banco.contas.Banco;
import br.com.rgrmra.banco.contas.TipoConta;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");
        banco.criarConta(TipoConta.CORRENTE);
        banco.criarConta(TipoConta.CORRENTE);
        banco.criarConta(TipoConta.POUPANCA);

        banco.imprimirContas();
    }
}
