package controlador;

import modelo.Modelo;
import vista.InterfaceGui;

public class Controlador {
	
	InterfaceGui g;
	
	Modelo m;
	public Controlador() {
		g = new InterfaceGui();
		
		m = new Modelo();
		
		Conectar();
		
	}
	
	public void Conectar () {
int z[] =g.preguntar();
		
		
		String h = m.getCh().CalcularInteres(z);
		String j =m.getCh().CalcularAptitudes(z); 

	
	g.resultado(h);
	g.resultado(j);
	g.resultado("Por puedes hacerte estas preguntas retrospectivas que son solo para ti \n 1.�Qu� me gusta hacer?\r\n" + 
			"2.�Realizando qu� actividad me siento c�modo? "+"\n"+"3.�Qu� me hace feliz?\r\n" + "4.�Qu� me apasiona y realmente lo disfruto?\r\n" + 
					"5.�Qu� me apasiona y realmente lo disfruto?\r\n" + 
					"6.�Qu� destrezas resaltan mi personalidad?\r\n"+"7.�Cu�les son mis habilidades?\r\n"+"8.�Qu� me gusta investigar y aprender?\r\n"+"9.�Tengo preparaci�n y car�cter para realizar esto o aquello?\r\n" + 
							"10.�Me siento feliz cuando elijo algo concerniente a los estudios?");
	
	}

	

}
