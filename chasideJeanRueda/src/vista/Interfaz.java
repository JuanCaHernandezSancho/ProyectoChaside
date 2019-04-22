package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	
	
	
	public int mostrarPregunta(String id) 
	{
	
		
		int respuesta = (JOptionPane.showConfirmDialog(null,id,"Test CHASIDE",JOptionPane.YES_NO_OPTION));
		if (respuesta == JOptionPane.YES_OPTION) {
			return 1;
		}else
			return 0;
	}
	
	
	/* metodo de prueba que imprime un dato procesado por un método declarado en 
	 * Reemplazar por lo que se necesiten
	 */


}
