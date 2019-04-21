package vista;

import javax.swing.JOptionPane;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class VistaGUI {
	public VistaGUI() {
		
	}
	
	public int pedirDato(String mensaje) {
		return  JOptionPane.showConfirmDialog(null, mensaje,null, JOptionPane.YES_NO_OPTION);
	}
	
	public void mostrarDato(String mensaje, String titulo) {
		 JOptionPane.showMessageDialog(null, mensaje,titulo, 1);
		
	}


}
