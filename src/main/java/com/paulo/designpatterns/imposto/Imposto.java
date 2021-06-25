package com.paulo.designpatterns.imposto;

import com.paulo.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = this.realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;

        if (this.outro != null) {
            valorOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
}
