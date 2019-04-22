package controller;

import model.Mundo;
import view.InterfazGUI;

public class Controlador 
{
	private InterfazGUI gui;
	private Mundo bd;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new InterfazGUI();
		gui.ConfirmarInicio();
		gui.Pregunta(bd.getA().readQuestions());
		bd.getC().setrSI(gui.getYes());
		bd.getC().setrNO(gui.getNo());
		gui.Final(bd.getC().getrSI());
	}
}
