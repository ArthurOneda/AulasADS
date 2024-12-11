package Enums;

public enum tpOperacao {
	toDiminuirSaldo('-'),
	toAumentarSaldo('+'),
	toNaoAlterarsaldo('=');
	
	private char valEnum;
	
	tpOperacao(char c) {
		this.valEnum = c;
	}
	
	public char getOperacao() {
		return this.valEnum;
	}
}
