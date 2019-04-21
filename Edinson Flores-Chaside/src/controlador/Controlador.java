package controlador;

import modelo.Chaside;
import vista.Interfaz;

public class Controlador {

	private Chaside chaside;
	private Interfaz interfaz;
	
	public Controlador () {
		
		chaside = new Chaside ();
		interfaz = new Interfaz ();
		
		chaside.calcularResultados(interfaz.hacerPreguntas(chaside.getCuestionario()));
		interfaz.mostrarResultados(chaside.darAreaIntereses(), chaside.darAreaAptitudes());
		
	}
}
