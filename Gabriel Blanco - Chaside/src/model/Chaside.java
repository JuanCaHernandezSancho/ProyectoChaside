package model;

public class Chaside implements Preguntas
{
	int rSI, rNO;

	@Override
	public int respuestaSI() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return rSI;
	}

	@Override
	public int respuestaNO() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return rNO;
	}

	public int getrSI() {
		return rSI;
	}

	public void setrSI(int rSI) {
		this.rSI = rSI;
	}

	public int getrNO() {
		return rNO;
	}

	public void setrNO(int rNO) {
		this.rNO = rNO;
	}

}
