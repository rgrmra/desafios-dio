package br.com.rgrmra.banco.contas.clientes;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String senha;

    final private Scanner scanner = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    private String chamarScanner(String message) {
        System.out.println(message);
        String nome = scanner.nextLine();
        if (nome == null || nome.length() < 1)
            chamarScanner(message);
        return nome;
    }

    public boolean verificarSenha() {
        return this.senha.equals(criptografar(chamarScanner("Digite sua Senha:")));
    }

    private String criptografar(String senha) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(senha.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch( NoSuchAlgorithmException e) {
            System.out.println("Algo deu errado ao registrar suas senhas...");
            return null;
        }
    }

    public void registrarCliente() {
        this.nome = chamarScanner("Digite o nome do Cliente:");
        this.sobrenome = chamarScanner("Digite o sobrenome do Cliente:");
        this.senha = criptografar(chamarScanner("Insira uma senha"));
    }
}
