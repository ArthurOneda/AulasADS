package Models;

import java.sql.Date;
import java.util.List;
import dao.ContaEspecialDAO;

public class ContaEspecial extends ContaCorrente {
	private double limiteCredito;
	private Date dataVctoContrato;
	
	public ContaEspecial(Long banco, int agencia, Long numero, double saldo, Date dataAbertura, Long titular, double valorCestaServicos, double limitePixNoturno, double limiteCredito, Date dataVctoContrato) {
		setAgencia(agencia);
		setBanco(banco);
		setDataAbertura(dataAbertura);
		setDataVctoContrato(dataVctoContrato);
		setLimiteCredito(limiteCredito);
		setLimitePixNoturno(limitePixNoturno);
		setNumero(numero);
		setSaldo(saldo);
		setTitular(titular);
		setValorCestaServicos(valorCestaServicos);
	}
	public ContaEspecial() {}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public Date getDataVctoContrato() {
		return dataVctoContrato;
	}
	public void setDataVctoContrato(Date dataVctoContrato) {
		this.dataVctoContrato = dataVctoContrato;
	}
	
	public void Gravar (ContaEspecial contaEspecial) {
		ContaEspecialDAO contaEspecialDAO = new ContaEspecialDAO();
		contaEspecialDAO.Insert(contaEspecial);
	}
	public void Ler(Long id) {
		ContaEspecialDAO contaEspecialDAO = new ContaEspecialDAO();
		ContaEspecial c = contaEspecialDAO.FindByID(id);
		System.out.println("ID: " + c.getIdContaBancaria() + "\nBanco: " + c.getBanco() + "\nAgência: " + c.getAgencia() + "\nNúmero: " + c.getNumero() + "\nData Abertura: " + c.getDataAbertura() + "\nTitular: " + c.getTitular() + "\nSaldo: " + c.getSaldo() + "\nValor Cesta Serviços: " + c.getValorCestaServicos() + "\nLimite Pix Noturno: " + c.getLimitePixNoturno() + "\nLimite de Crédito: " + c.getLimiteCredito() + "\nData Vencimento do Contrato: " + c.getDataVctoContrato());
	}
	public void ListarTodos() {
		ContaEspecialDAO contaEspecialDAO = new ContaEspecialDAO();
		List<ContaEspecial> lista = contaEspecialDAO.FindAll();
		for(ContaEspecial contaEspecial : lista) {
			System.out.println("ID: " + contaEspecial.getIdContaBancaria() + "\nBanco: " + contaEspecial.getBanco() + "\nAgência: " + contaEspecial.getAgencia() + "\nNúmero: " + contaEspecial.getNumero() + "\nData Abertura: " + contaEspecial.getDataAbertura() + "\nTitular: " + contaEspecial.getTitular() + "\nSaldo: " + contaEspecial.getSaldo() + "\nValor Cesta Serviços: " + contaEspecial.getValorCestaServicos() + "\nLimite Pix Noturno: " + contaEspecial.getLimitePixNoturno() + "\nLimite de Crédito: " + contaEspecial.getLimiteCredito() + "\nData Vencimento do Contrato: " + contaEspecial.getDataVctoContrato() + "\n");
		}
	}
}
