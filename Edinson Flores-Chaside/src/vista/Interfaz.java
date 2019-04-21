package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	
	
	public Interfaz () {
		
	}
	
	public int [] hacerPreguntas (String [] cuestionario) {
		int [] respuestas = new int [cuestionario.length];
		
		int x = 0;
		
		JOptionPane.showMessageDialog(null, "Bienvenidos\nA continuacion el cuestionario de orientaciones vocacionales ","CHASIDE", JOptionPane.INFORMATION_MESSAGE);
		for (int i = 0; i < cuestionario.length; i++) {
			//respuestas[i] = Integer.parseInt(
			
		x=JOptionPane.showConfirmDialog(null, cuestionario[i], "Preguntas "+(i+1)+"/98", JOptionPane.INFORMATION_MESSAGE);
		if (x==0) {
			respuestas[i]=1;
		}else if(x==1) {
			respuestas[i]=0;
		}else {
			i=cuestionario.length;
			JOptionPane.showMessageDialog(null, "No se completo el formulario", "FORMULARIO INCOMPLETO", JOptionPane.INFORMATION_MESSAGE);
			respuestas=null;
			
		}
		}
				
		return respuestas;
	}
	
	public void mostrarResultados (String resultadoIntereses , String resultadoAptitudes) {
		
		JOptionPane.showMessageDialog(null, "RESULTADOS: \n\nIntereses: \n"+resultadoIntereses+"\n\nAptitudes: \n"+resultadoAptitudes, "RESULTADOS", JOptionPane.INFORMATION_MESSAGE);
	}

}
