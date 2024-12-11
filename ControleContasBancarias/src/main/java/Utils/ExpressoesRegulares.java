package Utils;

public class ExpressoesRegulares {
	public static final String RegExCPF = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";
    public static final String RegExFoneFixo = "(\\d{2})(\\d{4})(\\d{4})";
    public static final String RegExFoneMovel = "(\\d{2})(\\d{5})(\\d{4})";
    public static final String RegExExcetoNumericos = "[^0-9]";
    public static final String RegExCEP = "(\\d{5})(\\d{3})";
}
