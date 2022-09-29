package br.com.rgrmra.banco.contas;

import br.com.rgrmra.banco.contas.clientes.Cliente;

public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente = new Cliente();

    private int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

        this.cliente.registrarCliente();
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    private void senhaErrada() {
        System.out.println("SENHA ERRADA!");
    }

    private void receber(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.cliente.verificarSenha()) {
            this.saldo -= valor;
        } else {
            senhaErrada();
        }
    }

    public void depositar(double valor) {
        if (this.cliente.verificarSenha()) {
            this.saldo += valor;
        } else {
            senhaErrada();
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.cliente.verificarSenha()) {
            this.saldo -= valor;
            contaDestino.receber(valor);
        } else {
            senhaErrada();
        }
    }

    public abstract void imprimirExtrato();

    protected void imprimirInformacoes() {
        System.out.println("DE: " + getCliente().getNome().toUpperCase() + " " + getCliente().getSobrenome().toUpperCase());
        System.out.print("AGÊNCIA: " + getAgencia());
        System.out.print(" | CONTA: " + getNumero());
        System.out.printf(" | SALDO: R$ " + getSaldo());
        System.out.println();
    }

}
