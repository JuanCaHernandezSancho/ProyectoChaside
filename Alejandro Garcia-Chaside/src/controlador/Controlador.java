package controlador;



import java.io.IOException;

import modelo.Mundo;
import vista.VistaGUI;

/**
 * @author Alejandro Garcia olarte
 *
 */
public class Controlador  {
	//todo el programa es de la autoria de Alejandro garcia
	private VistaGUI vista;
	private Persistencia persis;
	private Mundo mundo;
	
	public Controlador() {
		vista = new VistaGUI();
		mundo = new Mundo();
		persis = new Persistencia(mundo);
		leerPreguntas();
		verificarClase();
		vista.mostrarDato(resultadosInter(),"INTERESES");
		vista.mostrarDato(resultadosApti(),"APTITUDES");
		
			
	}
	public String resultadosInter() {
		String inter = mundo.ContarGanadorInter();
		return persis.intereces(inter);
	}
	public String resultadosApti() {
		String apti = mundo.ContarGanadorApti();
		return persis.aptitudes(apti);
	}
	
	public void verificarClase() {
		int cantidad = mundo.getNumPreguntas();
		for (int i = 0; i < cantidad; i++) {
			if (mundo.getPreguntas().get(i).getClase().equals("aptitudes")) {
				int respuesta = vista.pedirDato(mundo.getPreguntas().get(i).getTexto());
				mundo.hacerPreguntasAptitudes(i, respuesta);
				if(respuesta== -1) {
					i = 100;
				}
			}
			else if(mundo.getPreguntas().get(i).getClase().equals("intereses")){
				int respuesta = vista.pedirDato(mundo.getPreguntas().get(i).getTexto());
				mundo.hacerPreguntasIntereses(i, respuesta);
				if(respuesta== -1) {
					i = 100;
				}
			}
			else
				vista.mostrarDato("algo salgo mal", "ERROR");
		}

	}
	
	
	
	public void leerPreguntas() {
		try {
			persis.cargarpreguntas();
			System.out.println("C H A S I D E");
			
		} catch (Exception e) {
			vista.mostrarDato("no lee el archivo o entro una excepcion cualquiera","ERROR");
		}
		
		
	}
	

}
