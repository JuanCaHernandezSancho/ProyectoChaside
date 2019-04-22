package Vista;

import java.awt.BorderLayout;



import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel tNombre;
	private JLabel tIns;
	private JLabel t1, t2, obligatorio;
	private JTextField txtNombre;
	private JButton botonAceptar;
	public static final String ACEPTAR = "Aceptar";
	
	
	public PanelEntrada() {
		setLayout(new GridLayout(4,2));
		 TitledBorder border = BorderFactory.createTitledBorder("Registrese:");
		 border.setTitleColor(Color.blue);
		 setBorder(border);
		 
		tNombre = new JLabel("                              Nombre Completo**");		
		txtNombre = new JTextField("");
		
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setForeground(Color.BLACK);
		
		tIns = new JLabel("               SIGA LAS INSTRUCCIONES:");
		tIns.setForeground(Color.blue);
		t1=new JLabel("                    1) Lea con atencion TODAS las preguntas");
		obligatorio= new JLabel("**Caracter Obligatorio");
		obligatorio.setForeground(Color.red);
		t2=new JLabel("                    2) Responda TODAS las preguntas y de CONTINUAR al final");

		 
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setActionCommand(ACEPTAR);
		botonAceptar.setBackground(Color.blue);
		botonAceptar.setForeground(Color.white);
		add(botonAceptar);
		 
		 add(tNombre);
		 add(tIns);
		 add(txtNombre);
		 add(t1);
		 add(obligatorio);
		 add(t2);
		 add(new JLabel(""));
		 add(botonAceptar);
		 hola();
		 
	}
	
	public void hola() {
		botonAceptar.addActionListener(new ActionListener() {
	

			public void actionPerformed(ActionEvent e) {
		
		if(txtNombre.getText().length()>0)  {
			JOptionPane.showMessageDialog(null,"Ya puede iniciar su test, "+txtNombre.getText());
			botonAceptar.setEnabled(false);
			txtNombre.setEnabled(false);
		}else {
			JOptionPane.showMessageDialog(null,"INGRESE SU NOMBRE COMPLETO");
			
		}
		
	}
	});
	}


	
	
	


	

}
