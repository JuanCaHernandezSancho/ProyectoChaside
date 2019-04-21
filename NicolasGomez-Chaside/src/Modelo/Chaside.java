package Modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Chaside {

	protected Aptitudes aptitudes;
	protected Intereses intereses;
	private int C;
	private int H;
	private int A;
	private int S;
	private int I;
	private int D;
	private int E;
	private int CC;
	private int HH;
	private int AA;
	private int SS;
	private int II;
	private int DD;
	private int EE;
	private String mayorIntereses;
	private String mayorAptitudes;
	private int mayorInte;
	private int mayorApti;
	
	public Chaside() {
		
		aptitudes = new Aptitudes();
		intereses = new Intereses();
		C = 0;
		H = 0;
		A = 0;
		S = 0;
		I = 0;
		D = 0;
		E = 0;
		CC = 0;
		HH = 0;
		AA = 0;
		SS = 0;
		II = 0;
		DD = 0;
		EE = 0;
		mayorIntereses = null;
		mayorAptitudes = null;			
	}
	
	public void calcularPreguntas() {
		
		int U = 0;
		boolean t = false;
		String i = null;
		while(U!=98) {
		U++;
		switch(U) {
		case 1:{
			
		JOptionPane.showMessageDialog(null, "Bienvenido al test vocacional.\nPor favor responde éste test con -si- o -no-\nDale aceptar para comenzar", "Test", JOptionPane.INFORMATION_MESSAGE);
			
		i = JOptionPane.showInputDialog("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?");
		
		if(i.equalsIgnoreCase("si") == true) {
			
			t = true;
			if(t == true) {
				C++;
			}
		}
		
		break;
		}
		case 2:{
		JOptionPane.showInputDialog("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?");
		
		if(i.equalsIgnoreCase("si") == true) {
			
			t = true;
			if(t == true) {
				CC++;
			}
		}
		
		break;
		}
		
		case 3:{
			i = JOptionPane.showInputDialog("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 4:{
			i = JOptionPane.showInputDialog("4 ¿A una frustración siempre opones un pensamiento positivo?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					SS++;
				}
			}
			
			break;
			}
		case 5:{
			i = JOptionPane.showInputDialog("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 6:{
			i = JOptionPane.showInputDialog("6 ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 7:{
			i = JOptionPane.showInputDialog("7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					EE++;
				}
			}
			
			break;
			}
		case 8:{
			i = JOptionPane.showInputDialog("8 ¿Escuchas atentamente los problemas que te plantean tus amigos?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 9:{
			i = JOptionPane.showInputDialog("9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?");
			
			if(i.equalsIgnoreCase("si") == true) {
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 10:{
			i = JOptionPane.showInputDialog("10 ¿Eres exigente y crítico con tu equipo de trabajo?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					II++;
				}
			}
			
			break;
			}
		case 11:{
			i = JOptionPane.showInputDialog("11 ¿Te atrae armar rompecabezas o puzzles?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 12:{
			i = JOptionPane.showInputDialog("12 ¿Puedes establecer la diferencia conceptual entre macroeconomía y microeconomía?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 13:{
			i = JOptionPane.showInputDialog("13 ¿Usar uniforme te hace sentir distinto, importante?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					DD++;
				}
			}
			
			break;
			}
		case 14:{
			i = JOptionPane.showInputDialog("14 ¿Participarías como profesional en un espectáculo de acrobacia aérea?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 15:{
			i = JOptionPane.showInputDialog("15 ¿Organizas tu dinero de manera que te alcance hasta el próximo cobro?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					CC++;
				}
			}
			
			break;
			}
		case 16:{
			i = JOptionPane.showInputDialog("16 ¿Convences fácilmente a otras personas sobre la validez de tus argumentos?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 17:{
			i = JOptionPane.showInputDialog("17 ¿Estás informado sobre los nuevos descubrimientos que se están realizando sobre la Teoría del Big-Bang?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 18:{
			i = JOptionPane.showInputDialog("18 ¿Ante una situación de emergencia actúas rápidamente?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					DD++;
				}
			}
			
			break;
			}
		case 19:{
			i = JOptionPane.showInputDialog("19 ¿Cuando tienes que resolver un problema matemático, perseveras hasta encontrar la solución?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		
		case 20:{
			i = JOptionPane.showInputDialog("20 ¿Si te convocara tu club preferido para planificar, organizar y dirigir un campo de deportes, aceptarías?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 21:{
			i = JOptionPane.showInputDialog("21 ¿Eres el que pone un toque de alegría en las fiestas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 22:{
			i = JOptionPane.showInputDialog("22 ¿Crees que los detalles son tan importantes como el todo?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					AA++;
				}
			}
			
			break;
			}
		case 23:{
			i = JOptionPane.showInputDialog("23 ¿Te sentirías a gusto trabajando en un ámbito hospitalario?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 24:{
			i = JOptionPane.showInputDialog("24 ¿Te gustaría participar para mantener el orden ante grandes desórdenes y	cataclismos?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 25:{
			i = JOptionPane.showInputDialog("25 ¿Pasarías varias horas leyendo algún libro de tu interés?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 26:{
			i = JOptionPane.showInputDialog("26 ¿Planificas detalladamente tus trabajos antes de empezar?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					II++;
				}
			}
			
			break;
			}
		case 27:{
			i = JOptionPane.showInputDialog("27 ¿Entablas una relación casi personal con tu computadora?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 28:{
			i = JOptionPane.showInputDialog("28 ¿Disfrutas modelando con arcilla?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 29:{
			i = JOptionPane.showInputDialog("29 ¿Ayudas habitualmente a los no videntes a cruzar la calle?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					SS++;
				}
			}
			
			break;
			}
		case 30:{
			i = JOptionPane.showInputDialog("30 ¿Consideras importante que desde la escuela primaria se fomente la actitud crítica y la participación activa?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					HH++;
				}
			}
			
			break;
			}
		case 31:{
			i = JOptionPane.showInputDialog("31 ¿Aceptarías que las mujeres formaran parte de las fuerzas armadas bajo las mismas normas que los hombres?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 32:{
			i = JOptionPane.showInputDialog("32 ¿Te gustaría crear nuevas técnicas para descubrir las patologías de algunas enfermedades a través del microscopio?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 33:{
			i = JOptionPane.showInputDialog("33 ¿Participarías en una campaña de prevención contra la enfermedad de Chagas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 34:{
			i = JOptionPane.showInputDialog("34 ¿Te interesan los temas relacionados al pasado y a la evolución del hombre?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 35:{
			i = JOptionPane.showInputDialog("35 ¿Te incluirías en un proyecto de investigación de los movimientos sísmicos y sus consecuencias?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 36:{
			i = JOptionPane.showInputDialog("36 ¿Fuera de los horarios escolares, dedicas algún día de la semana a la realización de actividades corporales?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 37:{
			i = JOptionPane.showInputDialog("37 ¿Te interesan las actividades de mucha acción y de reacción rápida en situaciones imprevistas y de peligro?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 38:{
			i = JOptionPane.showInputDialog("38 ¿Te ofrecerías para colaborar como voluntario en los gabinetes espaciales dela NASA?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 39:{
			i = JOptionPane.showInputDialog("39 ¿Te gusta más el trabajo manual que el trabajo intelectual?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					AA++;
				}
			}
			
			break;
			}
		case 40:{
			i = JOptionPane.showInputDialog("40 ¿Estarías dispuesto a renunciar a un momento placentero para ofrecer tu servicio como profesional?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					SS++;
				}
			}
			
			break;
			}	
		case 41:{
			i = JOptionPane.showInputDialog("41 ¿Participarías de una investigación sobre la violencia en el fútbol?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 42:{
			i = JOptionPane.showInputDialog("42 ¿Te gustaría trabajar en un laboratorio mientras estudias?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 43:{
			i = JOptionPane.showInputDialog("43 ¿Arriesgarías tu vida para salvar la vida de otro que no conoces?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					DD++;
				}
			}
			
			break;
			}
		case 44:{
			i = JOptionPane.showInputDialog("44 ¿Te agradaría hacer un curso de primeros auxilios?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 45:{
			i = JOptionPane.showInputDialog("45 ¿Tolerarías empezar tantas veces como fuere necesario hasta obtener el logro deseado?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 46:{
			i = JOptionPane.showInputDialog("46 ¿Distribuyes tus horarios del día adecuadamente para poder hacer todo lo planeado?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					CC++;
				}
			}
			
			break;
			}
		case 47:{
			i = JOptionPane.showInputDialog("47 ¿Harías un curso para aprender a fabricar los instrumentos y/o piezas de las máquinas o aparatos con que trabajas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 48:{
			i = JOptionPane.showInputDialog("48 ¿Elegirías una profesión en la tuvieras que estar algunos meses alejado de tu familia, por ejemplo el marino?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 49:{
			i = JOptionPane.showInputDialog("49 ¿Te radicarías en una zona agrícola-ganadera para desarrollar tus actividades como profesional?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			break;
			}
		case 50:{
			i = JOptionPane.showInputDialog("50 ¿Cuando estás en un grupo trabajando, te entusiasma producir ideas originales y que sean tenidas en cuenta?");
		
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					
					A++;
				}
			}
			break;
		}
		case 51:{
			i = JOptionPane.showInputDialog("51 ¿Te resulta fácil coordinar un grupo de trabajo?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					CC++;
					A++;
				}
			}
			
			break;
			}
		case 52:{
			i = JOptionPane.showInputDialog("52 ¿Te resultó interesante el estudio de las ciencias biológicas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 53:{
			i = JOptionPane.showInputDialog("53 ¿Si una gran empresa solicita un profesional como gerente de comercialización, te sentirías a gusto desempeñando ese rol?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 54:{
			i = JOptionPane.showInputDialog("54 ¿Te incluirías en un proyecto nacional de desarrollo de la principal fuente de recursos de tu provincia?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 55:{
			i = JOptionPane.showInputDialog("55 ¿Tenés interés por saber cuales son las causas que determinan ciertos fenómenos, aunque saberlo no altere tu vida?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					EE++;
				}
			}
			
			break;
			}
		case 56:{
			i = JOptionPane.showInputDialog("56 ¿Descubriste algún filósofo o escritor que haya expresado tus mismas ideas con antelación?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 57:{
			i = JOptionPane.showInputDialog("57 ¿Desearías que te regalen algún instrumento musical para tu cumpleaños?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 58:{
			i = JOptionPane.showInputDialog("58 ¿Aceptarías colaborar con el cumplimiento de las normas en lugares públicos?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 59:{
			i = JOptionPane.showInputDialog("59 ¿Crees que tus ideas son importantes, y haces todo lo posible para ponerlas en práctica?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					II++;
				}
			}
			
			break;
			}
		case 60:{
			i = JOptionPane.showInputDialog("60 ¿Cuando se descompone un artefacto en tu casa, te dispones prontamente a repararlo?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 61:{
			i = JOptionPane.showInputDialog("61 ¿Formarías parte de un equipo de trabajo orientado a la preservación de la flora y la fauna en extinción?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 62:{
			i = JOptionPane.showInputDialog("62 ¿Acostumbras a leer revistas relacionadas con los últimos avance s científicos y tecnológicos en el área de la salud?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 63:{
			i = JOptionPane.showInputDialog("63 ¿Preservar las raíces culturales de nuestro país, te parece importante y necesario?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					HH++;
				}
			}
			
			break;
			}
		case 64:{
			i = JOptionPane.showInputDialog("64 ¿Te gustaría realizar una investigación que contribuyera a hacer más justa la distribución de la riqueza?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 65:{
			i = JOptionPane.showInputDialog("65 ¿Te gustaría realizar tareas auxiliares en una nave, como por ejemplo izado y arriado de velas, pintura y conservación del casco, arreglo de averías, conservación de motores, etc?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 66:{
			i = JOptionPane.showInputDialog("66 ¿Crees que un país debe poseer la más alta tecnología armamentista, a cualquier precio?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					DD++;
				}
			}
			
			break;
			}
		case 67:{
			i = JOptionPane.showInputDialog("67 ¿La libertad y la justicia son valores fundamentales en tu vida?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 68:{
			i = JOptionPane.showInputDialog("68 ¿Aceptarías hacer una práctica rentada en una industria de productos alimenticios en el sector de control de calidad?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
		}
		case 69:{
			i = JOptionPane.showInputDialog("69 ¿Consideras que la salud pública debe ser prioritaria, gratuita y eficiente para	todos?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					SS++;
				}
			}
			
			break;
			}
		case 70:{
			i = JOptionPane.showInputDialog("70 ¿Te interesaría investigar sobre alguna nueva vacuna?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
		}
		case 71:{
			i = JOptionPane.showInputDialog("71 ¿En un equipo de trabajo, preferís el rol de coordinador?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 72:{
			i = JOptionPane.showInputDialog("72 ¿En una discusión entre amigos, te ofreces como mediador?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					HH++;
				}
			}
			
			break;
			}
		case 73:{
			i = JOptionPane.showInputDialog("73 ¿Estás de acuerdo con la formación de un cuerpo de soldados profesionales?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 74:{
			i = JOptionPane.showInputDialog("74 ¿Lucharías por una causa justa hasta las últimas consecuencias?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 75:{
			i = JOptionPane.showInputDialog("75 ¿Te gustaría investigar científicamente sobre cultivos agrícolas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 76:{
			i = JOptionPane.showInputDialog("76 ¿Harías un nuevo diseño de una prenda pasada de moda, ante una reunión imprevista?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					AA++;
				}
			}
			
			break;
			}
		case 77:{
			i = JOptionPane.showInputDialog("77 ¿Visitarías un observatorio astronómico para conocer en acción el funcionamiento de los aparatos?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 78:{
			i = JOptionPane.showInputDialog("78 ¿Dirigirías el área de importación y exportación de una empresa?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 79:{
			i = JOptionPane.showInputDialog("79 ¿Te inhibís al entrar a un lugar nuevo con gente desconocida?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 80:{
			i = JOptionPane.showInputDialog("80 ¿Te gratificaría el trabajar con niños?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 81:{
			i = JOptionPane.showInputDialog("81 ¿Harías el diseño de un afiche para una campaña contra el sida?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 82:{
			i = JOptionPane.showInputDialog("82 ¿Dirigirías un grupo de teatro independiente?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					AA++;
				}
			}
			
			break;
			}
		case 83:{
			i = JOptionPane.showInputDialog("83 ¿Enviarías tu currículum a una empresa automotriz que solicita gerente para su área de producción?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 84:{
			i = JOptionPane.showInputDialog("84 ¿Participarías en un grupo de defensa internacional dentro de alguna fuerza armada?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					D++;
				}
			}
			
			break;
			}
		case 85:{
			i = JOptionPane.showInputDialog("85 ¿Te costearías tus estudios trabajando en una auditoría?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 86:{
			i = JOptionPane.showInputDialog("86 ¿Eres de los que defiendes causas perdidas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					HH++;
				}
			}
			
			break;
			}
		case 87:{
			i = JOptionPane.showInputDialog("87 ¿Ante una emergencia epidémica participarías en una campaña brindando tu ayuda?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 88:{
			i = JOptionPane.showInputDialog("88 ¿Sabrías responder que significa ADN y ARN?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 89:{
			i = JOptionPane.showInputDialog("89 ¿Elegirías una carrera cuyo instrumento de trabajo fuere la utilización de un idioma extranjero?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 90:{
			i = JOptionPane.showInputDialog("90 ¿Trabajar con objetos te resulta más gratificante que trabajar con personas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					II++;
				}
			}
			
			break;
			}
		case 91:{
			i = JOptionPane.showInputDialog("91 ¿Te resultaría gratificante ser asesor contable en una empresa reconocida?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			break;
			}
		case 92:{
			i = JOptionPane.showInputDialog("92 ¿Ante un llamado solidario, te ofrecerías para cuidar a un enfermo?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					S++;
				}
			}
			
			break;
			}
		case 93:{
			i = JOptionPane.showInputDialog("93 ¿Te atrae investigar sobre los misterios del universo, por ejemplo los agujeros negros?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					E++;
				}
			}
			
			break;
			}
		case 94:{
			i = JOptionPane.showInputDialog("94 ¿El trabajo individual te resulta más rápido y efectivo que el trabajo grupal?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					EE++;
				}
			}
			
			break;
			}
		case 95:{
			i = JOptionPane.showInputDialog("95 ¿Dedicarías parte de tu tiempo a ayudar a personas de zonas carenciadas?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					H++;
				}
			}
			
			break;
			}
		case 96:{
			i = JOptionPane.showInputDialog("96 ¿Cuando elegís tu ropa o decoras un ambiente, tienes en cuenta la combinación de los colores, las telas o el estilo de los muebles?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					A++;
				}
			}
			
			break;
			}
		case 97:{
			i = JOptionPane.showInputDialog("97 ¿Te gustaría trabajar como profesional dirigiendo la construcción de una empresa hidroeléctrica?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					I++;
				}
			}
			
			break;
			}
		case 98:{
			i = JOptionPane.showInputDialog("98 ¿Sabes qué es el PBI?");
			
			if(i.equalsIgnoreCase("si") == true) {
				
				t = true;
				if(t == true) {
					C++;
				}
			}
			
			JOptionPane.showMessageDialog(null, "Los resultados se veran a continuarcion", "Final", JOptionPane.INFORMATION_MESSAGE);
			break;
			}		
		}
		}	
	}
	
	public String getInteresMayor() {
		
		List<Integer> interesesMayor = new ArrayList<Integer>();
		
		interesesMayor.add(C);
		interesesMayor.add(H);
		interesesMayor.add(A);
		interesesMayor.add(S);
		interesesMayor.add(I);
		interesesMayor.add(D);
		interesesMayor.add(E);
			
		for (int i = 0; i < interesesMayor.size(); i++) {
			
			if(interesesMayor.get(i)>mayorInte) {
				
				mayorInte = interesesMayor.get(i);	
			}
			
			if(mayorInte == interesesMayor.get(0)) {
				
				mayorIntereses = "Tus intereses son: C – Administrativas y Contables: " + intereses.C_Intereses; 
			}

			if(mayorInte == interesesMayor.get(1)) {
				
				mayorIntereses = "Tus intereses son: H – Humanísticas y Sociales: " + intereses.H_Intereses; 
				
			}

			if(mayorInte == interesesMayor.get(2)) {
				
				mayorIntereses = "Tus intereses son: A - Artísticas: " + intereses.A_Intereses; 
				
			}

			if(mayorInte == interesesMayor.get(3)) {
				
				mayorIntereses = "Tus intereses son: S  – Medicina y Cs. De la Salud: " + intereses.S_Intereses; 
				
			}

			if(mayorInte == interesesMayor.get(4)) {
				
				mayorIntereses = "Tus intereses son: I  – Ingeniería y Computación: " + intereses.I_Intereses; 
				
			}

			if(mayorInte == interesesMayor.get(5)) {
				
				mayorIntereses = "Tus intereses son: D - Defensa y Seguridad: " + intereses.D_Intereses; 
				
			}

			if(mayorInte == interesesMayor.get(6)) {
				
				mayorIntereses = "Tus intereses son: E - Ciencias Exactas y Agrarias: " + intereses.E_Intereses; 
				
			}
			
			if(mayorInte == 0) {
				
				mayorIntereses = "Ninguna respuesta fue afirmativa, Por default los interes son: C – Administrativas y Contables: " + intereses.C_Intereses; 
				
			}
			
		}

		return mayorIntereses;
	}
	
	public String getAptitudesMayor() {
		
		List<Integer> aptitudesMayor = new ArrayList<Integer>();
		
		aptitudesMayor.add(CC);
		aptitudesMayor.add(HH);
		aptitudesMayor.add(AA);
		aptitudesMayor.add(SS);
		aptitudesMayor.add(II);
		aptitudesMayor.add(DD);
		aptitudesMayor.add(EE);
			
		for (int i = 0; i < aptitudesMayor.size(); i++) {
			
			if(aptitudesMayor.get(i)>mayorApti) {
				
				mayorApti = aptitudesMayor.get(i);	
			}
			
			if(mayorApti == aptitudesMayor.get(0)) {
				
				mayorAptitudes = "Tus Aptitudes son: C – Administrativas y Contables: " + aptitudes.C_Aptitudes; 
			}

			if(mayorApti == aptitudesMayor.get(1)) {
				
				mayorAptitudes = "Tus Aptitudes son: H – Humanísticas y Sociales: " + aptitudes.H_Aptitudes; 
				
			}

			if(mayorApti == aptitudesMayor.get(2)) {
				
				mayorAptitudes = "Tus Aptitudes son: A - Artísticas: " + aptitudes.A_Aptitudes; 
				
			}

			if(mayorApti == aptitudesMayor.get(3)) {
				
				mayorAptitudes = "Tus Aptitudes son: S  – Medicina y Cs. De la Salud: " + aptitudes.S_Aptitudes; 
				
			}

			if(mayorApti == aptitudesMayor.get(4)) {
				
				mayorAptitudes = "Tus Aptitudes son: I  – Ingeniería y Computación: " + aptitudes.I_Aptitudes; 
				
			}

			if(mayorApti == aptitudesMayor.get(5)) {
				
				mayorAptitudes = "Tus Aptitudes son: D - Defensa y Seguridad: " + aptitudes.D_Aptitudes;
				
			}

			if(mayorApti == aptitudesMayor.get(6)) {
				
				mayorAptitudes = "Tus Aptitudes son: E - Ciencias Exactas y Agrarias: " + aptitudes.E_Aptitudes; 
				
			}
			
			if(mayorApti == 0) {
				
				mayorAptitudes = "Ninguna respuesta fue afirmativa, por default las aptitudes son: C – Administrativas y Contables: " + aptitudes.C_Aptitudes;
				
			}
			
		}

		return mayorAptitudes;
	}
	
	public String finalChaside() {
		
		String chaside = "Test Terminado, Resultados: " + "\n" + getInteresMayor() + "\n" + getAptitudesMayor();
		return chaside;
	}
	
	public Intereses getIntereses() {
		
		return intereses;
	}
	
	public Aptitudes getAptitudes() {
		
		return aptitudes;
	}
	
}
