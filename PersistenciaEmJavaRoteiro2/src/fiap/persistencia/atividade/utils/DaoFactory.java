package fiap.persistencia.atividade.utils;

import fiap.persistencia.atividade.interfaces.ClienteDao;
import fiap.persistencia.atividade.interfaces.PedidoDao;
import fiap.persistencia.atividade.mySqlDao.MySqlDaoFactory;
import fiap.persistencia.atividade.sqlServer.SqlServerDaoFactory;


/* classe abstrata nao permite ser instanciada
 * 
 */
public abstract class DaoFactory {
	// Lista de tipos suportados pelo factory
	public static final int MYSQL = 1;
	public static final int SQLSERVER = 2;

	// Teremos um método para cada DAO criado.
	// As classes "factory" concretas
	// implementarão estes métodos
	public abstract ClienteDao getClientesDao();
	public abstract PedidoDao getPedidosDao();

	public static DaoFactory getDaoFactory(int tipo) {
		switch (tipo) {
		case MYSQL:	    return new MySqlDaoFactory();
		case SQLSERVER: return new SqlServerDaoFactory();
		default:		return null;
		}
	}
}
