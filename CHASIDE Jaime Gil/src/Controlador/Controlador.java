package Controlador;

import Modelo.Archivo;

import Modelo.Mundo;
import Modelo.Pregunta;
import Vista.Interfaz;

public class Controlador {
	
	private Pregunta p;
	private Interfaz i;
	private Mundo m;
	private Archivo ar;
	

	public Controlador() {
	p = new Pregunta();
	i = new Interfaz();
	m = new Mundo();
	ar = new Archivo();
	m.getAr().prepararArchivo();
	m.getP().mostrarCHASIDE();
	m.getAr().cerrarArchivo();
	m.getAr().leerArchivo();
	
	}
	
	

}
