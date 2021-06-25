package com.paulo.designpatterns.pedido;

import com.paulo.designpatterns.orcamento.ItemOrcamento;
import com.paulo.designpatterns.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valor;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valor, int quantidadeItens) {
        this.cliente = cliente;
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(valor));
        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
