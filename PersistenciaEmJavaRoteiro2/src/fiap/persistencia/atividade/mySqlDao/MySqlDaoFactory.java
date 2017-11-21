package fiap.persistencia.atividade.mySqlDao;

import java.sql.Connection;
import java.sql.DriverManager;
import fiap.persistencia.atividade.interfaces.ClienteDao;
import fiap.persistencia.atividade.interfaces.PedidoDao;
import fiap.persistencia.atividade.utils.DaoFactory;

public class MySqlDaoFactory extends DaoFactory {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/vendas";

	public static Connection criarConexao() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, "root", "fiap");
	}
	
	@Override
	public ClienteDao getClientesDao() {
		return new MySqlClienteDao();
	}

	@Override
	public PedidoDao getPedidosDao() {
		return new MySqlPedidoDao();
	}
}
