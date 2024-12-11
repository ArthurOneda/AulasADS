package Models;

import java.util.List;

import dao.PessoaJuridicaDAO;

public class pessoaJuridica extends Pessoa {
	private Long CNPJ;
	private String razaoSocial;
	private String nomeFantasia;
	private String inscricaoEstadual;
	
	public pessoaJuridica(Long cEP, int numEndereco, String complementoEndereco, int situacao, Long cNPJ, String razaoSocial, String nomeFantasia, String inscricaoEstadual) {
		setCEP(cEP);
		setCNPJ(cNPJ);
		setComplementoEndereco(complementoEndereco);
		setInscricaoEstadual(inscricaoEstadual);
		setNomeFantasia(nomeFantasia);
		setNumEndereco(numEndereco);
		setRazaoSocial(razaoSocial);
		setSituacao(situacao);
	}
	
	public pessoaJuridica() {}

	public Long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public void Gravar(pessoaJuridica pessoaJuridica) {
		PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
		pessoaJuridicaDAO.Insert(pessoaJuridica);
	}
	public void Ler(Long id) {
		PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
		pessoaJuridica p = pessoaJuridicaDAO.FindByID(id);
		System.out.println("CEP: " + p.getCEP() + "\nNúmero Endereço: " + p.getNumEndereco() + "\nComplemento Endereço: " + p.getComplementoEndereco() + "\nSituação: " + p.getSituacao() + "\nCNPJ: " + p.getCNPJ() + "\nRazão Social: " + p.getRazaoSocial() + "\nNome Fantasia: " + p.getNomeFantasia() + "\nInscrição Sexual: " + p.getInscricaoEstadual());
	}
	public void ListarTodos() {
		PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
		List<pessoaJuridica> lista = pessoaJuridicaDAO.FindAll();
		for(pessoaJuridica pessoaJuridica : lista) {
			System.out.println("ID: " + pessoaJuridica.getID() + "\nCEP: " + pessoaJuridica.getCEP() + "\nNúmero Endereço: " + pessoaJuridica.getNumEndereco() + "\nComplemento Endereço: " + pessoaJuridica.getComplementoEndereco() + "\nSituação: " + pessoaJuridica.getSituacao() + "\nCNPJ: " + pessoaJuridica.getCNPJ() + "\nRazão Social: " + pessoaJuridica.getRazaoSocial() + "\nNome Fantasia: " + pessoaJuridica.getNomeFantasia() + "\nInscrição Sexual: " + pessoaJuridica.getInscricaoEstadual() + "\n");
		}
	}
}
