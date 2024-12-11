package dao;

import Models.Localidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;

public class LocalidadeDAO {
	public void Insert(Localidade localidade) {
		final String comando = "INSERT INTO localidade (cep, estado, cidade, bairro, logradouro) VALUES (?, ?, ?, ?, ?)";
		if (localidade == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, localidade.getCEP());
			pstm.setString(2, localidade.getEstado());
			pstm.setString(3, localidade.getCidade());
			pstm.setString(4, localidade.getBairro());
			pstm.setString(5, localidade.getLogradouro());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(Localidade localidade) {
		final String comando = "UPDATE localidade SET cep = ?, estado = ?, cidade = ?, bairro = ?, logradouro = ? WHERE id = ? ";
		if (localidade == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, localidade.getCEP());
			pstm.setString(2, localidade.getEstado());
			pstm.setString(3, localidade.getCidade());
			pstm.setString(4, localidade.getBairro());
			pstm.setString(5, localidade.getLogradouro());
			pstm.setInt(6, localidade.getID());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(int ID) {
		final String comando = "DELETE FROM localidade WHERE id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, ID);
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public Localidade FindByCEP(String CEP) {
		final String comando = "SELECT a.id, a.estado, a.cidade, a.bairro, a.logradouro FROM localidade a WHERE a.cep = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Localidade localidade;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, CEP);
			result = pstm.executeQuery();
			if (result.next()) {
				localidade = new Localidade();
				localidade.setID(result.getInt(1));
				localidade.setCEP(CEP);
				localidade.setEstado(result.getString(2));
				localidade.setCidade(result.getString(3));
				localidade.setBairro(result.getString(4));
				localidade.setLogradouro(result.getString(5));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return localidade;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<Localidade> FindAll() {
		List<Localidade> lista = new ArrayList<Localidade>();
		final String comando = "SELECT a.id, a.cep, a.estado, a.cidade, a.bairro, a.logradouro FROM localidade a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Localidade localidade;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				localidade = new Localidade();
				localidade.setID(result.getInt(1));
				localidade.setCEP(result.getString(2));
				localidade.setEstado(result.getString(3));
				localidade.setCidade(result.getString(4));
				localidade.setBairro(result.getString(5));
				localidade.setLogradouro(result.getString(6));
				lista.add(localidade);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}