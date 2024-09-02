package Model;

public class Candidatos {

	private String nombre;
	private int votos;

	public Candidatos() {
	}

	public Candidatos(String candidato) {
		this.nombre = candidato;
		this.votos=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String candidato) {
		this.nombre = candidato;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos() {
		this.votos++;
	}

	@Override
	public String toString() {
		return "El candidato " + nombre + " tiene " + votos + " votos";
	}

}
