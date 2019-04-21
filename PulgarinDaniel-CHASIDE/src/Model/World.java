package Model;

public class World {

	private ReadWriteFile file;
	private CHASIDE chaside;
	private Persistence persistence;
	
	public World() {
		
		file = new ReadWriteFile();
		chaside = new CHASIDE();
		persistence = new Persistence();
		
	}
	
	
	public void fillQuestionaryAnswers(String[] answers) {		
		chaside.setAnswers(answers);
		
	}
	
	
	public String[] readFile() {		
			return file.readFile();			
	}	
	
	
	public String affirmativeAnswers(String[] actualChasidePosition) {
		
		String answer = "";
		int counter = 0;		
		
		for (int i = 0; i < chaside.getAnswers().length; i++) {
		
			if (chaside.getAnswers()[i].equals("1")) {
			
				String positionAsString = String.valueOf((i+1));
				int positionAsInteger = (i+1);
				
				if (positionAsInteger <= 9) {
				
					positionAsString = "0" + positionAsString;
				}
				
				for (int j = 0; j < actualChasidePosition.length; j++) {
				
					if (positionAsString.equals(actualChasidePosition[j])) {	counter++; }				
				}
			}			
		}		
		
		if (counter <= 9) { answer += "0" + String.valueOf(counter); }
		else { answer += counter; }
		
		return answer;
	}
	
	
	public String buildTableFromData() {
		
		int k = 0;
		
		String messageToShow = "<html>";
		String tab = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		
		messageToShow += "______________________| INTERESES |______________________" + "<br>";
		
		for (int j = 0; j < persistence.c1.length; j++) {	
			
			if (j >= 5) {
				
				messageToShow += persistence.c1[j] + tab +
									persistence.h1[j] + tab +
									persistence.a1[j] + tab +
									persistence.s1[j] + tab + 
									persistence.i1[j] + tab +
									persistence.d1[j] + tab + 
									persistence.e1[j];	
			}
			else {
				
				messageToShow += persistence.c1[j] + tab +
									persistence.h1[j] + tab +
									persistence.a1[j] + tab + 
									persistence.s1[j] + tab +
									persistence.i1[j] + tab +
									persistence.d1[j] + tab +
									persistence.e1[j] + tab + "<br>";
			}
			
			if (j==5) {
				messageToShow += tab + "_______________________| APTITUDES |_______________________" + "<br>";
			}
			
			if (j >= 6 && k<4) {
				
				messageToShow += tab + persistence.c2[k] +
									tab + persistence.h2[k] +
									tab + persistence.a2[k] +
									tab + persistence.s2[k] + 
									tab + persistence.i2[k] +
									tab + persistence.d2[k] +
									tab + persistence.e2[k] +
									tab + "<br>";
				k++;
			}		
								
	}
		messageToShow +=  "__________________________________________________________	|	___________________________________________________________" + "<br>" + 
				
				// First Table Answers
				affirmativeAnswers(persistence.c1) + tab + affirmativeAnswers(persistence.h1) + tab + 
				affirmativeAnswers(persistence.a1) + tab + affirmativeAnswers(persistence.s1) + tab + 
				affirmativeAnswers(persistence.i1) + tab + affirmativeAnswers(persistence.d1) + tab + 
				affirmativeAnswers(persistence.e1) 
				
				// Second Table Answers
				+ tab + affirmativeAnswers(persistence.c2) + tab + 
				affirmativeAnswers(persistence.h2) + tab + affirmativeAnswers(persistence.a2) + tab + 
				affirmativeAnswers(persistence.s2) + tab + affirmativeAnswers(persistence.i2) + tab + 
				affirmativeAnswers(persistence.d2) + tab + affirmativeAnswers(persistence.e2) + "<br>" +
				
				// Guide Summary
				"_C" + tab + "_H" + tab + "_A" + tab + "_S" + tab + "_I" + tab + "_D" + tab + "_E" + tab + "|" +
				"c" + tab + "_h" + tab + "_a" + tab + "_s" + tab + "_i" + tab + "_d" + tab + "_e" + tab +
	            "<br>" + "<br>" + 
	            tab + tab + "<br>" + "<br>" + "<br>" + tab + tab + tab + tab +
				"Guía:" + "<br>" + "<br>" + tab + tab + tab + tab +
				"C : " + "Administrativas y Contables" +"<br>" + tab + tab + tab + tab +
				"H : " + "Humanísticas y Sociales" +"<br>" + tab + tab + tab + tab +
	            "A : " + "Artísticas" + "<br>" + tab + tab + tab + tab +
	            "S : " + "Medicina y Cs. De la Salud"+ "<br>" + tab + tab + tab + tab +
	            "I : " + "Ingeniería y Computación"+ "<br>" + tab + tab + tab + tab +
	            "D : " + "Defensa y Seguridad"+ "<br>" + tab + tab + tab + tab +
	            "E : " + "Ciencias Exactas y Agrarias";
		
		messageToShow += "</html>";
		
		return messageToShow;
	}
}
