package controlador;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador 
{
	private InterfazGUI gui;
	private Mundo bd;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new InterfazGUI();
		gui.ConfirmStart();
		gui.Pregunta(bd.getA().readQuestions());
		bd.getC().setrYES(gui.getYes());
		bd.getC().setrNO(gui.getNo());
		gui.Final(bd.getC().getrYES());
	}
}
