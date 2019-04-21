package modelo;


import modelo.Persistencia;
import modelo.Archivo;

public class Mundo extends Chaside
{
	
	private Archivo ar;
	private String respuesta1;
	private String respuesta2;
	private String carreras1;
	private String carreras2;
	
	private Persistencia per;
	

	public Mundo() 
	{
	
		ar = new Archivo();
		respuesta1 = "";
		respuesta2 = "";
		carreras1 = "";
		carreras2 = "";	
		per = new Persistencia();
		
	}
	
	public String calcularChasideInteresC(int pContador1,int pContador2,int pContador3,int pContador4,int pContador5,int pContador6,int pContador7)
	{
		int pContador11 = pContador1;
		int pContador21 = pContador2;
		int pContador31 = pContador3;
		int pContador41 = pContador4;
		int pContador51 = pContador5;
		int pContador61 = pContador6;
		int pContador71 = pContador7;
		
		if(pContador11 >= pContador21 && pContador11 >= pContador31 && pContador11 >= pContador41 && pContador11 >= pContador51 && pContador11 >= pContador61 && pContador11 >= pContador71) 
		{
			C = String.valueOf(pContador11);
			respuesta1 = C;
			
		}
		
		if(pContador21 >= pContador11 && pContador21 >= pContador31 && pContador21 >= pContador41 && pContador21 >= pContador51 && pContador21 >= pContador61 && pContador21 >= pContador71) 
		{
			H = String.valueOf(pContador21);
			respuesta1 = H;
			
		}
		
		if(pContador31 >= pContador21 && pContador31 >= pContador11 && pContador31 >= pContador41 && pContador31 >= pContador51 && pContador31 >= pContador61 && pContador31 >= pContador71) 
		{
			A = String.valueOf(pContador31);
			respuesta1 = A;
			
		}
		
		if(pContador41 >= pContador21 && pContador41>= pContador31 && pContador41 >= pContador11 && pContador41 >= pContador51 && pContador41 >= pContador61 && pContador41 >= pContador71) 
		{
			S = String.valueOf(pContador41);
			respuesta1 = S;
			
		}
		
		if(pContador51 >= pContador21 && pContador51 >= pContador31 && pContador51 >= pContador41 && pContador51 >= pContador11 && pContador51 >= pContador61 && pContador51>= pContador71) 
		{
			I = String.valueOf(pContador51);
			respuesta1 = I;
			
		}
		
		if(pContador61 >= pContador21 && pContador61 >= pContador31 && pContador61 >= pContador41 && pContador61 >= pContador51 && pContador61 >= pContador11 && pContador61 >= pContador71) 
		{
			D = String.valueOf(pContador61);
			respuesta1 = D;
			
		}
		
		if(pContador71 >= pContador21 && pContador71 >= pContador31 && pContador71 >= pContador41 && pContador71 >= pContador51 && pContador71 >= pContador61 && pContador71 >= pContador11) 
		{
			E = String.valueOf(pContador71);
			respuesta1 = E;
			
		}
		
		
		
		return respuesta1;
		
		
	}
	
