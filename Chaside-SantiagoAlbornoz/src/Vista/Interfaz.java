package Vista;

import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() 
	{
		// TODO Auto-generated constructor stub
		
	}

	/* metodo de prueba que pide un dato por JOptionPane y retorna el String correspondiente
	 * Reemplazar por lo que se necesiten
	 */
	
	public String pedirDato(String titulo) 
	{
		return (JOptionPane.showInputDialog(null,titulo,"Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	
	
	/* metodo de prueba que imprime un dato procesado por un m�todo declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Titulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public	String tabla(String []a) {
		
		String rta="";
		int num=0;
		do {
		if (JOptionPane.showConfirmDialog(null, a[num], "PREGUNTA "+num,
		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			rta+="1";
		    
		} else {
		    
			rta+="0";
		}
		System.out.println(rta);
		num++;
		}while(num<98);
		return rta;
		
	}
	
	
	
}
