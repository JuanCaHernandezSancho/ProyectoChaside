package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Mundo;
import Vista.InterfazGUI;
public class Controlador implements ActionListener {
	private Mundo bd;
	private InterfazGUI gui;
	public Controlador() {
		bd = new Mundo();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		}
		
	
	
			
		
}
