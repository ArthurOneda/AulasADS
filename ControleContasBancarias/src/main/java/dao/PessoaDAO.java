package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.Pessoa;

public class PessoaDAO {
	public void Insert(Pessoa pessoa) {
		final String comando = "INSERT INTO pessoa (cep, numEndereco, complementoEndereco, situacao) VALUES (?, ?, ?, ?)";
		if (pessoa == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, pessoa.getCEP());
			pstm.setInt(2, pessoa.getNumEndereco());
			pstm.setString(3, pessoa.getComplementoEndereco());
			pstm.setInt(4, pessoa.getSituacao());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(Pessoa pessoa) {
		final String comando = "UPDATE pessoa SET cep = ?, numEndereco = ?, complementoEndereco = ?, situacao = ? WHERE id = ? ";
		if (pessoa == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, pessoa.getCEP());
			pstm.setInt(2, pessoa.getNumEndereco());
			pstm.setString(3, pessoa.getComplementoEndereco());
			pstm.setInt(4, pessoa.getSituacao());
			pstm.setLong(5, pessoa.getID());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM pessoa WHERE id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public Pessoa FindByID(Long id) {
		final String comando = "SELECT a.cep, a.numEndereco, a.complementoEndereco, a.situacao FROM pessoa a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Pessoa pessoa;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			result = pstm.executeQuery();
			if (result.next()) {
				pessoa = new Pessoa();
				pessoa.setID(id);
				pessoa.setCEP(result.getLong(1));
				pessoa.setNumEndereco(result.getInt(2));
				pessoa.setComplementoEndereco(result.getString(3));
				pessoa.setSituacao(result.getInt(4));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return pessoa;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<Pessoa> FindAll() {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		final String comando = "SELECT a.id, a.cep, a.numEndereco, a.complementoEndereco, a.situacao FROM pessoa a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Pessoa pessoa;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				pessoa = new Pessoa();
				pessoa.setID(result.getLong(1));
				pessoa.setCEP(result.getLong(2));
				pessoa.setNumEndereco(result.getInt(3));
				pessoa.setComplementoEndereco(result.getString(4));
				pessoa.setSituacao(result.getInt(5));
				lista.add(pessoa);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