	public String calcularChasideAptitudes(int pContador1,int pContador2,int pContador3,int pContador4,int pContador5,int pContador6,int pContador7)
	{
		int pContador11 = pContador1;
		int pContador21 = pContador2;
		int pContador31 = pContador3;
		int pContador41 = pContador4;
		int pContador51 = pContador5;
		int pContador61 = pContador6;
		int pContador71 = pContador7;
		
		if(pContador11 >= pContador21 && pContador11 >= pContador31 && pContador11 >= pContador41 && pContador11 >= pContador51 && pContador11 >= pContador61 && pContador11 >= pContador71) 
		{
			c = String.valueOf(pContador11);
			respuesta2 = C;
			
		}
		
		if(pContador21 >= pContador11 && pContador21 >= pContador31 && pContador21 >= pContador41 && pContador21 >= pContador51 && pContador21 >= pContador61 && pContador21 >= pContador71) 
		{
			h = String.valueOf(pContador21);
			respuesta2 = H;
			
		}
		
		if(pContador31 >= pContador21 && pContador31 >= pContador11 && pContador31 >= pContador41 && pContador31 >= pContador51 && pContador31 >= pContador61 && pContador31 >= pContador71) 
		{
			a = String.valueOf(pContador31);
			respuesta2 = A;
			
		}
		
		if(pContador41 >= pContador21 && pContador41>= pContador31 && pContador41 >= pContador11 && pContador41 >= pContador51 && pContador41 >= pContador61 && pContador41 >= pContador71) 
		{
			s = String.valueOf(pContador41);
			respuesta2 = S;
			
		}
		
		if(pContador51 >= pContador21 && pContador51 >= pContador31 && pContador51 >= pContador41 && pContador51 >= pContador11 && pContador51 >= pContador61 && pContador51>= pContador71) 
		{
			i = String.valueOf(pContador51);
			respuesta2 = I;
			
		}
		
		if(pContador61 >= pContador21 && pContador61 >= pContador31 && pContador61 >= pContador41 && pContador61 >= pContador51 && pContador61 >= pContador11 && pContador61 >= pContador71) 
		{
			d = String.valueOf(pContador61);
			respuesta2 = D;
			
		}
		
		if(pContador71 >= pContador21 && pContador71 >= pContador31 && pContador71 >= pContador41 && pContador71 >= pContador51 && pContador71 >= pContador61 && pContador71 >= pContador11) 
		{
			e = String.valueOf(pContador71);
			respuesta2 = E;
			
		}
		
		
		
		return respuesta2;
		
	}
	   
	public String opcionesDeCarrera1()
	{
		 String palabra1 = "";
		 String palabra2 = "";
		 String palabra3 = "";
		 String palabra4 = "";
		 String palabra5 = "";
		 String palabra6 = "";
		 String palabra7 = "";
		 String palabra8 = "";
	
		 if(respuesta1.equalsIgnoreCase(C)) 
		 {
			 
			 for(int i = 0; i< per.CarrerasCI.length; i++) 
			 {
				 palabra1 = per.CarrerasCI[0];
				 palabra2 = per.CarrerasCI[1];
				 palabra3 = per.CarrerasCI[2];
				 palabra4 = per.CarrerasCI[3];
				 palabra5 = per.CarrerasCI[4];
				 palabra6 = per.CarrerasCI[5];
				 palabra7 = per.CarrerasCI[6];
				 palabra8 = per.CarrerasCI[7];
			 }
			 
			 carreras1 = C1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 + "\n"+ palabra8  ;
			 
		 }
		 
		 if(respuesta1.equalsIgnoreCase(H)) 
		 {
			 for(int i = 0; i< per.CarrerasHI.length; i++) 
			 {
				 palabra1 = per.CarrerasHI[0];
				 palabra2 = per.CarrerasHI[1];
				 palabra3 = per.CarrerasHI[2];
				 palabra4 = per.CarrerasHI[3];
				 palabra5 = per.CarrerasHI[4];
				 palabra6 = per.CarrerasHI[5];
				 palabra7 = per.CarrerasHI[6];
				
			 }
			 
			 carreras1 = H1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 ;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(A)) 
		 {
			 for(int i = 0; i< per.CarrerasAI.length; i++) 
			 {
				 palabra1 = per.CarrerasAI[0];
				 palabra2 = per.CarrerasAI[1];
				 palabra3 = per.CarrerasAI[2];
				 palabra4 = per.CarrerasAI[3];
				 palabra5 = per.CarrerasAI[4];
				 palabra6 = per.CarrerasAI[5];
				 palabra7 = per.CarrerasAI[6];
				
			 }
			 
			 carreras1 = A1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7  ;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(S)) 
		 {
			 for(int i = 0; i< per.CarrerasSI.length; i++) 
			 {
				 palabra1 = per.CarrerasSI[0];
				 palabra2 = per.CarrerasSI[1];
				 palabra3 = per.CarrerasSI[2];
				 palabra4 = per.CarrerasSI[3];
				 palabra5 = per.CarrerasSI[4];
				 palabra6 = per.CarrerasSI[5];
				 palabra7 = per.CarrerasSI[6];
				 palabra8 = per.CarrerasSI[7];
			 }
			 
			 carreras1 = S1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7+ "\n"+ palabra8 ;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(I)) 
		 {
			 for(int i = 0; i< per.CarrerasII.length; i++) 
			 {
				 palabra1 = per.CarrerasII[0];
				 palabra2 = per.CarrerasII[1];
				 palabra3 = per.CarrerasII[2];
				 palabra4 = per.CarrerasII[3];
				 palabra5 = per.CarrerasII[4];
				 palabra6 = per.CarrerasII[5];
				 palabra7 = per.CarrerasII[6];
				 palabra8 = per.CarrerasII[7];
			 }
			 
			 carreras1 = I1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 + "\n"+ palabra8;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(D)) 
		 {
			 for(int i = 0; i< per.CarrerasDI.length; i++) 
			 {
				 palabra1 = per.CarrerasDI[0];
				 palabra2 = per.CarrerasDI[1];
				 palabra3 = per.CarrerasDI[2];
				 palabra4 = per.CarrerasDI[3];
				 palabra5 = per.CarrerasDI[4];
				 palabra6 = per.CarrerasDI[5];
				 palabra7 = per.CarrerasDI[6];
				 palabra8 = per.CarrerasDI[7];
			 }
			 
			 carreras1 = D1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7  + "\n"+ palabra8;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(E)) 
		 {
			 for(int i = 0; i< per.CarrerasEI.length; i++) 
			 {
				 palabra1 = per.CarrerasEI[0];
				 palabra2 = per.CarrerasEI[1];
				 palabra3 = per.CarrerasEI[2];
				 palabra4 = per.CarrerasEI[3];
				 palabra5 = per.CarrerasEI[4];
				 palabra6 = per.CarrerasEI[5];
				 palabra7 = per.CarrerasEI[6];
				 palabra8 = per.CarrerasEI[7];
			 }
			 
			 carreras1 = E1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 + "\n"+ palabra8 ;
		 }
		 
		 
		 return carreras1;
		 
	}
	
