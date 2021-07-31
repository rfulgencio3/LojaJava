import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import imposto.ISS;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamentoUm = new Orcamento();
        orcamentoUm.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento orcamentoDois = new Orcamento();
        orcamentoDois.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        Orcamento orcamentoTres = new Orcamento();
        orcamentoTres.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamentoUm));
        System.out.println(calculadora.calcular(orcamentoDois));
        System.out.println(calculadora.calcular(orcamentoTres));
    }
}
