package Models;

import java.util.List;

import dao.EventoDAO;

public class Evento {
	private int id;
	private String descricao;
	private int tipoMovimentacao;
	private int situacao;
	
	public Evento(String descricao, int tipoMovimentacao, int situacao) {
		setDescricao(descricao);
		setTipoMovimentacao(tipoMovimentacao);
		setSituacao(situacao);
	}
	
	public Evento() {}

	public int getIdEvento() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipoMovimentacao() {
		if (this.tipoMovimentacao == 1) {
			return "Saque";
		} else {
			return "Depósito";
		}
	}
	public void setTipoMovimentacao(int tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	public void setTipoMovimentacaoBusca(String tipoMovimentacao) {
		if (tipoMovimentacao.equals("Saque")) {
			this.tipoMovimentacao = 1;
		} else if (tipoMovimentacao.equals("Depósito")) {
			this.tipoMovimentacao = 0;
		}
	}
	public String getSituacao() {
		if (this.situacao == 1) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public void setSituacaoBusca(String situacao) {
		if (situacao.equals("Aprovado")) {
			this.situacao = 1;
		} else if (situacao.equals("Reprovado")) {
			this.situacao = 0;
		}
	}
	
	public void Gravar (Evento evento) {
		EventoDAO eventoDAO = new EventoDAO();
		eventoDAO.Insert(evento);
	}
	public void Ler(int ID) {
		EventoDAO eventoDAO = new EventoDAO();
		Evento eve = eventoDAO.FindByID(ID);
		System.out.println("\nDescrição: " + eve.getDescricao() + "\nTipo Movimentação: " + eve.getTipoMovimentacao() + "\nSituação: " + eve.getSituacao());
	}
	public void ListarTodos() {
		EventoDAO eventoDAO = new EventoDAO();
		List<Evento> lista = eventoDAO.FindAll();
		for(Evento evento : lista) {
			System.out.println("ID: " + evento.getIdEvento() + "\nDescrição: " + evento.getDescricao() + "\nTipo Movimentação: " + evento.getTipoMovimentacao() + "\nSituação: " + evento.getSituacao() + "\n");
		}
	}
}
