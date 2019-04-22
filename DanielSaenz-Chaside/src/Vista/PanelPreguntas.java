package Vista;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;




import java.awt.Color;
import java.awt.GridLayout;
public class PanelPreguntas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel Pregunta1,Pregunta2,Pregunta3,Pregunta4,Pregunta5,Pregunta6,Pregunta7,Pregunta8,Pregunta9,Pregunta10,Pregunta11,Pregunta12,Pregunta13,Pregunta14,Pregunta15,Pregunta16
	,Pregunta17,Pregunta18,Pregunta19,Pregunta20;
	private JLabel Pregunta21,Pregunta22,Pregunta23,Pregunta24,Pregunta25,Pregunta26,Pregunta27,Pregunta28,Pregunta29,Pregunta30,Pregunta31,Pregunta32,Pregunta33,Pregunta34,Pregunta35,Pregunta36
	,Pregunta37,Pregunta38,Pregunta39,Pregunta40;
	private JLabel Pregunta41,Pregunta42,Pregunta43,Pregunta44,Pregunta45,Pregunta46,Pregunta47,Pregunta48,Pregunta49,Pregunta50,Pregunta51,Pregunta52,Pregunta53,Pregunta54,Pregunta55,Pregunta56,Pregunta57
	,Pregunta58,Pregunta59,Pregunta60;
	private JLabel Pregunta61,Pregunta62,Pregunta63,Pregunta64,Pregunta65,Pregunta66,Pregunta67,Pregunta68,Pregunta69,Pregunta70,Pregunta71,Pregunta72,Pregunta73,Pregunta74,Pregunta75,Pregunta76
	,Pregunta77,Pregunta78,Pregunta79,Pregunta80;
	private JLabel Pregunta81,Pregunta82,Pregunta83,Pregunta84,Pregunta85,Pregunta86,Pregunta87,Pregunta88,Pregunta89,Pregunta90,Pregunta91,Pregunta92,Pregunta93,Pregunta94,Pregunta95,Pregunta96
	,Pregunta97,Pregunta98;
	private  JRadioButton Pregun1,Pregun2,Pregun3,Pregun4,Pregun5,Pregun6,Pregun7,Pregun8,Pregun9,Pregun10,Pregun11,Pregun12,Pregun13,Pregun14,Pregun15,Pregun16
	,Pregun17,Pregun18,Pregun19,Pregun20,Pregu1,Pregu2,Pregu3,Pregu4,Pregu5,Pregu6,Pregu7,Pregu8,Pregu9,Pregu10,Pregu11,Pregu12,Pregu13,Pregu14,Pregu15,Pregu16
	,Pregu17,Pregu18,Pregu19,Pregu20;
	private  JRadioButton Pregun21,Pregun22,Pregun23,Pregun24,Pregun25,Pregun26,Pregun27,Pregun28,Pregun29,Pregun30,Pregun31,Pregun32,Pregun33,Pregun34,Pregun35,Pregun36
	,Pregun37,Pregun38,Pregun39,Pregun40,Pregu21,Pregu22,Pregu23,Pregu24,Pregu25,Pregu26,Pregu27,Pregu28,Pregu29,Pregu30,Pregu31,Pregu32,Pregu33,Pregu34,Pregu35,Pregu36
	,Pregu37,Pregu38,Pregu39,Pregu40;
	private  JRadioButton Pregun41,Pregun42,Pregun43,Pregun44,Pregun45,Pregun46,Pregun47,Pregun48,Pregun49,Pregun50,Pregun51,Pregun52,Pregun53,Pregun54,Pregun55,Pregun56,Pregun57
	,Pregun58,Pregun59,Pregun60,Pregu41,Pregu42,Pregu43,Pregu44,Pregu45,Pregu46,Pregu47,Pregu48,Pregu49,Pregu50,Pregu51,Pregu52,Pregu53,Pregu54,Pregu55,Pregu56,Pregu57
	,Pregu58,Pregu59,Pregu60;
	private  JRadioButton Pregun61,Pregun62,Pregun63,Pregun64,Pregun65,Pregun66,Pregun67,Pregun68,Pregun69,Pregun70,Pregun71,Pregun72,Pregun73,Pregun74,Pregun75,Pregun76
	,Pregun77,Pregun78,Pregun79,Pregun80,Pregu61,Pregu62,Pregu63,Pregu64,Pregu65,Pregu66,Pregu67,Pregu68,Pregu69,Pregu70,Pregu71,Pregu72,Pregu73,Pregu74,Pregu75,Pregu76
	,Pregu77,Pregu78,Pregu79,Pregu80;
	private  JRadioButton Pregun81,Pregun82,Pregun83,Pregun84,Pregun85,Pregun86,Pregun87,Pregun88,Pregun89,Pregun90,Pregun91,Pregun92,Pregun93,Pregun94,Pregun95,Pregun96
	,Pregun97,Pregun98,Pregu81,Pregu82,Pregu83,Pregu84,Pregu85,Pregu86,Pregu87,Pregu88,Pregu89,Pregu90,Pregu91,Pregu92,Pregu93,Pregu94,Pregu95,Pregu96
	,Pregu97,Pregu98;
	
	public PanelPreguntas() {
		setLayout(new GridLayout(300,1));
		 TitledBorder border = BorderFactory.createTitledBorder("Responda las siguientes preguntas");
		 border.setTitleColor(Color.BLACK);
		 setBorder(border);
		 
		 Pregunta1 = new JLabel("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?" );
		    add(Pregunta1);
		    Pregun1 = new JRadioButton("Si");
			add(Pregun1);
			Pregu1 = new JRadioButton("No");
			add(Pregu1);
			ButtonGroup opciones1 = new ButtonGroup();
			opciones1.add(Pregun1);
			opciones1.add(Pregu1);
		 
			Pregunta2 = new JLabel("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?" );
		    add(Pregunta2);
		    Pregun2 = new JRadioButton("Si");
			add(Pregun2);
			Pregu2 = new JRadioButton("No");
			add(Pregu2);
			ButtonGroup opciones2 = new ButtonGroup();
			opciones2.add(Pregun2);
			opciones2.add(Pregu2);
			
			Pregunta3 = new JLabel("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?" );
		    add(Pregunta3);
		    Pregun3 = new JRadioButton("Si");
			add(Pregun3);
			Pregu3 = new JRadioButton("No");
			add(Pregu3);
			ButtonGroup opciones3 = new ButtonGroup();
			opciones3.add(Pregun3);
			opciones3.add(Pregu3);
			
			Pregunta4 = new JLabel("4 ¿A una frustración siempre opones un pensamiento positivo?" );
		    add(Pregunta4);
		    Pregun4 = new JRadioButton("Si");
			add(Pregun4);
			Pregu4 = new JRadioButton("No");
			add(Pregu4);
			ButtonGroup opciones4 = new ButtonGroup();
			opciones4.add(Pregun4);
			opciones4.add(Pregu4);
			
			Pregunta5 = new JLabel("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?" );
		    add(Pregunta5);
		    Pregun5 = new JRadioButton("Si");
			add(Pregun5);
			Pregu5 = new JRadioButton("No");
			add(Pregu5);
			ButtonGroup opciones5 = new ButtonGroup();
			opciones5.add(Pregun5);
			opciones5.add(Pregu5);
			
			Pregunta6 = new JLabel("6 ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?" );
		    add(Pregunta6);
		    Pregun6 = new JRadioButton("Si");
			add(Pregun6);
			Pregu6 = new JRadioButton("No");
			add(Pregu6);
			ButtonGroup opciones6 = new ButtonGroup();
			opciones6.add(Pregun6);
			opciones6.add(Pregu6);
		
			Pregunta7 = new JLabel("7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?" );
		    add(Pregunta7);
		    Pregun7 = new JRadioButton("Si");
			add(Pregun7);
			Pregu7 = new JRadioButton("No");
			add(Pregu7);
			ButtonGroup opciones7 = new ButtonGroup();
			opciones7.add(Pregun7);
			opciones7.add(Pregu7);
			
			Pregunta8 = new JLabel("8 ¿Escuchas atentamente los problemas que te plantean tus amigos?" );
		    add(Pregunta8);
		    Pregun8 = new JRadioButton("Si");
			add(Pregun8);
			Pregu8 = new JRadioButton("No");
			add(Pregu8);
			ButtonGroup opciones8 = new ButtonGroup();
			opciones8.add(Pregun8);
			opciones8.add(Pregu8);
			
			Pregunta9 = new JLabel("9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?" );
		    add(Pregunta9);
		    Pregun9 = new JRadioButton("Si");
			add(Pregun9);
			Pregu9 = new JRadioButton("No");
			add(Pregu9);
			ButtonGroup opciones9 = new ButtonGroup();
			opciones9.add(Pregun9);
			opciones9.add(Pregu9);
			
			Pregunta10 = new JLabel("10 ¿Eres exigente y crítico con tu equipo de trabajo" );
		    add(Pregunta10);
		    Pregun10 = new JRadioButton("Si");
			add(Pregun10);
			Pregu10 = new JRadioButton("No");
			add(Pregu10);
			ButtonGroup opciones10 = new ButtonGroup();
			opciones10.add(Pregun10);
			opciones10.add(Pregu10);
			
			
			Pregunta11 = new JLabel("11 ¿Te atrae armar rompecabezas o puzzles?" );
		    add(Pregunta11);
		    Pregun11 = new JRadioButton("Si");
			add(Pregun11);
			Pregu11 = new JRadioButton("No");
			add(Pregu11);
			ButtonGroup opciones11 = new ButtonGroup();
			opciones11.add(Pregun11);
			opciones11.add(Pregu11);
			
			
			Pregunta12 = new JLabel("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?" );
		    add(Pregunta12);
		    Pregun12 = new JRadioButton("Si");
			add(Pregun12);
			Pregu12 = new JRadioButton("No");
			add(Pregu12);
			ButtonGroup opciones12 = new ButtonGroup();
			opciones12.add(Pregun12);
			opciones12.add(Pregu12);
		 
			Pregunta13 = new JLabel("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?" );
		    add(Pregunta13);
		    Pregun13 = new JRadioButton("Si");
			add(Pregun13);
			Pregu13 = new JRadioButton("No");
			add(Pregu13);
			ButtonGroup opciones13 = new ButtonGroup();
			opciones13.add(Pregun13);
			opciones13.add(Pregu13);
			
			Pregunta14 = new JLabel("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?" );
		    add(Pregunta14);
		    Pregun14 = new JRadioButton("Si");
			add(Pregun14);
			Pregu14 = new JRadioButton("No");
			add(Pregu14);
			ButtonGroup opciones14 = new ButtonGroup();
			opciones14.add(Pregun14);
			opciones14.add(Pregu14);
			
			Pregunta15 = new JLabel("4 ¿A una frustración siempre opones un pensamiento positivo?" );
		    add(Pregunta15);
		    Pregun15 = new JRadioButton("Si");
			add(Pregun15);
			Pregu15 = new JRadioButton("No");
			add(Pregu15);
			ButtonGroup opciones15 = new ButtonGroup();
			opciones15.add(Pregun15);
			opciones15.add(Pregu15);
			
			Pregunta16 = new JLabel("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?" );
		    add(Pregunta16);
		    Pregun16 = new JRadioButton("Si");
			add(Pregun16);
			Pregu16 = new JRadioButton("No");
			add(Pregu16);
			ButtonGroup opciones16 = new ButtonGroup();
			opciones16.add(Pregun16);
			opciones16.add(Pregu16);
			
			Pregunta17 = new JLabel("6 ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?" );
		    add(Pregunta17);
		    Pregun17 = new JRadioButton("Si");
			add(Pregun17);
			Pregu17 = new JRadioButton("No");
			add(Pregu17);
			ButtonGroup opciones17 = new ButtonGroup();
			opciones17.add(Pregun17);
			opciones17.add(Pregu17);
		
			Pregunta18 = new JLabel("7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?" );
		    add(Pregunta18);
		    Pregun18 = new JRadioButton("Si");
			add(Pregun18);
			Pregu18 = new JRadioButton("No");
			add(Pregu18);
			ButtonGroup opciones18 = new ButtonGroup();
			opciones18.add(Pregun18);
			opciones18.add(Pregu18);
			
			Pregunta19 = new JLabel("8 ¿Escuchas atentamente los problemas que te plantean tus amigos?" );
		    add(Pregunta19);
		    Pregun19 = new JRadioButton("Si");
			add(Pregun19);
			Pregu19 = new JRadioButton("No");
			add(Pregu19);
			ButtonGroup opciones19 = new ButtonGroup();
			opciones19.add(Pregun19);
			opciones19.add(Pregu19);
			
			Pregunta20 = new JLabel("9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?" );
		    add(Pregunta20);
		    Pregun20 = new JRadioButton("Si");
			add(Pregun20);
			Pregu20 = new JRadioButton("No");
			add(Pregu20);
			ButtonGroup opciones20 = new ButtonGroup();
			opciones20.add(Pregun20);
			opciones20.add(Pregu20);
			
			Pregunta21 = new JLabel("10 ¿Eres exigente y crítico con tu equipo de trabajo" );
		    add(Pregunta21);
		    Pregun21 = new JRadioButton("Si");
			add(Pregun21);
			Pregu21 = new JRadioButton("No");
			add(Pregu21);
			ButtonGroup opciones21 = new ButtonGroup();
			opciones21.add(Pregun21);
			opciones21.add(Pregu21);
			
			
			Pregunta22 = new JLabel("11 ¿Te atrae armar rompecabezas o puzzles?" );
		    add(Pregunta22);
		    Pregun22 = new JRadioButton("Si");
			add(Pregun22);
			Pregu22 = new JRadioButton("No");
			add(Pregu22);
			ButtonGroup opciones22 = new ButtonGroup();
			opciones22.add(Pregun22);
			opciones22.add(Pregu22);
			
			Pregunta23 = new JLabel("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?" );
		    add(Pregunta23);
		    Pregun23 = new JRadioButton("Si");
			add(Pregun23);
			Pregu23 = new JRadioButton("No");
			add(Pregu23);
			ButtonGroup opciones23 = new ButtonGroup();
			opciones23.add(Pregun23);
			opciones23.add(Pregu23);
		 
			Pregunta24 = new JLabel("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?" );
		    add(Pregunta24);
		    Pregun24 = new JRadioButton("Si");
			add(Pregun24);
			Pregu24 = new JRadioButton("No");
			add(Pregu24);
			ButtonGroup opciones24 = new ButtonGroup();
			opciones24.add(Pregun24);
			opciones24.add(Pregu24);
			
			Pregunta25 = new JLabel("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?" );
		    add(Pregunta25);
		    Pregun25 = new JRadioButton("Si");
			add(Pregun25);
			Pregu25 = new JRadioButton("No");
			add(Pregu25);
			ButtonGroup opciones25 = new ButtonGroup();
			opciones25.add(Pregun25);
			opciones25.add(Pregu25);
			
			Pregunta26 = new JLabel("4 ¿A una frustración siempre opones un pensamiento positivo?" );
		    add(Pregunta26);
		    Pregun26 = new JRadioButton("Si");
			add(Pregun26);
			Pregu26 = new JRadioButton("No");
			add(Pregu26);
			ButtonGroup opciones26 = new ButtonGroup();
			opciones26.add(Pregun26);
			opciones26.add(Pregu26);
			
			Pregunta27 = new JLabel("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?" );
		    add(Pregunta27);
		    Pregun27 = new JRadioButton("Si");
			add(Pregun27);
			Pregu27 = new JRadioButton("No");
			add(Pregu27);
			ButtonGroup opciones27 = new ButtonGroup();
			opciones27.add(Pregun27);
			opciones27.add(Pregu27);
			
			Pregunta28 = new JLabel("6 ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?" );
		    add(Pregunta28);
		    Pregun28 = new JRadioButton("Si");
			add(Pregun28);
			Pregu28 = new JRadioButton("No");
			add(Pregu28);
			ButtonGroup opciones28 = new ButtonGroup();
			opciones28.add(Pregun28);
			opciones28.add(Pregu28);
		
			Pregunta29 = new JLabel("7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?" );
		    add(Pregunta29);
		    Pregun29 = new JRadioButton("Si");
			add(Pregun29);
			Pregu29 = new JRadioButton("No");
			add(Pregu29);
			ButtonGroup opciones29 = new ButtonGroup();
			opciones29.add(Pregun29);
			opciones29.add(Pregu29);
			
			Pregunta30 = new JLabel("8 ¿Escuchas atentamente los problemas que te plantean tus amigos?" );
		    add(Pregunta30);
		    Pregun30 = new JRadioButton("Si");
			add(Pregun30);
			Pregu30 = new JRadioButton("No");
			add(Pregu30);
			ButtonGroup opciones30 = new ButtonGroup();
			opciones30.add(Pregun30);
			opciones30.add(Pregu30);
			
			Pregunta31 = new JLabel("9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?" );
		    add(Pregunta31);
		    Pregun31 = new JRadioButton("Si");
			add(Pregun31);
			Pregu31 = new JRadioButton("No");
			add(Pregu31);
			ButtonGroup opciones31 = new ButtonGroup();
			opciones31.add(Pregun31);
			opciones31.add(Pregu31);
			
			Pregunta32 = new JLabel("10 ¿Eres exigente y crítico con tu equipo de trabajo" );
		    add(Pregunta32);
		    Pregun32 = new JRadioButton("Si");
			add(Pregun32);
			Pregu32 = new JRadioButton("No");
			add(Pregu32);
			ButtonGroup opciones32 = new ButtonGroup();
			opciones32.add(Pregun32);
			opciones32.add(Pregu32);
			
			
			Pregunta33 = new JLabel("11 ¿Te atrae armar rompecabezas o puzzles?" );
		    add(Pregunta33);
		    Pregun33 = new JRadioButton("Si");
			add(Pregun33);
			Pregu33 = new JRadioButton("No");
			add(Pregu33);
			ButtonGroup opciones33 = new ButtonGroup();
			opciones33.add(Pregun33);
			opciones33.add(Pregu33);
			
			Pregunta34 = new JLabel("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?" );
		    add(Pregunta34);
		    Pregun34 = new JRadioButton("Si");
			add(Pregun34);
			Pregu34 = new JRadioButton("No");
			add(Pregu34);
			ButtonGroup opciones34 = new ButtonGroup();
			opciones34.add(Pregun34);
			opciones34.add(Pregu34);
		 
			Pregunta35 = new JLabel("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?" );
		    add(Pregunta35);
		    Pregun35 = new JRadioButton("Si");
			add(Pregun35);
			Pregu35 = new JRadioButton("No");
			add(Pregu35);
			ButtonGroup opciones35 = new ButtonGroup();
			opciones35.add(Pregun35);
			opciones35.add(Pregu35);
			
			Pregunta36 = new JLabel("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?" );
		    add(Pregunta36);
		    Pregun36 = new JRadioButton("Si");
			add(Pregun36);
			Pregu36 = new JRadioButton("No");
			add(Pregu36);
			ButtonGroup opciones36 = new ButtonGroup();
			opciones36.add(Pregun36);
			opciones36.add(Pregu36);
			
			Pregunta37 = new JLabel("4 ¿A una frustración siempre opones un pensamiento positivo?" );
		    add(Pregunta37);
		    Pregun37 = new JRadioButton("Si");
			add(Pregun37);
			Pregu37 = new JRadioButton("No");
			add(Pregu37);
			ButtonGroup opciones37 = new ButtonGroup();
			opciones37.add(Pregun37);
			opciones37.add(Pregu37);
			
			Pregunta38 = new JLabel("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?" );
		    add(Pregunta38);
		    Pregun38 = new JRadioButton("Si");
			add(Pregun38);
			Pregu38 = new JRadioButton("No");
			add(Pregu38);
			ButtonGroup opciones38 = new ButtonGroup();
			opciones38.add(Pregun38);
			opciones38.add(Pregu38);
			
			Pregunta39 = new JLabel("6 ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?" );
		    add(Pregunta39);
		    Pregun39 = new JRadioButton("Si");
			add(Pregun39);
			Pregu39 = new JRadioButton("No");
			add(Pregu39);
			ButtonGroup opciones39 = new ButtonGroup();
			opciones39.add(Pregun39);
			opciones39.add(Pregu39);
		
			Pregunta40 = new JLabel("7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?" );
		    add(Pregunta40);
		    Pregun40 = new JRadioButton("Si");
			add(Pregun40);
			Pregu40 = new JRadioButton("No");
			add(Pregu40);
			ButtonGroup opciones40 = new ButtonGroup();
			opciones40.add(Pregun40);
			opciones40.add(Pregu40);
			
			Pregunta41 = new JLabel("8 ¿Escuchas atentamente los problemas que te plantean tus amigos?" );
		    add(Pregunta41);
		    Pregun41 = new JRadioButton("Si");
			add(Pregun41);
			Pregu41 = new JRadioButton("No");
			add(Pregu41);
			ButtonGroup opciones41 = new ButtonGroup();
			opciones41.add(Pregun41);
			opciones41.add(Pregu41);
			
			Pregunta42 = new JLabel("9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?" );
		    add(Pregunta42);
		    Pregun42 = new JRadioButton("Si");
			add(Pregun42);
			Pregu42 = new JRadioButton("No");
			add(Pregu42);
			ButtonGroup opciones42 = new ButtonGroup();
			opciones42.add(Pregun42);
			opciones42.add(Pregu42);
			
			Pregunta43 = new JLabel("10 ¿Eres exigente y crítico con tu equipo de trabajo" );
		    add(Pregunta43);
		    Pregun43 = new JRadioButton("Si");
			add(Pregun43);
			Pregu43 = new JRadioButton("No");
			add(Pregu43);
			ButtonGroup opciones43 = new ButtonGroup();
			opciones43.add(Pregun43);
			opciones43.add(Pregu43);
			
			
			Pregunta44 = new JLabel("11 ¿Te atrae armar rompecabezas o puzzles?" );
		    add(Pregunta44);
		    Pregun44 = new JRadioButton("Si");
			add(Pregun44);
			Pregu44 = new JRadioButton("No");
			add(Pregu44);
			ButtonGroup opciones44 = new ButtonGroup();
			opciones44.add(Pregun44);
			opciones44.add(Pregu44);
			
			Pregunta45 = new JLabel("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?" );
		    add(Pregunta45);
		    Pregun45 = new JRadioButton("Si");
			add(Pregun45);
			Pregu45 = new JRadioButton("No");
			add(Pregu1);
			ButtonGroup opciones45 = new ButtonGroup();
			opciones45.add(Pregun45);
			opciones45.add(Pregu45);
		 
			Pregunta46 = new JLabel("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?" );
		    add(Pregunta46);
		    Pregun46 = new JRadioButton("Si");
			add(Pregun46);
			Pregu46 = new JRadioButton("No");
			add(Pregu46);
			ButtonGroup opciones46 = new ButtonGroup();
			opciones46.add(Pregun46);
			opciones46.add(Pregu46);
			
			Pregunta47 = new JLabel("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?" );
		    add(Pregunta47);
		    Pregun47 = new JRadioButton("Si");
			add(Pregun47);
			Pregu47 = new JRadioButton("No");
			add(Pregu47);
			ButtonGroup opciones47 = new ButtonGroup();
			opciones47.add(Pregun47);
			opciones47.add(Pregu47);
			
			Pregunta48 = new JLabel("4 ¿A una frustración siempre opones un pensamiento positivo?" );
		    add(Pregunta48);
		    Pregun48 = new JRadioButton("Si");
			add(Pregun48);
			Pregu48 = new JRadioButton("No");
			add(Pregu48);
			ButtonGroup opciones48 = new ButtonGroup();
			opciones48.add(Pregun48);
			opciones48.add(Pregu48);
			
			Pregunta49 = new JLabel("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?" );
		    add(Pregunta49);
		    Pregun49 = new JRadioButton("Si");
			add(Pregun49);
			Pregu49 = new JRadioButton("No");
			add(Pregu49);
			ButtonGroup opciones49 = new ButtonGroup();
			opciones49.add(Pregun49);
			opciones49.add(Pregu49);
			
			Pregunta50 = new JLabel("6 ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?" );
		    add(Pregunta50);
		    Pregun50 = new JRadioButton("Si");
			add(Pregun50);
			Pregu50 = new JRadioButton("No");
			add(Pregu50);
			ButtonGroup opciones50 = new ButtonGroup();
			opciones50.add(Pregun50);
			opciones50.add(Pregu50);
		
			Pregunta51 = new JLabel("7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?" );
		    add(Pregunta51);
		    Pregun51 = new JRadioButton("Si");
			add(Pregun51);
			Pregu51 = new JRadioButton("No");
			add(Pregu51);
			ButtonGroup opciones51 = new ButtonGroup();
			opciones51.add(Pregun51);
			opciones51.add(Pregu51);
			
			Pregunta52 = new JLabel("8 ¿Escuchas atentamente los problemas que te plantean tus amigos?" );
		    add(Pregunta52);
		    Pregun52 = new JRadioButton("Si");
			add(Pregun52);
			Pregu52 = new JRadioButton("No");
			add(Pregu52);
			ButtonGroup opciones52 = new ButtonGroup();
			opciones52.add(Pregun52);
			opciones52.add(Pregu52);
			
			Pregunta53 = new JLabel("9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?" );
		    add(Pregunta53);
		    Pregun53 = new JRadioButton("Si");
			add(Pregun53);
			Pregu53 = new JRadioButton("No");
			add(Pregu53);
			ButtonGroup opciones53 = new ButtonGroup();
			opciones53.add(Pregun53);
			opciones53.add(Pregu53);
			
			Pregunta54 = new JLabel("10 ¿Eres exigente y crítico con tu equipo de trabajo" );
		    add(Pregunta54);
		    Pregun54 = new JRadioButton("Si");
			add(Pregun54);
			Pregu54 = new JRadioButton("No");
			add(Pregu54);
			ButtonGroup opciones54 = new ButtonGroup();
			opciones54.add(Pregun54);
			opciones54.add(Pregu54);
			
			
			Pregunta55 = new JLabel("11 ¿Te atrae armar rompecabezas o puzzles?" );
		    add(Pregunta55);
		    Pregun55 = new JRadioButton("Si");
			add(Pregun55);
			Pregu55 = new JRadioButton("No");
			add(Pregu55);
			ButtonGroup opciones55 = new ButtonGroup();
			opciones55.add(Pregun55);
			opciones55.add(Pregu5);
			
			
		 
	}

	public JLabel getPregunta1() {
		return Pregunta1;
	}

	public void setPregunta1(JLabel pregunta1) {
		Pregunta1 = pregunta1;
	}

	public JLabel getPregunta2() {
		return Pregunta2;
	}

	public void setPregunta2(JLabel pregunta2) {
		Pregunta2 = pregunta2;
	}

	public JLabel getPregunta3() {
		return Pregunta3;
	}

	public void setPregunta3(JLabel pregunta3) {
		Pregunta3 = pregunta3;
	}

	public JLabel getPregunta4() {
		return Pregunta4;
	}

	public void setPregunta4(JLabel pregunta4) {
		Pregunta4 = pregunta4;
	}

	public JLabel getPregunta5() {
		return Pregunta5;
	}

	public void setPregunta5(JLabel pregunta5) {
		Pregunta5 = pregunta5;
	}

	public JLabel getPregunta6() {
		return Pregunta6;
	}

	public void setPregunta6(JLabel pregunta6) {
		Pregunta6 = pregunta6;
	}

	public JLabel getPregunta7() {
		return Pregunta7;
	}

	public void setPregunta7(JLabel pregunta7) {
		Pregunta7 = pregunta7;
	}

	public JLabel getPregunta8() {
		return Pregunta8;
	}

	public void setPregunta8(JLabel pregunta8) {
		Pregunta8 = pregunta8;
	}

	public JLabel getPregunta9() {
		return Pregunta9;
	}

	public void setPregunta9(JLabel pregunta9) {
		Pregunta9 = pregunta9;
	}

	public JLabel getPregunta10() {
		return Pregunta10;
	}

	public void setPregunta10(JLabel pregunta10) {
		Pregunta10 = pregunta10;
	}

	public JLabel getPregunta11() {
		return Pregunta11;
	}

	public void setPregunta11(JLabel pregunta11) {
		Pregunta11 = pregunta11;
	}

	public JLabel getPregunta12() {
		return Pregunta12;
	}

	public void setPregunta12(JLabel pregunta12) {
		Pregunta12 = pregunta12;
	}

	public JLabel getPregunta13() {
		return Pregunta13;
	}

	public void setPregunta13(JLabel pregunta13) {
		Pregunta13 = pregunta13;
	}

	public JLabel getPregunta14() {
		return Pregunta14;
	}

	public void setPregunta14(JLabel pregunta14) {
		Pregunta14 = pregunta14;
	}

	public JLabel getPregunta15() {
		return Pregunta15;
	}

	public void setPregunta15(JLabel pregunta15) {
		Pregunta15 = pregunta15;
	}

	public JLabel getPregunta16() {
		return Pregunta16;
	}

	public void setPregunta16(JLabel pregunta16) {
		Pregunta16 = pregunta16;
	}

	public JLabel getPregunta17() {
		return Pregunta17;
	}

	public void setPregunta17(JLabel pregunta17) {
		Pregunta17 = pregunta17;
	}

	public JLabel getPregunta18() {
		return Pregunta18;
	}

	public void setPregunta18(JLabel pregunta18) {
		Pregunta18 = pregunta18;
	}

	public JLabel getPregunta19() {
		return Pregunta19;
	}

	public void setPregunta19(JLabel pregunta19) {
		Pregunta19 = pregunta19;
	}

	public JLabel getPregunta20() {
		return Pregunta20;
	}

	public void setPregunta20(JLabel pregunta20) {
		Pregunta20 = pregunta20;
	}

	public JLabel getPregunta21() {
		return Pregunta21;
	}

	public void setPregunta21(JLabel pregunta21) {
		Pregunta21 = pregunta21;
	}

	public JLabel getPregunta22() {
		return Pregunta22;
	}

	public void setPregunta22(JLabel pregunta22) {
		Pregunta22 = pregunta22;
	}

	public JLabel getPregunta23() {
		return Pregunta23;
	}

	public void setPregunta23(JLabel pregunta23) {
		Pregunta23 = pregunta23;
	}

	public JLabel getPregunta24() {
		return Pregunta24;
	}

	public void setPregunta24(JLabel pregunta24) {
		Pregunta24 = pregunta24;
	}

	public JLabel getPregunta25() {
		return Pregunta25;
	}

	public void setPregunta25(JLabel pregunta25) {
		Pregunta25 = pregunta25;
	}

	public JLabel getPregunta26() {
		return Pregunta26;
	}

	public void setPregunta26(JLabel pregunta26) {
		Pregunta26 = pregunta26;
	}

	public JLabel getPregunta27() {
		return Pregunta27;
	}

	public void setPregunta27(JLabel pregunta27) {
		Pregunta27 = pregunta27;
	}

	public JLabel getPregunta28() {
		return Pregunta28;
	}

	public void setPregunta28(JLabel pregunta28) {
		Pregunta28 = pregunta28;
	}

	public JLabel getPregunta29() {
		return Pregunta29;
	}

	public void setPregunta29(JLabel pregunta29) {
		Pregunta29 = pregunta29;
	}

	public JLabel getPregunta30() {
		return Pregunta30;
	}

	public void setPregunta30(JLabel pregunta30) {
		Pregunta30 = pregunta30;
	}

	public JLabel getPregunta31() {
		return Pregunta31;
	}

	public void setPregunta31(JLabel pregunta31) {
		Pregunta31 = pregunta31;
	}

	public JLabel getPregunta32() {
		return Pregunta32;
	}

	public void setPregunta32(JLabel pregunta32) {
		Pregunta32 = pregunta32;
	}

	public JLabel getPregunta33() {
		return Pregunta33;
	}

	public void setPregunta33(JLabel pregunta33) {
		Pregunta33 = pregunta33;
	}

	public JLabel getPregunta34() {
		return Pregunta34;
	}

	public void setPregunta34(JLabel pregunta34) {
		Pregunta34 = pregunta34;
	}

	public JLabel getPregunta35() {
		return Pregunta35;
	}

	public void setPregunta35(JLabel pregunta35) {
		Pregunta35 = pregunta35;
	}

	public JLabel getPregunta36() {
		return Pregunta36;
	}

	public void setPregunta36(JLabel pregunta36) {
		Pregunta36 = pregunta36;
	}

	public JLabel getPregunta37() {
		return Pregunta37;
	}

	public void setPregunta37(JLabel pregunta37) {
		Pregunta37 = pregunta37;
	}

	public JLabel getPregunta38() {
		return Pregunta38;
	}

	public void setPregunta38(JLabel pregunta38) {
		Pregunta38 = pregunta38;
	}

	public JLabel getPregunta39() {
		return Pregunta39;
	}

	public void setPregunta39(JLabel pregunta39) {
		Pregunta39 = pregunta39;
	}

	public JLabel getPregunta40() {
		return Pregunta40;
	}

	public void setPregunta40(JLabel pregunta40) {
		Pregunta40 = pregunta40;
	}

	public JLabel getPregunta41() {
		return Pregunta41;
	}

	public void setPregunta41(JLabel pregunta41) {
		Pregunta41 = pregunta41;
	}

	public JLabel getPregunta42() {
		return Pregunta42;
	}

	public void setPregunta42(JLabel pregunta42) {
		Pregunta42 = pregunta42;
	}

	public JLabel getPregunta43() {
		return Pregunta43;
	}

	public void setPregunta43(JLabel pregunta43) {
		Pregunta43 = pregunta43;
	}

	public JLabel getPregunta44() {
		return Pregunta44;
	}

	public void setPregunta44(JLabel pregunta44) {
		Pregunta44 = pregunta44;
	}

	public JLabel getPregunta45() {
		return Pregunta45;
	}

	public void setPregunta45(JLabel pregunta45) {
		Pregunta45 = pregunta45;
	}

	public JLabel getPregunta46() {
		return Pregunta46;
	}

	public void setPregunta46(JLabel pregunta46) {
		Pregunta46 = pregunta46;
	}

	public JLabel getPregunta47() {
		return Pregunta47;
	}

	public void setPregunta47(JLabel pregunta47) {
		Pregunta47 = pregunta47;
	}

	public JLabel getPregunta48() {
		return Pregunta48;
	}

	public void setPregunta48(JLabel pregunta48) {
		Pregunta48 = pregunta48;
	}

	public JLabel getPregunta49() {
		return Pregunta49;
	}

	public void setPregunta49(JLabel pregunta49) {
		Pregunta49 = pregunta49;
	}

	public JLabel getPregunta50() {
		return Pregunta50;
	}

	public void setPregunta50(JLabel pregunta50) {
		Pregunta50 = pregunta50;
	}

	public JLabel getPregunta51() {
		return Pregunta51;
	}

	public void setPregunta51(JLabel pregunta51) {
		Pregunta51 = pregunta51;
	}

	public JLabel getPregunta52() {
		return Pregunta52;
	}

	public void setPregunta52(JLabel pregunta52) {
		Pregunta52 = pregunta52;
	}

	public JLabel getPregunta53() {
		return Pregunta53;
	}

	public void setPregunta53(JLabel pregunta53) {
		Pregunta53 = pregunta53;
	}

	public JLabel getPregunta54() {
		return Pregunta54;
	}

	public void setPregunta54(JLabel pregunta54) {
		Pregunta54 = pregunta54;
	}

	public JLabel getPregunta55() {
		return Pregunta55;
	}

	public void setPregunta55(JLabel pregunta55) {
		Pregunta55 = pregunta55;
	}

	public JLabel getPregunta56() {
		return Pregunta56;
	}

	public void setPregunta56(JLabel pregunta56) {
		Pregunta56 = pregunta56;
	}

	public JLabel getPregunta57() {
		return Pregunta57;
	}

	public void setPregunta57(JLabel pregunta57) {
		Pregunta57 = pregunta57;
	}

	public JLabel getPregunta58() {
		return Pregunta58;
	}

	public void setPregunta58(JLabel pregunta58) {
		Pregunta58 = pregunta58;
	}

	public JLabel getPregunta59() {
		return Pregunta59;
	}

	public void setPregunta59(JLabel pregunta59) {
		Pregunta59 = pregunta59;
	}

	public JLabel getPregunta60() {
		return Pregunta60;
	}

	public void setPregunta60(JLabel pregunta60) {
		Pregunta60 = pregunta60;
	}

	public JLabel getPregunta61() {
		return Pregunta61;
	}

	public void setPregunta61(JLabel pregunta61) {
		Pregunta61 = pregunta61;
	}

	public JLabel getPregunta62() {
		return Pregunta62;
	}

	public void setPregunta62(JLabel pregunta62) {
		Pregunta62 = pregunta62;
	}

	public JLabel getPregunta63() {
		return Pregunta63;
	}

	public void setPregunta63(JLabel pregunta63) {
		Pregunta63 = pregunta63;
	}

	public JLabel getPregunta64() {
		return Pregunta64;
	}

	public void setPregunta64(JLabel pregunta64) {
		Pregunta64 = pregunta64;
	}

	public JLabel getPregunta65() {
		return Pregunta65;
	}

	public void setPregunta65(JLabel pregunta65) {
		Pregunta65 = pregunta65;
	}

	public JLabel getPregunta66() {
		return Pregunta66;
	}

	public void setPregunta66(JLabel pregunta66) {
		Pregunta66 = pregunta66;
	}

	public JLabel getPregunta67() {
		return Pregunta67;
	}

	public void setPregunta67(JLabel pregunta67) {
		Pregunta67 = pregunta67;
	}

	public JLabel getPregunta68() {
		return Pregunta68;
	}

	public void setPregunta68(JLabel pregunta68) {
		Pregunta68 = pregunta68;
	}

	public JLabel getPregunta69() {
		return Pregunta69;
	}

	public void setPregunta69(JLabel pregunta69) {
		Pregunta69 = pregunta69;
	}

	public JLabel getPregunta70() {
		return Pregunta70;
	}

	public void setPregunta70(JLabel pregunta70) {
		Pregunta70 = pregunta70;
	}

	public JLabel getPregunta71() {
		return Pregunta71;
	}

	public void setPregunta71(JLabel pregunta71) {
		Pregunta71 = pregunta71;
	}

	public JLabel getPregunta72() {
		return Pregunta72;
	}

	public void setPregunta72(JLabel pregunta72) {
		Pregunta72 = pregunta72;
	}

	public JLabel getPregunta73() {
		return Pregunta73;
	}

	public void setPregunta73(JLabel pregunta73) {
		Pregunta73 = pregunta73;
	}

	public JLabel getPregunta74() {
		return Pregunta74;
	}

	public void setPregunta74(JLabel pregunta74) {
		Pregunta74 = pregunta74;
	}

	public JLabel getPregunta75() {
		return Pregunta75;
	}

	public void setPregunta75(JLabel pregunta75) {
		Pregunta75 = pregunta75;
	}

	public JLabel getPregunta76() {
		return Pregunta76;
	}

	public void setPregunta76(JLabel pregunta76) {
		Pregunta76 = pregunta76;
	}

	public JLabel getPregunta77() {
		return Pregunta77;
	}

	public void setPregunta77(JLabel pregunta77) {
		Pregunta77 = pregunta77;
	}

	public JLabel getPregunta78() {
		return Pregunta78;
	}

	public void setPregunta78(JLabel pregunta78) {
		Pregunta78 = pregunta78;
	}

	public JLabel getPregunta79() {
		return Pregunta79;
	}

	public void setPregunta79(JLabel pregunta79) {
		Pregunta79 = pregunta79;
	}

	public JLabel getPregunta80() {
		return Pregunta80;
	}

	public void setPregunta80(JLabel pregunta80) {
		Pregunta80 = pregunta80;
	}

	public JLabel getPregunta81() {
		return Pregunta81;
	}

	public void setPregunta81(JLabel pregunta81) {
		Pregunta81 = pregunta81;
	}

	public JLabel getPregunta82() {
		return Pregunta82;
	}

	public void setPregunta82(JLabel pregunta82) {
		Pregunta82 = pregunta82;
	}

	public JLabel getPregunta83() {
		return Pregunta83;
	}

	public void setPregunta83(JLabel pregunta83) {
		Pregunta83 = pregunta83;
	}

	public JLabel getPregunta84() {
		return Pregunta84;
	}

	public void setPregunta84(JLabel pregunta84) {
		Pregunta84 = pregunta84;
	}

	public JLabel getPregunta85() {
		return Pregunta85;
	}

	public void setPregunta85(JLabel pregunta85) {
		Pregunta85 = pregunta85;
	}

	public JLabel getPregunta86() {
		return Pregunta86;
	}

	public void setPregunta86(JLabel pregunta86) {
		Pregunta86 = pregunta86;
	}

	public JLabel getPregunta87() {
		return Pregunta87;
	}

	public void setPregunta87(JLabel pregunta87) {
		Pregunta87 = pregunta87;
	}

	public JLabel getPregunta88() {
		return Pregunta88;
	}

	public void setPregunta88(JLabel pregunta88) {
		Pregunta88 = pregunta88;
	}

	public JLabel getPregunta89() {
		return Pregunta89;
	}

	public void setPregunta89(JLabel pregunta89) {
		Pregunta89 = pregunta89;
	}

	public JLabel getPregunta90() {
		return Pregunta90;
	}

	public void setPregunta90(JLabel pregunta90) {
		Pregunta90 = pregunta90;
	}

	public JLabel getPregunta91() {
		return Pregunta91;
	}

	public void setPregunta91(JLabel pregunta91) {
		Pregunta91 = pregunta91;
	}

	public JLabel getPregunta92() {
		return Pregunta92;
	}

	public void setPregunta92(JLabel pregunta92) {
		Pregunta92 = pregunta92;
	}

	public JLabel getPregunta93() {
		return Pregunta93;
	}

	public void setPregunta93(JLabel pregunta93) {
		Pregunta93 = pregunta93;
	}

	public JLabel getPregunta94() {
		return Pregunta94;
	}

	public void setPregunta94(JLabel pregunta94) {
		Pregunta94 = pregunta94;
	}

	public JLabel getPregunta95() {
		return Pregunta95;
	}

	public void setPregunta95(JLabel pregunta95) {
		Pregunta95 = pregunta95;
	}

	public JLabel getPregunta96() {
		return Pregunta96;
	}

	public void setPregunta96(JLabel pregunta96) {
		Pregunta96 = pregunta96;
	}

	public JLabel getPregunta97() {
		return Pregunta97;
	}

	public void setPregunta97(JLabel pregunta97) {
		Pregunta97 = pregunta97;
	}

	public JLabel getPregunta98() {
		return Pregunta98;
	}

	public void setPregunta98(JLabel pregunta98) {
		Pregunta98 = pregunta98;
	}

	public JRadioButton getPregun1() {
		return Pregun1;
	}

	public void setPregun1(JRadioButton pregun1) {
		Pregun1 = pregun1;
	}

	public JRadioButton getPregun2() {
		return Pregun2;
	}

	public void setPregun2(JRadioButton pregun2) {
		Pregun2 = pregun2;
	}

	public JRadioButton getPregun3() {
		return Pregun3;
	}

	public void setPregun3(JRadioButton pregun3) {
		Pregun3 = pregun3;
	}

	public JRadioButton getPregun4() {
		return Pregun4;
	}

	public void setPregun4(JRadioButton pregun4) {
		Pregun4 = pregun4;
	}

	public JRadioButton getPregun5() {
		return Pregun5;
	}

	public void setPregun5(JRadioButton pregun5) {
		Pregun5 = pregun5;
	}

	public JRadioButton getPregun6() {
		return Pregun6;
	}

	public void setPregun6(JRadioButton pregun6) {
		Pregun6 = pregun6;
	}

	public JRadioButton getPregun7() {
		return Pregun7;
	}

	public void setPregun7(JRadioButton pregun7) {
		Pregun7 = pregun7;
	}

	public JRadioButton getPregun8() {
		return Pregun8;
	}

	public void setPregun8(JRadioButton pregun8) {
		Pregun8 = pregun8;
	}

	public JRadioButton getPregun9() {
		return Pregun9;
	}

	public void setPregun9(JRadioButton pregun9) {
		Pregun9 = pregun9;
	}

	public JRadioButton getPregun10() {
		return Pregun10;
	}

	public void setPregun10(JRadioButton pregun10) {
		Pregun10 = pregun10;
	}

	public JRadioButton getPregun11() {
		return Pregun11;
	}

	public void setPregun11(JRadioButton pregun11) {
		Pregun11 = pregun11;
	}

	public JRadioButton getPregun12() {
		return Pregun12;
	}

	public void setPregun12(JRadioButton pregun12) {
		Pregun12 = pregun12;
	}

	public JRadioButton getPregun13() {
		return Pregun13;
	}

	public void setPregun13(JRadioButton pregun13) {
		Pregun13 = pregun13;
	}

	public JRadioButton getPregun14() {
		return Pregun14;
	}

	public void setPregun14(JRadioButton pregun14) {
		Pregun14 = pregun14;
	}

	public JRadioButton getPregun15() {
		return Pregun15;
	}

	public void setPregun15(JRadioButton pregun15) {
		Pregun15 = pregun15;
	}

	public JRadioButton getPregun16() {
		return Pregun16;
	}

	public void setPregun16(JRadioButton pregun16) {
		Pregun16 = pregun16;
	}

	public JRadioButton getPregun17() {
		return Pregun17;
	}

	public void setPregun17(JRadioButton pregun17) {
		Pregun17 = pregun17;
	}

	public JRadioButton getPregun18() {
		return Pregun18;
	}

	public void setPregun18(JRadioButton pregun18) {
		Pregun18 = pregun18;
	}

	public JRadioButton getPregun19() {
		return Pregun19;
	}

	public void setPregun19(JRadioButton pregun19) {
		Pregun19 = pregun19;
	}

	public JRadioButton getPregun20() {
		return Pregun20;
	}

	public void setPregun20(JRadioButton pregun20) {
		Pregun20 = pregun20;
	}

	public JRadioButton getPregu1() {
		return Pregu1;
	}

	public void setPregu1(JRadioButton pregu1) {
		Pregu1 = pregu1;
	}

	public JRadioButton getPregu2() {
		return Pregu2;
	}

	public void setPregu2(JRadioButton pregu2) {
		Pregu2 = pregu2;
	}

	public JRadioButton getPregu3() {
		return Pregu3;
	}

	public void setPregu3(JRadioButton pregu3) {
		Pregu3 = pregu3;
	}

	public JRadioButton getPregu4() {
		return Pregu4;
	}

	public void setPregu4(JRadioButton pregu4) {
		Pregu4 = pregu4;
	}

	public JRadioButton getPregu5() {
		return Pregu5;
	}

	public void setPregu5(JRadioButton pregu5) {
		Pregu5 = pregu5;
	}

	public JRadioButton getPregu6() {
		return Pregu6;
	}

	public void setPregu6(JRadioButton pregu6) {
		Pregu6 = pregu6;
	}

	public JRadioButton getPregu7() {
		return Pregu7;
	}

	public void setPregu7(JRadioButton pregu7) {
		Pregu7 = pregu7;
	}

	public JRadioButton getPregu8() {
		return Pregu8;
	}

	public void setPregu8(JRadioButton pregu8) {
		Pregu8 = pregu8;
	}

	public JRadioButton getPregu9() {
		return Pregu9;
	}

	public void setPregu9(JRadioButton pregu9) {
		Pregu9 = pregu9;
	}

	public JRadioButton getPregu10() {
		return Pregu10;
	}

	public void setPregu10(JRadioButton pregu10) {
		Pregu10 = pregu10;
	}

	public JRadioButton getPregu11() {
		return Pregu11;
	}

	public void setPregu11(JRadioButton pregu11) {
		Pregu11 = pregu11;
	}

	public JRadioButton getPregu12() {
		return Pregu12;
	}

	public void setPregu12(JRadioButton pregu12) {
		Pregu12 = pregu12;
	}

	public JRadioButton getPregu13() {
		return Pregu13;
	}

	public void setPregu13(JRadioButton pregu13) {
		Pregu13 = pregu13;
	}

	public JRadioButton getPregu14() {
		return Pregu14;
	}

	public void setPregu14(JRadioButton pregu14) {
		Pregu14 = pregu14;
	}

	public JRadioButton getPregu15() {
		return Pregu15;
	}

	public void setPregu15(JRadioButton pregu15) {
		Pregu15 = pregu15;
	}

	public JRadioButton getPregu16() {
		return Pregu16;
	}

	public void setPregu16(JRadioButton pregu16) {
		Pregu16 = pregu16;
	}

	public JRadioButton getPregu17() {
		return Pregu17;
	}

	public void setPregu17(JRadioButton pregu17) {
		Pregu17 = pregu17;
	}

	public JRadioButton getPregu18() {
		return Pregu18;
	}

	public void setPregu18(JRadioButton pregu18) {
		Pregu18 = pregu18;
	}

	public JRadioButton getPregu19() {
		return Pregu19;
	}

	public void setPregu19(JRadioButton pregu19) {
		Pregu19 = pregu19;
	}

	public JRadioButton getPregu20() {
		return Pregu20;
	}

	public void setPregu20(JRadioButton pregu20) {
		Pregu20 = pregu20;
	}

	public JRadioButton getPregun21() {
		return Pregun21;
	}

	public void setPregun21(JRadioButton pregun21) {
		Pregun21 = pregun21;
	}

	public JRadioButton getPregun22() {
		return Pregun22;
	}

	public void setPregun22(JRadioButton pregun22) {
		Pregun22 = pregun22;
	}

	public JRadioButton getPregun23() {
		return Pregun23;
	}

	public void setPregun23(JRadioButton pregun23) {
		Pregun23 = pregun23;
	}

	public JRadioButton getPregun24() {
		return Pregun24;
	}

	public void setPregun24(JRadioButton pregun24) {
		Pregun24 = pregun24;
	}

	public JRadioButton getPregun25() {
		return Pregun25;
	}

	public void setPregun25(JRadioButton pregun25) {
		Pregun25 = pregun25;
	}

	public JRadioButton getPregun26() {
		return Pregun26;
	}

	public void setPregun26(JRadioButton pregun26) {
		Pregun26 = pregun26;
	}

	public JRadioButton getPregun27() {
		return Pregun27;
	}

	public void setPregun27(JRadioButton pregun27) {
		Pregun27 = pregun27;
	}

	public JRadioButton getPregun28() {
		return Pregun28;
	}

	public void setPregun28(JRadioButton pregun28) {
		Pregun28 = pregun28;
	}

	public JRadioButton getPregun29() {
		return Pregun29;
	}

	public void setPregun29(JRadioButton pregun29) {
		Pregun29 = pregun29;
	}

	public JRadioButton getPregun30() {
		return Pregun30;
	}

	public void setPregun30(JRadioButton pregun30) {
		Pregun30 = pregun30;
	}

	public JRadioButton getPregun31() {
		return Pregun31;
	}

	public void setPregun31(JRadioButton pregun31) {
		Pregun31 = pregun31;
	}

	public JRadioButton getPregun32() {
		return Pregun32;
	}

	public void setPregun32(JRadioButton pregun32) {
		Pregun32 = pregun32;
	}

	public JRadioButton getPregun33() {
		return Pregun33;
	}

	public void setPregun33(JRadioButton pregun33) {
		Pregun33 = pregun33;
	}

	public JRadioButton getPregun34() {
		return Pregun34;
	}

	public void setPregun34(JRadioButton pregun34) {
		Pregun34 = pregun34;
	}

	public JRadioButton getPregun35() {
		return Pregun35;
	}

	public void setPregun35(JRadioButton pregun35) {
		Pregun35 = pregun35;
	}

	public JRadioButton getPregun36() {
		return Pregun36;
	}

	public void setPregun36(JRadioButton pregun36) {
		Pregun36 = pregun36;
	}

	public JRadioButton getPregun37() {
		return Pregun37;
	}

	public void setPregun37(JRadioButton pregun37) {
		Pregun37 = pregun37;
	}

	public JRadioButton getPregun38() {
		return Pregun38;
	}

	public void setPregun38(JRadioButton pregun38) {
		Pregun38 = pregun38;
	}

	public JRadioButton getPregun39() {
		return Pregun39;
	}

	public void setPregun39(JRadioButton pregun39) {
		Pregun39 = pregun39;
	}

	public JRadioButton getPregun40() {
		return Pregun40;
	}

	public void setPregun40(JRadioButton pregun40) {
		Pregun40 = pregun40;
	}

	public JRadioButton getPregu21() {
		return Pregu21;
	}

	public void setPregu21(JRadioButton pregu21) {
		Pregu21 = pregu21;
	}

	public JRadioButton getPregu22() {
		return Pregu22;
	}

	public void setPregu22(JRadioButton pregu22) {
		Pregu22 = pregu22;
	}

	public JRadioButton getPregu23() {
		return Pregu23;
	}

	public void setPregu23(JRadioButton pregu23) {
		Pregu23 = pregu23;
	}

	public JRadioButton getPregu24() {
		return Pregu24;
	}

	public void setPregu24(JRadioButton pregu24) {
		Pregu24 = pregu24;
	}

	public JRadioButton getPregu25() {
		return Pregu25;
	}

	public void setPregu25(JRadioButton pregu25) {
		Pregu25 = pregu25;
	}

	public JRadioButton getPregu26() {
		return Pregu26;
	}

	public void setPregu26(JRadioButton pregu26) {
		Pregu26 = pregu26;
	}

	public JRadioButton getPregu27() {
		return Pregu27;
	}

	public void setPregu27(JRadioButton pregu27) {
		Pregu27 = pregu27;
	}

	public JRadioButton getPregu28() {
		return Pregu28;
	}

	public void setPregu28(JRadioButton pregu28) {
		Pregu28 = pregu28;
	}

	public JRadioButton getPregu29() {
		return Pregu29;
	}

	public void setPregu29(JRadioButton pregu29) {
		Pregu29 = pregu29;
	}

	public JRadioButton getPregu30() {
		return Pregu30;
	}

	public void setPregu30(JRadioButton pregu30) {
		Pregu30 = pregu30;
	}

	public JRadioButton getPregu31() {
		return Pregu31;
	}

	public void setPregu31(JRadioButton pregu31) {
		Pregu31 = pregu31;
	}

	public JRadioButton getPregu32() {
		return Pregu32;
	}

	public void setPregu32(JRadioButton pregu32) {
		Pregu32 = pregu32;
	}

	public JRadioButton getPregu33() {
		return Pregu33;
	}

	public void setPregu33(JRadioButton pregu33) {
		Pregu33 = pregu33;
	}

	public JRadioButton getPregu34() {
		return Pregu34;
	}

	public void setPregu34(JRadioButton pregu34) {
		Pregu34 = pregu34;
	}

	public JRadioButton getPregu35() {
		return Pregu35;
	}

	public void setPregu35(JRadioButton pregu35) {
		Pregu35 = pregu35;
	}

	public JRadioButton getPregu36() {
		return Pregu36;
	}

	public void setPregu36(JRadioButton pregu36) {
		Pregu36 = pregu36;
	}

	public JRadioButton getPregu37() {
		return Pregu37;
	}

	public void setPregu37(JRadioButton pregu37) {
		Pregu37 = pregu37;
	}

	public JRadioButton getPregu38() {
		return Pregu38;
	}

	public void setPregu38(JRadioButton pregu38) {
		Pregu38 = pregu38;
	}

	public JRadioButton getPregu39() {
		return Pregu39;
	}

	public void setPregu39(JRadioButton pregu39) {
		Pregu39 = pregu39;
	}

	public JRadioButton getPregu40() {
		return Pregu40;
	}

	public void setPregu40(JRadioButton pregu40) {
		Pregu40 = pregu40;
	}

	public JRadioButton getPregun41() {
		return Pregun41;
	}

	public void setPregun41(JRadioButton pregun41) {
		Pregun41 = pregun41;
	}

	public JRadioButton getPregun42() {
		return Pregun42;
	}

	public void setPregun42(JRadioButton pregun42) {
		Pregun42 = pregun42;
	}

	public JRadioButton getPregun43() {
		return Pregun43;
	}

	public void setPregun43(JRadioButton pregun43) {
		Pregun43 = pregun43;
	}

	public JRadioButton getPregun44() {
		return Pregun44;
	}

	public void setPregun44(JRadioButton pregun44) {
		Pregun44 = pregun44;
	}

	public JRadioButton getPregun45() {
		return Pregun45;
	}

	public void setPregun45(JRadioButton pregun45) {
		Pregun45 = pregun45;
	}

	public JRadioButton getPregun46() {
		return Pregun46;
	}

	public void setPregun46(JRadioButton pregun46) {
		Pregun46 = pregun46;
	}

	public JRadioButton getPregun47() {
		return Pregun47;
	}

	public void setPregun47(JRadioButton pregun47) {
		Pregun47 = pregun47;
	}

	public JRadioButton getPregun48() {
		return Pregun48;
	}

	public void setPregun48(JRadioButton pregun48) {
		Pregun48 = pregun48;
	}

	public JRadioButton getPregun49() {
		return Pregun49;
	}

	public void setPregun49(JRadioButton pregun49) {
		Pregun49 = pregun49;
	}

	public JRadioButton getPregun50() {
		return Pregun50;
	}

	public void setPregun50(JRadioButton pregun50) {
		Pregun50 = pregun50;
	}

	public JRadioButton getPregun51() {
		return Pregun51;
	}

	public void setPregun51(JRadioButton pregun51) {
		Pregun51 = pregun51;
	}

	public JRadioButton getPregun52() {
		return Pregun52;
	}

	public void setPregun52(JRadioButton pregun52) {
		Pregun52 = pregun52;
	}

	public JRadioButton getPregun53() {
		return Pregun53;
	}

	public void setPregun53(JRadioButton pregun53) {
		Pregun53 = pregun53;
	}

	public JRadioButton getPregun54() {
		return Pregun54;
	}

	public void setPregun54(JRadioButton pregun54) {
		Pregun54 = pregun54;
	}

	public JRadioButton getPregun55() {
		return Pregun55;
	}

	public void setPregun55(JRadioButton pregun55) {
		Pregun55 = pregun55;
	}

	public JRadioButton getPregun56() {
		return Pregun56;
	}

	public void setPregun56(JRadioButton pregun56) {
		Pregun56 = pregun56;
	}

	public JRadioButton getPregun57() {
		return Pregun57;
	}

	public void setPregun57(JRadioButton pregun57) {
		Pregun57 = pregun57;
	}

	public JRadioButton getPregun58() {
		return Pregun58;
	}

	public void setPregun58(JRadioButton pregun58) {
		Pregun58 = pregun58;
	}

	public JRadioButton getPregun59() {
		return Pregun59;
	}

	public void setPregun59(JRadioButton pregun59) {
		Pregun59 = pregun59;
	}

	public JRadioButton getPregun60() {
		return Pregun60;
	}

	public void setPregun60(JRadioButton pregun60) {
		Pregun60 = pregun60;
	}

	public JRadioButton getPregu41() {
		return Pregu41;
	}

	public void setPregu41(JRadioButton pregu41) {
		Pregu41 = pregu41;
	}

	public JRadioButton getPregu42() {
		return Pregu42;
	}

	public void setPregu42(JRadioButton pregu42) {
		Pregu42 = pregu42;
	}

	public JRadioButton getPregu43() {
		return Pregu43;
	}

	public void setPregu43(JRadioButton pregu43) {
		Pregu43 = pregu43;
	}

	public JRadioButton getPregu44() {
		return Pregu44;
	}

	public void setPregu44(JRadioButton pregu44) {
		Pregu44 = pregu44;
	}

	public JRadioButton getPregu45() {
		return Pregu45;
	}

	public void setPregu45(JRadioButton pregu45) {
		Pregu45 = pregu45;
	}

	public JRadioButton getPregu46() {
		return Pregu46;
	}

	public void setPregu46(JRadioButton pregu46) {
		Pregu46 = pregu46;
	}

	public JRadioButton getPregu47() {
		return Pregu47;
	}

	public void setPregu47(JRadioButton pregu47) {
		Pregu47 = pregu47;
	}

	public JRadioButton getPregu48() {
		return Pregu48;
	}

	public void setPregu48(JRadioButton pregu48) {
		Pregu48 = pregu48;
	}

	public JRadioButton getPregu49() {
		return Pregu49;
	}

	public void setPregu49(JRadioButton pregu49) {
		Pregu49 = pregu49;
	}

	public JRadioButton getPregu50() {
		return Pregu50;
	}

	public void setPregu50(JRadioButton pregu50) {
		Pregu50 = pregu50;
	}

	public JRadioButton getPregu51() {
		return Pregu51;
	}

	public void setPregu51(JRadioButton pregu51) {
		Pregu51 = pregu51;
	}

	public JRadioButton getPregu52() {
		return Pregu52;
	}

	public void setPregu52(JRadioButton pregu52) {
		Pregu52 = pregu52;
	}

	public JRadioButton getPregu53() {
		return Pregu53;
	}

	public void setPregu53(JRadioButton pregu53) {
		Pregu53 = pregu53;
	}

	public JRadioButton getPregu54() {
		return Pregu54;
	}

	public void setPregu54(JRadioButton pregu54) {
		Pregu54 = pregu54;
	}

	public JRadioButton getPregu55() {
		return Pregu55;
	}

	public void setPregu55(JRadioButton pregu55) {
		Pregu55 = pregu55;
	}

	public JRadioButton getPregu56() {
		return Pregu56;
	}

	public void setPregu56(JRadioButton pregu56) {
		Pregu56 = pregu56;
	}

	public JRadioButton getPregu57() {
		return Pregu57;
	}

	public void setPregu57(JRadioButton pregu57) {
		Pregu57 = pregu57;
	}

	public JRadioButton getPregu58() {
		return Pregu58;
	}

	public void setPregu58(JRadioButton pregu58) {
		Pregu58 = pregu58;
	}

	public JRadioButton getPregu59() {
		return Pregu59;
	}

	public void setPregu59(JRadioButton pregu59) {
		Pregu59 = pregu59;
	}

	public JRadioButton getPregu60() {
		return Pregu60;
	}

	public void setPregu60(JRadioButton pregu60) {
		Pregu60 = pregu60;
	}

	public JRadioButton getPregun61() {
		return Pregun61;
	}

	public void setPregun61(JRadioButton pregun61) {
		Pregun61 = pregun61;
	}

	public JRadioButton getPregun62() {
		return Pregun62;
	}

	public void setPregun62(JRadioButton pregun62) {
		Pregun62 = pregun62;
	}

	public JRadioButton getPregun63() {
		return Pregun63;
	}

	public void setPregun63(JRadioButton pregun63) {
		Pregun63 = pregun63;
	}

	public JRadioButton getPregun64() {
		return Pregun64;
	}

	public void setPregun64(JRadioButton pregun64) {
		Pregun64 = pregun64;
	}

	public JRadioButton getPregun65() {
		return Pregun65;
	}

	public void setPregun65(JRadioButton pregun65) {
		Pregun65 = pregun65;
	}

	public JRadioButton getPregun66() {
		return Pregun66;
	}

	public void setPregun66(JRadioButton pregun66) {
		Pregun66 = pregun66;
	}

	public JRadioButton getPregun67() {
		return Pregun67;
	}

	public void setPregun67(JRadioButton pregun67) {
		Pregun67 = pregun67;
	}

	public JRadioButton getPregun68() {
		return Pregun68;
	}

	public void setPregun68(JRadioButton pregun68) {
		Pregun68 = pregun68;
	}

	public JRadioButton getPregun69() {
		return Pregun69;
	}

	public void setPregun69(JRadioButton pregun69) {
		Pregun69 = pregun69;
	}

	public JRadioButton getPregun70() {
		return Pregun70;
	}

	public void setPregun70(JRadioButton pregun70) {
		Pregun70 = pregun70;
	}

	public JRadioButton getPregun71() {
		return Pregun71;
	}

	public void setPregun71(JRadioButton pregun71) {
		Pregun71 = pregun71;
	}

	public JRadioButton getPregun72() {
		return Pregun72;
	}

	public void setPregun72(JRadioButton pregun72) {
		Pregun72 = pregun72;
	}

	public JRadioButton getPregun73() {
		return Pregun73;
	}

	public void setPregun73(JRadioButton pregun73) {
		Pregun73 = pregun73;
	}

	public JRadioButton getPregun74() {
		return Pregun74;
	}

	public void setPregun74(JRadioButton pregun74) {
		Pregun74 = pregun74;
	}

	public JRadioButton getPregun75() {
		return Pregun75;
	}

	public void setPregun75(JRadioButton pregun75) {
		Pregun75 = pregun75;
	}

	public JRadioButton getPregun76() {
		return Pregun76;
	}

	public void setPregun76(JRadioButton pregun76) {
		Pregun76 = pregun76;
	}

	public JRadioButton getPregun77() {
		return Pregun77;
	}

	public void setPregun77(JRadioButton pregun77) {
		Pregun77 = pregun77;
	}

	public JRadioButton getPregun78() {
		return Pregun78;
	}

	public void setPregun78(JRadioButton pregun78) {
		Pregun78 = pregun78;
	}

	public JRadioButton getPregun79() {
		return Pregun79;
	}

	public void setPregun79(JRadioButton pregun79) {
		Pregun79 = pregun79;
	}

	public JRadioButton getPregun80() {
		return Pregun80;
	}

	public void setPregun80(JRadioButton pregun80) {
		Pregun80 = pregun80;
	}

	public JRadioButton getPregu61() {
		return Pregu61;
	}

	public void setPregu61(JRadioButton pregu61) {
		Pregu61 = pregu61;
	}

	public JRadioButton getPregu62() {
		return Pregu62;
	}

	public void setPregu62(JRadioButton pregu62) {
		Pregu62 = pregu62;
	}

	public JRadioButton getPregu63() {
		return Pregu63;
	}

	public void setPregu63(JRadioButton pregu63) {
		Pregu63 = pregu63;
	}

	public JRadioButton getPregu64() {
		return Pregu64;
	}

	public void setPregu64(JRadioButton pregu64) {
		Pregu64 = pregu64;
	}

	public JRadioButton getPregu65() {
		return Pregu65;
	}

	public void setPregu65(JRadioButton pregu65) {
		Pregu65 = pregu65;
	}

	public JRadioButton getPregu66() {
		return Pregu66;
	}

	public void setPregu66(JRadioButton pregu66) {
		Pregu66 = pregu66;
	}

	public JRadioButton getPregu67() {
		return Pregu67;
	}

	public void setPregu67(JRadioButton pregu67) {
		Pregu67 = pregu67;
	}

	public JRadioButton getPregu68() {
		return Pregu68;
	}

	public void setPregu68(JRadioButton pregu68) {
		Pregu68 = pregu68;
	}

	public JRadioButton getPregu69() {
		return Pregu69;
	}

	public void setPregu69(JRadioButton pregu69) {
		Pregu69 = pregu69;
	}

	public JRadioButton getPregu70() {
		return Pregu70;
	}

	public void setPregu70(JRadioButton pregu70) {
		Pregu70 = pregu70;
	}

	public JRadioButton getPregu71() {
		return Pregu71;
	}

	public void setPregu71(JRadioButton pregu71) {
		Pregu71 = pregu71;
	}

	public JRadioButton getPregu72() {
		return Pregu72;
	}

	public void setPregu72(JRadioButton pregu72) {
		Pregu72 = pregu72;
	}

	public JRadioButton getPregu73() {
		return Pregu73;
	}

	public void setPregu73(JRadioButton pregu73) {
		Pregu73 = pregu73;
	}

	public JRadioButton getPregu74() {
		return Pregu74;
	}

	public void setPregu74(JRadioButton pregu74) {
		Pregu74 = pregu74;
	}

	public JRadioButton getPregu75() {
		return Pregu75;
	}

	public void setPregu75(JRadioButton pregu75) {
		Pregu75 = pregu75;
	}

	public JRadioButton getPregu76() {
		return Pregu76;
	}

	public void setPregu76(JRadioButton pregu76) {
		Pregu76 = pregu76;
	}

	public JRadioButton getPregu77() {
		return Pregu77;
	}

	public void setPregu77(JRadioButton pregu77) {
		Pregu77 = pregu77;
	}

	public JRadioButton getPregu78() {
		return Pregu78;
	}

	public void setPregu78(JRadioButton pregu78) {
		Pregu78 = pregu78;
	}

	public JRadioButton getPregu79() {
		return Pregu79;
	}

	public void setPregu79(JRadioButton pregu79) {
		Pregu79 = pregu79;
	}

	public JRadioButton getPregu80() {
		return Pregu80;
	}

	public void setPregu80(JRadioButton pregu80) {
		Pregu80 = pregu80;
	}

	public JRadioButton getPregun81() {
		return Pregun81;
	}

	public void setPregun81(JRadioButton pregun81) {
		Pregun81 = pregun81;
	}

	public JRadioButton getPregun82() {
		return Pregun82;
	}

	public void setPregun82(JRadioButton pregun82) {
		Pregun82 = pregun82;
	}

	public JRadioButton getPregun83() {
		return Pregun83;
	}

	public void setPregun83(JRadioButton pregun83) {
		Pregun83 = pregun83;
	}

	public JRadioButton getPregun84() {
		return Pregun84;
	}

	public void setPregun84(JRadioButton pregun84) {
		Pregun84 = pregun84;
	}

	public JRadioButton getPregun85() {
		return Pregun85;
	}

	public void setPregun85(JRadioButton pregun85) {
		Pregun85 = pregun85;
	}

	public JRadioButton getPregun86() {
		return Pregun86;
	}

	public void setPregun86(JRadioButton pregun86) {
		Pregun86 = pregun86;
	}

	public JRadioButton getPregun87() {
		return Pregun87;
	}

	public void setPregun87(JRadioButton pregun87) {
		Pregun87 = pregun87;
	}

	public JRadioButton getPregun88() {
		return Pregun88;
	}

	public void setPregun88(JRadioButton pregun88) {
		Pregun88 = pregun88;
	}

	public JRadioButton getPregun89() {
		return Pregun89;
	}

	public void setPregun89(JRadioButton pregun89) {
		Pregun89 = pregun89;
	}

	public JRadioButton getPregun90() {
		return Pregun90;
	}

	public void setPregun90(JRadioButton pregun90) {
		Pregun90 = pregun90;
	}

	public JRadioButton getPregun91() {
		return Pregun91;
	}

	public void setPregun91(JRadioButton pregun91) {
		Pregun91 = pregun91;
	}

	public JRadioButton getPregun92() {
		return Pregun92;
	}

	public void setPregun92(JRadioButton pregun92) {
		Pregun92 = pregun92;
	}

	public JRadioButton getPregun93() {
		return Pregun93;
	}

	public void setPregun93(JRadioButton pregun93) {
		Pregun93 = pregun93;
	}

	public JRadioButton getPregun94() {
		return Pregun94;
	}

	public void setPregun94(JRadioButton pregun94) {
		Pregun94 = pregun94;
	}

	public JRadioButton getPregun95() {
		return Pregun95;
	}

	public void setPregun95(JRadioButton pregun95) {
		Pregun95 = pregun95;
	}

	public JRadioButton getPregun96() {
		return Pregun96;
	}

	public void setPregun96(JRadioButton pregun96) {
		Pregun96 = pregun96;
	}

	public JRadioButton getPregun97() {
		return Pregun97;
	}

	public void setPregun97(JRadioButton pregun97) {
		Pregun97 = pregun97;
	}

	public JRadioButton getPregun98() {
		return Pregun98;
	}

	public void setPregun98(JRadioButton pregun98) {
		Pregun98 = pregun98;
	}

	public JRadioButton getPregu81() {
		return Pregu81;
	}

	public void setPregu81(JRadioButton pregu81) {
		Pregu81 = pregu81;
	}

	public JRadioButton getPregu82() {
		return Pregu82;
	}

	public void setPregu82(JRadioButton pregu82) {
		Pregu82 = pregu82;
	}

	public JRadioButton getPregu83() {
		return Pregu83;
	}

	public void setPregu83(JRadioButton pregu83) {
		Pregu83 = pregu83;
	}

	public JRadioButton getPregu84() {
		return Pregu84;
	}

	public void setPregu84(JRadioButton pregu84) {
		Pregu84 = pregu84;
	}

	public JRadioButton getPregu85() {
		return Pregu85;
	}

	public void setPregu85(JRadioButton pregu85) {
		Pregu85 = pregu85;
	}

	public JRadioButton getPregu86() {
		return Pregu86;
	}

	public void setPregu86(JRadioButton pregu86) {
		Pregu86 = pregu86;
	}

	public JRadioButton getPregu87() {
		return Pregu87;
	}

	public void setPregu87(JRadioButton pregu87) {
		Pregu87 = pregu87;
	}

	public JRadioButton getPregu88() {
		return Pregu88;
	}

	public void setPregu88(JRadioButton pregu88) {
		Pregu88 = pregu88;
	}

	public JRadioButton getPregu89() {
		return Pregu89;
	}

	public void setPregu89(JRadioButton pregu89) {
		Pregu89 = pregu89;
	}

	public JRadioButton getPregu90() {
		return Pregu90;
	}

	public void setPregu90(JRadioButton pregu90) {
		Pregu90 = pregu90;
	}

	public JRadioButton getPregu91() {
		return Pregu91;
	}

	public void setPregu91(JRadioButton pregu91) {
		Pregu91 = pregu91;
	}

	public JRadioButton getPregu92() {
		return Pregu92;
	}

	public void setPregu92(JRadioButton pregu92) {
		Pregu92 = pregu92;
	}

	public JRadioButton getPregu93() {
		return Pregu93;
	}

	public void setPregu93(JRadioButton pregu93) {
		Pregu93 = pregu93;
	}

	public JRadioButton getPregu94() {
		return Pregu94;
	}

	public void setPregu94(JRadioButton pregu94) {
		Pregu94 = pregu94;
	}

	public JRadioButton getPregu95() {
		return Pregu95;
	}

	public void setPregu95(JRadioButton pregu95) {
		Pregu95 = pregu95;
	}

	public JRadioButton getPregu96() {
		return Pregu96;
	}

	public void setPregu96(JRadioButton pregu96) {
		Pregu96 = pregu96;
	}

	public JRadioButton getPregu97() {
		return Pregu97;
	}

	public void setPregu97(JRadioButton pregu97) {
		Pregu97 = pregu97;
	}

	public JRadioButton getPregu98() {
		return Pregu98;
	}

	public void setPregu98(JRadioButton pregu98) {
		Pregu98 = pregu98;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
