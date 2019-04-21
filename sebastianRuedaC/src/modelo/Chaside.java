package modelo;

abstract class Chaside 
{
	protected String C;
	protected String H;
	protected String A;
	protected String S;
	protected String I;
	protected String D;
	protected String E;
	
	protected String c;
	protected String h;
	protected String a;
	protected String s;
	protected String i;
	protected String d;
	protected String e;
	
	protected String C1 ;
	protected String H1 ;
	protected String A1 ;
	protected String S1 ;
	protected String I1 ;
	protected String D1 ;
	protected String E1 ;
	
	
	
  public Chaside() 
  {

		C = "";
		H = "";
		A = "";
		S = "";
		I = "";
		D = "";
		E = "";
		
		c = ""; 
		h = "";
		a = ""; 
		s = "";
		i = "";
		d = "";
		e = "";
		
		C1 = "Administrativas y contables";
		H1 = " Humanisticas y sociales";
		A1 = "Artisticas";
		S1 = "Medicina y Cs. de la salud";
		I1 = "Ingenieria y computacion";
		D1 = "Defensa y seguridad";
		E1 = "Ciencias exactas y agrarias";
  }
  
  public abstract String calcularChasideInteresC(int pContador1,int pContador2,int pContador3,int pContador4,int pContador5,int pContador6,int pContador7);
  
  public abstract String calcularChasideAptitudes(int pContador1,int pContador2,int pContador3,int pContador4,int pContador5,int pContador6,int pContador7);
}
