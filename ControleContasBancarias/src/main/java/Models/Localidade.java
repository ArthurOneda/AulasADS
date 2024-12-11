package Models;

import java.util.List;
import Utils.Formatacoes;
import dao.LocalidadeDAO;

public class Localidade {
	private int ID;
	private Long CEP;
	private String estado;
	private String cidade;
	private String bairro;
	private String logradouro;
	
	public Localidade(String cEP, String estado, String cidade, String bairro, String logradouro) {
		setCEP(cEP);;
		setEstado(estado);
		setCidade(cidade);
		setBairro(bairro);
		setLogradouro(logradouro);
	}
	public Localidade() {}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCEP() {
		return Formatacoes.CepParaString(CEP);
	}
	public void setCEP(String cEP) {
		this.CEP = Formatacoes.StringParaCEP(cEP);
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public void Gravar (Localidade localidade) {
		LocalidadeDAO localidadeDAO = new LocalidadeDAO();
		localidadeDAO.Insert(localidade);
	}
	public void Ler(Long CEP) {
		LocalidadeDAO localidadeDAO = new LocalidadeDAO();
		String cepBusca = Formatacoes.CepParaString(CEP);
		Localidade loc = localidadeDAO.FindByCEP(cepBusca);
		System.out.println("CEP: " + loc.getCEP() + "\nLogradouro: " + loc.getBairro() + "\nBairro: " + loc.getBairro() + "\nCidade: " + loc.getCidade() + "\nEstado: " + loc.getEstado());
	}
	public void ListarTodos() {
		LocalidadeDAO localidadeDAO = new LocalidadeDAO();
		List<Localidade> lista = localidadeDAO.FindAll();
		for(Localidade localidade : lista) {
			System.out.println("CEP: " + localidade.getCEP() + "\nLogradouro: " + localidade.getBairro() + "\nBairro: " + localidade.getBairro() + "\nCidade: " + localidade.getCidade() + "\nEstado: " + localidade.getEstado() + "\n");
		}
	}
}
