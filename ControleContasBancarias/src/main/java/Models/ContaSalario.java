package Models;

import java.sql.Date;
import java.util.List;

import dao.ContaSalarioDAO;

public class ContaSalario extends ContaBancaria {
	private String CNPJVinculado;
	private double limiteConsignado;
	private double limiteAntecipacaoMes;
	private boolean premiteAntecipar13o;
	private Long contaVinculada;
	
	public ContaSalario(Long banco, int agencia, Long numero, double saldo, Date dataAbertura, Long titular, String cNPJVinculado, double limiteConsignado, double limiteAntecipacaoMes, boolean premiteAntecipar13o, Long contaVinculada) {
		setAgencia(agencia);
		setBanco(banco);
		setCNPJVinculado(cNPJVinculado);
		setContaVinculada(contaVinculada);
		setDataAbertura(dataAbertura);
		setLimiteAntecipacaoMes(limiteAntecipacaoMes);
		setLimiteConsignado(limiteConsignado);
		setNumero(numero);
		setPremiteAntecipar13o(premiteAntecipar13o);
		setSaldo(saldo);
		setTitular(titular);
	}

	public ContaSalario() {}

	public String getCNPJVinculado() {
		return CNPJVinculado;
	}
	public void setCNPJVinculado(String cNPJVinculado) {
		CNPJVinculado = cNPJVinculado;
	}
	public double getLimiteConsignado() {
		return limiteConsignado;
	}
	public void setLimiteConsignado(double limiteConsignado) {
		this.limiteConsignado = limiteConsignado;
	}
	public double getLimiteAntecipacaoMes() {
		return limiteAntecipacaoMes;
	}
	public void setLimiteAntecipacaoMes(double limiteAntecipacaoMes) {
		this.limiteAntecipacaoMes = limiteAntecipacaoMes;
	}
	public boolean isPremiteAntecipar13o() {
		return premiteAntecipar13o;
	}
	public void setPremiteAntecipar13o(boolean premiteAntecipar13o) {
		this.premiteAntecipar13o = premiteAntecipar13o;
	}
	public Long getContaVinculada() {
		return contaVinculada;
	}
	public void setContaVinculada(Long contaVinculada) {
		this.contaVinculada = contaVinculada;
	}
	
	public void Gravar (ContaSalario contaSalario) {
		ContaSalarioDAO contaSalarioDAO = new ContaSalarioDAO();
		contaSalarioDAO.Insert(contaSalario);
	}
	public void Ler(Long ID) {
		ContaSalarioDAO contaSalarioDAO = new ContaSalarioDAO();
		ContaSalario c = contaSalarioDAO.FindByID(ID);
		System.out.println("ID: " + c.getIdContaBancaria() + "\nBanco: " + c.getBanco() + "\nAgência: " + c.getAgencia() + "\nNúmero: " + c.getNumero() + "\nData Abertura: " + c.getDataAbertura() + "\nTitular: " + c.getTitular() + "\nSaldo: " + c.getSaldo() + "\nCNPJ Vinculado: " + c.getCNPJVinculado() + "\nLimite Consignado: " + c.getLimiteConsignado() + "\nLimite Antecipação: " + c.getLimiteAntecipacaoMes() + "\nPrmite Antecipação do 13º: " + c.isPremiteAntecipar13o() + "\nContaVinculada: " + c.getContaVinculada());
	}
	public void ListarTodos() {
		ContaSalarioDAO contaSalarioDAO = new ContaSalarioDAO();
		List<ContaSalario> lista = contaSalarioDAO.FindAll();
		for(ContaSalario contaSalario : lista) {
			System.out.println("ID: " + contaSalario.getIdContaBancaria() + "\nBanco: " + contaSalario.getBanco() + "\nAgência: " + contaSalario.getAgencia() + "\nNúmero: " + contaSalario.getNumero() + "\nData Abertura: " + contaSalario.getDataAbertura() + "\nTitular: " + contaSalario.getTitular() + "\nSaldo: " + contaSalario.getSaldo() + "\nCNPJ Vinculado: " + contaSalario.getCNPJVinculado() + "\nLimite Consignado: " + contaSalario.getLimiteConsignado() + "\nLimite Antecipação: " + contaSalario.getLimiteAntecipacaoMes() + "\nPrmite Antecipação do 13º: " + contaSalario.isPremiteAntecipar13o() + "\nContaVinculada: " + contaSalario.getContaVinculada() + "\n");
		}
	}
}
