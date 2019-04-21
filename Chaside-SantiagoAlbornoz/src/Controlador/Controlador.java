package Controlador;

import javax.swing.JOptionPane;

import Modelo.Mundo;

import Vista.Interfaz;

public class Controlador{

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		gui = new Interfaz();
		
		gui.escribirDato(bd.crearTest(gui.tabla(bd.preguntas())));
		
	
		
		
		
		
		
	}
	

}
