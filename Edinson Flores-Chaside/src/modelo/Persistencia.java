package modelo;

public class Persistencia {
	
	private int [][] intereses = {{98,12,64,53,85,1,78,20,71,91},
	/*private int [] hI =*/ {9,34,80,25,95,67,41,74,56,89},
	/*private int [] aI =*/ {21,45,96,57,28,11,50,3,81,36}, //se acomodo el 50 aqui 
	/*private int [] sI =*/ {33,92,70,8,87,62,23,44,16,52},
/*	private int [] iI =*/ {75,6,19,38,60,27,83,54,47,97},
	/*private int [] dI =*/ {84,31,48,73,5,65,14,37,58,24},
	/*private int [] eI =*/ {77,42,88,17,93,32,68,49,35,61}};
	
	private int [][] aptitudes = {{15,51,2,46},
	/*private int [] hA = */ 	{63,30,72,86},
	/*private int [] aA = */	{22,39,76,82},
	/*private int [] sA = */	{69,40,29,4},
	/*private int [] iA = */	{26,59,90,10},
	/*private int [] dA = */	{13,66,18,43},
	/*private int [] eA = */	{94,7,79,55}};
	
	private String [] areasIntereses = { "Administrativas y Contables:\n-Organizativo\n-Supervision\n-Orden\n-Analisis y sintesis\n-Colaboracion\n-Calculo\n-Liderazgo\n-Participacion Actiba" , 
										 "Humanisticas y Sociales:\n-Precision Verbal\n-Organizacion\n-Relacion de Hechos\n-Linguistica\n-Orden\n-Justicia\n-El hombre analitico",
										 "Artisticas:\n-Estetico\n-Armonico\n-Manual\n-Visual\n-Auditivo\n-Oservacion y Analisis\n-Senso-Perceptivo",
										 "Medicinas y Cs. de la Salud:\n-Asistir\n-Investigativo\n-Precision\n-Senso-Perceptivo\n-Analitico\n-Ayudar\n-Curar\n-Rehabilitar ", 
										 "Ingenieria y Computacion:\n-Calculo\n-Cientifico\n-Manual\n-Exacto\n-Planificar\n-Organizar\n-Controlar", 
										 "Defensa y Seguridad:\n-Justicia\n-Equidad\n-Colaboracion\n-Espiritu de equipo\n-Liderazgo\n-Coordinacion\n-Destreza Fisica",
										 "Ciencias Exactas y Agrarias:\n-Investigacion\n-Orden\n-Organizacion\n-Analisis y Sintesis\n-Numerico\n-Clasificar\n-Precision\n-Exacto"};
	
	private String [] areasAptitudes = { "Administrativas y Contables:\n-Persuasivo\n-Objetivo\n-Practico\n-Tolerante\n-Responsable\n-Ambicioso\n-Dinamico\n-Resolutivo" , 
										 "Humanisticas y Sociales:\n-Responsable\n-Justo\n-Conciliador\n-Persuasivo\n-Sagaz\n-Imaginativo\n-Comprensivo\n-Estabilidad Economica",
										 "Artisticas:\n-Sensible\n-Imaginativo\n-Creativo\n-Detallista\n-Innovador\n-Intuitivo\n-Paciente\n-Espontaneo",
										 "Medicinas y Cs. de la Salud:\n-Altruista\n-Solidario\n-Paciente\n-Comprensivo\n-Respetuoso\n-Persuasivo\n-Servicial\n-Observador ", 
										 "Ingenieria y Computacion:\n-Preciso\n-Practico\n-Critico\n-Analitico\n-Rigido\n-Racional\n-Independiente", 
										 "Defensa y Seguridad:\n-Arriesgado\n-Solidario\n-Valiente\n-Agresivo\n-Persuasivo\n-Aventurero\n-Equilibrio Psiquico",
										 "Ciencias Exactas y Agrarias:\n-Metodico\n-Analitico\n-Observador\n-Introvertido\n-Paciente\n-Seguro\n-Independiente\n-Intuitivo"};

	
	public Persistencia () {
		
	}


	public int[][] getIntereses() {
		return intereses;
	}


	public int[][] getAptitudes() {
		return aptitudes;
	}


	public String[] getAreasIntereses() {
		return areasIntereses;
	}


	public String[] getAreasAptitudes() {
		return areasAptitudes;
	}



	
	

}
