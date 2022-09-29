package br.com.rgrmra.banco.contas;

public class ContaPoupanca extends Conta {

    private void rendimento() {

    }


    @Override
    public void imprimirExtrato() {
        System.out.print("EXTRATO DA CONTA POUPANÇA ");
        imprimirInformacoes();
    }
}
