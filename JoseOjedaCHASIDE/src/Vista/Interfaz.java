package Vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
		
	public String pedirDato(String dato) 
	{
		return (JOptionPane.showInputDialog(null, dato, "Titulo", JOptionPane.OK_CANCEL_OPTION));
	}
	
	public void escribirDato3(String strings)  
	{
		
		JOptionPane.showMessageDialog(null, strings, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
