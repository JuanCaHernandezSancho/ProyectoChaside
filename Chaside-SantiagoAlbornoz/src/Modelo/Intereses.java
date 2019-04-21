package Modelo;

public class Intereses {
	
	private int c[]; 
	private int h[];
	private int a[];
	private int s[];
	private int is[];
	private int d[]; 
	private int e[]; 
	private int lop[];
	private int[]respuestas;
	private int  contadorI=0;
	private int contadorC=0;
	private int contadorH=0;
	private int contadorA=0;
	private int contadorS=0;
	private int contadorD=0;
	private int contadorE=0;
	private String rt;
	public Intereses(int[] respuestas) {
		this.respuestas=respuestas;
		
		c=llenarC(); 
		is=llenarI();
		h=llenarH();
		a=llenarA();
		s=llenarS();
		d=llenarD();
		e=llenarE();
	}
	public int [] llenarC() {
		int aux[]=new int [10];
		aux[0]=respuestas[97];
		aux[1]=respuestas[11];
		aux[2]=respuestas[63];
		aux[3]=respuestas[52];
		aux[4]=respuestas[84];
		aux[5]=respuestas[0];
		aux[6]=respuestas[77];
		aux[7]=respuestas[19];
		aux[8]=respuestas[70];
		aux[9]=respuestas[90];
		
		return aux;
	}
	public int [] llenarH() {
		int aux[]=new int [10];
		aux[0]=respuestas[8];
		aux[1]=respuestas[33];
		aux[2]=respuestas[79];
		aux[3]=respuestas[24];
		aux[4]=respuestas[94];
		aux[5]=respuestas[66];
		aux[6]=respuestas[40];
		aux[7]=respuestas[73];
		aux[8]=respuestas[55];
		aux[9]=respuestas[88];
		
		return aux;
	}
	public int [] llenarA() {
		int aux[]=new int [10];
		aux[0]=respuestas[20];
		aux[1]=respuestas[44];
		aux[2]=respuestas[95];
		aux[3]=respuestas[56];
		aux[4]=respuestas[27];
		aux[5]=respuestas[10];
		aux[6]=respuestas[4];
		aux[7]=respuestas[2];
		aux[8]=respuestas[80];
		aux[9]=respuestas[35];
		
		return aux;
	}
	public int [] llenarS() {
		int aux[]=new int [10];
		aux[0]=respuestas[32];
		aux[1]=respuestas[91];
		aux[2]=respuestas[69];
		aux[3]=respuestas[7];
		aux[4]=respuestas[86];
		aux[5]=respuestas[61];
		aux[6]=respuestas[22];
		aux[7]=respuestas[43];
		aux[8]=respuestas[15];
		aux[9]=respuestas[51];
		
		return aux;
	}
	public int [] llenarI() {
		int aux[]=new int [10];
		aux[0]=respuestas[74];
		aux[1]=respuestas[5];
		aux[2]=respuestas[18];
		aux[3]=respuestas[37];
		aux[4]=respuestas[59];
		aux[5]=respuestas[26];
		aux[6]=respuestas[82];
		aux[7]=respuestas[53];
		aux[8]=respuestas[46];
		aux[9]=respuestas[96];
		
		return aux;
	}
	public int [] llenarD() {
		int aux[]=new int [10];
		aux[0]=respuestas[83];
		aux[1]=respuestas[30];
		aux[2]=respuestas[47];
		aux[3]=respuestas[72];
		aux[4]=respuestas[4];
		aux[5]=respuestas[64];
		aux[6]=respuestas[13];
		aux[7]=respuestas[36];
		aux[8]=respuestas[57];
		aux[9]=respuestas[23];
		
		return aux;
	}
	public int [] llenarE() {
		int aux[]=new int [10];
		aux[0]=respuestas[76];
		aux[1]=respuestas[41];
		aux[2]=respuestas[86];
		aux[3]=respuestas[16];
		aux[4]=respuestas[92];
		aux[5]=respuestas[31];
		aux[6]=respuestas[67];
		aux[7]=respuestas[48];
		aux[8]=respuestas[34];
		aux[9]=respuestas[60];
		
		return aux;
	}
	public String InteresMasAlta() {
		int rta=0;
		rt="puntuacion de intereses: \n";
		String aux="";
		
		for(int i=0;i<is.length;i++) {
			if(is[i]==1) {
				contadorI++;
			}
		}
		for(int j=0;j<c.length;j++) {
			if(c[j]==1) {
				contadorC++;
			}
		}
		for(int u=0;u<h.length;u++) {
			if(h[u]==1) {
				contadorH++;
			}
		}
		for(int u=0;u<h.length;u++) {
			if(a[u]==1) {
				contadorA++;
			}
		}
		for(int u=0;u<h.length;u++) {
			if(s[u]==1) {
				contadorS++;
			}
		}
		for(int u=0;u<h.length;u++) {
			if(d[u]==1) {
				contadorD++;
			}
		}
		for(int u=0;u<h.length;u++) {
			if(e[u]==1) {
				contadorE++;
			}
		}
		rt+="c = "+contadorC+"\n";
		rt+="h = "+contadorH+"\n";
		rt+="a = "+contadorA+"\n";
		rt+="s = "+contadorS+"\n";
		rt+="i = "+contadorI+"\n";
		rt+="d = "+contadorD+"\n";
		rt+="e = "+contadorE+"\n";
		
		if(contadorC>rta) {
			rta=contadorC;
			aux="c";
		}if(contadorH>rta) {
			rta=contadorH;
			aux="h";
		}if(contadorA>rta) {
			rta=contadorA;
			aux="a";
		}if(contadorS>rta) {
			rta=contadorS;
			aux="s";
		}if(contadorI>rta) {
			rta=contadorI;
			aux="i";
		}if(contadorD>rta) {
			rta=contadorD;
			aux="d";
		}if(contadorE>rta) {
			rta=contadorE;
			aux="e";
		}
		rt+="su interes mas alto es: "+aux;
		
		
		return aux;
	}
	
	@Override
	public String toString() {
		return  rt;
	}
	
	
	

}
