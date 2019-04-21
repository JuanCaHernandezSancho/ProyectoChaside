package modelo;

public class Chaside {
	
	private Archivo archivo;
	private String [] cuestionario;
	private Persistencia bd;
	
	private int [][] chIntereses;
	private int [][] chAptitudes;
	private String [] areasIntereses;
	private String [] areasAptitudes;
	private int [] numRespuestasPorIntereses;
	private int [] numRespuestasPorAptitudes;
	
	public Chaside () {
		
		archivo = new Archivo();
		archivo.contarLineas();
		bd = new Persistencia ();
		
		cuestionario = archivo.leerArchivo();
		chIntereses=bd.getIntereses();
		chAptitudes=bd.getAptitudes();
		areasIntereses = bd.getAreasIntereses();
		areasAptitudes = bd.getAreasAptitudes();
		numRespuestasPorIntereses = new int [7];
		numRespuestasPorAptitudes = new int [7];
	}
	
	public void calcularResultados(int [] respuestas) {
		boolean seEncontro = false;
	if(respuestas!=null) {
		for (int i = 0; i < respuestas.length; i++) {
			
			if(respuestas[i]==1) {
			
				while(!seEncontro) {
				
					for (int j = 0; j < 7; j++) { //fila MATRIZ chInteres
					
						for (int k = 0; k < 10; k++) { //columna
						
							if((i+1)==chIntereses[j][k]) {
								numRespuestasPorIntereses[j]++;
								
								seEncontro=true;
							}
						}
					
					} //fin primer for intereses
					
					
					for (int j = 0; j < 7; j++) { //fila MATRIZ chaptitud
						
						for (int k = 0; k < 4; k++) { //columna
						
							if((i+1)==chAptitudes[j][k]) {
								numRespuestasPorAptitudes[j]+=1;
							
								seEncontro=true;
							}
						}
					} //fin for
				}//fin while
		}//fin if
			seEncontro=false;
		}//fin for respuestas
	}
		
	}
	
	public String darAreaIntereses () {
		int mayor = 0;
		int x = 0;
		for (int i = 0; i < numRespuestasPorIntereses.length; i++) {
			if(mayor<numRespuestasPorIntereses[i] && numRespuestasPorIntereses[i]!=0) {
				mayor=numRespuestasPorIntereses[i];
				x=i;
			}
		}
		
		if(numRespuestasPorIntereses[x]==0) {
			return "Todas las respuestas de CHASIDE Intereses fueron NO";
		}else {
		return areasIntereses[x];
		}
	}
	
	public String darAreaAptitudes () {
		int mayor = 0;
		int x = 0;
		for (int i = 0; i < numRespuestasPorAptitudes.length; i++) {
			if(mayor<numRespuestasPorAptitudes[i] && numRespuestasPorAptitudes[i]!=0) {
				mayor=numRespuestasPorAptitudes[i];
				x=i;
			}
		}
		if(numRespuestasPorAptitudes[x]==0) {
			return "Todas las respuestas de CHASIDE Aptitudes fueron NO";
		}else {
		return areasAptitudes[x];
		}
	}

	public String[] getCuestionario() {
		return cuestionario;
	}



	
}
