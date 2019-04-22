package modelo;



public class Pregunta {
	
	private int numPregunta;
	private String txtpregunta;
	private String area;
	
	
	
	
	
	

	public Pregunta(int numPregunta, String txtpregunta, String area) {
		
		this.numPregunta = numPregunta;
		this.txtpregunta = txtpregunta;
		this.area = area;
	}



	public String getArea() {
		return this.area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public int getNumPregunta() {
		return this.numPregunta;
	}

	public void setNumPregunta(int numPregunta) {
		this.numPregunta = numPregunta;
	}

	public String getTxtpregunta() {
		return this.txtpregunta;
	}

	public void setTxtpregunta(String txtpregunta) {
		this.txtpregunta = txtpregunta;
	}
	
	public void guardarPregunta() {
		
	}
	
	public boolean cargarPregunta() {
		
		return true;
	}
	

}
