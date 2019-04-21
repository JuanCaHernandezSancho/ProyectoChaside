package Interfaz;

import javax.swing.JOptionPane;

public class Interfaz {

	public String pedirDato() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese un dato","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Chaside", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
