package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connections.MYSQL;
import Models.ContaCorrente;

public class ContaCorrenteDAO {
	public void Insert(ContaCorrente contaCorrente) {
		final String comando = "INSERT INTO conta_corrente (agencia, banco, dataAbertura, numero, saldo, titular, valorCestaServicos, limitePixNoturno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		if (contaCorrente == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaCorrente.getAgencia());
			pstm.setLong(2, contaCorrente.getBanco());
			pstm.setDate(3, contaCorrente.getDataAbertura());
			pstm.setLong(4, contaCorrente.getNumero());
			pstm.setDouble(5, contaCorrente.getSaldo());
			pstm.setLong(6, contaCorrente.getTitular());
			pstm.setDouble(7, contaCorrente.getValorCestaServicos());
			pstm.setDouble(8, contaCorrente.getLimitePixNoturno());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(ContaCorrente contaCorrente) {
		final String comando = "UPDATE conta_corrente SET agencia = ?, banco = ?, dataAbertura = ?, numero = ?, saldo = ?, titular = ?, valorCestaServicos = ?, limitePixNoturno = ? WHERE id = ? ";
		if (contaCorrente == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaCorrente.getAgencia());
			pstm.setLong(2, contaCorrente.getBanco());
			pstm.setDate(3, contaCorrente.getDataAbertura());
			pstm.setLong(4, contaCorrente.getNumero());
			pstm.setDouble(5, contaCorrente.getSaldo());
			pstm.setLong(6, contaCorrente.getTitular());
			pstm.setDouble(7, contaCorrente.getValorCestaServicos());
			pstm.setDouble(8, contaCorrente.getLimitePixNoturno());
			pstm.setLong(9, contaCorrente.getIdContaBancaria());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM conta_corrente WHERE numero = ? ";
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
	public ContaCorrente FindByID(Long id) {
		final String comando = "SELECT a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.valorCestaServicos, a.limitePixNoturno FROM conta_corrente a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaCorrente contaCorrente;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			result = pstm.executeQuery();
			if (result.next()) {
				contaCorrente = new ContaCorrente();
				contaCorrente.setId(id);
				contaCorrente.setAgencia(result.getInt(1));
				contaCorrente.setBanco(result.getLong(2));
				contaCorrente.setDataAbertura(result.getDate(3));
				contaCorrente.setNumero(result.getLong(4));
				contaCorrente.setSaldo(result.getDouble(5));
				contaCorrente.setTitular(result.getLong(6));
				contaCorrente.setValorCestaServicos(result.getDouble(7));
				contaCorrente.setLimitePixNoturno(result.getDouble(8));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return contaCorrente;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<ContaCorrente> FindAll() {
		List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
		final String comando = "SELECT a.id, a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.valorCestaServicos, a.limitePixNoturno FROM conta_corrente a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaCorrente contaCorrente;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				contaCorrente = new ContaCorrente();
				contaCorrente.setId(result.getLong(1));
				contaCorrente.setAgencia(result.getInt(2));
				contaCorrente.setBanco(result.getLong(3));
				contaCorrente.setDataAbertura(result.getDate(4));
				contaCorrente.setNumero(result.getLong(5));
				contaCorrente.setSaldo(result.getDouble(6));
				contaCorrente.setTitular(result.getLong(7));
				contaCorrente.setValorCestaServicos(result.getDouble(8));
				contaCorrente.setLimitePixNoturno(result.getDouble(9));
				lista.add(contaCorrente);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}

