package Utils;

public class Formatacoes {
	public static Long StringParaCEP(String CEP) {
		Long CEPformatado = Long.parseLong(CEP.replaceAll("[^0-9]", ""));
		return CEPformatado;
	}
	public static String CepParaString(Long CEP) {
		String CEPformatado = CEP.toString().replaceAll(ExpressoesRegulares.RegExCEP, Mascaras.MascaraCEP);
		return CEPformatado;
	}
	public static Long StringParaTelefone(String Telefone) {
		Long TelefoneFormatado = Long.parseLong(Telefone.replaceAll("[^0-9]", ""));
		return TelefoneFormatado;
	}
	public static String TelefoneParaString(Long numero, int tipo) {
		if (tipo == 0) {
			String TelefoneFormatado = numero.toString().replaceAll(ExpressoesRegulares.RegExFoneFixo, Mascaras.MascaraFone);
			return TelefoneFormatado;
		} else {
			String TelefoneFormatado = numero.toString().replaceAll(ExpressoesRegulares.RegExFoneMovel, Mascaras.MascaraFone);
			return TelefoneFormatado;
		}
	}
}
