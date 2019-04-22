package modelo;

public class Mundo 
{
	private Archivo a;
	private Persistencia bd;
	private Chaside c;
	
	public Mundo()
	{
		a = new Archivo();
		bd = new Persistencia();
		c = new Chaside();
		
	}

	public Archivo getA() {
		return a;
	}

	public Persistencia getBd() {
		return bd;
	}

	public Chaside getC() {
		return c;
	}
	
}
