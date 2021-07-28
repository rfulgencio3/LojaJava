import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamentoUm = new Orcamento(new BigDecimal("200"),6);
        Orcamento orcamentoDois = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamentoUm));
        System.out.println(calculadora.calcular(orcamentoDois));
    }
}
