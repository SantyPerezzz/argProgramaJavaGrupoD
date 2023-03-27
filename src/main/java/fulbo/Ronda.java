package fulbo;
import java.util.List;
import java.util.ArrayList;


public class Ronda {
	private String nro;
	private List<Partido> partidos;
	
	public Ronda() {
		this.nro="";
		this.partidos= new ArrayList<>();
	}

	public Ronda(String nro, List<Partido> partidos) {
		super();
		this.nro = nro;
		this.partidos = partidos;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	// Completar metodo puntos()
	public int puntos() {
		return ;
	}
}
