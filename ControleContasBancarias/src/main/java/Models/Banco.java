package Models;

import java.util.List;

import dao.BancoDAO;

public class Banco {
	private Long codigo;
	private String nome;
	private String mascaraAgencia;
	private String mascaraConta;
	
	public Banco() {}

	public Banco(Long codigo, String nome, String mascaraAgencia, String mascaraConta) {
		setCodigo(codigo);
		setMascaraAgencia(mascaraAgencia);
		setMascaraConta(mascaraConta);
		setNome(nome);
	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMascaraAgencia() {
		return mascaraAgencia;
	}
	public void setMascaraAgencia(String mascaraAgencia) {
		this.mascaraAgencia = mascaraAgencia;
	}
	public String getMascaraConta() {
		return mascaraConta;
	}
	public void setMascaraConta(String mascaraConta) {
		this.mascaraConta = mascaraConta;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + "\nNome: " + nome;
	};
	
	public void Gravar (Banco banco) {
		BancoDAO bancoDAO = new BancoDAO();
		bancoDAO.Insert(banco);
	}
	public void Ler(Long Codigo) {
		BancoDAO bancoDAO = new BancoDAO();
		Banco b = bancoDAO.FindByID(Codigo);
		System.out.println("Código: " + b.getCodigo() + "\nNome: " + b.getNome() + "\nMáscara Agência: " + b.getMascaraAgencia() + "\nMáscara Conta: " + b.getMascaraConta());
	}
	
	public void ListarTodos() {
		BancoDAO bancoDAO = new BancoDAO();
		List<Banco> lista = bancoDAO.FindAll();
		for(Banco banco : lista) {
			System.out.println("Código: " + banco.getCodigo() + "\nNome: " + banco.getNome() + "\nMáscara Agência: " + banco.getMascaraAgencia() + "\nMáscara Conta: " + banco.getMascaraConta() + "\n");
		}
	}
}
