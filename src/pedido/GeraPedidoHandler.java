package pedido;

import orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //constructor com injeção de dependências: repository, service, etc.

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar Pedido no banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
