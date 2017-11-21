package fiap.persistencia.atividade.mySqlDao;


import java.util.List;

import fiap.persistencia.atividade.interfaces.PedidoDao;
import fiap.persistencia.atividade.modelo.Pedido;

public class MySqlPedidoDao implements PedidoDao{

	public Pedido incluirPedido(Pedido pedido) throws Exception {
		return pedido;
	}

	public List<Pedido> listarPedidos(int idCliente) throws Exception {
		return null;
	}

}
