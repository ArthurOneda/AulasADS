package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.Movimentacao;

public class MovimentacaoDAO {
	public void Insert(Movimentacao movimentacao) {
		final String comando = "INSERT INTO movimentacao (contaBancaria, data, evento, valor) VALUES (?, ?, ?, ?)";
		if (movimentacao == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, movimentacao.getContaBancaria());
			pstm.setDate(2, movimentacao.getData());
			pstm.setLong(3, movimentacao.getEvento());
			pstm.setDouble(4, movimentacao.getValor());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}

	public void Update(Movimentacao movimentacao) {
		final String comando = "UPDATE movimentacao SET contaBancaria = ?, data = ?, evento = ?, valor = ? WHERE id = ? ";
		if (movimentacao == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, movimentacao.getContaBancaria());
			pstm.setDate(2, movimentacao.getData());
			pstm.setLong(3, movimentacao.getEvento());
			pstm.setDouble(4, movimentacao.getValor());
			pstm.setInt(5, movimentacao.getIdMovimentacao());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}

	public void Delete(Long id) {
		final String comando = "DELETE FROM movimentacao WHERE id = ? ";
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

	public List<Movimentacao> FindAll() {
		List<Movimentacao> lista = new ArrayList<Movimentacao>();
		final String comando = "SELECT a.id, a.contaBancaria, a.data, a.evento, a.valor FROM movimentacao a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Movimentacao movimentacao;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				movimentacao = new Movimentacao();
				movimentacao.setIdMovimentacao(result.getInt(1));
				movimentacao.setContaBancaria(result.getLong(2));
				movimentacao.setData(result.getDate(3));
				movimentacao.setEvento(result.getLong(4));
				movimentacao.setValor(result.getDouble(5));
				lista.add(movimentacao);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
