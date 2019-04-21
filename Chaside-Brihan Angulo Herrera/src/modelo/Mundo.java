package modelo;

public class Mundo {

	private Chaside cha;
	
	public Mundo() {
	
		cha = new Chaside();
	}

	public Chaside getCha() {
		
		return cha;
	}

	public void setCha(Chaside cha) {
		
		this.cha = cha;
	}
}
