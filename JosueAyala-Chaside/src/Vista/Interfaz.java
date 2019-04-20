package Vista;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Interfaz {

	public Interfaz() 
	{

	}
	
	
	public String[] pedirDato(String[] pregunta) 
	{
		String[] respuestas= new String[98];
		int i = 0;	
		
			while(i<98) {				
					String a = JOptionPane.showInputDialog(null,pregunta[i],"Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE);	
					if(!a.equalsIgnoreCase("")&&!a.equalsIgnoreCase(" ")) {
						if(a.equalsIgnoreCase("1")||a.equalsIgnoreCase("0")) {
							respuestas[i]=a;
							i++;
						}
						else
							JOptionPane.showMessageDialog(null, "digite solo 1 o 0", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);						
					}		
					else
						JOptionPane.showMessageDialog(null, "digite algo porfavor", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			}			
		
		
		return respuestas;
	}
	
	public void presentacionChaside() {
		JOptionPane.showMessageDialog(null, "Bienvenido al test vocaional chaside"+"\n"+"A continuacion se le presentaran 98 preguntas,"
		+ "responda todas con sinceridad y paciencia"+"\n"+"\n"+"Sus respuestas deben ser solamente 1 o 0, siendo 1 si y 0 no"+"\n"+"\n"+
				"Pulse el boton aceptar para empezar............"+"\n"
	, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}

	public void escribirTabla(String dato) 
	{		
		UIManager.put("OptionPane.minimumSize",new Dimension(100,150));
		JOptionPane.showMessageDialog(null, dato, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
