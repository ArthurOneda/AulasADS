package Models;

import java.sql.Date;
import java.util.List;
import dao.MovimentacaoDAO;

public class Movimentacao {
	private int idMovimentacao;
	private Long contaBancaria;
	private Date data;
	private Long evento;
	private double valor;
	
	public Movimentacao(Long contaBancaria, Date data, Long evento, double valor) {
		setContaBancaria(contaBancaria);
		setData(data);
		setEvento(evento);
		setValor(valor);
	}
	public Movimentacao() {}
	
	public Long getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(Long contaBancaria) {
		this.contaBancaria = contaBancaria;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Long getEvento() {
		return evento;
	}
	public void setEvento(Long evento) {
		this.evento = evento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getIdMovimentacao() {
		return idMovimentacao;
	}
	public void setIdMovimentacao(int idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}
	
	public void Gravar(Movimentacao movimentacao) {
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
		movimentacaoDAO.Insert(movimentacao);
	}
	public void ListarTodos() {
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
		List<Movimentacao> lista = movimentacaoDAO.FindAll();
		for(Movimentacao movimentacao : lista) {
			System.out.println("ID: " + movimentacao.getIdMovimentacao() + "\nConta Bancária: " + movimentacao.getContaBancaria() + "\nData: " + movimentacao.getData() + "\nEvento: " + movimentacao.getEvento() + "\nValor: " + movimentacao.getValor() + "\n");
		}
	}
}
