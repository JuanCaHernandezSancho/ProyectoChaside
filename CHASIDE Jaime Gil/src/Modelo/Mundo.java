package Modelo;

public class Mundo {
	
	private Pregunta p;
	private AptitudesIntereses ap;
	private Archivo ar;
	
	
	public Mundo() {
		p = new Pregunta();
		ar = new Archivo();
		ap = new AptitudesIntereses();
	}

	public Pregunta getP() {
		return p;
	}

	public void setP(Pregunta p) {
		this.p = p;
	}



	public AptitudesIntereses getAp() {
		return ap;
	}

	public void setAp(AptitudesIntereses ap) {
		this.ap = ap;
	}



	public Archivo getAr() {
		return ar;
	}

	public void setAr(Archivo ar) {
		this.ar = ar;
	}


	
	

}
