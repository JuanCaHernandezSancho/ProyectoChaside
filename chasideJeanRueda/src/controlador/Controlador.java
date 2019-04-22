package controlador;


import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Mundo bd;
	private Interfaz gui;
	
	public Controlador() {
		// TODO Auto-generated constructor stub
		this.bd = new Mundo();
		this.gui = new Interfaz();
		
		for (int i = 1; i <= bd.getCuestionario().getCantidadPreguntas(); i++) {
			String mensaje = bd.getCuestionario().getPregunta(i).getNumPregunta()+ ":"+ bd.getCuestionario().getPregunta(i).getTxtpregunta()+" Area = "+bd.getCuestionario().getPregunta(i).getArea();
			int respuesta = gui.mostrarPregunta(mensaje);
			bd.getCuestionario().asignarRespuesta(i, respuesta);
		}
		bd.getCuestionario().guardar();
		
	}
}
