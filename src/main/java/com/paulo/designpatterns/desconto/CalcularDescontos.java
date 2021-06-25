package com.paulo.designpatterns.desconto;

import com.paulo.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoParaQuantidadeItens(
                new DescontoComValorMaior(new SemDesconto()));

        return desconto.efetuarCalculo(orcamento);
    }
}
