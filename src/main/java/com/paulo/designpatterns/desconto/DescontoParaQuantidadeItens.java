package com.paulo.designpatterns.desconto;

import com.paulo.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaQuantidadeItens extends Desconto {

    public DescontoParaQuantidadeItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

}
