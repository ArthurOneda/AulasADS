package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.Evento;

public class EventoDAO {
	public void Insert(Evento evento) {
		final String comando = "INSERT INTO evento (descricao, tipoMovimentacao, situacao) VALUES (?, ?, ?)";
		if (evento == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, evento.getDescricao());
			pstm.setString(2, evento.getTipoMovimentacao());
			pstm.setString(3, evento.getSituacao());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(Evento evento) {
		final String comando = "UPDATE evento SET descricao = ?, tipoMovimentacao = ?, situacao = ? WHERE id = ? ";
		if (evento == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setString(1, evento.getDescricao());
			pstm.setString(2, evento.getTipoMovimentacao());
			pstm.setString(3, evento.getSituacao());
			pstm.setLong(4, evento.getIdEvento());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM evento WHERE id = ? ";
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
	public Evento FindByID(int ID) {
		final String comando = "SELECT a.descricao, a.tipoMovimentacao, a.situacao FROM evento a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Evento evento;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, ID);
			result = pstm.executeQuery();
			if (result.next()) {
				evento = new Evento();
				evento.setId(ID);
				evento.setDescricao(result.getString(1));
				evento.setTipoMovimentacaoBusca(result.getString(2));
				evento.setSituacaoBusca(result.getString(3));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return evento;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<Evento> FindAll() {
		List<Evento> lista = new ArrayList<Evento>();
		final String comando = "SELECT a.id, a.descricao, a.tipoMovimentacao, a.situacao FROM evento a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Evento evento;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				evento = new Evento();
				evento.setId(result.getInt(1));
				evento.setDescricao(result.getString(2));
				evento.setTipoMovimentacao(result.getInt(3));
				evento.setSituacao(result.getInt(4));
				lista.add(evento);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
