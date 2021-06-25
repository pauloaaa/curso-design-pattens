package com.paulo.designpatterns.pedido.acao;

import com.paulo.designpatterns.pedido.Pedido;

public class EnviarEmailPedido implements AcaoGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar email com o pedido!");
    }
}
