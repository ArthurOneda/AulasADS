package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.Banco;

public class BancoDAO {
	public void Insert(Banco banco) {
		final String comando = "INSERT INTO banco (codigo, nome, mascara_agencia, mascara_conta) VALUES (?, ?, ?, ?)";
		if (banco == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, banco.getCodigo());
			pstm.setString(2, banco.getNome());
			pstm.setString(3, banco.getMascaraAgencia());
			pstm.setString(4, banco.getMascaraConta());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(Banco banco) {
		final String comando = "UPDATE banco SET nome = ?, mascara_agencia = ?, mascara_conta = ? WHERE codigo = ? ";
		if (banco == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, banco.getNome());
			pstm.setString(2, banco.getMascaraAgencia());
			pstm.setString(3, banco.getMascaraConta());
			pstm.setLong(4, banco.getCodigo());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long codigo) {
		final String comando = "DELETE FROM banco WHERE codigo = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, codigo);
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public Banco FindByID(Long codigo) {
		final String comando = "SELECT a.nome, a.mascara_agencia, a.mascara_conta FROM banco a WHERE a.codigo = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Banco banco;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, codigo);
			result = pstm.executeQuery();
			if (result.next()) {
				banco = new Banco();
				banco.setCodigo(codigo);
				banco.setNome(result.getString(1));
				banco.setMascaraAgencia(result.getString(2));
				banco.setMascaraConta(result.getString(3));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return banco;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<Banco> FindAll() {
		List<Banco> lista = new ArrayList<Banco>();
		final String comando = "SELECT a.codigo, a.nome, a.mascara_agencia, a.mascara_conta FROM banco a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Banco banco;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				banco = new Banco();
				banco.setCodigo(result.getLong(1));
				banco.setNome(result.getString(2));
				banco.setMascaraAgencia(result.getString(3));
				banco.setMascaraConta(result.getString(4));
				lista.add(banco);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
