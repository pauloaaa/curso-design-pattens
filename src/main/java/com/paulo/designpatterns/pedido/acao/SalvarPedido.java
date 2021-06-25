package com.paulo.designpatterns.pedido.acao;

import com.paulo.designpatterns.pedido.Pedido;

public class SalvarPedido implements AcaoGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no banco de dados!");
    }
}
