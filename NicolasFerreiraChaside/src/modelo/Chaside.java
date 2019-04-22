package modelo;

public class Chaside implements Questions
{
	int rYES, rNO;

	@Override
	public int answerYES() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return rYES;
	}

	@Override
	public int answerNO() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return rNO;
	}

	public int getrYES() {
		return rYES;
	}

	public void setrYES(int rYES) {
		this.rYES = rYES;
	}

	public int getrNO() {
		return rNO;
	}

	public void setrNO(int rNO) {
		this.rNO = rNO;
	}

}
