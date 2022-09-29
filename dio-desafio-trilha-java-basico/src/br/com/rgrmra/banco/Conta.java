package br.com.rgrmra.banco;

import java.util.Scanner;
/**
 * <h1>Conta</h1>
 * <p>Essa classe simula a conta de uma pessoa em um banco.</p>
 * <p>Ela insere e envia seus próprios valores através de Getters e Setters, e impede que o cliente envie um valor que não seja válido, impedindo que o programa quebre.</p>
 *
 * @author rgrmra
 * @version 1.1
 * @since 19/08/2022
 */
public class Conta {
    private int  numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    private Scanner scanner;

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o número da conta:");
        try {
            this.numero = scanner.nextInt();
        } catch (Exception exception){
            setNumero();
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia() {
        scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o número da agencia:");
        this.agencia = scanner.nextLine();
        if (this.agencia == null || this.agencia.length() < 1)
            setAgencia();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente() {
        scanner = new Scanner(System.in);
        System.out.println("Por favor, insira seu nome:");
        this.nomeCliente = scanner.nextLine();
        if (nomeCliente == null || nomeCliente.length() < 1)
            setNomeCliente();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        scanner = new Scanner(System.in);
        System.out.println("Por favor, insira seu saldo:");
        try {
            this.saldo = scanner.nextDouble();
        } catch (Exception exception) {
            setSaldo();
        }
    }

    public String getConta() {
        return "\nOlá, " + getNomeCliente() + "!\nObrigado por criar uma conta em nosso banco,"
                + " sua agência é " + getAgencia() + " conta " + getNumero()
                + " e seu saldo de " + getSaldo() + " já está disponível para saque!";
    }

}
