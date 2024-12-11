package Models;

import java.sql.Date;

public abstract class ContaBancaria {
	private Long id;
	private Long banco;
	private int agencia;
	private Long numero;
	private double saldo;
	private Date dataAbertura;
	private Long titular;
	
	public ContaBancaria(Long banco, int agencia, Long numero, double saldo, Date dataAbertura, Long titular) {
		setBanco(banco);
		setAgencia(agencia);
		setNumero(numero);
		setSaldo(saldo);
		setDataAbertura(dataAbertura);
		setTitular(titular);
	}
	
	public ContaBancaria() {}
	
	public Long getBanco() {
		return banco;
	}
	public void setBanco(Long banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Long getTitular() {
		return titular;
	}
	public void setTitular(Long titular) {
		this.titular = titular;
	}
	public Long getIdContaBancaria() {
		return id;
	}
	public void setId(Long Id) {
		this.id = Id;
	}

	@Override
	public String toString() {
		return "ID da Conta: " + id + "\nBanco: " + banco + "\nAgencia: " + agencia + "\nNúmero: " + numero + "\nSaldo: " + saldo + "\nData Abertura: " + dataAbertura + "\nTitular: " + titular;
	}
	
}
