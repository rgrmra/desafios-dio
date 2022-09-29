package com.dio.me.gof.subsistema.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Criente salvo no sistema de CRM.");
        System.out.println("Cliente: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade + " - " + estado);
    }
}
