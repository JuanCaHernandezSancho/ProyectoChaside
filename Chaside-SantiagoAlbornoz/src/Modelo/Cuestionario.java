package Modelo;

public class Cuestionario implements Interface{
	
	
	private String input;
	private Intereses i1;
	private Aptitudes ap;
	private int[]respuestas;
	private String interest;
	private String aptitud;
	public Cuestionario(String input) {
		this.input=input;
		respuestas=stringToAarray();
		i1= new Intereses(respuestas);
		ap=new Aptitudes(respuestas);
		interest=i1.InteresMasAlta();
		aptitud=ap.aptitudMasAlta();	
	}
	
	public String aptitud() {
		return ap.toString();
	}
	public String Interes() {
		return i1.toString();
	}
	public int[] stringToAarray() {
		String code=input;
		int[]rta=new int [code.length()];
		String[]ss=code.split("");
		for(int i=0;i<rta.length;i++) {
			rta[i]=Integer.parseInt(ss[i]);
		}
		return rta;
	}
	
	public String getInterest() {
		String rta="intereses: \n";
		String in =interest;
		int i=0;
		if(in=="i") {
			while(i<interesesI.length) {
			rta+=interesesI[i]+"\n";
			i++;
			}
		}
		int j=0;
		if(in.equalsIgnoreCase("c")) {
			while(j<interesesC.length) {
			rta+=interesesC[j]+"\n";
			j++;
			}
		}
		j=0;
		if(in.equalsIgnoreCase("a")) {
			while(j<interesesA.length) {
			rta+=interesesA[j]+"\n";
			j++;
			}
		}
		j=0;
		if(in.equalsIgnoreCase("h")) {
			while(j<interesesH.length) {
			rta+=interesesH[j]+"\n";
			j++;
			}
		}
		j=0;
		if(in.equalsIgnoreCase("s")) {
			while(j<interesesS.length) {
			rta+=interesesS[j]+"\n";
			j++;
			}
		}
		j=0;
		if(in.equalsIgnoreCase("d")) {
			while(j<interesesD.length) {
			rta+=interesesD[j]+"\n";
			j++;
			}
		}
		j=0;
		if(in.equalsIgnoreCase("e")) {	
			while(j<interesesE.length) {
			rta+=interesesE[j]+"\n";
			j++;
			}
		}
		return rta;
	}
	public String getAptitudes() {
		String rta="aptitudes: \n";
		String ap=aptitud;
		int j=0;
		if(ap.equalsIgnoreCase("c")) {
			while(j<aptitudC.length) {
			rta+=aptitudC[j]+"\n";
			j++;
			}
		}
		j=0;
		if(ap.equalsIgnoreCase("h")) {
			while(j<aptitudH.length) {
			rta+=aptitudH[j]+"\n";
			j++;
			}
		}
		j=0;
		if(ap.equalsIgnoreCase("a")) {
			while(j<aptitudA.length) {
			rta+=aptitudA[j]+"\n";
			j++;
			}
		}
		j=0;
		if(ap.equalsIgnoreCase("s")) {
			while(j<aptitudS.length) {
			rta+=aptitudS[j]+"\n";
			j++;
			}
		}
		j=0;
		if(ap.equalsIgnoreCase("i")) {
			while(j<aptitudI.length) {
			rta+=aptitudI[j]+"\n";
			j++;
			}
		}
		j=0;
		if(ap.equalsIgnoreCase("d")) {
			while(j<aptitudD.length) {
			rta+=aptitudD[j]+"\n";
			j++;
			}
		}
		j=0;
		if(ap.equalsIgnoreCase("e")) {
			while(j<aptitudE.length) {
			rta+=aptitudE[j]+"\n";
			j++;
			}
		}
		j=0;
		return rta;
	}
	public String listOrientation() {
		String rta="";
		rta=getInterest()+"\n"+getAptitudes();
		return rta;
	}
	public String ShowAsnwers() {
		String respuesta="";
		respuesta+=aptitud()+"\n";
		
		respuesta+=Interes()+"\n";
		
		respuesta+=listOrientation();
		
		return respuesta;
		
	}
	
	

	
	

}
