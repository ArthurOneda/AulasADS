package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connections.MYSQL;
import Models.NumTelefone;

public class TelefoneDAO {
	public void Insert(NumTelefone Telefone) {
		final String comando = "INSERT INTO telefone (numero, tipo, idPessoa) VALUES (?, ?, ?)";
		if (Telefone == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, Telefone.getNumero());
			pstm.setString(2, Telefone.getTipo());
			pstm.setInt(3, Telefone.getIDPessoa());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(NumTelefone Telefone) {
		final String comando = "UPDATE telefone SET numero = ?, tipo = ?, idPessoa = ? WHERE id = ?";
		if (Telefone == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, Telefone.getNumero());
			pstm.setString(2, Telefone.getTipo());
			pstm.setInt(3, Telefone.getIDPessoa());
			pstm.setInt(4, Telefone.getID());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(int ID) {
		final String comando = "DELETE FROM telefone WHERE id = ?";
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
	public NumTelefone FindByID(int ID) {
		final String comando = "SELECT numero, idPessoa FROM telefone WHERE id = ?";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		NumTelefone telefone;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, ID);
			result = pstm.executeQuery();
			if (result.next()) {
				telefone = new NumTelefone();
				telefone.setID(ID);
				telefone.setNumero(result.getString(1));
				telefone.setIDPessoa(result.getInt(2));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return telefone;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<NumTelefone> FindAll(int IDPessoa) {
		List<NumTelefone> lista = new ArrayList<NumTelefone>();
		final String comando = "SELECT id, numero, idPessoa FROM telefone WHERE id = ?";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		NumTelefone telefone;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, IDPessoa);
			result = pstm.executeQuery();
			while (result.next()) {
				telefone = new NumTelefone();
				telefone.setID(result.getInt(1));
				telefone.setNumero(result.getString(2));
				telefone.setIDPessoa(result.getInt(3));
				lista.add(telefone);
			}
			return lista;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
