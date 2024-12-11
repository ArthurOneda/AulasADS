package Models;

import java.sql.Date;
import java.util.List;

import dao.PessoaFisicaDAO;

public class pessoaFisica extends Pessoa {
	private Long CPF;
	private String nome;
	private Date dataNascimento;
	private boolean sexo;
	
	public pessoaFisica(Long cEP, int numEndereco, String complementoEndereco, int situacao, Long cPF, String nome, Date dataNascimento, boolean sexo) {
		setCEP(cEP);
		setComplementoEndereco(complementoEndereco);
		setCPF(cPF);
		setDataNascimento(dataNascimento);
		setNome(nome);
		setNumEndereco(numEndereco);
		setSexo(sexo);
		setSituacao(situacao);
	}
	public pessoaFisica() {}
	
	public Long getCPF() {
		return this.CPF;
	}
	public void setCPF(Long cPF) {
		this.CPF = cPF;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public boolean isSexo() {
		return this.sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public void Gravar(pessoaFisica pessoaFisica) {
		PessoaFisicaDAO pessoaDAO = new PessoaFisicaDAO();
		pessoaDAO.Insert(pessoaFisica);
	}
	public void Ler(Long id) {
		PessoaFisicaDAO pessoaDAO = new PessoaFisicaDAO();
		pessoaFisica p = pessoaDAO.FindByID(id);
		System.out.println("CEP: " + p.getCEP() + "\nNúmero Endereço: " + p.getNumEndereco() + "\nComplemento Endereço: " + p.getComplementoEndereco() + "\nSituação: " + p.getSituacao() + "\nCPF: " + p.getCPF() + "\nNome: " + p.getNome() + "\nData Nascimento: " + p.getDataNascimento() + "\nSexo: " + p.isSexo());
	}
	public void ListarTodos() {
		PessoaFisicaDAO pessoaDAO = new PessoaFisicaDAO();
		List<pessoaFisica> lista = pessoaDAO.FindAll();
		for(pessoaFisica pessoaFisica : lista) {
			System.out.println("ID: " + pessoaFisica.getID() + "\nCEP: " + pessoaFisica.getCEP() + "\nNúmero Endereço: " + pessoaFisica.getNumEndereco() + "\nComplemento Endereço: " + pessoaFisica.getComplementoEndereco() + "\nSituação: " + pessoaFisica.getSituacao() + "\nCPF: " + pessoaFisica.getCPF() + "\nNome: " + pessoaFisica.getNome() + "\nData Nascimento: " + pessoaFisica.getDataNascimento() + "\nSexo: " + pessoaFisica.isSexo() + "\n");
		}
	}
}
