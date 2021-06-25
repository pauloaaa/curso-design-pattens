package com.paulo.designpatterns.pedido;

import com.paulo.designpatterns.orcamento.ItemOrcamento;
import com.paulo.designpatterns.orcamento.Orcamento;
import com.paulo.designpatterns.pedido.acao.AcaoGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(geraPedido.getValor()));
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
