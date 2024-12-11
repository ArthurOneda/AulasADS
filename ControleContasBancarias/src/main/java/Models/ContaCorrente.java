package Models;

import java.sql.Date;
import java.util.List;
import dao.ContaCorrenteDAO;

public class ContaCorrente extends ContaBancaria {
	private double valorCestaServicos;
	private double limitePixNoturno;
	
	public ContaCorrente(Long banco, int agencia, Long numero, double saldo, Date dataAbertura, Long titular, double valorCestaServicos, double limitePixNoturno) {
		setValorCestaServicos(valorCestaServicos);
		setLimitePixNoturno(limitePixNoturno);
		setAgencia(agencia);
		setBanco(banco);
		setDataAbertura(dataAbertura);
		setNumero(numero);
		setSaldo(saldo);
		setTitular(titular);
	}
	public ContaCorrente() {}
	
	public double getValorCestaServicos() {
		return valorCestaServicos;
	}
	public void setValorCestaServicos(double valorCestaServicos) {
		this.valorCestaServicos = valorCestaServicos;
	}
	public double getLimitePixNoturno() {
		return limitePixNoturno;
	}
	public void setLimitePixNoturno(double limitePixNoturno) {
		this.limitePixNoturno = limitePixNoturno;
	}
	
	public void Gravar (ContaCorrente contaCorrente) {
		ContaCorrenteDAO contaCorrenteDAO = new ContaCorrenteDAO();
		contaCorrenteDAO.Insert(contaCorrente);
	}
	public void Ler(Long id) {
		ContaCorrenteDAO contaCorrenteDAO = new ContaCorrenteDAO();
		ContaCorrente c = contaCorrenteDAO.FindByID(id);
		System.out.println("ID: " + c.getIdContaBancaria() + "\nBanco: " + c.getBanco() + "\nAgência: " + c.getAgencia() + "\nNúmero: " + c.getNumero() + "\nData Abertura: " + c.getDataAbertura() + "\nTitular: " + c.getTitular() + "\nSaldo: " + c.getSaldo() + "\nValor Cesta Serviços: " + c.getValorCestaServicos() + "\nLimite Pix Noturno: " + c.getLimitePixNoturno());
	}

	public void ListarTodos() {
		ContaCorrenteDAO contaCorrenteDAO = new ContaCorrenteDAO();
		List<ContaCorrente> lista = contaCorrenteDAO.FindAll();
		for(ContaCorrente contaCorrente : lista) {
			System.out.println("ID: " + contaCorrente.getIdContaBancaria() + "\nBanco: " + contaCorrente.getBanco() + "\nAgência: " + contaCorrente.getAgencia() + "\nNúmero: " + contaCorrente.getNumero() + "\nData Abertura: " + contaCorrente.getDataAbertura() + "\nTitular: " + contaCorrente.getTitular() + "\nSaldo: " + contaCorrente.getSaldo() + "\nValor Cesta Serviços: " + contaCorrente.getValorCestaServicos() + "\nLimite Pix Noturno: " + contaCorrente.getLimitePixNoturno() + "\n");
		}
	}
}
