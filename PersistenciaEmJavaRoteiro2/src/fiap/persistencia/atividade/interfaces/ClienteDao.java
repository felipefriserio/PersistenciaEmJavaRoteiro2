package fiap.persistencia.atividade.interfaces;

import fiap.persistencia.atividade.modelo.Cliente;

public interface ClienteDao {
	Cliente inserirCliente(Cliente cliente) throws Exception;
	Cliente buscarCliente(int id) throws Exception;
}
