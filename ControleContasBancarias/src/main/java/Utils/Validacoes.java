package Utils;

import Enums.FillSide;

public class Validacoes {
	public static String Fill(String Str, char Chr, FillSide Lado, int Tamanho) {
		String Aux = Str;
		while (Aux.length() < Tamanho) {
			if (Lado == FillSide.RIGHT) {
				Aux = Aux + Chr;
			} else {
				Aux = Chr + Aux;
			}
		}
		return Aux;
	}
}
