package Modelo;

//Representa el mundo del problema: las clases y m�todos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo implements Interface {

	//se asocia a Mundo para que �ste pueda interactuar con la data de Persistencia.
	private Cuestionario cue;
	private Archivo a1;

	public Mundo() {
		// TODO Auto-generated constructor stub
		a1= new Archivo();
		
		
		
		
	}
	
	public String crearTest(String code) {
		String rta="";
		
		cue= new Cuestionario(code);
		rta+=cue.ShowAsnwers();
		a1.escribirArchivo(code);
		return rta;
	}
	
	
	
	
	
	
	
	public String leerArchivo() {
		return a1.leerArchivo();
	}
	
	public void escribirArchivo(String code) {
		a1.escribirArchivo(code);
	}
	public String []preguntas(){
		return preguntas;
	}

	
	
}
