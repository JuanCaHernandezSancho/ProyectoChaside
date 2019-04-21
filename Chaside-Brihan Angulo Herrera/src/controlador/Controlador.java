package controlador;

import modelo.Mundo;
import vista.InterfazGui;

public class Controlador {

	private InterfazGui inter;
	private Mundo mun;
	
	public Controlador() {
	
		mun = new Mundo();
		inter = new InterfazGui();
		mostraResultado();
	}
	
	public void mostrarInteres() {
		
		int [] z = inter.recibirDato();
		String q = mun.getCha().calcularInteres(z);
		inter.getMensaje(q);
	}
	
	public void mostrarAptitudes() {
		
		int [] z = inter.recibirDato();
		String q = mun.getCha().calcularAptitudes(z);
		inter.getMensaje(q);
	}
	
	public void mostraResultado() {
		
		this.mostrarInteres();
		this.mostrarAptitudes();	
	}
}
