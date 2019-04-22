package Vista;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;

public class InterfazGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PanelPreguntas Panelpreguntas;
	private JScrollPane scroll;
	public InterfazGUI() {
		setSize(500, 700);
		setResizable(false);
		
		setTitle("Test De Orientacion");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		Panelpreguntas = new PanelPreguntas();
		Panelpreguntas.setBackground(Color.LIGHT_GRAY);
		add(Panelpreguntas,BorderLayout.NORTH);
		scroll = new JScrollPane(Panelpreguntas);
		add(scroll);
	}

	public PanelPreguntas getPanelpreguntas() {
		return Panelpreguntas;
	}

	public void setPanelpreguntas(PanelPreguntas panelpreguntas) {
		Panelpreguntas = panelpreguntas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
