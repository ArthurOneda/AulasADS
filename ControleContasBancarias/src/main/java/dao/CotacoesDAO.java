package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.Cotacoes;

public class CotacoesDAO {
	public void Insert(Cotacoes cotacoes) {
		final String comando = "INSERT INTO cotacoes (codigo, data, valor) VALUES (?, ?, ?)";
		if (cotacoes == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, cotacoes.getCodigo());
			pstm.setDate(2, cotacoes.getData());
			pstm.setDouble(3, cotacoes.getValor());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(Cotacoes cotacoes) {
		final String comando = "UPDATE cotacoes SET data = ?, valor = ? WHERE codigo = ? ";
		if (cotacoes == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setDate(1, cotacoes.getData());
			pstm.setDouble(2, cotacoes.getValor());
			pstm.setLong(3, cotacoes.getCodigo());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long codigo) {
		final String comando = "DELETE FROM cotacoes WHERE codigo = ? ";
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
	public Cotacoes FindByID(Long codigo) {
		final String comando = "SELECT a.data, a.valor FROM cotacoes a WHERE a.codigo = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Cotacoes cotacoes;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, codigo);
			result = pstm.executeQuery();
			if (result.next()) {
				cotacoes = new Cotacoes();
				cotacoes.setCodigo(codigo);
				cotacoes.setData(result.getDate(1));
				cotacoes.setValor(result.getDouble(2));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return cotacoes;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<Cotacoes> FindAll() {
		List<Cotacoes> lista = new ArrayList<Cotacoes>();
		final String comando = "SELECT a.codigo, a.data, a.valor FROM cotacoes a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Cotacoes cotacoes;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				cotacoes = new Cotacoes();
				cotacoes.setCodigo(result.getLong(1));
				cotacoes.setData(result.getDate(2));
				cotacoes.setValor(result.getDouble(3));
				lista.add(cotacoes);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
