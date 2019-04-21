package modelo;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class Pregunta {
	
	private String texto;
	private int num;
	private String clase;
	private String letra;
	private int numPreguntas;
	
	public Pregunta(String texto, int num, String clase, String letra) {
		super();
		this.texto = texto;
		this.num = num;
		this.clase = clase;
		this.letra = letra;
		numPreguntas =0;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getNumPreguntas() {
		return numPreguntas;
	}

	public void setNumPreguntas(int numPreguntas) {
		this.numPreguntas = numPreguntas;
	}
	
	
	
	

}
