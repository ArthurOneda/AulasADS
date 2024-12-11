package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.pessoaFisica;

public class PessoaFisicaDAO {
	public void Insert(pessoaFisica pessoaFisica) {
		final String comando = "INSERT INTO pessoa_fisica (cep, numEndereco, complementoEndereco, situacao, cpf, nome, dataNascimento, sexo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		if (pessoaFisica == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, pessoaFisica.getCEP());
			pstm.setInt(2, pessoaFisica.getNumEndereco());
			pstm.setString(3, pessoaFisica.getComplementoEndereco());
			pstm.setInt(4, pessoaFisica.getSituacao());
			pstm.setLong(5, pessoaFisica.getCPF());
			pstm.setString(6, pessoaFisica.getNome());
			pstm.setDate(7, pessoaFisica.getDataNascimento());
			pstm.setBoolean(8, pessoaFisica.isSexo());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(pessoaFisica pessoaFisica) {
		final String comando = "UPDATE pessoa_fisica SET cep = ?, numEndereco = ?, complementoEndereco = ?, situacao = ?, cpf = ?, nome = ?, dataNascimento = ?, sexo = ? WHERE id = ? ";
		if (pessoaFisica == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, pessoaFisica.getCEP());
			pstm.setInt(2, pessoaFisica.getNumEndereco());
			pstm.setString(3, pessoaFisica.getComplementoEndereco());
			pstm.setInt(4, pessoaFisica.getSituacao());
			pstm.setLong(5, pessoaFisica.getCPF());
			pstm.setString(6, pessoaFisica.getNome());
			pstm.setDate(7, pessoaFisica.getDataNascimento());
			pstm.setBoolean(8, pessoaFisica.isSexo());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM pessoa_fisica WHERE id = ? ";
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
	public pessoaFisica FindByID(Long id) {
		final String comando = "SELECT a.cep, a.numEndereco, a.complementoEndereco, a.situacao, a.cpf, a.nome, a.dataNascimento, a.sexo FROM pessoa_fisica a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		pessoaFisica pessoaFisica;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			result = pstm.executeQuery();
			if (result.next()) {
				pessoaFisica = new pessoaFisica();
				pessoaFisica.setID(id);
				pessoaFisica.setCEP(result.getLong(1));
				pessoaFisica.setNumEndereco(result.getInt(2));
				pessoaFisica.setComplementoEndereco(result.getString(3));
				pessoaFisica.setSituacao(result.getInt(4));
				pessoaFisica.setCPF(result.getLong(5));
				pessoaFisica.setNome(result.getString(6));
				pessoaFisica.setDataNascimento(result.getDate(7));
				pessoaFisica.setSexo(result.getBoolean(8));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return pessoaFisica;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<pessoaFisica> FindAll() {
		List<pessoaFisica> lista = new ArrayList<pessoaFisica>();
		final String comando = "SELECT a.id, a.cep, a.numEndereco, a.complementoEndereco, a.situacao, a.cpf, a.nome, a.dataNascimento, a.sexo FROM pessoa_fisica a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		pessoaFisica pessoaFisica;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				pessoaFisica = new pessoaFisica();
				pessoaFisica.setID(result.getLong(1));
				pessoaFisica.setCEP(result.getLong(2));
				pessoaFisica.setNumEndereco(result.getInt(3));
				pessoaFisica.setComplementoEndereco(result.getString(4));
				pessoaFisica.setSituacao(result.getInt(5));
				pessoaFisica.setCPF(result.getLong(6));
				pessoaFisica.setNome(result.getString(7));
				pessoaFisica.setDataNascimento(result.getDate(8));
				pessoaFisica.setSexo(result.getBoolean(9));
				lista.add(pessoaFisica);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
