package com.paulo.designpatterns;

import com.paulo.designpatterns.desconto.CalcularDescontos;
import com.paulo.designpatterns.imposto.CalculadoraImpostos;
import com.paulo.designpatterns.imposto.ICMS;
import com.paulo.designpatterns.imposto.ISS;
import com.paulo.designpatterns.orcamento.ItemOrcamento;
import com.paulo.designpatterns.orcamento.Orcamento;
import com.paulo.designpatterns.pedido.GeraPedido;
import com.paulo.designpatterns.pedido.GeraPedidoHandler;
import com.paulo.designpatterns.pedido.Pedido;
import com.paulo.designpatterns.pedido.acao.EnviarEmailPedido;
import com.paulo.designpatterns.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        System.out.println(calculadoraImpostos.calcular(orcamento, new ISS(null)));

        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        CalculadoraImpostos calculadoraImpostos1 = new CalculadoraImpostos();
        System.out.println(calculadoraImpostos1.calcular(orcamento1, new ISS(new ICMS(null))));

        CalcularDescontos calcularDescontos = new CalcularDescontos();
        System.out.println(calcularDescontos.calcular(orcamento));

        GeraPedido geraPedido = new GeraPedido("Paulo Arruda", new BigDecimal("300"), 2);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new EnviarEmailPedido(), new SalvarPedido()));
        geraPedidoHandler.executar(geraPedido);



    }
}
