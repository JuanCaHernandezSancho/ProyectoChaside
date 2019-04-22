package Vista;
import java.awt.Color;
import java.awt.font.*;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class PanelPreguntas extends JPanel{

	public int getIntC() {
		return intC;
	}

	public void setIntC(int intC) {
		this.intC = intC;
	}

	public int getIntH() {
		return intH;
	}

	public void setIntH(int intH) {
		this.intH = intH;
	}

	public int getIntA() {
		return intA;
	}

	public void setIntA(int intA) {
		this.intA = intA;
	}

	public int getIntS() {
		return intS;
	}

	public void setIntS(int intS) {
		this.intS = intS;
	}

	public int getIntI() {
		return intI;
	}

	public void setIntI(int intI) {
		this.intI = intI;
	}

	public int getIntE() {
		return intE;
	}

	public void setIntE(int intE) {
		this.intE = intE;
	}

	public int getIntD() {
		return intD;
	}

	public void setIntD(int intD) {
		this.intD = intD;
	}

	public int getAptC() {
		return aptC;
	}

	public void setAptC(int aptC) {
		this.aptC = aptC;
	}

	public int getAptH() {
		return aptH;
	}

	public void setAptH(int aptH) {
		this.aptH = aptH;
	}

	public int getAptA() {
		return aptA;
	}

	public void setAptA(int aptA) {
		this.aptA = aptA;
	}

	public int getAptS() {
		return aptS;
	}

	public void setAptS(int aptS) {
		this.aptS = aptS;
	}

	public int getAptI() {
		return aptI;
	}

	public void setAptI(int aptI) {
		this.aptI = aptI;
	}

	public int getAptD() {
		return aptD;
	}

	public void setAptD(int aptD) {
		this.aptD = aptD;
	}

	public int getAptE() {
		return aptE;
	}

	public void setAptE(int aptE) {
		this.aptE = aptE;
	}

	private static final long serialVersionUID = 1L;
	
	private JLabel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	private JLabel p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30;
	private JLabel p31,p32,p33,p34,p35,p36,p37,p38,p39,p40,p41,p42,p43,p44,p45,p46,p47,p48,p49,p50;
	private JLabel p51,p52,p53,p54,p55,p56,p57,p58,p59,p60,p61,p62,p63,p64,p65,p66,p67,p68,p69,p70;
	private JLabel p71,p72,p73,p74,p75,p76,p77,p78,p79,p80,p81,p82,p83,p84,p85,p86,p87,p88,p89,p90;
	private JLabel p91,p92,p93,p94,p95,p96,p97,p98;

	private JRadioButton s1,n1,s2,n2,s3,n3,s4,n4,s5,n5,s6,n6,s7,n7,s8,n8,s9,n9,s10,n10,s11,n11,s12,n12,s13,n13,s14,n14,s15,n15;
	private JRadioButton s16,n16,s17,n17,s18,n18,s19,n19,s20,n20,s21,n21,s22,n22,s23,n23,s24,n24,s25,n25,s26,n26,s27,n27,s28,n28,s29,n29,s30, n30;
	private JRadioButton s31,n31,s32,n32,s33,n33,s34,n34,s35,n35,s36,n36,s37,n37,s38,n38,s39,n39,s40,n40,s41,n41,s42,n42,s43,n43,s44,n44,s45,n45;
	private JRadioButton s46,n46,s47,n47,s48,n48,s49,n49,s50,n50,s51,n51,s52,n52,s53,n53,s54,n54,s55,n55,s56,n56,s57,n57,s58,n58,s59,n59,s60, n60;
	private JRadioButton s61,n61,s62,n62,s63,n63,s64,n64,s65,n65,s66,n66,s67,n67,s68,n68,s69,n69,s70,n70,s71,n71,s72,n72,s73,n73,s74,n74,s75,n75;
	private JRadioButton s76,n76,s77,n77,s78,n78,s79,n79,s80,n80,s81,n81,s82,n82,s83,n83,s84,n84,s85,n85,s86,n86,s87,n87,s88,n88,s89,n89,s90, n90;
	private JRadioButton s91,n91,s92,n92,s93,n93,s94,n94,s95,n95,s96,n96,s97,n97,s98,n98;
	
	private ButtonGroup siyno,siyno2,siyno3,siyno4,siyno5,siyno6,siyno7,siyno8,siyno9,siyno10,siyno11,siyno12,siyno13,siyno14,siyno15;
	private ButtonGroup siyno16,siyno17,siyno18,siyno19,siyno20,siyno21,siyno22,siyno23,siyno24,siyno25,siyno26,siyno27,siyno28,siyno29,siyno30;
	private ButtonGroup siyno31,siyno32,siyno33,siyno34,siyno35,siyno36,siyno37,siyno38,siyno39,siyno40,siyno41,siyno42,siyno43,siyno44,siyno45;
	private ButtonGroup siyno46,siyno47,siyno48,siyno49,siyno50,siyno51,siyno52,siyno53,siyno54,siyno55,siyno56,siyno57,siyno58,siyno59,siyno60;
	private ButtonGroup siyno61,siyno62,siyno63,siyno64,siyno65,siyno66,siyno67,siyno68,siyno69,siyno70,siyno71,siyno72,siyno73,siyno74,siyno75;
	private ButtonGroup siyno76,siyno77,siyno78,siyno79,siyno80,siyno81,siyno82,siyno83,siyno84,siyno85,siyno86,siyno87,siyno88,siyno89,siyno90;
	private ButtonGroup siyno91,siyno92,siyno93,siyno94,siyno95,siyno96,siyno97,siyno98;

	private JButton botonContinuar;
	public static final String CONTINUAR = "Continuar";
	
	private int intC,intH,intA,intS,intI,intE,intD;
	private int aptC,aptH,aptA,aptS,aptI,aptD,aptE;
	
	
	public PanelPreguntas() {
		setLayout(new GridLayout(265,1));
		TitledBorder border = BorderFactory.createTitledBorder("TEST");
		border.setTitleColor (Color.blue);
		setBorder(border);
		
		intC=0;
		intH=0;
		intA=0;
		intS=0;
		intI=0;
		intD=0;
		intE=0;
		
		aptC=0;
		aptH=0;
		aptA=0;
		aptS=0;
		aptI=0;
		aptD=0;
		aptE=0;
		
		p1 = new JLabel("1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?");
		p2 = new JLabel("2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?");
		p3 = new JLabel("3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?");
		p4 = new JLabel("4 ¿A una frustración siempre opones un pensamiento positivo?");
		p5 = new JLabel("5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?");
		p6 = new JLabel("6. ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?");
		p7 = new JLabel("7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?");
		p8 = new JLabel("8 ¿Escuchas atentamente los problemas que te plantean tus amigos?");
		p9 = new JLabel("9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?");
		p10 = new JLabel("10 ¿Eres exigente y crítico con tu equipo de trabajo?");
		p11 = new JLabel("11 ¿Te atrae armar rompecabezas o puzzles?");
		p12 = new JLabel("12 ¿Puedes establecer la diferencia conceptual entre macroeconomía y microeconomía?");
		p13 = new JLabel("13 ¿Usar uniforme te hace sentir distinto, importante?");
		p14 = new JLabel("14 ¿Participarías como profesional en un espectáculo de acrobacia aérea?");
		p15 = new JLabel("15 ¿Organizas tu dinero de manera que te alcance hasta el próximo cobro?");
		p16 = new JLabel("16 ¿Convences fácilmente a otras personas sobre la validez de tus argumentos?");
		p17 = new JLabel("17 ¿Estás informado sobre los nuevos descubrimientos que se están realizando sobre la Teoría del Big-Bang?");
		p18 = new JLabel("18 ¿Ante una situación de emergencia actúas rápidamente?");
		p19 = new JLabel("19 ¿Cuando tienes que resolver un problema matemático, perseveras hasta encontrar la solución?");
		p20 = new JLabel("20 ¿Si te convocara tu club preferido para planificar, organizar y dirigir un campo de deportes, aceptarías?");
		p21 = new JLabel("21 ¿Eres el que pone un toque de alegría en las fiestas?");
		p22 = new JLabel("22 ¿Crees que los detalles son tan importantes como el todo?");
		p23 = new JLabel("23 ¿Te sentirías a gusto trabajando en un ámbito hospitalario?");
		p24 = new JLabel("24 ¿Te gustaría participar para mantener el orden ante grandes desórdenes y cataclismos?");
		p25 = new JLabel("25 ¿Pasarías varias horas leyendo algún libro de tu interés?");
		p26 = new JLabel("26 ¿Planificas detalladamente tus trabajos antes de empezar?");
		p27 = new JLabel("27 ¿Entablas una relación casi personal con tu computadora?");
		p28 = new JLabel("28 ¿Disfrutas modelando con arcilla?");
		p29 = new JLabel("29 ¿Ayudas habitualmente a los no videntes a cruzar la calle?");
		p30 = new JLabel("30 ¿Consideras importante que desde la escuela primaria se fomente la actitud crítica y la participación activa?");
		p31 = new JLabel("31 ¿Aceptarías que las mujeres formaran parte de las fuerzas armadas bajo las mismas normas que los hombres?");
		p32 = new JLabel("32 ¿Te gustaría crear nuevas técnicas para descubrir las patologías de algunas enfermedades a través del microscopio?");
		p33 = new JLabel("33 ¿Participarías en una campaña de prevención contra la enfermedad de Chagas?");
		p34 = new JLabel("34 ¿Te interesan los temas relacionados al pasado y a la evolución del hombre?");
		p35 = new JLabel("35 ¿Te incluirías en un proyecto de investigación de los movimientos sísmicos y sus consecuencias?");
		p36 = new JLabel("36 ¿Fuera de los horarios escolares, dedicas algún día de la semana a la realización de actividades corporales?");
		p37 = new JLabel("37 ¿Te interesan las actividades de mucha acción y de reacción rápida en situaciones imprevistas y de peligro?");
		p38 = new JLabel("38 ¿Te ofrecerías para colaborar como voluntario en los gabinetes espaciales de la NASA?");
		p39 = new JLabel("39 ¿Te gusta más el trabajo manual que el trabajo intelectual?");
		p40 = new JLabel("40 ¿Estarías dispuesto a renunciar a un momento placentero para ofrecer tu servicio como profesional?");
		p41 = new JLabel("41 ¿Participarías de una investigación sobre la violencia en el fútbol?");
		p42 = new JLabel("42 ¿Te gustaría trabajar en un laboratorio mientras estudias? ");
		p43 = new JLabel("43 ¿Arriesgarías tu vida para salvar la vida de otro que no conoces?");
		p44 = new JLabel("44 ¿Te agradaría hacer un curso de primeros auxilios?");
		p45 = new JLabel("45 ¿Tolerarías empezar tantas veces como fuere necesario hasta obtener el logro deseado?");
		p46 = new JLabel("46 ¿Distribuyes tus horarios del día adecuadamente para poder hacer todo lo planeado");
		p47 = new JLabel("47 ¿Harías un curso para aprender a fabricar los instrumentos y/o piezas de las máquinas o aparatos con que trabajas?");
		p48 = new JLabel("48 ¿Elegirías una profesión en la tuvieras que estar algunos meses alejado de tu familia, por ejemplo el marino?");
		p49 = new JLabel("49 ¿Te radicarías en una zona agrícola-ganadera para desarrollar tus actividades como profesional?");
		p50 = new JLabel("50 ¿Cuando estás en un grupo trabajando, te entusiasma producir ideas originales y que sean tenidas en cuenta?");
		p51 = new JLabel("51 ¿Te resulta fácil coordinar un grupo de trabajo?");
		p52 = new JLabel("52 ¿Te resultó interesante el estudio de las ciencias biológicas?");
		p53 = new JLabel("53 ¿Si una gran empresa solicita un profesional como gerente de comercialización, te sentirías a gusto desempeñando ese rol?");
		p54 = new JLabel("54 ¿Te incluirías en un proyecto nacional de desarrollo de la principal fuente de recursos de tu provincia?");
		p55 = new JLabel("55 ¿Tenés interés por saber cuales son las causas que determinan ciertos fenómenos, aunque saberlo no altere tu vida?");
		p56 = new JLabel("56 ¿Descubriste algún filósofo o escritor que haya expresado tus mismas ideas con antelación?");
		p57 = new JLabel("57 ¿Desearías que te regalen algún instrumento musical para tu cumpleaños?");
		p58 = new JLabel("58 ¿Aceptarías colaborar con el cumplimiento de las normas en lugares públicos?");
		p59 = new JLabel("59 ¿Crees que tus ideas son importantes, y haces todo lo posible para ponerla en práctica?");
		p60 = new JLabel("60 ¿Cuando se descompone un artefacto en tu casa, te dispones prontamente a repararlo? ");
		p61 = new JLabel("61 ¿Formarías parte de un equipo de trabajo orientado a la preservación de la flora y la fauna en extinción?");
		p62 = new JLabel("62 ¿Acostumbras a leer revistas relacionadas con los últimos avance s científicos y tecnológicos en el área de la salud?");
		p63 = new JLabel("63 ¿Preservar las raíces culturales de nuestro país, te parece importante y necesario?");
		p64 = new JLabel("64 ¿Te gustaría realizar una investigación que contribuyera a hacer más justa la distribución de la riqueza?");
		p65 = new JLabel("65 ¿Te gustaría realizar tareas auxiliares en una nave, como por ejemplo izado y arriado de velas, pintura y conservación del casco, arreglo de averías, conservación de motores, etc?");
		p66 = new JLabel("66 ¿Crees que un país debe poseer la más alta tecnología armamentista, a cualquier precio?");
		p67 = new JLabel("67 ¿La libertad y la justicia son valores fundamentales en tu vida?");
		p68 = new JLabel("68 ¿Aceptarías hacer una práctica rentada en una industria de productos alimenticios en el sector de control de calidad?");
		p69 = new JLabel("69 ¿Consideras que la salud pública debe ser prioritaria, gratuita y eficiente para todos?");
		p70 = new JLabel("70 ¿Te interesaría investigar sobre alguna nueva vacuna?");
		p71 = new JLabel("71 ¿En un equipo de trabajo, preferís el rol de coordinador?");
		p72 = new JLabel("72 ¿En una discusión entre amigos, te ofreces como mediador?");
		p73 = new JLabel("73 ¿Estás de acuerdo con la formación de un cuerpo de soldados profesionales?");
		p74 = new JLabel("74 ¿Lucharías por una causa justa hasta las últimas consecuencias?");
		p75 = new JLabel("75 ¿Te gustaría investigar científicamente sobre cultivos agrícolas?");
		p76 = new JLabel("76 ¿Harías un nuevo diseño de una prenda pasada de moda, ante una reunión imprevista?");
		p77 = new JLabel("77 ¿Visitarías un observatorio astronómico para conocer en acción el funcionamiento de los aparatos?");
		p78 = new JLabel("78 ¿Dirigirías el área de importación y exportación de una empresa?");
		p79 = new JLabel("79 ¿Te inhibís al entrar a un lugar nuevo con gente desconocida?");
		p80 = new JLabel("80 ¿Te gratificaría el trabajar con niños?");
		p81 = new JLabel("81 ¿Harías el diseño de un afiche para una campaña contra el sida?");
		p82 = new JLabel("82 ¿Dirigirías un grupo de teatro independiente?");
		p83 = new JLabel("83 ¿Enviarías tu currículum a una empresa automotriz que solicita gerente para su área de producción?");
		p84 = new JLabel("84 ¿Participarías en un grupo de defensa internacional dentro de alguna fuerza armada?");
		p85 = new JLabel("85 ¿Te costearías tus estudios trabajando en una auditoría?");
		p86 = new JLabel("86 ¿Eres de los que defiendes causas perdidas?");
		p87 = new JLabel("87 ¿Ante una emergencia epidémica participarías en una campaña brindando tu ayuda?");
		p88 = new JLabel("88 ¿Sabrías responder que significa ADN y ARN?");
		p89 = new JLabel("89 ¿Elegirías una carrera cuyo instrumento de trabajo fuere la utilización de un idioma extranjero?");
		p90 = new JLabel("90 ¿Trabajar con objetos te resulta más gratificante que trabajar con personas?");
		p91 = new JLabel("91 ¿Te resultaría gratificante ser asesor contable en una empresa reconocida?");
		p92 = new JLabel("92 ¿Ante un llamado solidario, te ofrecerías para cuidar a un enfermo?");
		p93 = new JLabel("93 ¿Te atrae investigar sobre los misterios del universo, por ejemplo los agujeros negros?ola");
		p94 = new JLabel("94 ¿El trabajo individual te resulta más rápido y efectivo que el trabajo grupal?");
		p95 = new JLabel("95 ¿Dedicarías parte de tu tiempo a ayudar a personas de zonas carenciadas?");
		p96 = new JLabel("96 ¿Cuando elegís tu ropa o decoras un ambiente, tienes en cuenta la combinación de los colores, las telas o el estilo de los muebles?");
		p97 = new JLabel("97 ¿Te gustaría trabajar como profesional dirigiendo la construcción de una empresa hidroeléctrica?");
		p98 = new JLabel("98 ¿Sabes qué es el PBI?");

		
		s1 = new JRadioButton("Si");
		n1 = new JRadioButton("No");
		siyno =new ButtonGroup();
		siyno.add(s1);
		siyno.add(n1);
		
		s2 = new JRadioButton("Si");
		n2 = new JRadioButton("No");
		siyno2 =new ButtonGroup();
		siyno2.add(s2);
		siyno2.add(n2);
		
		s3 = new JRadioButton("Si");
		n3 = new JRadioButton("No");
		siyno3 =new ButtonGroup();
		siyno3.add(s3);
		siyno3.add(n3);
		
		s4 = new JRadioButton("Si");
		n4 = new JRadioButton("No");
		siyno4 =new ButtonGroup();
		siyno4.add(s4);
		siyno4.add(n4);
		
		s5 = new JRadioButton("Si");
		n5 = new JRadioButton("No");
		siyno5 =new ButtonGroup();
		siyno5.add(s5);
		siyno5.add(n5);
		
		s6 = new JRadioButton("Si");
		n6 = new JRadioButton("No");
		siyno6 =new ButtonGroup();
		siyno6.add(s6);
		siyno6.add(n6);
		
		s7 = new JRadioButton("Si");
		n7 = new JRadioButton("No");
		siyno7 =new ButtonGroup();
		siyno7.add(s7);
		siyno7.add(n7);
		
		s8 = new JRadioButton("Si");
		n8 = new JRadioButton("No");
		siyno8 =new ButtonGroup();
		siyno8.add(s8);
		siyno8.add(n8);
		
		
		s9 = new JRadioButton("Si");
		n9 = new JRadioButton("No");
		siyno9 =new ButtonGroup();
		siyno9.add(s9);
		siyno9.add(n9);
		
		s10 = new JRadioButton("Si");
		n10 = new JRadioButton("No");
		siyno10 =new ButtonGroup();
		siyno10.add(s10);
		siyno10.add(n10);
		
		s11 = new JRadioButton("Si");
		n11 = new JRadioButton("No");
		siyno11 =new ButtonGroup();
		siyno11.add(s11);
		siyno11.add(n11);
		
		s12 = new JRadioButton("Si");
		n12 = new JRadioButton("No");
		siyno12 =new ButtonGroup();
		siyno12.add(s12);
		siyno12.add(n12);
		
		s13 = new JRadioButton("Si");
		n13 = new JRadioButton("No");
		siyno13 =new ButtonGroup();
		siyno13.add(s13);
		siyno13.add(n13);
		
		s14 = new JRadioButton("Si");
		n14 = new JRadioButton("No");
		siyno14 =new ButtonGroup();
		siyno14.add(s14);
		siyno14.add(n14);
		
		s15 = new JRadioButton("Si");
		n15 = new JRadioButton("No");
		siyno15 =new ButtonGroup();
		siyno15.add(s15);
		siyno15.add(n15);
		
		s16 = new JRadioButton("Si");
		n16 = new JRadioButton("No");
		siyno16 =new ButtonGroup();
		siyno16.add(s16);
		siyno16.add(n16);
		

		s17 = new JRadioButton("Si");
		n17 = new JRadioButton("No");
		siyno17 =new ButtonGroup();
		siyno17.add(s17);
		siyno17.add(n17);
		
		s18 = new JRadioButton("Si");
		n18 = new JRadioButton("No");
		siyno18 =new ButtonGroup();
		siyno18.add(s18);
		siyno18.add(n18);
		
		
		s19 = new JRadioButton("Si");
		n19 = new JRadioButton("No");
		siyno19 =new ButtonGroup();
		siyno19.add(s19);
		siyno19.add(n19);
		
		s20 = new JRadioButton("Si");
		n20 = new JRadioButton("No");
		siyno20 =new ButtonGroup();
		siyno20.add(s20);
		siyno20.add(n20);
		
		s21 = new JRadioButton("Si");
		n21 = new JRadioButton("No");
		siyno21 =new ButtonGroup();
		siyno21.add(s21);
		siyno21.add(n21);
		
		s22 = new JRadioButton("Si");
		n22 = new JRadioButton("No");
		siyno22 =new ButtonGroup();
		siyno22.add(s22);
		siyno22.add(n22);
		
		s23 = new JRadioButton("Si");
		n23 = new JRadioButton("No");
		siyno23 =new ButtonGroup();
		siyno23.add(s23);
		siyno23.add(n23);
		
		s24 = new JRadioButton("Si");
		n24 = new JRadioButton("No");
		siyno24 =new ButtonGroup();
		siyno24.add(s24);
		siyno24.add(n24);
		
		s25 = new JRadioButton("Si");
		n25 = new JRadioButton("No");
		siyno25 =new ButtonGroup();
		siyno25.add(s25);
		siyno25.add(n25);
		
		s26 = new JRadioButton("Si");
		n26 = new JRadioButton("No");
		siyno26 =new ButtonGroup();
		siyno26.add(s26);
		siyno26.add(n26);
		
		s27 = new JRadioButton("Si");
		n27 = new JRadioButton("No");
		siyno27 =new ButtonGroup();
		siyno27.add(s27);
		siyno27.add(n27);
		
		s28 = new JRadioButton("Si");
		n28 = new JRadioButton("No");
		siyno28 =new ButtonGroup();
		siyno28.add(s28);
		siyno28.add(n28);
		
		
		s29 = new JRadioButton("Si");
		n29 = new JRadioButton("No");
		siyno29 =new ButtonGroup();
		siyno29.add(s29);
		siyno29.add(n29);
		
		s30 = new JRadioButton("Si");
		n30 = new JRadioButton("No");
		siyno30 =new ButtonGroup();
		siyno30.add(s30);
		siyno30.add(n30);
		
		s31 = new JRadioButton("Si");
		n31 = new JRadioButton("No");
		siyno31 =new ButtonGroup();
		siyno31.add(s31);
		siyno31.add(n31);
		
		s32 = new JRadioButton("Si");
		n32 = new JRadioButton("No");
		siyno32 =new ButtonGroup();
		siyno32.add(s32);
		siyno32.add(n32);
		
		s33 = new JRadioButton("Si");
		n33= new JRadioButton("No");
		siyno33 =new ButtonGroup();
		siyno33.add(s33);
		siyno33.add(n33);
		
		s34 = new JRadioButton("Si");
		n34 = new JRadioButton("No");
		siyno34 =new ButtonGroup();
		siyno34.add(s34);
		siyno34.add(n34);
		
		s35 = new JRadioButton("Si");
		n35 = new JRadioButton("No");
		siyno35 =new ButtonGroup();
		siyno35.add(s35);
		siyno35.add(n35);
		
		s36 = new JRadioButton("Si");
		n36 = new JRadioButton("No");
		siyno36 =new ButtonGroup();
		siyno36.add(s36);
		siyno36.add(n36);
		
		s37 = new JRadioButton("Si");
		n37 = new JRadioButton("No");
		siyno37 =new ButtonGroup();
		siyno37.add(s37);
		siyno37.add(n37);
		
		s38 = new JRadioButton("Si");
		n38 = new JRadioButton("No");
		siyno38 =new ButtonGroup();
		siyno38.add(s38);
		siyno38.add(n38);
		
		
		s39 = new JRadioButton("Si");
		n39 = new JRadioButton("No");
		siyno39 =new ButtonGroup();
		siyno39.add(s39);
		siyno39.add(n39);
		
		s40 = new JRadioButton("Si");
		n40 = new JRadioButton("No");
		siyno40 =new ButtonGroup();
		siyno40.add(s40);
		siyno40.add(n40);
		
		s41 = new JRadioButton("Si");
		n41 = new JRadioButton("No");
		siyno41 =new ButtonGroup();
		siyno41.add(s41);
		siyno41.add(n41);
		
		s42 = new JRadioButton("Si");
		n42 = new JRadioButton("No");
		siyno42 =new ButtonGroup();
		siyno42.add(s42);
		siyno42.add(n42);
		
		s43 = new JRadioButton("Si");
		n43 = new JRadioButton("No");
		siyno43 =new ButtonGroup();
		siyno43.add(s43);
		siyno43.add(n43);
		
		s44 = new JRadioButton("Si");
		n44 = new JRadioButton("No");
		siyno44 =new ButtonGroup();
		siyno44.add(s44);
		siyno44.add(n44);
		
		s45 = new JRadioButton("Si");
		n45 = new JRadioButton("No");
		siyno45 =new ButtonGroup();
		siyno45.add(s45);
		siyno45.add(n45);
		
		s46 = new JRadioButton("Si");
		n46 = new JRadioButton("No");
		siyno46 =new ButtonGroup();
		siyno46.add(s46);
		siyno46.add(n46);
		
		s47 = new JRadioButton("Si");
		n47 = new JRadioButton("No");
		siyno47 =new ButtonGroup();
		siyno47.add(s47);
		siyno47.add(n47);
		
		s48 = new JRadioButton("Si");
		n48 = new JRadioButton("No");
		siyno48 =new ButtonGroup();
		siyno48.add(s48);
		siyno48.add(n48);
		
		
		s49 = new JRadioButton("Si");
		n49 = new JRadioButton("No");
		siyno49 =new ButtonGroup();
		siyno49.add(s49);
		siyno49.add(n49);
		
		s50 = new JRadioButton("Si");
		n50 = new JRadioButton("No");
		siyno50 =new ButtonGroup();
		siyno50.add(s50);
		siyno50.add(n50);
		
		s51 = new JRadioButton("Si");
		n51 = new JRadioButton("No");
		siyno51 =new ButtonGroup();
		siyno51.add(s51);
		siyno51.add(n51);
		
		s52 = new JRadioButton("Si");
		n52 = new JRadioButton("No");
		siyno52 =new ButtonGroup();
		siyno52.add(s52);
		siyno52.add(n52);
		
		s53 = new JRadioButton("Si");
		n53 = new JRadioButton("No");
		siyno53 =new ButtonGroup();
		siyno53.add(s53);
		siyno53.add(n53);
		
		s54 = new JRadioButton("Si");
		n54 = new JRadioButton("No");
		siyno54 =new ButtonGroup();
		siyno54.add(s54);
		siyno54.add(n54);
		
		s55 = new JRadioButton("Si");
		n55 = new JRadioButton("No");
		siyno55 =new ButtonGroup();
		siyno55.add(s55);
		siyno55.add(n55);
		
		s56 = new JRadioButton("Si");
		n56 = new JRadioButton("No");
		siyno56 =new ButtonGroup();
		siyno56.add(s56);
		siyno56.add(n56);
		
		s57 = new JRadioButton("Si");
		n57 = new JRadioButton("No");
		siyno57 =new ButtonGroup();
		siyno57.add(s57);
		siyno57.add(n57);
		
		s58 = new JRadioButton("Si");
		n58 = new JRadioButton("No");
		siyno58 =new ButtonGroup();
		siyno58.add(s58);
		siyno58.add(n58);
		
		
		s59 = new JRadioButton("Si");
		n59 = new JRadioButton("No");
		siyno59 =new ButtonGroup();
		siyno59.add(s59);
		siyno59.add(n59);
		
		s60 = new JRadioButton("Si");
		n60 = new JRadioButton("No");
		siyno60 =new ButtonGroup();
		siyno60.add(s60);
		siyno60.add(n60);
		
		s61 = new JRadioButton("Si");
		n61 = new JRadioButton("No");
		siyno61 =new ButtonGroup();
		siyno61.add(s61);
		siyno61.add(n61);
		
		s62 = new JRadioButton("Si");
		n62 = new JRadioButton("No");
		siyno62 =new ButtonGroup();
		siyno62.add(s62);
		siyno62.add(n62);
		
		s63 = new JRadioButton("Si");
		n63 = new JRadioButton("No");
		siyno63 =new ButtonGroup();
		siyno63.add(s63);
		siyno63.add(n63);
		
		s64 = new JRadioButton("Si");
		n64 = new JRadioButton("No");
		 siyno64 =new ButtonGroup();
		siyno64.add(s64);
		siyno64.add(n64);
		
		s65 = new JRadioButton("Si");
		n65 = new JRadioButton("No");
		 siyno65 =new ButtonGroup();
		siyno65.add(s65);
		siyno65.add(n65);
		
		s66 = new JRadioButton("Si");
		n66 = new JRadioButton("No");
		 siyno66 =new ButtonGroup();
		siyno66.add(s66);
		siyno66.add(n66);
		
		s67 = new JRadioButton("Si");
		n67 = new JRadioButton("No");
		 siyno67 =new ButtonGroup();
		siyno67.add(s67);
		siyno67.add(n67);
		
		s68 = new JRadioButton("Si");
		n68 = new JRadioButton("No");
		siyno68 =new ButtonGroup();
		siyno68.add(s68);
		siyno68.add(n68);
		
		
		s69 = new JRadioButton("Si");
		n69 = new JRadioButton("No");
		 siyno69 =new ButtonGroup();
		siyno69.add(s69);
		siyno69.add(n69);
		
		s70 = new JRadioButton("Si");
		n70 = new JRadioButton("No");
		 siyno70 =new ButtonGroup();
		siyno70.add(s70);
		siyno70.add(n70);
		
		s71 = new JRadioButton("Si");
		n71 = new JRadioButton("No");
		 siyno71 =new ButtonGroup();
		siyno71.add(s71);
		siyno71.add(n71);
		
		s72 = new JRadioButton("Si");
		n72 = new JRadioButton("No");
		 siyno72 =new ButtonGroup();
		siyno72.add(s72);
		siyno72.add(n72);
		
		s73 = new JRadioButton("Si");
		n73 = new JRadioButton("No");
		 siyno73 =new ButtonGroup();
		siyno73.add(s73);
		siyno73.add(n73);
		
		s74 = new JRadioButton("Si");
		n74 = new JRadioButton("No");
		 siyno74 =new ButtonGroup();
		siyno74.add(s74);
		siyno74.add(n74);
		
		s75 = new JRadioButton("Si");
		n75 = new JRadioButton("No");
		 siyno75 =new ButtonGroup();
		siyno75.add(s75);
		siyno75.add(n75);
		
		s76 = new JRadioButton("Si");
		n76 = new JRadioButton("No");
		 siyno76 =new ButtonGroup();
		siyno76.add(s76);
		siyno76.add(n76);
		
		s77 = new JRadioButton("Si");
		n77 = new JRadioButton("No");
		 siyno77 =new ButtonGroup();
		siyno77.add(s77);
		siyno77.add(n77);
		
		s78 = new JRadioButton("Si");
		n78 = new JRadioButton("No");
		 siyno78 =new ButtonGroup();
		siyno78.add(s78);
		siyno78.add(n78);
		
		
		s79 = new JRadioButton("Si");
		n79 = new JRadioButton("No");
		 siyno79 =new ButtonGroup();
		siyno79.add(s79);
		siyno79.add(n79);
		
		s80 = new JRadioButton("Si");
		n80 = new JRadioButton("No");
		 siyno80 =new ButtonGroup();
		siyno80.add(s80);
		siyno80.add(n80);
		
		s81 = new JRadioButton("Si");
		n81 = new JRadioButton("No");
		 siyno81 =new ButtonGroup();
		siyno81.add(s81);
		siyno81.add(n81);
		
		s82 = new JRadioButton("Si");
		n82 = new JRadioButton("No");
		 siyno82 =new ButtonGroup();
		siyno82.add(s82);
		siyno82.add(n82);
		
		s83 = new JRadioButton("Si");
		n83 = new JRadioButton("No");
		 siyno83 =new ButtonGroup();
		siyno83.add(s83);
		siyno83.add(n83);
		
		s84 = new JRadioButton("Si");
		n84 = new JRadioButton("No");
		 siyno84 =new ButtonGroup();
		siyno84.add(s84);
		siyno84.add(n84);
		
		s85 = new JRadioButton("Si");
		n85 = new JRadioButton("No");
		 siyno85 =new ButtonGroup();
		siyno85.add(s85);
		siyno85.add(n85);
		
		s86 = new JRadioButton("Si");
		n86 = new JRadioButton("No");
		 siyno86 =new ButtonGroup();
		siyno86.add(s86);
		siyno86.add(n86);
		
		s87 = new JRadioButton("Si");
		n87 = new JRadioButton("No");
		 siyno87 =new ButtonGroup();
		siyno87.add(s87);
		siyno87.add(n87);
		
		s88 = new JRadioButton("Si");
		n88 = new JRadioButton("No");
		 siyno88 =new ButtonGroup();
		siyno88.add(s88);
		siyno88.add(n88);
		
		
		s89 = new JRadioButton("Si");
		n89 = new JRadioButton("No");
		 siyno89 =new ButtonGroup();
		siyno89.add(s89);
		siyno89.add(n89);
		
		s90 = new JRadioButton("Si");
		n90 = new JRadioButton("No");
		 siyno90 =new ButtonGroup();
		siyno90.add(s90);
		siyno90.add(n90);
		
		s91 = new JRadioButton("Si");
		n91 = new JRadioButton("No");
		 siyno91 =new ButtonGroup();
		siyno91.add(s91);
		siyno91.add(n91);
		
		s92 = new JRadioButton("Si");
		n92 = new JRadioButton("No");
		 siyno92 =new ButtonGroup();
		siyno92.add(s92);
		siyno92.add(n92);
		
		s93 = new JRadioButton("Si");
		n93 = new JRadioButton("No");
		 siyno93 =new ButtonGroup();
		siyno93.add(s93);
		siyno93.add(n93);
		
		s94 = new JRadioButton("Si");
		n94 = new JRadioButton("No");
		 siyno94 =new ButtonGroup();
		siyno94.add(s94);
		siyno94.add(n94);
		
		s95 = new JRadioButton("Si");
		n95 = new JRadioButton("No");
		 siyno95 =new ButtonGroup();
		siyno95.add(s95);
		siyno95.add(n95);
		
		s96 = new JRadioButton("Si");
		n96 = new JRadioButton("No");
		 siyno96 =new ButtonGroup();
		siyno96.add(s96);
		siyno96.add(n96);
		
		s97 = new JRadioButton("Si");
		n97 = new JRadioButton("No");
		 siyno97 =new ButtonGroup();
		siyno97.add(s97);
		siyno97.add(n97);
		
		s98 = new JRadioButton("Si");
		n98 = new JRadioButton("No");
		 siyno98 =new ButtonGroup();
		siyno8.add(s98);
		siyno8.add(n98);
		
		botonContinuar = new JButton("Continuar");
		botonContinuar.setActionCommand(CONTINUAR);
		botonContinuar.setBackground(Color.blue);
		botonContinuar.setForeground(Color.white);		
		
		
		 add(p1);
		 add(s1);
		 add(n1);
		 add(p2);
		 add(s2);
		 add(n2);
		 add(p3);
		 add(s3);
		 add(n3);
		 add(p4);
		 add(s4);
		 add(n4);
		 add(p5);
		 add(s5);
		 add(n5);
		 add(p6);
		 add(s6);
		 add(n6);
		 add(p7);
		 add(s7);
		 add(n7);
		 add(p8);
		 add(s8);
		 add(n8);
		 add(p9);
		 add(s9);
		 add(n9);
		 add(p10);
		 add(s10);
		 add(n10);
		 add(p11);
		 add(s11);
		 add(n11);
		 add(p12);
		 add(s12);
		 add(n12);
		 add(p13);
		 add(s13);
		 add(n13); 
		 add(p14);
		 add(s14);
		 add(n14);
		 add(p15);
		 add(s15);
		 add(n15);
		 add(p16);
		 add(s16);
		 add(n16);
		 add(p17);
		 add(s17);
		 add(n17);
		 add(p18);
		 add(s18);
		 add(n18);
		 add(p19);
		 add(s19);
		 add(n19);
		 add(p20);
		 add(s20);
		 add(n20);
		 add(p21);
		 add(s21);
		 add(n21);
		 add(p22);
		 add(s22);
		 add(n22);
		 add(p23);
		 add(s23);
		 add(n23);
		 add(p24);
		 add(s24);
		 add(n24);
		 add(p25);
		 add(s25);
		 add(n25);
		 add(p26);
		 add(s26);
		 add(n26);
		 add(p27);
		 add(s27);
		 add(n27);
		 add(p28);
		 add(s28);
		 add(n28);
		 add(p29);
		 add(s29);
		 add(n29);
		 add(p30);
		 add(s30);
		 add(n30);
		 add(p41);
		 add(s41);
		 add(n41);
		 add(p42);
		 add(s42);
		 add(n42);
		 add(p43);
		 add(s43);
		 add(n43);
		 add(p44);
		 add(s44);
		 add(n44);
		 add(p45);
		 add(s45);
		 add(n45);
		 add(p46);
		 add(s46);
		 add(n46);
		 add(p47);
		 add(s47);
		 add(n47);
		 add(p48);
		 add(s48);
		 add(n48);
		 add(p49);
		 add(s49);
		 add(n49);
		 add(p50);
		 add(s50);
		 add(n50);
		 add(p51);
		 add(s51);
		 add(n51);
		 add(p52);
		 add(s52);
		 add(n52);
		 add(p53);
		 add(s53);
		 add(n53);
		 add(p54);
		 add(s54);
		 add(n54);
		 add(p55);
		 add(s55);
		 add(n55);
		 add(p56);
		 add(s56);
		 add(n56);
		 add(p57);
		 add(s57);
		 add(n57);
		 add(p58);
		 add(s58);
		 add(n58);
		 add(p59);
		 add(s59);
		 add(n59);
		 add(p60);
		 add(s60);
		 add(n60);
		 add(p61);
		 add(s61);
		 add(n61);
		 add(p62);
		 add(s62);
		 add(n62);
		 add(p63);
		 add(s63);
		 add(n63);
		 add(p64);
		 add(s64);
		 add(n64);
		 add(p65);
		 add(s65);
		 add(n65);
		 add(p66);
		 add(s66);
		 add(n66);
		 add(p67);
		 add(s67);
		 add(n67);
		 add(p68);
		 add(s68);
		 add(n68);
		 add(p69);
		 add(s69);
		 add(n69);
		 add(p70);
		 add(s70);
		 add(n70);
		 add(p71);
		 add(s71);
		 add(n71);
		 add(p72);
		 add(s72);
		 add(n72);
		 add(p73);
		 add(s73);
		 add(n73);
		 add(p74);
		 add(s74);
		 add(n74);
		 add(p75);
		 add(s75);
		 add(n75);
		 add(p76);
		 add(s76);
		 add(n76);
		 add(p77);
		 add(s77);
		 add(n77);
		 add(p78);
		 add(s78);
		 add(n78);
		 add(p79);
		 add(s79);
		 add(n79);
		 add(p80);
		 add(s80);
		 add(n80);
		 add(p81);
		 add(s81);
		 add(n81);
		 add(p82);
		 add(s82);
		 add(n82);
		 add(p83);
		 add(s83);
		 add(n83);
		 add(p84);
		 add(s84);
		 add(n84);
		 add(p85);
		 add(s85);
		 add(n85);
		 add(p86);
		 add(s86);
		 add(n86);
		 add(p87);
		 add(s87);
		 add(n87);
		 add(p88);
		 add(s88);
		 add(n88);
		 add(p89);
		 add(s89);
		 add(n89);
		 add(p90);
		 add(s90);
		 add(n90);
		 add(p91);
		 add(s91);
		 add(n91);
		 add(p92);
		 add(s92);
		 add(n92);
		 add(p93);
		 add(s93);
		 add(n93);
		 add(p94);
		 add(s94);
		 add(n94);
		 add(p95);
		 add(s95);
		 add(n95);
		 add(p96);
		 add(s96);
		 add(n96);
		 add(p97);
		 add(s97);
		 add(n97);
		 add(p98);
		 add(s98);
		 add(n98);
		 add(botonContinuar);
		 
		 verificarINTC();
		 verificarINTH();
		 verificarINTA();
		 verificarINTS();
		 verificarINTI();
		 verificarINTD();
		 verificarINTE();
		 verificarAPTC();
		 verificarAPTH();
		 verificarAPTA();
		 verificarAPTS();
		 verificarAPTI();
		 verificarAPTD();
		 verificarAPTE();
		 
		
	}
	
	public int verificarINTC() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s1.isSelected()) {
			intC++;		
		}else {
			if(!n1.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 1");
		}
			
		
			if(s98.isSelected()) {
				intC++;
			}else {
				if(!n98.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 98");
			}
				
	
			if(s12.isSelected()) {;
				intC++;
			}else {
				if(!n12.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 12");
			}
					
					
			if(s64.isSelected()) {
				intC++;	
			}else {
				if(!n64.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 64");
					
				}
						
			if(s53.isSelected()) {
			intC++;							
		}else {
			if(!n53.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 53");
		}
		
			if(s85.isSelected()) {
				intC++;
			}else {
				if(!n85.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 85");
			
			}
				
				
				if(s78.isSelected()) {
					intC++;
				}else {
					if(!n78.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 78");
				
				}
			
			if(s20.isSelected()) {
				intC++;
			}else {
				if(!n20.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 20");
					
			}
						
						
			if(s71.isSelected()) {
				intC++;
			}else {
				if(!n71.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 71");
						
			}
							
			if(s91.isSelected()) {
				intC++;
			}else {
				if(!n91.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 91");
			}
								
		
		
	}}}}}}}}}}}
	});return intC;
		}
	public int verificarINTH() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s9.isSelected()) {
			intH++;		
		}else {
			if(!n9.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 9");
		}
			
		
			if(s34.isSelected()) {
				intH++;
			}else {
				if(!n34.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 34");
			}
				
	
			if(s80.isSelected()) {;
					intH++;
			}else {
				if(!n80.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 80");
			}
				
					
			if(s25.isSelected()) {
						intH++;	
			}else {
				if(!n25.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 25");
					
			}
						
			if(s95.isSelected()) {
			intH++;							
		}else {
			if(!n95.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 95");
			}
			
			
			if(s67.isSelected()) {
				intH++;
			}else {
				if(!n67.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 67");
			
			}
				
				
			if(s41.isSelected()) {
				intH++;
			}else {
				if(!n41.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 41");
				
			}
			
			if(s74.isSelected()) {
				intH++;
			}else {
				if(!n74.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 74");
					
			}
					
			if(s56.isSelected()) {
				intH++;
			}else {
				if(!n56.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 56");
						
			}
							
			if(s89.isSelected()) {
				intH++;
			}else {
				if(!n89.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 89");
							}
								
		
		
	}}}}}}}}}}}
	});return intH;
		}
	
	public int verificarINTA() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s21.isSelected()) {
			intA++;		
		}else {
			if(!n21.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 21");
		}
			
		
			if(s45.isSelected()) {
				intA++;
			}else {
				if(!n45.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 45");
			}
				
	
			if(s96.isSelected()) {;
					intA++;
			}else {
				if(!n96.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 96");
			}
				
					
			if(s57.isSelected()) {
						intA++;	
			}else {
				if(!n57.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 57");
					
			}
						
			if(s28.isSelected()) {
			intA++;							
		}else {
			if(!n28.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 28");
			}
			
			
			if(s11.isSelected()) {
				intA++;
			}else {
				if(!n11.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 11");
			
			}
				
				
			if(s5.isSelected()) {
				intA++;
			}else {
				if(!n5.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 5");
				
			}
			
			if(s3.isSelected()) {
				intA++;
			}else {
				if(!n3.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 3");
					
			}
					
			if(s36.isSelected()) {
				intA++;
			}else {
				if(!n36.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 36");
						
			}
							
			if(s81.isSelected()) {
				intA++;
			}else {
				if(!n81.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 81");
							}
								
		
		
	}}}}}}}}}}}
	});return intA;
		}
	
	public int verificarINTS() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s33.isSelected()) {
			intS++;		
		}else {
			if(!n33.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 33");
		}
			
		
			if(s92.isSelected()) {
				intS++;
			}else {
				if(!n92.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 92");
			}
				
	
			if(s70.isSelected()) {;
					intS++;
			}else {
				if(!n70.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 70");
			}
				
					
			if(s8.isSelected()) {
						intS++;	
			}else {
				if(!n8.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 8");
					
			}
						
			if(s87.isSelected()) {
			intS++;							
		}else {
			if(!n87.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 87");
			}
			
			
			if(s62.isSelected()) {
				intS++;
			}else {
				if(!n62.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 62");
			
			}
				
				
			if(s23.isSelected()) {
				intS++;
			}else {
				if(!n23.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 23");
				
			}
			
			if(s44.isSelected()) {
				intS++;
			}else {
				if(!n44.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 44");
					
			}
					
			if(s16.isSelected()) {
				intS++;
			}else {
				if(!n16.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 16");
						
			}
							
			if(s52.isSelected()) {
				intS++;
			}else {
				if(!n52.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 52");
							}
								
		
		
	}}}}}}}}}}}
	});return intS;
		}
	
	public int verificarINTI() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s75.isSelected()) {
			intI++;		
		}else {
			if(!n75.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 75");
		}
			
		
			if(s6.isSelected()) {
				intI++;
			}else {
				if(!n6.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 6");
			}
				
	
			if(s19.isSelected()) {;
					intI++;
			}else {
				if(!n19.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 19");
			}
				
					
			if(s38.isSelected()) {
						intI++;	
			}else {
				if(!n38.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 38");
					
			}
						
			if(s60.isSelected()) {
			intI++;							
		}else {
			if(!n60.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 60");
			}
			
			
			if(s27.isSelected()) {
				intI++;
			}else {
				if(!n27.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 27");
			
			}
				
				
			if(s83.isSelected()) {
				intI++;
			}else {
				if(!n83.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 83");
				
			}
			
			if(s54.isSelected()) {
				intI++;
			}else {
				if(!n54.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 54");
					
			}
					
			if(s47.isSelected()) {
				intI++;
			}else {
				if(!n47.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 47");
						
			}
							
			if(s97.isSelected()) {
				intI++;
			}else {
				if(!n97.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 97");
							}
								
		
		
	}}}}}}}}}}}
	});return intI;
		}
	
	public int verificarINTD() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s84.isSelected()) {
			intD++;		
		}else {
			if(!n84.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 84");
		}
			
		
			if(s31.isSelected()) {
				intD++;
			}else {
				if(!n31.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 31");
			}
				
	
			if(s48.isSelected()) {;
					intD++;
			}else {
				if(!n48.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 48");
			}
				
					
			if(s73.isSelected()) {
						intD++;	
			}else {
				if(!n73.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 73");
					
			}
						
			if(s5.isSelected()) {
			intD++;							
		}else {
			if(!n5.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 5");
			}
			
			
			if(s65.isSelected()) {
				intD++;
			}else {
				if(!n65.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 65");
			
			}
				
				
			if(s14.isSelected()) {
				intD++;
			}else {
				if(!n14.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 14");
				
			}
			
			if(s37.isSelected()) {
				intD++;
			}else {
				if(!n37.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 37");
					
			}
					
			if(s58.isSelected()) {
				intD++;
			}else {
				if(!n58.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 58");
						
			}
							
			if(s24.isSelected()) {
				intD++;
			}else {
				if(!n24.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 24");
							}
								
		
		
	}}}}}}}}}}}
	});return intD;
		}
	
	
	
	public int verificarINTE() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s77.isSelected()) {
			intE++;		
		}else {
			if(!n77.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 77");
		}
			
		
			if(s42.isSelected()) {
				intE++;
			}else {
				if(!n42.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 42");
			}
				
	
			if(s88.isSelected()) {;
					intE++;
			}else {
				if(!n88.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 88");
			}
				
					
			if(s17.isSelected()) {
						intE++;	
			}else {
				if(!n17.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 17");
					
			}
						
			if(s93.isSelected()) {
			intE++;							
		}else {
			if(!n93.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 93");
			}
			
			
			if(s32.isSelected()) {
				intE++;
			}else {
				if(!n32.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 32");
			
			}
				
				
			if(s68.isSelected()) {
				intE++;
			}else {
				if(!n68.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 68");
				
			}
			
			if(s49.isSelected()) {
				intE++;
			}else {
				if(!n49.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 49");
					
			}
					
			if(s35.isSelected()) {
				intE++;
			}else {
				if(!n35.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 35");
						
			}
							
			if(s61.isSelected()) {
				intE++;
			}else {
				if(!n61.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 61");
							}
								
		
		
	}}}}}}}}}}}
	});return intE;
		}
	
	
	public int verificarAPTC() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s15.isSelected()) {
			aptC++;		
		}else {
			if(!n15.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 15");
		}
			
		
			if(s51.isSelected()) {
				aptC++;
			}else {
				if(!n51.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 51");
			}
				
	
			if(s2.isSelected()) {;
					aptC++;
			}else {
				if(!n2.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 2");
			}
				
					
			if(s46.isSelected()) {
						aptC++;	
			}else {
				if(!n46.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 46");
					
			}}}}}}});return aptC;
		}
	
	
	public int verificarAPTH() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s63.isSelected()) {
			aptH++;		
		}else {
			if(!n63.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 63");
		}
			
		
			if(s30.isSelected()) {
				aptH++;
			}else {
				if(!n30.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 30");
			}
				
	
			if(s72.isSelected()) {;
					aptH++;
			}else {
				if(!n72.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 72");
			}
				
					
			if(s86.isSelected()) {
						aptH++;	
			}else {
				if(!n86.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 86");
					
			}}}}}}});return aptH;
		}
		
	public int verificarAPTA() {
		botonContinuar.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
		
		if(s22.isSelected()) {
			aptA++;		
		}else {
			if(!n22.isSelected()) {
			JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 22");
		}
			
		
			if(s39.isSelected()) {
				aptA++;
			}else {
				if(!n39.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 39");
			}
				
	
			if(s76.isSelected()) {;
					aptA++;
			}else {
				if(!n76.isSelected()) {
				JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 76");
			}
				
					
			if(s82.isSelected()) {
						aptA++;	
			}else {
				if(!n82.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 82");
					
			}}}}}}});return aptA;}
			
			public int verificarAPTS() {
				botonContinuar.addActionListener(new ActionListener() {
			
					public void actionPerformed(ActionEvent e) {
				
				if(s69.isSelected()) {
					aptS++;		
				}else {
					if(!n69.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 69");
				}
					
				
					if(s40.isSelected()) {
						aptS++;
					}else {
						if(!n40.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 40");
					}
						
			
					if(s29.isSelected()) {;
							aptS++;
					}else {
						if(!n29.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 29");
					}
						
							
					if(s4.isSelected()) {
								aptS++;	
					}else {
						if(!n4.isSelected()) {
							JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 4");
							
					}}}}}}});return aptS;
				}
			
			
			public int verificarAPTI() {
				botonContinuar.addActionListener(new ActionListener() {
			
					public void actionPerformed(ActionEvent e) {
				
				if(s26.isSelected()) {
					aptI++;		
				}else {
					if(!n26.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 26");
				}
					
				
					if(s59.isSelected()) {
						aptI++;
					}else {
						if(!n59.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 59");
					}
						
			
					if(s90.isSelected()) {;
							aptI++;
							
					}else {
						if(!n90.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 90");
						
					}
						
							
					if(s10.isSelected()) {
								aptI++;	
					}else {
						if(!n10.isSelected()) {
							JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 10");
							
					}}}}}}});return aptI;
				}
			
			
			
			public int verificarAPTD() {
				botonContinuar.addActionListener(new ActionListener() {
			
					public void actionPerformed(ActionEvent e) {
				
				if(s13.isSelected()) {
					aptD++;		
				}else {
					if(!n13.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 13");
				}
					
				
					if(s66.isSelected()) {
						aptD++;
					}else {
						if(!n66.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 66");
					}
						
			
					if(s18.isSelected()) {;
							aptD++;
					}else {
						if(!n18.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 18");
					}
						
							
					if(s43.isSelected()) {
								aptD++;	
					}else {
						if(!n43.isSelected()) {
							JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 43");
							
					}}}}}}});return aptD;
					
					
				}
			
			public int verificarAPTE() {
				botonContinuar.addActionListener(new ActionListener() {
			
					public void actionPerformed(ActionEvent e) {
				
				if(s94.isSelected()) {
					aptE++;		
				}else {
					if(!n94.isSelected()) {
					JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 94");
				}
					
				
					if(s7.isSelected()) {
						aptE++;
					}else {
						if(!n7.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 7");
					}
						
			
					if(s79.isSelected()) {;
							aptE++;
					}else {
						if(!n79.isSelected()) {
						JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 79");
					}
						
							
					if(s55.isSelected()) {
								aptE++;	
					}else {
						if(!n55.isSelected()) {
							JOptionPane.showMessageDialog(null, "NO RESPONDIO LA PREGUNTA 55");
							
					}}}}}}});return aptE;
				}
		


	



}
