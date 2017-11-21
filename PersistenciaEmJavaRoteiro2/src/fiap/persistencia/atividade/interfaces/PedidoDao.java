package fiap.persistencia.atividade.interfaces;

import java.util.List;

import fiap.persistencia.atividade.modelo.Pedido;

public interface PedidoDao {
	Pedido incluirPedido(Pedido pedido) throws Exception;
	List<Pedido> listarPedidos(int idCliente) throws Exception;
}
