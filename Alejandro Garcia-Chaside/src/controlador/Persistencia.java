package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import modelo.Mundo;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class Persistencia {
	private Mundo mundo ;
	
	public Persistencia(Mundo pMundo) {
		mundo = pMundo;
	}
	
	public String intereces(String letra) {
		String intereses = " ";
		if (letra.equals("c")) {
			intereses ="C \n"
		+"Organizativo \n"
		+"Supervisión \n"
		+ "Orden \n"
		+ "Análisis y síntesis \n"
		+ "Colaboración \n"
		+"Cálculo \n"
		+"Liderazgo \n"
		+"Participación Activa \n";
		}
		else if (letra.equals("h")) {
			intereses ="H \n"
					+"Precisión Verbal  \n"
					+"Organización \n"
					+ "Relación \n"
					+ "Lingüística \n"
					+"Orden \n"
					+"Justicia \n"
					+"analítico  \n";
		}
		else if (letra.equals("a")) {
			intereses ="A \n"
					+"Estético \n"
					+"Armónico \n"
					+ "Manual \n"
					+ "Visual \n"
					+ "Auditivo \n"
					+"Observación \n"
					+"Senso Perceptivo \n";
		}
		else if (letra.equals("s")) {
			intereses ="S \n"
					+"Asistir \n"
					+"Investigativo \n"
					+ "Precisión \n"
					+"Senso Perceptivo \n"
					+ "Analítico \n"
					+"Ayudar \n"
					+"Curar \n"
					+"Rehabilitar  \n";
			}
		else if (letra.equals("i")) {
			intereses ="I \n"
					+"Cálculo \n"
					+"Científico \n"
					+ "Manual \n"
					+ "Exacto \n"
					+ "Planificar \n"
					+"Organizar \n"
					+"Controlar \n";
		}
		else if (letra.equals("d")) {
			intereses ="D \n"
					+"Justicia \n"
					+"Equidad \n"
					+ "Colaboración \n"
					+ "Equipo \n"
					+ "Liderazgo \n"
					+"Coordinación \n"
					+"Destreza \n";
		}
		else if (letra.equals("e")) {
			intereses ="E \n"
					+"Investigación \n"
					+"Orden \n"
					+ "Organización \n"
					+ "Análisis y síntesis \n"
					+ " Numérico \n"
					+"Clasificar \n"
					+"Precisión \n"
					+" Exacto \n";
		} 
		return intereses;
		
	}
	
	
	public void cargarpreguntas() throws IOException{	
		File archivo = new File("./archivos/preguntas.properties");
		FileInputStream lee = new FileInputStream(archivo);
		
		Properties prop = new Properties();
		prop.load(lee);
		
		String propCant = prop.getProperty("cantidad");
		int cantidad = Short.parseShort(propCant);
		
		
			
		
		int c = 0;
		while(c<cantidad)
		{
			String proptexto = prop.getProperty("pre"+c+".texto");
			String propnum = prop.getProperty("pre"+c+".num");
			int propNum = Integer.parseInt(propnum);
			String propclase = prop.getProperty("pre"+c+".clase");
			String propletra = prop.getProperty("pre"+c+".letra");

			
			
			mundo.agregarpreguntas(proptexto, propNum, propclase, propletra);

			
			c++;
		}
		
		
		}
	public String aptitudes(String letra) {
		String aptitudes = " ";
		if (letra.equals("c")) {
			aptitudes ="C \n"
					+"Persuasivo \n"
		+"Objetivo \n"
		+ "Práctico \n"
		+ "Tolerante \n"
		+ "Responsable \n"
		+"Ambicioso \n"
		+"Dinámico \n"
		+"Resolutivo  \n";
		}
		else if (letra.equals("h")) {
			aptitudes ="H \n"
					+"Responsable  \n"
					+"Justo \n"
					+ "Conciliador \n"
					+ "Persuasivo \n"
					+"Sagaz \n"
					+"Imaginativo \n"
					+"Comprensivo  \n"
					+ "Estabilidad Emocional";
		}
		else if (letra.equals("a")) {
			aptitudes ="A \n"
					+"Sensible  \n"
					+"Imaginativo \n"
					+ "Creativo \n"
					+ "Detallista \n"
					+"Innovador \n"
					+"Intuitivo \n"
					+"Paciente  \n"
					+ "Espontáneo";
		}
		else if (letra.equals("s")) {
			aptitudes ="S \n"
					+"Altruista  \n"
					+"Solidario \n"
					+ "Paciente \n"
					+ "Comprensivo \n"
					+"Respetuoso \n"
					+"Persuasivo \n"
					+"Servicial  \n"
					+ "Observador";
			}
		else if (letra.equals("i")) {
			aptitudes ="I \n"
					+"Preciso  \n"
					+"Práctico \n"
					+ "Crítico \n"
					+ "Analítico \n"
					+"Rígido \n"
					+"Racional \n"
					+"Independiente  \n";
		}
		else if (letra.equals("d")) {
			aptitudes ="D \n"
					+"Arriesgado  \n"
					+"Solidario \n"
					+ "Valiente \n"
					+ "Agresivo \n"
					+"Persuasivo \n"
					+"Aventurero \n"
					+"Equilibri Psíquico  \n";
		}
		else if (letra.equals("e")) {
			aptitudes ="E \n"
					+"Metódico  \n"
					+"Analítico \n"
					+ "Observador \n"
					+ "Introvertido \n"
					+"Paciente \n"
					+"Seguro \n"
					+"Independiente  \n"
					+ "Intuitivo";
			} 
		return aptitudes;
		
	}

}
