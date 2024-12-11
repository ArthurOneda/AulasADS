package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.IndiceRemuneracao;

public class IndiceRemuneracaoDAO {
	public void Insert(IndiceRemuneracao indiceRemuneracao) {
		final String comando = "INSERT INTO indice_remuneracao (codigo, descricao, periodicidade, situacao) VALUES (?, ?, ?, ?)";
		if (indiceRemuneracao == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, indiceRemuneracao.getCodigo());
			pstm.setString(2, indiceRemuneracao.getDescricao());
			pstm.setInt(3, indiceRemuneracao.getPeriodicidade());
			pstm.setInt(4, indiceRemuneracao.getSituacao());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(IndiceRemuneracao indiceRemuneracao) {
		final String comando = "UPDATE indice_remuneracao SET descricao = ?, periodicidade = ?, situacao = ? WHERE codigo = ? ";
		if (indiceRemuneracao == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, indiceRemuneracao.getDescricao());
			pstm.setInt(2, indiceRemuneracao.getPeriodicidade());
			pstm.setInt(3, indiceRemuneracao.getSituacao());
			pstm.setLong(4, indiceRemuneracao.getCodigo());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long codigo) {
		final String comando = "DELETE FROM indice_remuneracao WHERE codigo = ? ";
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
	public IndiceRemuneracao FindByID(Long codigo) {
		final String comando = "SELECT a.descricao, a.periodicidade, a.situacao FROM indice_remuneracao a WHERE a.codigo = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		IndiceRemuneracao indiceRemuneracao;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, codigo);
			result = pstm.executeQuery();
			if (result.next()) {
				indiceRemuneracao = new IndiceRemuneracao();
				indiceRemuneracao.setCodigo(codigo);
				indiceRemuneracao.setDescricao(result.getString(1));
				indiceRemuneracao.setPeriodicidade(result.getInt(2));
				indiceRemuneracao.setSituacao(result.getInt(3));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return indiceRemuneracao;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<IndiceRemuneracao> FindAll() {
		List<IndiceRemuneracao> lista = new ArrayList<IndiceRemuneracao>();
		final String comando = "SELECT a.codigo, a.descricao, a.periodicidade, a.situacao FROM indice_remuneracao a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		IndiceRemuneracao indiceRemuneracao;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				indiceRemuneracao = new IndiceRemuneracao();
				indiceRemuneracao.setCodigo(result.getLong(1));
				indiceRemuneracao.setDescricao(result.getString(2));
				indiceRemuneracao.setPeriodicidade(result.getInt(3));
				indiceRemuneracao.setSituacao(result.getInt(4));
				lista.add(indiceRemuneracao);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
