package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Cuestionario {
	
	
	private Pregunta pregunta;
	
	private int[][] matrizRespuestas;
	private Pregunta[] preguntas;
	private Properties propPreguntas;
	private Properties propRespuestas;
	private String archivoPregunta;
	private String archivoRespuesta;
	
	public Cuestionario() {
		// TODO Auto-generated constructor stub
		//lógica paracargar la matriz de respuestas inicializadas en -1
		
		this.propPreguntas = new Properties();
		this.propRespuestas = new Properties();	
		
		this.archivoPregunta = "preguntas.properties";
		this.archivoRespuesta = "respuestas.properties";
		this.preguntas = new Pregunta[99];
		this.matrizRespuestas = new int[99][2];
		
		cargarPreguntas();
		try {
			inicializarRespuestas();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	


	private void cargarPreguntas() {
		
		//TODO cargar arreglo de preguntas a partir del PropertieFile de Preguntas
		// como resultado, deja cargado el arreglo preguntas
		
		try {
			propPreguntas.load(new FileInputStream(archivoPregunta));
		
			
			 Enumeration<String> enums = (Enumeration<String>) propPreguntas.propertyNames();
			    while (enums.hasMoreElements()) {
			        
			    	String key = enums.nextElement();
			    	String value = propPreguntas.getProperty(key);
			    	
			    	String[] values = value.split("-",2);
			    	pregunta = new Pregunta(Integer.parseInt(key), values[0], values[1]);
			    	
			    	
			    	//System.out.println(pregunta.getNumPregunta() + " : " + pregunta.getTxtpregunta() + " Area = " + pregunta.getArea());
			    	preguntas[Integer.parseInt(key)] = pregunta;
			    }
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void inicializarRespuestas() throws FileNotFoundException, IOException {
		// TODO inicializa la matriz de Respuestas.
		//con los numeros de la pregunta, y la respuesta correspondiente inicializada en -1
		propRespuestas.load(new FileInputStream(archivoRespuesta));
		for (int i = 1; i <= getCantidadPreguntas(); i++) {
			propRespuestas.setProperty(String.valueOf(i), String.valueOf(-1));	
		}		
	}
	
	
	public void asignarRespuesta(int id,int respuesta) {
		//actualiza el valor de la respuesta a la pregunta correspondiente a ID, en la matriz de respuesta
		propRespuestas.setProperty(String.valueOf(id), String.valueOf(respuesta));	
		
	}
	public void guardar() {
		
		//guarda las respuestas en el properiteFIle de respuesta
		try {
			
			propRespuestas.store(new FileOutputStream(archivoRespuesta),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}



	public Pregunta getPregunta(int id) {
		return preguntas[id];
	}
	
	public int getCantidadPreguntas() {
		
		return propPreguntas.size();
	}



	
	
	

	

}
