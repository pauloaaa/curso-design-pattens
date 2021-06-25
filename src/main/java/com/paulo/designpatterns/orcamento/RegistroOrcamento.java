package com.paulo.designpatterns.orcamento;

import com.paulo.designpatterns.DomainException;
import com.paulo.designpatterns.http.HttpAdapter;

import java.util.HashMap;
import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {

        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento finalizado!");
        }

        String URL = "";
        Map<String, Object> dados = new HashMap<>();
        dados.put("valor", orcamento.getValor());
        dados.put("quantidadeItens", orcamento.getQuantidadeItens());

        httpAdapter.post(URL, dados);
    }
}
