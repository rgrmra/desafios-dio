package com.dio.me.gof.subsistema.cep;

import com.dio.me.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public static String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public static String recuperarEstado(String cep) {
        return "SP";
    }

}
