package Models;

import java.sql.Date;
import java.util.List;

import dao.ContaPoupancaDAO;

public class ContaPoupanca extends ContaBancaria {
	private int diaAniversario;
	private Long indiceRemuneracao;
	private double precRendimentoReal;
	
	public ContaPoupanca(Long banco, int agencia, Long numero, double saldo, Date dataAbertura, Long titular, int diaAniversario, Long indiceRemuneracao, double precRendimentoReal) {
		setAgencia(agencia);
		setBanco(banco);
		setDataAbertura(dataAbertura);
		setDiaAniversario(diaAniversario);
		setIndiceRemuneracao(indiceRemuneracao);
		setNumero(numero);
		setPrecRendimentoReal(precRendimentoReal);
		setSaldo(saldo);
		setTitular(titular);
	}
	public ContaPoupanca() {}
	
	public int getDiaAniversario() {
		return diaAniversario;
	}
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	public Long getIndiceRemuneracao() {
		return indiceRemuneracao;
	}
	public void setIndiceRemuneracao(Long indiceRemuneracao) {
		this.indiceRemuneracao = indiceRemuneracao;
	}
	public double getPrecRendimentoReal() {
		return precRendimentoReal;
	}
	public void setPrecRendimentoReal(double precRendimentoReal) {
		this.precRendimentoReal = precRendimentoReal;
	}
	
	public void Gravar (ContaPoupanca contaPoupanca) {
		ContaPoupancaDAO contaPoupancaDAO = new ContaPoupancaDAO();
		contaPoupancaDAO.Insert(contaPoupanca);
	}
	public void Ler(Long ID) {
		ContaPoupancaDAO contaPoupancaDAO = new ContaPoupancaDAO();
		ContaPoupanca c = contaPoupancaDAO.FindByID(ID);
		System.out.println("ID: " + c.getIdContaBancaria() + "\nBanco: " + c.getBanco() + "\nAgência: " + c.getAgencia() + "\nNúmero: " + c.getNumero() + "\nData Abertura: " + c.getDataAbertura() + "\nTitular: " + c.getTitular() + "\nSaldo: " + c.getSaldo() + "\nDia Aniversário: " + c.getDiaAniversario() + "\nÍndice Remuneração: " + c.getIndiceRemuneracao() + "\nRendimento Real: " + c.getPrecRendimentoReal());
	}
	
	public void ListarTodos() {
		ContaPoupancaDAO contaPoupancaDAO = new ContaPoupancaDAO();
		List<ContaPoupanca> lista = contaPoupancaDAO.FindAll();
		for(ContaPoupanca contaPoupanca : lista) {
			System.out.println("ID: " + contaPoupanca.getIdContaBancaria() + "\nBanco: " + contaPoupanca.getBanco() + "\nAgência: " + contaPoupanca.getAgencia() + "\nNúmero: " + contaPoupanca.getNumero() + "\nData Abertura: " + contaPoupanca.getDataAbertura() + "\nTitular: " + contaPoupanca.getTitular() + "\nSaldo: " + contaPoupanca.getSaldo() + "\nDia Aniversário: " + contaPoupanca.getDiaAniversario() + "\nÍndice Remuneração: " + contaPoupanca.getIndiceRemuneracao() + "\nRendimento Real: " + contaPoupanca.getPrecRendimentoReal() + "\n");
		}
	}
}
