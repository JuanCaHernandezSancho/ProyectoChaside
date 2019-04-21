package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Controlador.Controlador;

public class InterfazGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	PanelEntrada panelEntrada;
	
	PanelResultados panelResultados;
	
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	public InterfazGUI(Controlador control) {
		
		setSize(1000,700);
		setResizable(false);
		setTitle("Test Chaside");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.WEST);
		
		panelEntrada.getButInicializar().addActionListener(control);	
		panelEntrada.getButPrev().addActionListener(control);
		panelEntrada.getButNext().addActionListener(control);
		panelEntrada.getButCalcular().addActionListener(control);
	}

}
