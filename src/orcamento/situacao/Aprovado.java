package orcamento.situacao;

import base.DomainException;
import orcamento.Orcamento;

import javax.swing.plaf.basic.BasicBorders;
import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
