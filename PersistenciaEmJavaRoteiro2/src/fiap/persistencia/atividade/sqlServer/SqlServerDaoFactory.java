package fiap.persistencia.atividade.sqlServer;

import fiap.persistencia.atividade.interfaces.ClienteDao;
import fiap.persistencia.atividade.interfaces.PedidoDao;
import fiap.persistencia.atividade.utils.DaoFactory;

public class SqlServerDaoFactory extends DaoFactory{
	public ClienteDao getClientesDao() {
		return null;
	}
	public PedidoDao getPedidosDao() {
		return null;
	}
}
