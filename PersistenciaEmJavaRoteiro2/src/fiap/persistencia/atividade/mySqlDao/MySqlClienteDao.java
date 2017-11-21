package fiap.persistencia.atividade.mySqlDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fiap.persistencia.atividade.interfaces.ClienteDao;
import fiap.persistencia.atividade.modelo.Cliente;

public class MySqlClienteDao implements ClienteDao {

	Connection cn = null;
	ResultSet rs;
	PreparedStatement stmt;

	@Override
	public Cliente inserirCliente(Cliente cliente) throws Exception{
		try {
			cn = MySqlDaoFactory.criarConexao();
			stmt = cn.prepareStatement("INSERT INTO CLIENTES (NOME,EMAIL) VALUES (?,?)",stmt.RETURN_GENERATED_KEYS);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.executeUpdate();
			
			rs = stmt.getGeneratedKeys();
			
			if (rs.next())
				cliente.setId(rs.getInt(1));
			
		} catch (Exception e) {
			throw e;
		} finally {
			cn.close();
		}
		return cliente;
	}

	@Override
	public Cliente buscarCliente(int id) throws Exception {
		try {
			cn = MySqlDaoFactory.criarConexao();
			stmt = cn.prepareStatement("SELECT * FROM CLIENTES WHERE IDCLIENTE = ?");
			stmt.setInt(1, id);		

			rs = stmt.getGeneratedKeys();
			
			if (rs.next()) 
				return new Cliente(rs.getInt("idcliente"),rs.getString("nome"),rs.getString("email"));
			
		} catch (Exception e) {
			throw e;
		}
		return null;
	}
}
