package Vista;

import javax.swing.JOptionPane;

import Modelo.Pregunta;

public class Interfaz {
	
	public Interfaz() {
		
		
		
	}
	
	public String hacerCuestionario(String d) {
		return  JOptionPane.showInputDialog(null,d,"CHASIDE - Responda SI/NO (Respuesta diferente a Si es No)",JOptionPane.QUESTION_MESSAGE );
	}
	
	
}
