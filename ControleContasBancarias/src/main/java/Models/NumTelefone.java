package Models;

import java.util.List;
import Utils.Formatacoes;
import dao.TelefoneDAO;

public class NumTelefone {
	private int ID;
	private Long numero;
	private int tipo;
	private int IDPessoa;
	
	public NumTelefone(String numero, int tipo, int IDpessoa) {
		setNumero(numero);
		setIDPessoa(IDpessoa);
	}
	public NumTelefone(){}
	
	public String getNumero() {
		return Formatacoes.TelefoneParaString(this.numero, this.tipo);
	}
	public void setNumero(String numero) {
		this.numero = Formatacoes.StringParaTelefone(numero);
		setTipo();
	}
	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getTipo() {
		if (tipo == 0) {
			return "Telefone Fixo";
		} else if (tipo == 1) {
			return "Telefone Móvel";
		}
		return null;
	}
	public void setTipo() {
		if (this.numero.toString().length() == 11) {
			this.tipo = 1;
		} else if(this.numero.toString().length() == 10) {
			this.tipo = 0;
		}
	}
	public int getIDPessoa() {
		return this.IDPessoa;
	}
	public void setIDPessoa(int IDPessoa) {
		this.IDPessoa = IDPessoa;
	}
	
	public void Gravar(NumTelefone telefone) {
		TelefoneDAO telefoneDAO = new TelefoneDAO();
		telefoneDAO.Insert(telefone);
	}
	public void ListarNumerosPessoa(int IDPessoa) {
		TelefoneDAO telefoneDAO = new TelefoneDAO();
		List<NumTelefone> lista = telefoneDAO.FindAll(IDPessoa);
		for (NumTelefone telefone : lista) {
			System.out.println("Número: " + telefone.getNumero() + "\nTipo: " + telefone.getTipo() + "\n");
		}
	}
}
