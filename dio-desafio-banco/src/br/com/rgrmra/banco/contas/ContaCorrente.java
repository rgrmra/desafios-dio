package br.com.rgrmra.banco.contas;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.print("EXTRATO DA CONTA CORRENTE ");
        imprimirInformacoes();
    }
}
