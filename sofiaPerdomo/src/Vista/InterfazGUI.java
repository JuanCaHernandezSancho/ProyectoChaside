package Vista;
import javax.swing.*;

import Controlador.Controlador;

//import Controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


public class InterfazGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	 PanelEntrada panelentrada;
	 PanelPreguntas panelPreguntas;

	private JScrollPane scroll;

	
	public InterfazGUI(Controlador control) {
		setSize( 1100,1000);
		setResizable(false);
	
	setTitle("Test CHAMISO");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new BorderLayout());
	panelentrada = new PanelEntrada();
	panelentrada.setBackground(Color.LIGHT_GRAY);
	add(panelentrada,BorderLayout.NORTH);
	
	panelPreguntas = new PanelPreguntas();
	 panelPreguntas.setBackground(Color.LIGHT_GRAY);
	 
	 
	 add(panelPreguntas,BorderLayout.CENTER);
     scroll = new JScrollPane(panelPreguntas);
     add(scroll);
	
	}}
