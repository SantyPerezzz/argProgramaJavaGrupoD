package fulbo;

public class ResultadoEnum {
	private char resultado;
	
	public ResultadoEnum() {
		this.resultado= '\0';
	}
	
	public ResultadoEnum(char resultado) {
		this.resultado=resultado;
	}

	public char getResultado() {
		return resultado;
	}

	public void setResultado(char resultado) {
		this.resultado = resultado;
	}
	

}
