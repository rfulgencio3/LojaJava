import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        ICMS icms = new ICMS();
        ISS iss = new ISS();

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, icms));
    }
}
