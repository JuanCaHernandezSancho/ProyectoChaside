package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{

	public Interfaz()
	{
		
	}
	
	public void getMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje,"Resultados",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public int capturarDato(String mensaje)
	{
		int pro = JOptionPane.showConfirmDialog(null, mensaje,"Test Vocacional",JOptionPane.YES_NO_OPTION);
		return pro;
	}
}