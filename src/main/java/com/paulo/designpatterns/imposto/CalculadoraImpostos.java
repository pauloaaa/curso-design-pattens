package com.paulo.designpatterns.imposto;

import com.paulo.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
