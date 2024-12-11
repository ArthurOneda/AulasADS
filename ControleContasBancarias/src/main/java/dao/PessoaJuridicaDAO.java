package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connections.MYSQL;
import Models.pessoaJuridica;

public class PessoaJuridicaDAO {
	public void Insert(pessoaJuridica pessoaJuridica) {
		final String comando = "INSERT INTO pessoa_juridica (cep, numEndereco, complementoEndereco, situacao, cnpj, razaoSocial, nomeFantasia, inscricaoEstadual) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		if (pessoaJuridica == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, pessoaJuridica.getCEP());
			pstm.setInt(2, pessoaJuridica.getNumEndereco());
			pstm.setString(3, pessoaJuridica.getComplementoEndereco());
			pstm.setInt(4, pessoaJuridica.getSituacao());
			pstm.setLong(5, pessoaJuridica.getCNPJ());
			pstm.setString(6, pessoaJuridica.getRazaoSocial());
			pstm.setString(7, pessoaJuridica.getNomeFantasia());
			pstm.setString(8, pessoaJuridica.getInscricaoEstadual());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(pessoaJuridica pessoaJuridica) {
		final String comando = "UPDATE pessoa_juridica SET cep = ?, numEndereco = ?, complementoEndereco = ?, situacao = ?, cnpj = ?, razaoSocial = ?, nomeFantasia = ?, inscricaoEstadual = ? WHERE id = ? ";
		if (pessoaJuridica == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, pessoaJuridica.getCEP());
			pstm.setInt(2, pessoaJuridica.getNumEndereco());
			pstm.setString(3, pessoaJuridica.getComplementoEndereco());
			pstm.setInt(4, pessoaJuridica.getSituacao());
			pstm.setLong(5, pessoaJuridica.getCNPJ());
			pstm.setString(6, pessoaJuridica.getRazaoSocial());
			pstm.setString(7, pessoaJuridica.getNomeFantasia());
			pstm.setString(8, pessoaJuridica.getInscricaoEstadual());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM pessoa_juridica WHERE id = ? ";
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
	public pessoaJuridica FindByID(Long id) {
		final String comando = "SELECT a.cep, a.numEndereco, a.complementoEndereco, a.situacao, a.cnpj, a.razaoSocial, a.nomeFantasia, a.inscricaoEstadual FROM pessoa_juridica a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		pessoaJuridica pessoaJuridica;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			result = pstm.executeQuery();
			if (result.next()) {
				pessoaJuridica = new pessoaJuridica();
				pessoaJuridica.setID(id);
				pessoaJuridica.setCEP(result.getLong(1));
				pessoaJuridica.setNumEndereco(result.getInt(2));
				pessoaJuridica.setComplementoEndereco(result.getString(3));
				pessoaJuridica.setSituacao(result.getInt(4));
				pessoaJuridica.setCNPJ(result.getLong(5));
				pessoaJuridica.setRazaoSocial(result.getString(6));
				pessoaJuridica.setNomeFantasia(result.getString(7));
				pessoaJuridica.setInscricaoEstadual(result.getString(8));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return pessoaJuridica;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<pessoaJuridica> FindAll() {
		List<pessoaJuridica> lista = new ArrayList<pessoaJuridica>();
		final String comando = "SELECT a.id, a.cep, a.numEndereco, a.complementoEndereco, a.situacao, a.cnpj, a.razaoSocial, a.nomeFantasia, a.inscricaoEstadual FROM pessoa_juridica a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		pessoaJuridica pessoaJuridica;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				pessoaJuridica = new pessoaJuridica();
				pessoaJuridica.setID(result.getLong(1));
				pessoaJuridica.setCEP(result.getLong(2));
				pessoaJuridica.setNumEndereco(result.getInt(3));
				pessoaJuridica.setComplementoEndereco(result.getString(4));
				pessoaJuridica.setSituacao(result.getInt(5));
				pessoaJuridica.setCNPJ(result.getLong(6));
				pessoaJuridica.setRazaoSocial(result.getString(7));
				pessoaJuridica.setNomeFantasia(result.getString(8));
				pessoaJuridica.setInscricaoEstadual(result.getString(9));
				lista.add(pessoaJuridica);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
