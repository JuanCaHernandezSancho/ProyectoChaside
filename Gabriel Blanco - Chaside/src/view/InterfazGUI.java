package view;

import javax.swing.*;

public class InterfazGUI extends JPanel
{
	private static final long serialVersionUID = 1L;
	private int yes, no;
	
	public void ConfirmarInicio()
	{
		int returnValue = JOptionPane.showConfirmDialog(null, "Se le harán 98 preguntas. ¿Desea continuar?", "Advertencia", JOptionPane.WARNING_MESSAGE);
		if(returnValue == JOptionPane.CANCEL_OPTION)
		{
			System.exit(0);
		}
	}
	
	public void Pregunta(String insertarPregunta)
	{
		int returnValue = JOptionPane.showConfirmDialog(null, insertarPregunta, "Chaside", JOptionPane.YES_NO_OPTION);
		if(returnValue == JOptionPane.YES_OPTION)
		{
			yes++;
		}
		else
		{
			no++;
		}
	}
	
	public void Final(int cantidadPuntos)
	{
		JOptionPane.showMessageDialog(null, "La cantidad de puntos fue: "+cantidadPuntos, "FIN DEL EXAMEN", JOptionPane.INFORMATION_MESSAGE);
	}

	public int getYes() {
		return yes;
	}

	public int getNo() {
		return no;
	}
	
}
