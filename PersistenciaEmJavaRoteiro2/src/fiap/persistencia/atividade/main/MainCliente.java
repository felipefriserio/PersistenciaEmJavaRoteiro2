package fiap.persistencia.atividade.main;

import fiap.persistencia.atividade.interfaces.ClienteDao;
import fiap.persistencia.atividade.modelo.Cliente;
import fiap.persistencia.atividade.utils.DaoFactory;

public class MainCliente {
	
	public static void main(String[] args) {
		try {
			ClienteDao clienteDao = DaoFactory.getDaoFactory(DaoFactory.MYSQL).getClientesDao();
			clienteDao.inserirCliente(new Cliente(0,"Felipe", "@"));
			
			clienteDao.buscarCliente(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
