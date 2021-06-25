package com.paulo.designpatterns.orcamento.situacao;

import com.paulo.designpatterns.DomainException;
import com.paulo.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) { throw new DomainException("Orçamento não pode ser aprovado!");  }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finaliado!");
    }
}
