package Controlador;
import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	
	private Mundo md;
	private Interfaz gui;
	
	public Controlador() {
		md=new Mundo();
		gui=new Interfaz();		
		
	  gui.presentacionChaside();
	  md.llenarArregloRespuestas(gui.pedirDato(md.archivoLeer()));			
	  gui.escribirTabla( md.crearTabla());
	   
	}

}
