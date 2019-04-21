package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Chaside;
import Vista.InterfazGUI;

public class Controlador implements ActionListener {
	
	private static InterfazGUI gui;
	private Chaside bd;
	public int i = 0;
	
	String [][] cuestionario = new String [98][2];  // Definición arreglo de preguntas
    int [] respuestas = new int [98];  // Definición arreglo de respuestas en números
    int [] chaside_intereses = new int [7];  // Definición arreglo de resultados de intereses
    int [] chaside_aptitudes = new int [7];  // Definición arreglo de resultados de aptitudes

	public Controlador() {
		gui = new InterfazGUI(this);
		gui.setVisible(true);
		bd = new Chaside();
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals(gui.getPanelEntrada().INICIALIZAR)){
			bd.inicializacion(cuestionario, respuestas); // Crea el arreglo con las preguntas del test e inicializa las respuestas del Test
	    	gui.getPanelResultados().getFilaSalida().setText("");
			i=0;
			preguntas(cuestionario, respuestas,i); // Realiza las preguntas del Test CHASIDE
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().PREV)) {
			if (i==0) i=97;
			else i--;
			preguntas(cuestionario, respuestas,i); // Realiza las preguntas del Test CHASIDE
		}
	 
		if(evento.getActionCommand().equals(gui.getPanelEntrada().NEXT)) {
			if (i==97) i=0;
			else i++;
			preguntas(cuestionario, respuestas,i); // Realiza las preguntas del Test CHASIDE
		}
	 
		if(evento.getActionCommand().equals(gui.getPanelEntrada().CALCULAR)){
			calculos (respuestas, chaside_intereses, chaside_aptitudes); // Calcula los resultados y los guarda en los arreglos de resultados
			muestra_resultados (chaside_intereses, chaside_aptitudes); // Muestra los resultados intereses y aptitudes
		}
	}

	public void preguntas(String cuestionario[][], int respuestas[], int j){
    	gui.getPanelEntrada().getLabPregunta().setText(cuestionario[j][0]+" (S/N) ");
    	gui.getPanelEntrada().getTxtRespuesta().setText("");
    	String resp = gui.getPanelEntrada().getTxtRespuesta().getText();
    	cuestionario [j][1] = resp;
        if (cuestionario [j][1].equals("S")) respuestas [j] = 1;
    }

    public static void calculos(int respuestas[], int chaside_intereses[], int chaside_aptitudes[]){
        chaside_intereses[0] = respuestas[97] + respuestas[11] + respuestas[63] + respuestas[52] + respuestas[84] + respuestas[0] + respuestas[77] + respuestas[19] + respuestas[70] + respuestas[90];
        chaside_intereses[1] = respuestas[8] + respuestas[33] + respuestas[79] + respuestas[24] + respuestas[94] + respuestas[66] + respuestas[40] + respuestas[73] + respuestas[55] + respuestas[88];
        chaside_intereses[2] = respuestas[20] + respuestas[44] + respuestas[95] + respuestas[56] + respuestas[27] + respuestas[10] + respuestas[49] + respuestas[2] + respuestas[80] + respuestas[35];
        chaside_intereses[3] = respuestas[32] + respuestas[91] + respuestas[69] + respuestas[7] + respuestas[86] + respuestas[61] + respuestas[22] + respuestas[43] + respuestas[15] + respuestas[51];
        chaside_intereses[4] = respuestas[74] + respuestas[5] + respuestas[18] + respuestas[37] + respuestas[59] + respuestas[26] + respuestas[82] + respuestas[53] + respuestas[46] + respuestas[96];
        chaside_intereses[5] = respuestas[83] + respuestas[30] + respuestas[47] + respuestas[72] + respuestas[4] + respuestas[64] + respuestas[13] + respuestas[36] + respuestas[57] + respuestas[23];
        chaside_intereses[6] = respuestas[76] + respuestas[41] + respuestas[87] + respuestas[16] + respuestas[92] + respuestas[31] + respuestas[67] + respuestas[48] + respuestas[34] + respuestas[60];
        chaside_aptitudes[0] = respuestas[14] + respuestas[50] + respuestas[1] + respuestas[45];
        chaside_aptitudes[1] = respuestas[62] + respuestas[29] + respuestas[71] + respuestas[85];
        chaside_aptitudes[2] = respuestas[21] + respuestas[38] + respuestas[75] + respuestas[81];
        chaside_aptitudes[3] = respuestas[68] + respuestas[39] + respuestas[28] + respuestas[3];
        chaside_aptitudes[4] = respuestas[25] + respuestas[58] + respuestas[89] + respuestas[9];
        chaside_aptitudes[5] = respuestas[12] + respuestas[65] + respuestas[17] + respuestas[42];
        chaside_aptitudes[6] = respuestas[93] + respuestas[6] + respuestas[78] + respuestas[54];
    }

    public static void muestra_resultados(int chaside_intereses[], int chaside_aptitudes[]){
    	int mayor_int=0, area_int=0, mayor_apt=0, area_apt=0;
    	String linea;
    	for (int i=0; i < chaside_intereses.length ; i++){
    		if (chaside_intereses [i] > mayor_int) {
    			mayor_int = chaside_intereses [i];
    			area_int = i;
    		} 
    	}

    	linea= "<br>Áreas de inclinación según los intereses: </br>";
    	switch (area_int) {
           case 0:
                linea=linea+"<br>Administrativas y Contables</br>";
                linea=linea+"<br>Intereses</br>";
                linea=linea+"<br>- Organizativo</br>";
                linea=linea+"<br>- Supervisión</br>";
                linea=linea+"<br>- Orden</br>";
                linea=linea+"<br>- Análisis y síntesis</br>";
                linea=linea+"<br>- Colaboración</br>";
                linea=linea+"<br>- Cálculo</br>";
                linea=linea+"<br>- Liderazgo</br>";
                linea=linea+"<br>- Participación activa</br>";
                break;
            case 1:
                linea=linea+"<br>Humanísticas y Sociales</br>";
                linea=linea+"<br>Intereses</br>";
                linea=linea+"<br>- Precisión Verbal</br>";
                linea=linea+"<br>- Organización</br>";
                linea=linea+"<br>- Relación de Hechos</br>";
                linea=linea+"<br>- Lingüística</br>";
                linea=linea+"<br>- Orden</br>";
                linea=linea+"<br>- Justicia</br>";
                linea=linea+"<br>- El hombre analítico</br>";
                break;
            case 2:
                linea=linea+"<br>Artísticas</br>";
                linea=linea+"<br>Intereses</br>";
                linea=linea+"<br>- Estético</br>";
                linea=linea+"<br>- Armónico</br>";
                linea=linea+"<br>- Manual</br>";
                linea=linea+"<br>- Visual</br>";
                linea=linea+"<br>- Auditivo</br>";
                linea=linea+"<br>- Observación y Análisis</br>";
                linea=linea+"<br>- Senso-Perceptivo</br>";
                break;
            case 3:
                linea=linea+"<br>Medicina y Cs. De la Salud</br>";
                linea=linea+"<br>Intereses</br>";
                linea=linea+"<br>- Asistir</br>";
                linea=linea+"<br>- Investigativo</br>";
                linea=linea+"<br>- Precisión</br>";
                linea=linea+"<br>- Senso-Perceptivo</br>";
                linea=linea+"<br>- Analítico</br>";
                linea=linea+"<br>- Curar</br>";
                linea=linea+"<br>- Rehabilitar</br>";
                break;
            case 4:
                linea=linea+"<br>Ingeniería y Computación</br>";
                linea=linea+"<br>Intereses</br>";
                linea=linea+"<br>- Cálculo</br>";
                linea=linea+"<br>- Científico</br>";
                linea=linea+"<br>- Manual</br>";
                linea=linea+"<br>- Exacto</br>";
                linea=linea+"<br>- Planificar</br>";
                linea=linea+"<br>- Organizar</br>";
                linea=linea+"<br>- Controlar</br>";
                break;
            case 5:
                linea=linea+"<br>Defensa y Seguridad</br>";
                linea=linea+"<br>Intereses</br>";
                linea=linea+"<br>- Justicia</br>";
                linea=linea+"<br>- Equidad</br>";
                linea=linea+"<br>- Colaboración</br>";
                linea=linea+"<br>- Espíritu de Equipo</br>";
                linea=linea+"<br>- Liderazgo</br>";
                linea=linea+"<br>- Coordinación</br>";
                linea=linea+"<br>- Destreza Física</br>";
                break;
            case 6:
                linea=linea+"<br>Ciencias Exactas y Agrarias</br>";
                linea=linea+"<br>Intereses</br>";
                linea=linea+"<br>- Investigación</br>";
                linea=linea+"<br>- Orden</br>";
                linea=linea+"<br>- Organización</br>";
                linea=linea+"<br>- Análisis y Síntesis</br>";
                linea=linea+"<br>- Numérico</br>";
                linea=linea+"<br>- Clasificar</br>";
                linea=linea+"<br>- Precisión</br>";
                linea=linea+"<br>- Exacto</br>";
                break;
        	}
    	for (int i=0; i < chaside_aptitudes.length ; i++){
    		if (chaside_aptitudes [i] > mayor_apt) {
    			mayor_apt = chaside_aptitudes [i];
    			area_apt = i;
    		} 
    	}
    	linea= linea +"<br>Áreas de inclinación según las aptitudes: </br>";
    	switch (area_apt) {
            case 0:
                linea=linea+"<br>Administrativas y Contables</br>";
                linea=linea+"<br>Aptitudes</br>";
                linea=linea+"<br>- Persuasivo</br>";
                linea=linea+"<br>- Objetivo</br>";
                linea=linea+"<br>- Práctico</br>";
                linea=linea+"<br>- Tolerante</br>";
                linea=linea+"<br>- Responsable</br>";
                linea=linea+"<br>- Ambicioso</br>";
                linea=linea+"<br>- Dinámico</br>";
                linea=linea+"<br>- Resolutivo</br>";
                break;
            case 1:
                linea=linea+"<br>Humanísticas y Sociales</br>";
                linea=linea+"<br>Aptitudes</br>";
                linea=linea+"<br>- Responsable</br>";
                linea=linea+"<br>- Justo</br>";
                linea=linea+"<br>- Conciliador</br>";
                linea=linea+"<br>- Persuasivo</br>";
                linea=linea+"<br>- Sagaz</br>";
                linea=linea+"<br>- Imaginativo</br>";
                linea=linea+"<br>- Comprensivo</br>";
                linea=linea+"<br>- Estabilidad Emocional</br>";
                break;
            case 2:
                linea=linea+"<br>Artísticas</br>";
                linea=linea+"<br>Aptitudes</br>";
                linea=linea+"<br>- Sensible</br>";
                linea=linea+"<br>- Imaginativo</br>";
                linea=linea+"<br>- Creativo</br>";
                linea=linea+"<br>- Detallista</br>";
                linea=linea+"<br>- Innovador</br>";
                linea=linea+"<br>- Intuitivo</br>";
                linea=linea+"<br>- Paciente</br>";
                linea=linea+"<br>- Espontáneo</br>";
                break;
            case 3:
                linea=linea+"<br>Medicina y Cs. De la Salud</br>";
                linea=linea+"<br>Aptitudes</br>";
                linea=linea+"<br>- Altruista</br>";
                linea=linea+"<br>- Solidario</br>";
                linea=linea+"<br>- Paciente</br>";
                linea=linea+"<br>- Comprensivo</br>";
                linea=linea+"<br>- Respetuoso</br>";
                linea=linea+"<br>- Persuasivo</br>";
                linea=linea+"<br>- Servicial</br>";
                linea=linea+"<br>- Observador</br>";
                break;
            case 4:
                linea=linea+"<br>Ingeniería y Computación</br>";
                linea=linea+"<br>Aptitudes</br>";
                linea=linea+"<br>- Preciso</br>";
                linea=linea+"<br>- Práctico</br>";
                linea=linea+"<br>- Crítico</br>";
                linea=linea+"<br>- Analítico</br>";
                linea=linea+"<br>- Rígido</br>";
                linea=linea+"<br>- Racional</br>";
                linea=linea+"<br>- Independiente</br>";
                break;
            case 5:
                linea=linea+"<br>Defensa y Seguridad</br>";
                linea=linea+"<br>Aptitudes</br>";
                linea=linea+"<br>- Arriesgado</br>";
                linea=linea+"<br>- Solidario</br>";
                linea=linea+"<br>- Valiente</br>";
                linea=linea+"<br>- Agresivo</br>";
                linea=linea+"<br>- Persuasivo</br>";
                linea=linea+"<br>- Aventurero</br>";
                linea=linea+"<br>- Equilibrio Psíquico</br>";
                break;
            case 6:
                linea=linea+"<br>Ciencias Exactas y Agrarias</br>";
                linea=linea+"<br>Aptitudes</br>";
                linea=linea+"<br>- Metódico</br>";
                linea=linea+"<br>- Analítico</br>";
                linea=linea+"<br>- Observador</br>";
                linea=linea+"<br>- Introvertido</br>";
                linea=linea+"<br>- Paciente</br>";
                linea=linea+"<br>- Seguro</br>";
                linea=linea+"<br>- Independiente</br>";
                linea=linea+"<br>- Intuitivo</br>";
                break;
        }
    	gui.getPanelResultados().getFilaSalida().setText("<html>"+linea+"</html>");
    }
}	
