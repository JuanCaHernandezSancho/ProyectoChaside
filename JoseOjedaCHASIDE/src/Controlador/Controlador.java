package Controlador;


import java.lang.reflect.Array;
import java.util.Scanner;

import Modelo.Mundo;
import Modelo.Persistencia;
import Vista.Interfaz;

public class Controlador { 

	Persistencia BD;
	private Mundo bd;

	private Interfaz gui;
	
	public Controlador() {  

		bd = new Mundo();
		gui = new Interfaz();
		BD = new Persistencia();
		
		for(int i=0; i<=97; i++) {
			
			bd.setRespuestas(gui.pedirDato((i+1)+"."+BD.preguntas[i]));
		
		}
		gui.escribirDato3(bd.getRespuestas());
	
	
	}
	
	
	
	

}
