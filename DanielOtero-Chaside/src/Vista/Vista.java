package Vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Vista {
	
	private int[] respuestas;

	public Vista() {
		
		
		
	}
	
	public int[] preguntar(ArrayList<String> preguntas) {
		respuestas = new int[98];
		
		for(int i = 0; i < preguntas.size();i++) {
			respuestas[i] = JOptionPane.showConfirmDialog(null, preguntas.get(i));
		}
		
		//for(int i = 0; i< respuestas.length;i++) {
			//System.out.println(respuestas[i]);
		//}
		return respuestas;
	}
	
	public void Mostar(String[] res) {
		
		String ic = "Administrativas y Contables: Organizativo,Supervisión ,Orden ,Análisis y síntesis,Colaboración,Cálculo,Liderazgo";
		String ih ="Humanísticas y Sociales: Precisión Verbal, Organización,Relación de Hechos,Lingüística,Orden,Justicia,El hombre analítico";
		String ia ="Artísticas: Estético,Armónico,Manual,Visual,Auditivo,Observación y Análisis,Senso-Perceptivo ";
		String is = "Medicina y Cs. De la Salud: Asistir,Investigativo,Precisión,Senso-Perceptivo,Analítico,Ayudar,Curar";
		String ii= "Ingeniería y Computación: Cálculo,Manual,Exacto,Planificar,Organizar,Controlar";
		String id ="Defensa y Seguridad: Justicia,Equidad,Colaboración,Espíritu de Equipo,Liderazgo,Coordinación,Destreza Física"; 
		String ie ="Ciencias Exactas y Agrarias: Investigación,Orden,Organización,Análisis y Síntesis,Numérico,Clasificar,Precisión,Exacto";
		
		String ac ="Administrativas y Contables:Persuasivo,Objetivo, Práctico,Tolerante,Responsable,Ambicioso ,Dinámico  ";
		String ah ="Humanísticas y Sociales: Responsable,Justo,Conciliador,Persuasivo,Sagaz,Imaginativo,Comprensivo ";
		String aa ="Artísticas: Sensible,Imaginativo,Creativo,Detallista,Innovador,Intuitivo,Paciente,Espontáneo";
		String as ="Medicina y Cs. De la Salud: Altruista,Solidario,Paciente,Comprensivo,Respetuoso,Persuasivo,Servicial,Observador";
		String ai ="Ingeniería y Computación: Preciso,Práctico, Crítico,Analítico,Rígido,Racional,Independiente ";
		String ad ="Defensa y Seguridad: Arriesgado,Solidario,Valiente,Agresivo,Persuasivo,Aventurero";
		String ae ="Ciencias Exactas y Agrarias: Metódico,Analítico,Observador,Introvertido,Paciente,Seguro,Independiente,Intuitivo";
		
		
		JOptionPane.showMessageDialog(null, "Segun sus intereses podria ser su vocacion");
		if(res[0] != "") {
			if(res[0] == "c") {
				JOptionPane.showMessageDialog(null, ic);
			}
			else if(res[0]== "h") {
				JOptionPane.showMessageDialog(null, ih);
			}
			else if(res[0]== "a") {
				JOptionPane.showMessageDialog(null, ia);
			}
			else if(res[0]== "s") {
				JOptionPane.showMessageDialog(null, is);
			}
			else if(res[0]== "i") {
				JOptionPane.showMessageDialog(null, ii);
			}
			else if(res[0]== "d") {
				
				JOptionPane.showMessageDialog(null, id);
			}else if(res[0]== "e") {
				JOptionPane.showMessageDialog(null, ie);
			}
		}
		
		
		JOptionPane.showMessageDialog(null, "Segun sus aptitudes podria ser su vocacion");
		
		if(res[1] != "") {
			if(res[1]== "c") {
				JOptionPane.showMessageDialog(null, ac);
			}else if(res[1]=="h") {
				JOptionPane.showMessageDialog(null, ah);
			}
			else if(res[1]=="a") {
				JOptionPane.showMessageDialog(null, aa);
			}else if(res[1]=="s") {
				JOptionPane.showMessageDialog(null, as);
			}else if(res[1]=="i") {
				JOptionPane.showMessageDialog(null, ai);
			}else if(res[1]=="d") {
				JOptionPane.showMessageDialog(null, ad);
			}else if(res[1]=="e") {
				JOptionPane.showMessageDialog(null, ae);
			}
		}
		
		
		
		
	}
	
	
}
