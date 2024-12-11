package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connections.MYSQL;
import Models.ContaSalario;

public class ContaSalarioDAO {
	public void Insert(ContaSalario contaSalario) {
		final String comando = "INSERT INTO conta_salario (agencia, banco, dataAbertura, numero, saldo, titular, CNPJVinculado, limiteConsignado, limiteAntecipacaoMes, premiteAntecipar13o, contaVinculada) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		if (contaSalario == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaSalario.getAgencia());
			pstm.setLong(2, contaSalario.getBanco());
			pstm.setDate(3, contaSalario.getDataAbertura());
			pstm.setLong(4, contaSalario.getNumero());
			pstm.setDouble(5, contaSalario.getSaldo());
			pstm.setLong(6, contaSalario.getTitular());
			pstm.setString(7, contaSalario.getCNPJVinculado());
			pstm.setDouble(8, contaSalario.getLimiteConsignado());
			pstm.setDouble(9, contaSalario.getLimiteAntecipacaoMes());
			pstm.setBoolean(10, contaSalario.isPremiteAntecipar13o());
			pstm.setLong(11, contaSalario.getContaVinculada());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Update(ContaSalario contaSalario) {
		final String comando = "UPDATE conta_salario SET agencia = ?, banco = ?, dataAbertura = ?, numero = ?, saldo = ?, titular = ?, CNPJVinculado = ?, limiteConsignado = ?, limiteAntecipacaoMes = ?, premiteAntecipar13o = ?, contaVinculada = ? WHERE id = ?";
		if (contaSalario == null) {
			return;
		}
		Connection conexao = null;
		PreparedStatement pstm = null;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setInt(1, contaSalario.getAgencia());
			pstm.setLong(2, contaSalario.getBanco());
			pstm.setDate(3, contaSalario.getDataAbertura());
			pstm.setLong(4, contaSalario.getNumero());
			pstm.setDouble(5, contaSalario.getSaldo());
			pstm.setLong(6, contaSalario.getTitular());
			pstm.setString(7, contaSalario.getCNPJVinculado());
			pstm.setDouble(8, contaSalario.getLimiteConsignado());
			pstm.setDouble(9, contaSalario.getLimiteAntecipacaoMes());
			pstm.setBoolean(10, contaSalario.isPremiteAntecipar13o());
			pstm.setLong(11, contaSalario.getContaVinculada());
			pstm.execute();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			MYSQL.Disconnect(conexao);
		}
	}
	public void Delete(Long id) {
		final String comando = "DELETE FROM conta_salario WHERE id = ? ";
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
	public ContaSalario FindByID(Long id) {
		final String comando = "SELECT a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.CNPJVinculado, a.limiteConsignado, a.limiteAntecipacaoMes, a.premiteAntecipar13o, a.contaVinculada FROM conta_salario a WHERE a.id = ? ";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaSalario contaSalario;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			pstm.setLong(1, id);
			result = pstm.executeQuery();
			if (result.next()) {
				contaSalario = new ContaSalario();
				contaSalario.setId(id);
				contaSalario.setAgencia(result.getInt(1));
				contaSalario.setBanco(result.getLong(2));
				contaSalario.setDataAbertura(result.getDate(3));
				contaSalario.setNumero(result.getLong(4));
				contaSalario.setSaldo(result.getDouble(5));
				contaSalario.setTitular(result.getLong(6));
				contaSalario.setCNPJVinculado(result.getString(7));
				contaSalario.setLimiteConsignado(result.getDouble(8));
				contaSalario.setLimiteAntecipacaoMes(result.getDouble(9));
				contaSalario.setPremiteAntecipar13o(result.getBoolean(10));
				contaSalario.setContaVinculada(result.getLong(11));
				pstm.close();
				MYSQL.Disconnect(conexao);
				return contaSalario;
			} else {
				pstm.close();
				MYSQL.Disconnect(conexao);
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	public List<ContaSalario> FindAll() {
		List<ContaSalario> lista = new ArrayList<ContaSalario>();
		final String comando = "SELECT a.id, a.agencia, a.banco, a.dataAbertura, a.numero, a.saldo, a.titular, a.CNPJVinculado, a.limiteConsignado, a.limiteAntecipacaoMes, a.premiteAntecipar13o, a.contaVinculada FROM conta_salario a";
		Connection conexao = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		ContaSalario contaSalario;
		try {
			conexao = MYSQL.Connect();
			pstm = conexao.prepareStatement(comando);
			result = pstm.executeQuery();
			while (result.next()) {
				contaSalario = new ContaSalario();
				contaSalario.setId(result.getLong(1));
				contaSalario.setAgencia(result.getInt(2));
				contaSalario.setBanco(result.getLong(3));
				contaSalario.setDataAbertura(result.getDate(4));
				contaSalario.setNumero(result.getLong(5));
				contaSalario.setSaldo(result.getDouble(6));
				contaSalario.setTitular(result.getLong(7));
				contaSalario.setCNPJVinculado(result.getString(8));
				contaSalario.setLimiteConsignado(result.getDouble(9));
				contaSalario.setLimiteAntecipacaoMes(result.getDouble(10));
				contaSalario.setPremiteAntecipar13o(result.getBoolean(11));
				contaSalario.setContaVinculada(result.getLong(12));
				lista.add(contaSalario);
			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
