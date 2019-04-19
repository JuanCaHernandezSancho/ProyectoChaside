package Modelo;

public class Mundo {
	
	private Archivo archivo;
	private Chaside chaside;
	private Persistencia persis;
	
	public Mundo() {
		archivo=new Archivo();
		chaside= new Chaside();
		persis= new Persistencia();
		
	}
	
	public void llenarArregloRespuestas(String[] resp) {		
		chaside.setRespuestas(resp);
		
	}
	
	public String[] archivoLeer() {		
			return archivo.leerArchivo();			
	}	
	
	public String contarRespuestasAfir(String[] letraChaside) {
		int cont = 0;		
		for (int i = 0; i < chaside.getRespuestas().length; i++) {
			if(chaside.getRespuestas()[i].equals("1")) {
				String posicion= String.valueOf((i+1));
				int position=(i+1);
				if(position<=9) {
					posicion="0"+posicion;
				}
				for (int j = 0; j < letraChaside.length; j++) {
					if(posicion.equals(letraChaside[j])) {						
						cont++;
					}				
				}
			}			
		}		
		if(cont<=9) {
			String numAfirmaciones= "0"+String.valueOf(cont);
			return numAfirmaciones;
		}
		else
		return String.valueOf(cont);	
	}
	
	public String crearTabla() {
		int k = 0;
		String message = "<html>";
		String tab = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		message+="~C"+tab+"~h"+tab+"~a"+tab+"~s"+tab+"~i"+tab+"~d"+tab+"~e"+tab+"<br>";		
		for (int j = 0; j < persis.cI.length; j++) {	
			if(j>=5) {
				message=message+persis.cI[j]+tab+persis.hI[j]+tab+persis.aI[j]+tab+persis.sI[j]+tab+persis.iI[j]+tab+
						persis.dI[j]+tab+persis.eI[j];	
			}else {
				message=message+persis.cI[j]+tab+persis.hI[j]+tab+persis.aI[j]+tab+persis.sI[j]+tab+persis.iI[j]+tab+
						persis.dI[j]+tab+persis.eI[j]+tab+"<br>";
			}
			if(j==5) {
				message=message+tab+"~C"+tab+"~h"+tab+"~a"+tab+"~s"+tab+"~i"+tab+"~d"+tab+"~e"+tab+"<br>";
			}
			if(j>=6&&k<4) {
				message=message+tab+persis.cA[k]+tab+persis.hA[k]+tab+persis.aA[k]+tab+persis.sA[k]+tab+persis.iA[k]+tab+persis.dA[k]+tab+
			persis.eA[k]+tab+"<br>";
				k++;
			}		
								
	}
		message=message+"--------------------------------------------------------------------------------------------------------------------------------------------------------------------"+
				"<br>"+contarRespuestasAfir(persis.cI)+tab+contarRespuestasAfir(persis.hI)+tab+contarRespuestasAfir(persis.aI)+tab+
	            contarRespuestasAfir(persis.sI)+tab+contarRespuestasAfir(persis.iI)+tab+contarRespuestasAfir(persis.dI)+tab+contarRespuestasAfir(persis.eI)+tab+
	            contarRespuestasAfir(persis.cA)+tab+ contarRespuestasAfir(persis.hA)+ tab+contarRespuestasAfir(persis.aA)+tab+contarRespuestasAfir(persis.sA)+
	            tab+contarRespuestasAfir(persis.iA)+tab+ contarRespuestasAfir(persis.dA)+tab+contarRespuestasAfir(persis.eA)+
	            "<br>"+"<br>"+"Sus interes (tabla izquierda) y aptitudes (tabla derecha) se enfocan en la letra con la mayor sumatoria, debajo de cada columna, separada por la linea."+
	            tab+tab+"<br>"+"<br>"+"<br>"+"Recuerde:"+"<br>"+"<br>"+tab+tab+"C - Administrativas y Contables" +"<br>"+tab+tab+"H – Humanísticas y Sociales" +"<br>"+tab+tab+
	            "A - Artísticas"+ "<br>"+tab+tab+"S – Medicina y Cs. De la Salud"+ "<br>"+tab+tab+"I – Ingeniería y Computación"+ "<br>"+tab+tab+
	            "D - Defensa y Seguridad"+ "<br>"+tab+tab+"E - Ciencias Exactas y Agrarias";
		
		message += "</html>";
		return message;

	}

}
