package Controlador;

import Modelo.Mundo;
import Modelo.Persistencia;
import Vista.Vista;

public class Principal {

	
	public Principal() {
		Persistencia per = new Persistencia();
		Mundo mud = new Mundo();
		
		Vista vis = new Vista();
		//vis.preguntar(per.leerArchivo());
		//mud.comparar(vis.preguntar(per.leerArchivo()));
		vis.Mostar(mud.comparar(vis.preguntar(per.leerArchivo())));
	}
}
