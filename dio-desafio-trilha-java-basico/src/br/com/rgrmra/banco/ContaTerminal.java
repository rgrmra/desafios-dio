package br.com.rgrmra.banco;

/**
 * <h1>Conta do Banco</h1>
 * <p>Essa classe simula a inserção de dados de um cliente na classe Conta.</p>
 * <p>É limitado ao usuário o acesso as variáveis da classe Conta e permitindo o acesso somente pelos Getters e Setters da classe Conta.</p>
 *
 * @author rgrmra
 * @version 1.1
 * @since 19/08/2022
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNomeCliente();
        conta.setAgencia();
        conta.setNumero();
        conta.setSaldo();

        System.out.println(conta.getConta());
    }
}
