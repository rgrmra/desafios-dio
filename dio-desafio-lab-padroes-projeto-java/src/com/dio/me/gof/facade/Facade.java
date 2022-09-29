package com.dio.me.gof.facade;

import com.dio.me.gof.subsistema.cep.CepApi;
import com.dio.me.gof.subsistema.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.recuperarCidade(cep);
        String estado = CepApi.recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
