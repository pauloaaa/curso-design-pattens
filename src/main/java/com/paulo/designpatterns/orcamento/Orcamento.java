package com.paulo.designpatterns.orcamento;

import com.paulo.designpatterns.orcamento.situacao.EmAnalise;
import com.paulo.designpatterns.orcamento.situacao.Finalizado;
import com.paulo.designpatterns.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();

    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDesconto = this.situacao.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDesconto);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel itemOrcamento) {
        this.valor = valor.add(itemOrcamento.getValor());
        this.itens.add(itemOrcamento);
    }
}
