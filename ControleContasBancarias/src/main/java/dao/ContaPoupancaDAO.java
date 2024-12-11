package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.ContaPoupanca;

public class ContaPoupancaDAO {
	public void Insert(ContaPoupanca contaPoupanca) {
		final String comando = "INSERT INTO conta_poupanca (agencia, banco, dataAbertura, numero, saldo, titular, diaAniversario, indiceRemuneracao, precRendimentoReal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		if (contaPoupanca == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaPoupanca.getAgencia());
			pstm.setLong(2, contaPoupanca.getBanco());
			pstm.setDate(3, contaPoupanca.getDataAbertura());
			pstm.setLong(4, contaPoupanca.getNumero());
			pstm.setDouble(5, contaPoupanca.getSaldo());
			pstm.setLong(6, contaPoupanca.getTitular());
			pstm.setInt(7, contaPoupanca.getDiaAniversario());
			pstm.setLong(8, contaPoupanca.getIndiceRemuneracao());
			pstm.setDouble(9, contaPoupanca.getPrecRendimentoReal());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(ContaPoupanca contaPoupanca) {
		final String comando = "UPDATE conta_poupanca SET agencia = ?, banco = ?, dataAbertura = ?, numero = ?, saldo = ?, titular = ?, diaAniversario = ?, indiceRemuneracao = ?, precRendimentoReal = ? WHERE id = ? ";
		if (contaPoupanca == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaPoupanca.getAgencia());
			pstm.setLong(2, contaPoupanca.getBanco());
			pstm.setDate(3, contaPoupanca.getDataAbertura());
			pstm.setLong(4, contaPoupanca.getNumero());
			pstm.setDouble(5, contaPoupanca.getSaldo());
			pstm.setLong(6, contaPoupanca.getTitular());
			pstm.setInt(7, contaPoupanca.getDiaAniversario());
			pstm.setLong(8, contaPoupanca.getIndiceRemuneracao());
			pstm.setDouble(9, contaPoupanca.getPrecRendimentoReal());
			pstm.setLong(10, contaPoupanca.getIdContaBancaria());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM conta_poupanca WHERE id = ? ";
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
	public ContaPoupanca FindByID(Long id) {
		final String comando = "SELECT a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.diaAniversario, a.indiceRemuneracao, a.precRendimentoReal FROM conta_poupanca a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaPoupanca contaPoupanca;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			result = pstm.executeQuery();
			if (result.next()) {
				contaPoupanca = new ContaPoupanca();
				contaPoupanca.setId(id);
				contaPoupanca.setAgencia(result.getInt(1));
				contaPoupanca.setBanco(result.getLong(2));
				contaPoupanca.setDataAbertura(result.getDate(3));
				contaPoupanca.setNumero(result.getLong(4));
				contaPoupanca.setSaldo(result.getDouble(5));
				contaPoupanca.setTitular(result.getLong(6));
				contaPoupanca.setDiaAniversario(result.getInt(7));
				contaPoupanca.setIndiceRemuneracao(result.getLong(8));
				contaPoupanca.setPrecRendimentoReal(result.getDouble(9));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return contaPoupanca;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<ContaPoupanca> FindAll() {
		List<ContaPoupanca> lista = new ArrayList<ContaPoupanca>();
		final String comando = "SELECT a.id, a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.diaAniversario, a.indiceRemuneracao, a.precRendimentoReal FROM conta_poupanca a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaPoupanca contaPoupanca;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				contaPoupanca = new ContaPoupanca();
				contaPoupanca.setId(result.getLong(1));
				contaPoupanca.setAgencia(result.getInt(2));
				contaPoupanca.setBanco(result.getLong(3));
				contaPoupanca.setDataAbertura(result.getDate(4));
				contaPoupanca.setNumero(result.getLong(5));
				contaPoupanca.setSaldo(result.getDouble(6));
				contaPoupanca.setTitular(result.getLong(7));
				contaPoupanca.setDiaAniversario(result.getInt(8));
				contaPoupanca.setIndiceRemuneracao(result.getLong(9));
				contaPoupanca.setPrecRendimentoReal(result.getDouble(10));
				lista.add(contaPoupanca);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