	public String opcionesDeCarrera2()
	{
		 String palabra1 = "";
		 String palabra2 = "";
		 String palabra3 = "";
		 String palabra4 = "";
		 String palabra5 = "";
		 String palabra6 = "";
		 String palabra7 = "";
		 String palabra8 = "";
		 
		
		 
		 if(respuesta1.equalsIgnoreCase(C)) 
		 {
			 
			 for(int i = 0; i< per.CarrerasCA.length; i++) 
			 {
				 palabra1 = per.CarrerasCA[0];
				 palabra2 = per.CarrerasCA[1];
				 palabra3 = per.CarrerasCA[2];
				 palabra4 = per.CarrerasCA[3];
				 palabra5 = per.CarrerasCA[4];
				 palabra6 = per.CarrerasCA[5];
				 palabra7 = per.CarrerasCA[6];
				 palabra8 = per.CarrerasCA[7];
			 }
			 
			carreras2 = C1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 + "\n"+ palabra8  ;
			 
		 }
		 
		 if(respuesta2.equalsIgnoreCase(H)) 
		 {
			 for(int i = 0; i< per.CarrerasHA.length; i++) 
			 {
				 palabra1 = per.CarrerasHA[0];
				 palabra2 = per.CarrerasHA[1];
				 palabra3 = per.CarrerasHA[2];
				 palabra4 = per.CarrerasHA[3];
				 palabra5 = per.CarrerasHA[4];
				 palabra6 = per.CarrerasHA[5];
				 palabra7 = per.CarrerasHA[6];
				 palabra8 = per.CarrerasHA[7];
				
			 }
			 
			 carreras2 = H1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 +"\n"+ palabra8  ;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(A)) 
		 {
			 for(int i = 0; i< per.CarrerasCA.length; i++) 
			 {
				 palabra1 = per.CarrerasAA[0];
				 palabra2 = per.CarrerasAA[1];
				 palabra3 = per.CarrerasAA[2];
				 palabra4 = per.CarrerasAA[3];
				 palabra5 = per.CarrerasAA[4];
				 palabra6 = per.CarrerasAA[5];
				 palabra7 = per.CarrerasAA[6];
				 palabra8 = per.CarrerasAA[7];
			 }
			 
			 carreras2 = A1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 +"\n"+ palabra8  ;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(S)) 
		 {
			 for(int i = 0; i< per.CarrerasSA.length; i++) 
			 {
				 palabra1 = per.CarrerasSA[0];
				 palabra2 = per.CarrerasSA[1];
				 palabra3 = per.CarrerasSA[2];
				 palabra4 = per.CarrerasSA[3];
				 palabra5 = per.CarrerasSA[4];
				 palabra6 = per.CarrerasSA[5];
				 palabra7 = per.CarrerasSA[6];
				 palabra8 = per.CarrerasSA[7];
			 }
			 
			 carreras2 = S1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7+ "\n"+ palabra8 ;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(I)) 
		 {
			 for(int i = 0; i< per.CarrerasIA.length; i++) 
			 {
				 palabra1 = per.CarrerasIA[0];
				 palabra2 = per.CarrerasIA[1];
				 palabra3 = per.CarrerasIA[2];
				 palabra4 = per.CarrerasIA[3];
				 palabra5 = per.CarrerasIA[4];
				 palabra6 = per.CarrerasIA[5];
				 palabra7 = per.CarrerasIA[6];
				 palabra8 = per.CarrerasIA[7];
			 }
			 
			 carreras2 = I1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 + "\n"+ palabra8;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(D)) 
		 {
			 for(int i = 0; i< per.CarrerasDA.length; i++) 
			 {
				 palabra1 = per.CarrerasDA[0];
				 palabra2 = per.CarrerasDA[1];
				 palabra3 = per.CarrerasDA[2];
				 palabra4 = per.CarrerasDA[3];
				 palabra5 = per.CarrerasDA[4];
				 palabra6 = per.CarrerasDA[5];
				 palabra7 = per.CarrerasDA[6];
				 palabra8 = per.CarrerasDA[7];
			 }
			 
			 carreras2 = D1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7  + "\n"+ palabra8;
		 }
		 
		 if(respuesta1.equalsIgnoreCase(E)) 
		 {
			 for(int i = 0; i< per.CarrerasEA.length; i++) 
			 {
				 palabra1 = per.CarrerasEA[0];
				 palabra2 = per.CarrerasEA[1];
				 palabra3 = per.CarrerasEA[2];
				 palabra4 = per.CarrerasEA[3];
				 palabra5 = per.CarrerasEA[4];
				 palabra6 = per.CarrerasEA[5];
				 palabra7 = per.CarrerasEA[6];
				 palabra8 = per.CarrerasEA[7];
			 }
			 
			 carreras2 = E1 + "\n" + "Intereses :" + "\n"+ "\n" + palabra1 + "\n" + palabra2 +"\n"+ palabra3 +"\n"+ palabra4 +"\n"+ palabra5 +"\n"+ palabra6 +"\n"+ palabra7 + "\n"+ palabra8 ;
		 }
		 
		 
		 return carreras2;
		 
	}

	public Archivo getAr() {
		return ar;
	}

	public void setAr(Archivo ar) {
		this.ar = ar;
	}

	public String getRespuesta1() {
		return respuesta1;
	}

	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getCarreras1() {
		return carreras1;
	}

	public void setCarreras1(String carreras1) {
		this.carreras1 = carreras1;
	}

	public String getCarreras2() {
		return carreras2;
	}

	public void setCarreras2(String carreras2) {
		this.carreras2 = carreras2;
	}

	public Persistencia getPer() {
		return per;
	}

	public void setPer(Persistencia per) {
		this.per = per;
	}
	
	
	
	
}
