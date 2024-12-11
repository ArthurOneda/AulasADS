package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.ContaEspecial;

public class ContaEspecialDAO {
	public void Insert(ContaEspecial contaEspecial) {
		final String comando = "INSERT INTO conta_especial (agencia, banco, dataAbertura, numero, saldo, titular, valorCestaServicos, limitePixNoturno, limiteCredito, dataVctoContrato) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		if (contaEspecial == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaEspecial.getAgencia());
			pstm.setLong(2, contaEspecial.getBanco());
			pstm.setDate(3, contaEspecial.getDataAbertura());
			pstm.setLong(4, contaEspecial.getNumero());
			pstm.setDouble(5, contaEspecial.getSaldo());
			pstm.setLong(6, contaEspecial.getTitular());
			pstm.setDouble(7, contaEspecial.getValorCestaServicos());
			pstm.setDouble(8, contaEspecial.getLimitePixNoturno());
			pstm.setDouble(9, contaEspecial.getLimiteCredito());
			pstm.setDate(10, contaEspecial.getDataVctoContrato());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(ContaEspecial contaEspecial) {
		final String comando = "UPDATE conta_especial SET agencia = ?, banco = ?, dataAbertura = ?, numero = ?, saldo = ?, titular = ?, valorCestaServicos = ?, limitePixNoturno = ?, limiteCredito = ?, dataVctoContrato = ? WHERE id = ?";
		if (contaEspecial == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaEspecial.getAgencia());
			pstm.setLong(2, contaEspecial.getBanco());
			pstm.setDate(3, contaEspecial.getDataAbertura());
			pstm.setLong(4, contaEspecial.getNumero());
			pstm.setDouble(5, contaEspecial.getSaldo());
			pstm.setLong(6, contaEspecial.getTitular());
			pstm.setDouble(7, contaEspecial.getValorCestaServicos());
			pstm.setDouble(8, contaEspecial.getLimitePixNoturno());
			pstm.setDouble(9, contaEspecial.getLimiteCredito());
			pstm.setDate(10, contaEspecial.getDataVctoContrato());
			pstm.setLong(11, contaEspecial.getIdContaBancaria());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM conta_especial WHERE id = ? ";
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
	public ContaEspecial FindByID(Long id) {
		final String comando = "SELECT a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.valorCestaServicos, a.limitePixNoturno, a.limiteCredito, a.dataVctoContrato FROM conta_especial a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaEspecial contaEspecial;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			result = pstm.executeQuery();
			if (result.next()) {
				contaEspecial = new ContaEspecial();
				contaEspecial.setId(id);
				contaEspecial.setAgencia(result.getInt(1));
				contaEspecial.setBanco(result.getLong(2));
				contaEspecial.setDataAbertura(result.getDate(3));
				contaEspecial.setNumero(result.getLong(4));
				contaEspecial.setSaldo(result.getDouble(5));
				contaEspecial.setTitular(result.getLong(6));
				contaEspecial.setValorCestaServicos(result.getDouble(7));
				contaEspecial.setLimitePixNoturno(result.getDouble(8));
				contaEspecial.setLimiteCredito(result.getDouble(9));
				contaEspecial.setDataVctoContrato(result.getDate(10));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return contaEspecial;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<ContaEspecial> FindAll() {
		List<ContaEspecial> lista = new ArrayList<ContaEspecial>();
		final String comando = "SELECT a.id, a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.valorCestaServicos, a.limitePixNoturno, a.limiteCredito, a.dataVctoContrato FROM conta_especial a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaEspecial contaEspecial;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				contaEspecial = new ContaEspecial();
				contaEspecial.setId(result.getLong(1));
				contaEspecial.setAgencia(result.getInt(2));
				contaEspecial.setBanco(result.getLong(3));
				contaEspecial.setDataAbertura(result.getDate(4));
				contaEspecial.setNumero(result.getLong(5));
				contaEspecial.setSaldo(result.getDouble(6));
				contaEspecial.setTitular(result.getLong(7));
				contaEspecial.setValorCestaServicos(result.getDouble(8));
				contaEspecial.setLimitePixNoturno(result.getDouble(9));
				contaEspecial.setLimiteCredito(result.getDouble(10));
				contaEspecial.setDataVctoContrato(result.getDate(11));
				lista.add(contaEspecial);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
