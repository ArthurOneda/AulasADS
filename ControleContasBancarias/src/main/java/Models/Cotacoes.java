package Models;

import java.sql.Date;
import java.util.List;

import dao.CotacoesDAO;

public class Cotacoes {
	private Long codigo;
	private Date data;
	private double valor;
	
	public Cotacoes(Long codigo, Date data, double valor) {
		setCodigo(codigo);
		setData(data);
		setValor(valor);
	}
	public Cotacoes() {}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void Gravar (Cotacoes cotacoes) {
		CotacoesDAO cotacoesDAO = new CotacoesDAO();
		cotacoesDAO.Insert(cotacoes);
	}
	public void Ler(Long Codigo) {
		CotacoesDAO cotacoesDAO = new CotacoesDAO();
		Cotacoes c = cotacoesDAO.FindByID(Codigo);
		System.out.println("Código: " + c.getCodigo() + "\nData: " + c.getData() + "\nValor: " + c.getValor());
	}
	
	public void ListarTodos() {
		CotacoesDAO cotacoesDAO = new CotacoesDAO();
		List<Cotacoes> lista = cotacoesDAO.FindAll();
		for(Cotacoes cotacoes : lista) {
			System.out.println("Código: " + cotacoes.getCodigo() + "\nData: " + cotacoes.getData() + "\nValor: " + cotacoes.getValor() + "\n");
		}
	}
}
