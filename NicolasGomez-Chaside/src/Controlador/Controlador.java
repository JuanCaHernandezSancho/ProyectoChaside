package Controlador;

import javax.swing.JOptionPane;

import Interfaz.Interfaz;
import Modelo.Chaside;

public class Controlador {

	protected Chaside chaside;
	protected Interfaz gui;
	
	public Controlador() {
		
		chaside = new Chaside();
		gui = new Interfaz();
		chaside.getIntereses().calcularIntereses();
		chaside.getAptitudes().calcularAptitudes();
		chaside.calcularPreguntas();
		chaside.getInteresMayor();
		chaside.getAptitudesMayor();
		gui.escribirDato(chaside.finalChaside());
	}
	
}
