package Modelo;

public class Aptitudes{
	private int c[]; 
	private int h[];
	private int a[];
	private int s[];
	private int is[];
	private int d[]; 
	private int e[]; 
	private int[]respuestas;
	private int  contadorI=0;
	private int contadorC=0;
	private int contadorH=0;
	private int contadorA=0;
	private int contadorS=0;
	private int contadorD=0;
	private int contadorE=0;
	private String rt;
	public Aptitudes(int []respuestas) {
		this.respuestas= respuestas;
		c=llenarC(); 
		is=llenarI();
		h=llenarH();
		a=llenarA();
		s=llenarS();
		d=llenarD();
		e=llenarE();
		
	}
	
	public int [] llenarC() {
		int aux[]=new int [4];
		aux[0]=respuestas[14];
		aux[1]=respuestas[50];
		aux[2]=respuestas[1];
		aux[3]=respuestas[45];
		return aux;
	}
	
	public int[] llenarH() {
		int aux[]=new int [4];
		aux[0]=respuestas[62];
		aux[1]=respuestas[29];
		aux[2]=respuestas[71];
		aux[3]=respuestas[85];
		return aux;
	}
	public int[] llenarA() {
		int aux[]=new int [4];
		aux[0]=respuestas[21];
		aux[1]=respuestas[38];
		aux[2]=respuestas[75];
		aux[3]=respuestas[81];
		return aux;
	}
	public int [] llenarS() {
		
		int aux[]=new int [4];
		aux[0]=respuestas[68];
		aux[1]=respuestas[40];
		aux[2]=respuestas[28];
		aux[3]=respuestas[3];
		return aux;
	}
	public int [] llenarI() {
		
		int aux[]=new int [4];
		aux[0]=respuestas[25];
		aux[1]=respuestas[58];
		aux[2]=respuestas[89];
		aux[3]=respuestas[9];
		return aux;
		 
	}
	public int[] llenarD() {
		int aux[]=new int [4];
		aux[0]=respuestas[12];
		aux[1]=respuestas[65];
		aux[2]=respuestas[17];
		aux[3]=respuestas[42];
		return aux;
	}
	public int [] llenarE() {
		int aux[]=new int [4];
		aux[0]=respuestas[93];
		aux[1]=respuestas[6];
		aux[2]=respuestas[78];
		aux[3]=respuestas[54];
		return aux;
	}
	public String aptitudMasAlta() {
		int rta=0;
		rt="puntuacion de aptitudes: \n";
		String alto="";
		
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
			alto="c";
		}if(contadorH>rta) {
			rta=contadorH;
			alto="h";
		}if(contadorA>rta) {
			rta=contadorA;
			alto="a";
		}if(contadorS>rta) {
			rta=contadorS;
			alto="s";
		}if(contadorI>rta) {
			rta=contadorI;
			alto="i";
		}if(contadorD>rta) {
			rta=contadorD;
			alto="d";
		}if(contadorE>rta) {
			rta=contadorE;
			alto="e";
		}
		rt+="su aptitud mas alta es: "+alto;
		
		
		return alto;
	}
	@Override
	public String toString() {
		return  rt;
	}

	

}
