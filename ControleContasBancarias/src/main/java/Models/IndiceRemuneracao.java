package Models;

import java.util.List;

import dao.IndiceRemuneracaoDAO;

public class IndiceRemuneracao {
	private Long codigo;
	private String descricao;
	private int periodicidade;
	private int situacao;
	
	public IndiceRemuneracao(Long codigo, String descricao, int periodicidade, int situacao) {
		setCodigo(codigo);
		setDescricao(descricao);
		setPeriodicidade(periodicidade);
		setSituacao(situacao);
	}
	public IndiceRemuneracao() {}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	public void Gravar (IndiceRemuneracao indiceRemuneracao) {
		IndiceRemuneracaoDAO indiceRemuneracaoDAO = new IndiceRemuneracaoDAO();
		indiceRemuneracaoDAO.Insert(indiceRemuneracao);
	}
	public void Ler(Long Codigo) {
		IndiceRemuneracaoDAO indiceRemuneracaoDAO = new IndiceRemuneracaoDAO();
		IndiceRemuneracao ir = indiceRemuneracaoDAO.FindByID(Codigo);
		System.out.println("Código: " + ir.getCodigo() + "\nDescrição: " + ir.getDescricao() + "\nPeriodicidade: " + ir.getPeriodicidade() + "\nSituação: " + ir.getSituacao());
	}
	
	public void ListarTodos() {
		IndiceRemuneracaoDAO indiceRemuneracaoDAO = new IndiceRemuneracaoDAO();
		List<IndiceRemuneracao> lista = indiceRemuneracaoDAO.FindAll();
		for(IndiceRemuneracao indiceRemuneracao : lista) {
			System.out.println("Código: " + indiceRemuneracao.getCodigo() + "\nDescrição: " + indiceRemuneracao.getDescricao() + "\nPeriodicidade: " + indiceRemuneracao.getPeriodicidade() + "\nSituação: " + indiceRemuneracao.getSituacao() + "\n");
		}
	}
}
