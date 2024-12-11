package Models;

import java.util.List;
import dao.PessoaDAO;

public class Pessoa {
	private Long ID;
	private Long CEP;
	private int numEndereco;
	private String complementoEndereco;
	private int situacao;
	private List<NumTelefone> Telefone;
	
	public Pessoa(Long cEP, int numEndereco, String complementoEndereco, int situacao) {
		setCEP(cEP);
		setNumEndereco(numEndereco);
		setComplementoEndereco(complementoEndereco);
		setSituacao(situacao);
	}

	public Pessoa() {}

	public Long getID() {
		return this.ID;
	}
	public void setID(Long ID) {
		this.ID = ID;
	}
	public Long getCEP() {
		return this.CEP;
	}
	public void setCEP(Long cEP) {
		this.CEP = cEP;
	}
	public int getNumEndereco() {
		return this.numEndereco;
	}
	public void setNumEndereco(int numEndereco) {
		this.numEndereco = numEndereco;
	}
	public int getSituacao() {
		return this.situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public String getComplementoEndereco() {
		return this.complementoEndereco;
	}
	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}
	public void addTelefone(NumTelefone fone) {
		if (!telefoneNaLista(fone)) {
			Telefone.add(fone);
			System.out.println("Telefone adicionado na lista na posição " + Telefone.indexOf(fone));
		}
	}
	public void removeTelefone(NumTelefone fone) {
		if (telefoneNaLista(fone)) {
			Telefone.remove(fone);
		}
	}
	public boolean telefoneNaLista(NumTelefone fone) {
		for (NumTelefone FoneLista : Telefone) {
			if (FoneLista.getNumero() == fone.getNumero()) {
				return true;
			}
		}
		return false;
	}
	public void Gravar(Pessoa pessoa) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.Insert(pessoa);
	}
	public void Ler(Long id) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa p = pessoaDAO.FindByID(id);
		System.out.println("CEP: " + p.getCEP() + "\nNúmero Endereço: " + p.getNumEndereco() + "\nComplemento Endereço: " + p.getComplementoEndereco() + "\nSituação: " + p.getSituacao());
	}
	public void ListarTodos() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> lista = pessoaDAO.FindAll();
		for(Pessoa pessoa : lista) {
			System.out.println("ID: " + pessoa.getID() + "\nCEP: " + pessoa.getCEP() + "\nNúmero Endereço: " + pessoa.getNumEndereco() + "\nComplemento Endereço: " + pessoa.getComplementoEndereco() + "\nSituação: " + pessoa.getSituacao() + "\n");
		}
	}
}
