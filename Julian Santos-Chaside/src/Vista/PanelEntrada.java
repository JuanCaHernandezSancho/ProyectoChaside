package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton butInicializar;
	public static final String INICIALIZAR = "Inicializar Test";	
	private JLabel labPregunta;
	private	JTextField txtRespuesta;
	private JButton butPrev;
	public static final String PREV = "Guarda y pasa a la pregunta anterior";
	private JButton butNext;
	public static final String NEXT = "Guarda y pasa a la pregunta siguiente";
	private JButton butCalcular;
	public static final String CALCULAR = "Ejecutar Cálculos";
		
	public PanelEntrada(){
		setLayout(new GridLayout(6,3));
		TitledBorder border = BorderFactory.createTitledBorder("Datos");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		butInicializar = new JButton ("Inicializar Test");
		butInicializar.setActionCommand(INICIALIZAR);
		
		labPregunta = new JLabel ("Preguntas:");
		txtRespuesta = new JTextField("");
		txtRespuesta.setForeground(Color.BLACK);
		txtRespuesta.setBackground(Color.WHITE);
		
		butPrev = new JButton("Guarda y pasa a la pregunta anterior");
		butPrev.setActionCommand(PREV);
		
		butNext = new JButton("Guarda y pasa a la pregunta siguiente");
		butNext.setActionCommand(NEXT);
		
		butCalcular = new JButton("Ejecutar Calculos");
		butCalcular.setActionCommand(CALCULAR);
		
		add(butInicializar);
		add(labPregunta);
		add(txtRespuesta);
		add(butPrev);
		add(butNext);
		add(butCalcular);
	}

	public JButton getButCalcular() {
		return butCalcular;
	}

	public void setButCalcular(JButton butCalcular) {
		this.butCalcular = butCalcular;
	}

	public JLabel getLabPregunta() {
		return labPregunta;
	}

	public JButton getButPrev() {
		return butPrev;
	}

	public void setButPrev(JButton butPrev) {
		this.butPrev = butPrev;
	}

	public JButton getButNext() {
		return butNext;
	}

	public void setButNext(JButton butNext) {
		this.butNext = butNext;
	}

	public void setLabPregunta(JLabel labPregunta) {
		this.labPregunta = labPregunta;
	}

	public JTextField getTxtRespuesta() {
		return txtRespuesta;
	}

	public void setTxtRespuesta(JTextField txtRespuesta) {
		this.txtRespuesta = txtRespuesta;
	}
	
	public void setButInicializar(JButton butInicializar) {
		this.butInicializar = butInicializar;
	}

	public JButton getButInicializar() {
		return butInicializar;
	}
		
}