import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.Pedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.LogDePedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente;
        BigDecimal valorOrcamento;
        int quantidadeItens = Integer.parseInt("4");

        Scanner input = new Scanner(System.in);

        System.out.print("Client name: ");
        cliente = input.next();

        System.out.print("Budget value: ");
        valorOrcamento = input.nextBigDecimal();

        System.out.print("Quantity: ");
        quantidadeItens = input.nextInt();

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                    new SalvarPedidoNoBancoDeDados(),
                    new EnviarEmailPedido(),
                    new LogDePedido()
                ));
        handler.execute(gerador);
    }
}
