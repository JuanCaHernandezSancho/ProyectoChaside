package Modelo;

import javax.management.monitor.MonitorSettingException;
import javax.swing.JOptionPane;

import Vista.Interfaz;

public class Pregunta extends AptitudesIntereses {
	private String[] textoPregunta;
	private int[] numPregunta;
	private int[] fila;
	private int[] columna;
	private String cuestionario;
	private AptitudesIntereses api;

	public Pregunta() {
		textoPregunta = new String[98];
		numPregunta = new int[98];
		fila = new int[98];
		columna = new int[98];
		api = new AptitudesIntereses();

		textoPregunta[0] = " ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?";
		numPregunta[0] = 1;
		fila[0] = 5;
		columna[0] = 0;

		textoPregunta[1] = " ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?";
		numPregunta[1] = 2;
		fila[1] = 8;
		columna[1] = 7;

		textoPregunta[2] = " ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?";
		numPregunta[2] = 3;
		fila[2] = 7;
		columna[2] = 2;

		textoPregunta[3] = " ¿A una frustracion siempre opones un pensamiento positivo?";
		numPregunta[3] = 4;
		fila[3] = 9;
		columna[3] = 10;

		textoPregunta[4] = " ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?";
		numPregunta[4] = 5;
		fila[4] = 6;
		columna[4] = 2;

		textoPregunta[5] = " ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus juguetes?";
		numPregunta[5] = 6;
		fila[5] = 1;
		columna[5] = 4;

		textoPregunta[6] = " ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?";
		numPregunta[6] = 7;
		fila[6] = 7;
		columna[6] = 13;

		textoPregunta[7] = " ¿Escuchas atentamente los problemas que te plantean tus amigos?";
		numPregunta[7] = 8;
		fila[7] = 3;
		columna[7] = 3;

		textoPregunta[8] = " ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?";
		numPregunta[8] = 9;
		fila[8] = 0;
		columna[8] = 1;

		textoPregunta[9] = " ¿Eres exigente y crítico con tu equipo de trabajo?";
		numPregunta[9] = 10;
		fila[9] = 9;
		columna[9] = 11;

		textoPregunta[10] = " ¿Te atrae armar rompecabezas o puzzles?";
		numPregunta[10] = 11;
		fila[10] = 5;
		columna[10] = 2;

		textoPregunta[11] = " ¿Puedes establecer la diferencia conceptual entre macroeconomía y microeconomía?";
		numPregunta[11] = 12;
		fila[11] = 1;
		columna[11] = 0;

		textoPregunta[12] = " ¿Usar uniforme te hace sentir distinto, importante?";
		numPregunta[12] = 13;
		fila[12] = 6;
		columna[12] = 12;

		textoPregunta[13] = " ¿Participarías como profesional en un espectáculo de acrobacia aérea?";
		numPregunta[13] = 14;
		fila[13] = 6;
		columna[13] = 5;

		textoPregunta[14] = " ¿Organizas tu dinero de manera que te alcance hasta el próximo cobro?";
		numPregunta[14] = 15;
		fila[14] = 6;
		columna[14] = 7;

		textoPregunta[15] = " ¿Convences fácilmente a otras personas sobre la validez de tus argumentos?";
		numPregunta[15] = 16;
		fila[15] = 8;
		columna[15] = 3;

		textoPregunta[16] = " ¿Estás informado sobre los nuevos descubrimientos que se están realizando sobre la Teoría del Big-Bang?";
		numPregunta[16] = 17;
		fila[16] = 3;
		columna[16] = 6;

		textoPregunta[17] = " ¿Ante una situación de emergencia actúas rápidamente?";
		numPregunta[17] = 18;
		fila[17] = 8;
		columna[17] = 12;

		textoPregunta[18] = " ¿Cuando tienes que resolver un problema matemático, perseveras hasta encontrar la solución?";
		numPregunta[18] = 19;
		fila[18] = 2;
		columna[18] = 4;

		textoPregunta[19] = " ¿Si te convocara tu club preferido para planificar, organizar y dirigir un campo de deportes, aceptarías?";
		numPregunta[19] = 20;
		fila[19] = 7;
		columna[19] = 0;

		textoPregunta[20] = " ¿Eres el que pone un toque de alegría en las fiestas?";
		numPregunta[20] = 21;
		fila[20] = 0;
		columna[20] = 2;

		textoPregunta[21] = " ¿Crees que los detalles son tan importantes como el todo?";
		numPregunta[21] = 22;
		fila[21] = 6;
		columna[21] = 9;

		textoPregunta[22] = " ¿Te sentirías a gusto trabajando en un ámbito hospitalario?";
		numPregunta[22] = 23;
		fila[22] = 6;
		columna[22] = 3;

		textoPregunta[23] = " ¿Te gustaría participar para mantener el orden ante grandes desórdenes y cataclismos?";
		numPregunta[23] = 24;
		fila[23] = 9;
		columna[23] = 5;

		textoPregunta[24] = " ¿Pasarías varias horas leyendo algún libro de tu interés?";
		numPregunta[24] = 25;
		fila[24] = 3;
		columna[24] = 1;

		textoPregunta[25] = " ¿Planificas detalladamente tus trabajos antes de empezar?";
		numPregunta[25] = 26;
		fila[25] = 6;
		columna[25] = 11;

		textoPregunta[26] = " ¿Entablas una relación casi personal con tu computadora?";
		numPregunta[26] = 27;
		fila[26] = 5;
		columna[26] = 4;

		textoPregunta[27] = " ¿Disfrutas modelando con arcilla?";
		numPregunta[27] = 28;
		fila[27] = 4;
		columna[27] = 2;

		textoPregunta[28] = " ¿Ayudas habitualmente a los no videntes a cruzar la calle?";
		numPregunta[28] = 29;
		fila[28] = 8;
		columna[28] = 10;

		textoPregunta[29] = " ¿Consideras importante que desde la escuela primaria se fomente la actitud crítica y la participación activa?";
		numPregunta[29] = 30;
		fila[29] = 7;
		columna[29] = 8;

		textoPregunta[30] = " ¿Aceptarías que las mujeres formaran parte de las fuerzas armadas bajo las mismas normas que los hombres?";
		numPregunta[30] = 31;
		fila[30] = 1;
		columna[30] = 5;

		textoPregunta[31] = " ¿Te gustaría crear nuevas técnicas para descubrir las patologías de algunas enfermedades a través del microscopio?";
		numPregunta[31] = 32;
		fila[31] = 5;
		columna[31] = 6;

		textoPregunta[32] = " ¿Participarías en una campaña de prevención contra la enfermedad de Chagas?";
		numPregunta[32] = 33;
		fila[32] = 0;
		columna[32] = 3;

		textoPregunta[33] = " ¿Te interesan los temas relacionados al pasado y a la evolución del hombre?";
		numPregunta[33] = 34;
		fila[33] = 1;
		columna[33] = 1;

		textoPregunta[34] = " ¿Te incluirías en un proyecto de investigación de los movimientos sísmicos y sus consecuencias?";
		numPregunta[34] = 35;
		fila[34] = 8;
		columna[34] = 6;

		textoPregunta[35] = " ¿Fuera de los horarios escolares, dedicas algún día de la semana a la realización de actividades corporales?";
		numPregunta[35] = 36;
		fila[35] = 9;
		columna[35] = 2;

		textoPregunta[36] = " ¿Te interesan las actividades de mucha acción y de reacción rápida en situaciones imprevistas y de peligro?";
		numPregunta[36] = 37;
		fila[36] = 7;
		columna[36] = 5;

		textoPregunta[37] = " ¿Te ofrecerías para colaborar como voluntario en los gabinetes espaciales de la NASA?";
		numPregunta[37] = 38;
		fila[37] = 3;
		columna[37] = 4;

		textoPregunta[38] = " ¿Te gusta más el trabajo manual que el trabajo intelectual?";
		numPregunta[38] = 39;
		fila[38] = 7;
		columna[38] = 9;

		textoPregunta[39] = " ¿Estarías dispuesto a renunciar a un momento placentero para ofrecer tu servicio como profesional?";
		numPregunta[39] = 40;
		fila[39] = 7;
		columna[39] = 10;

		textoPregunta[40] = " ¿Participarías de una investigación sobre la violencia en el fútbol?";
		numPregunta[40] = 41;
		fila[40] = 6;
		columna[40] = 1;

		textoPregunta[41] = " ¿Te gustaría trabajar en un laboratorio mientras estudias?";
		numPregunta[41] = 42;
		fila[41] = 1;
		columna[41] = 6;

		textoPregunta[42] = " ¿Arriesgarías tu vida para salvar la vida de otro que no conoces?";
		numPregunta[42] = 43;
		fila[42] = 9;
		columna[43] = 12;

		textoPregunta[43] = " ¿Te agradaría hacer un curso de primeros auxilios?";
		numPregunta[43] = 44;
		fila[43] = 7;
		columna[43] = 3;

		textoPregunta[44] = " ¿Tolerarías empezar tantas veces como fuere necesario hasta obtener el logro deseado?";
		numPregunta[44] = 45;
		fila[44] = 1;
		columna[44] = 2;

		textoPregunta[45] = " ¿Distribuyes tus horarios del día adecuadamente para poder hacer todo lo planeado?";
		numPregunta[45] = 46;
		fila[45] = 9;
		columna[45] = 7;

		textoPregunta[46] = " ¿Harías un curso para aprender a fabricar los instrumentos y/o piezas de las máquinas o aparatos con que trabajas?";
		numPregunta[46] = 47;
		fila[46] = 8;
		columna[46] = 4;

		textoPregunta[47] = " ¿Elegirías una profesión en la tuvieras que estar algunos meses alejado de tu familia, por ejemplo el marino?";
		numPregunta[47] = 48;
		fila[47] = 2;
		columna[47] = 5;

		textoPregunta[48] = " ¿Te radicarías en una zona agrícola-ganadera para desarrollar tus actividades como profesional?";
		numPregunta[48] = 49;
		fila[48] = 7;
		columna[48] = 6;

		textoPregunta[49] = " ¿Cuando estás en un grupo trabajando, te entusiasma producir ideas originales y que sean tenidas en cuenta?";
		numPregunta[49] = 50;
		fila[49] = 0;
		columna[49] = 0;

		textoPregunta[50] = " ¿Te resulta fácil coordinar un grupo de trabajo?";
		numPregunta[50] = 51;
		fila[50] = 7;
		columna[50] = 7;

		textoPregunta[51] = " ¿Te resultó interesante el estudio de las ciencias biológicas?";
		numPregunta[51] = 52;
		fila[51] = 9;
		columna[51] = 3;

		textoPregunta[52] = " ¿Si una gran empresa solicita un profesional como gerente de comercialización, te sentirías a gusto desempeñando ese rol?";
		numPregunta[52] = 53;
		fila[52] = 3;
		columna[52] = 0;

		textoPregunta[53] = " ¿Te incluirías en un proyecto nacional de desarrollo de la principal fuente de recursos de tu provincia?";
		numPregunta[53] = 54;
		fila[53] = 7;
		columna[53] = 4;

		textoPregunta[54] = " ¿Tenés interés por saber cuales son las causas que determinan ciertos fenómenos, aunque saberlo no altere tu vida?";
		numPregunta[54] = 55;
		fila[54] = 9;
		columna[54] = 13;

		textoPregunta[55] = " ¿Descubriste algún filósofo o escritor que haya expresado tus mismas ideas con antelación?";
		numPregunta[55] = 56;
		fila[55] = 8;
		columna[55] = 1;

		textoPregunta[56] = " ¿Desearías que te regalen algún instrumento musical para tu cumpleaños?";
		numPregunta[56] = 57;
		fila[56] = 3;
		columna[56] = 2;

		textoPregunta[57] = " ¿Aceptarías colaborar con el cumplimiento de las normas en lugares públicos?";
		numPregunta[57] = 58;
		fila[57] = 8;
		columna[57] = 5;

		textoPregunta[58] = " ¿Crees que tus ideas son importantes, y haces todo lo posible para ponerlas en práctica?";
		numPregunta[58] = 59;
		fila[58] = 7;
		columna[58] = 11;

		textoPregunta[59] = " ¿Cuando se descompone un artefacto en tu casa, te dispones prontamente a repararlo?";
		numPregunta[59] = 60;
		fila[59] = 4;
		columna[59] = 4;

		textoPregunta[60] = " ¿Formarías parte de un equipo de trabajo orientado a la preservación de la flora y la fauna en extinción?";
		numPregunta[60] = 61;
		fila[60] = 9;
		columna[60] = 6;

		textoPregunta[61] = " ¿Acostumbras a leer revistas relacionadas con los últimos avance s científicos y tecnológicos en el área de la salud?";
		numPregunta[61] = 62;
		fila[61] = 5;
		columna[61] = 3;

		textoPregunta[62] = " ¿Preservar las raíces culturales de nuestro país, te parece importante y necesario?";
		numPregunta[62] = 63;
		fila[62] = 6;
		columna[62] = 8;

		textoPregunta[63] = " ¿Te gustaría realizar una investigación que contribuyera a hacer más justa la distribución de la riqueza?";
		numPregunta[63] = 64;
		fila[63] = 2;
		columna[63] = 0;

		textoPregunta[64] = " ¿Te gustaría realizar tareas auxiliares en una nave, como por ejemplo izado y arriado de velas, pintura y conservación del casco, arreglo de averías, conservación de motores, etc?";
		numPregunta[64] = 65;
		fila[64] = 5;
		columna[64] = 5;

		textoPregunta[65] = " ¿Crees que un país debe poseer la más alta tecnología armamentista, a cualquier precio?";
		numPregunta[65] = 66;
		fila[65] = 7;
		columna[65] = 12;

		textoPregunta[66] = " ¿La libertad y la justicia son valores fundamentales en tu vida?";
		numPregunta[66] = 67;
		fila[66] = 5;
		columna[66] = 1;

		textoPregunta[67] = " ¿Aceptarías hacer una práctica rentada en una industria de productos alimenticios en el sector de control de calidad?";
		numPregunta[67] = 68;
		fila[67] = 6;
		columna[67] = 6;

		textoPregunta[68] = " ¿Consideras que la salud pública debe ser prioritaria, gratuita y eficiente para todos?";
		numPregunta[68] = 69;
		fila[68] = 6;
		columna[68] = 10;

		textoPregunta[69] = " ¿Te interesaría investigar sobre alguna nueva vacuna?";
		numPregunta[69] = 70;
		fila[69] = 2;
		columna[69] = 3;

		textoPregunta[70] = " ¿En un equipo de trabajo, preferís el rol de coordinador?";
		numPregunta[70] = 71;
		fila[70] = 8;
		columna[70] = 0;

		textoPregunta[71] = " ¿En una discusión entre amigos, te ofreces como mediador?";
		numPregunta[71] = 72;
		fila[71] = 8;
		columna[71] = 8;

		textoPregunta[72] = " ¿Estás de acuerdo con la formación de un cuerpo de soldados profesionales?";
		numPregunta[72] = 73;
		fila[72] = 3;
		columna[72] = 5;

		textoPregunta[73] = " ¿Lucharías por una causa justa hasta las últimas consecuencias?";
		numPregunta[73] = 74;
		fila[73] = 7;
		columna[73] = 1;

		textoPregunta[74] = " ¿Te gustaría investigar científicamente sobre cultivos agrícolas?";
		numPregunta[74] = 75;
		fila[74] = 0;
		columna[74] = 4;

		textoPregunta[75] = " ¿Harías un nuevo diseño de una prenda pasada de moda, ante una reunión imprevista?";
		numPregunta[75] = 76;
		fila[75] = 8;
		columna[75] = 9;

		textoPregunta[76] = " ¿Visitarías un observatorio astronómico para conocer en acción el funcionamiento de los aparatos?";
		numPregunta[76] = 77;
		fila[76] = 0;
		columna[76] = 6;

		textoPregunta[77] = " ¿Dirigirías el área de importación y exportación de una empresa?";
		numPregunta[77] = 78;
		fila[77] = 6;
		columna[77] = 0;

		textoPregunta[78] = " ¿Te inhibís al entrar a un lugar nuevo con gente desconocida?";
		numPregunta[78] = 79;
		fila[78] = 8;
		columna[78] = 13;

		textoPregunta[79] = " ¿Te gratificaría el trabajar con niños?";
		numPregunta[79] = 80;
		fila[79] = 2;
		columna[79] = 1;

		textoPregunta[80] = " ¿Harías el diseño de un afiche para una campaña contra el sida?";
		numPregunta[80] = 81;
		fila[80] = 8;
		columna[80] = 2;

		textoPregunta[81] = " ¿Dirigirías un grupo de teatro independiente?";
		numPregunta[81] = 82;
		fila[81] = 9;
		columna[81] = 9;

		textoPregunta[82] = " ¿Enviarías tu currículum a una empresa automotriz que solicita gerente para su área de producción?";
		numPregunta[82] = 83;
		fila[82] = 6;
		columna[82] = 4;

		textoPregunta[83] = " ¿Participarías en un grupo de defensa internacional dentro de alguna fuerza armada?";
		numPregunta[83] = 84;
		fila[83] = 0;
		columna[83] = 5;

		textoPregunta[84] = " ¿Te costearías tus estudios trabajando en una auditoría?";
		numPregunta[84] = 85;
		fila[84] = 4;
		columna[84] = 0;

		textoPregunta[85] = " ¿Eres de los que defiendes causas perdidas?";
		numPregunta[85] = 86;
		fila[85] = 9;
		columna[85] = 8;

		textoPregunta[86] = " ¿Ante una emergencia epidémica participarías en una campaña brindando tu ayuda?";
		numPregunta[86] = 87;
		fila[86] = 4;
		columna[86] = 3;

		textoPregunta[87] = " ¿Sabrías responder que significa ADN y ARN?";
		numPregunta[87] = 88;
		fila[87] = 2;
		columna[87] = 6;

		textoPregunta[88] = " ¿Elegirías una carrera cuyo instrumento de trabajo fuere la utilización de un idioma extranjero?";
		numPregunta[88] = 89;
		fila[88] = 9;
		columna[88] = 1;

		textoPregunta[89] = " ¿Trabajar con objetos te resulta más gratificante que trabajar con personas?";
		numPregunta[89] = 90;
		fila[89] = 8;
		columna[89] = 11;

		textoPregunta[90] = " ¿Te resultaría gratificante ser asesor contable en una empresa reconocida?";
		numPregunta[90] = 91;
		fila[90] = 9;
		columna[90] = 0;

		textoPregunta[91] = " ¿Ante un llamado solidario, te ofrecerías para cuidar a un enfermo?";
		numPregunta[91] = 92;
		fila[91] = 1;
		columna[91] = 3;

		textoPregunta[92] = " ¿Te atrae investigar sobre los misterios del universo, por ejemplo los agujeros negros?";
		numPregunta[92] = 93;
		fila[92] = 4;
		columna[92] = 6;

		textoPregunta[93] = " ¿El trabajo individual te resulta más rápido y efectivo que el trabajo grupal?";
		numPregunta[93] = 94;
		fila[93] = 6;
		columna[93] = 13;

		textoPregunta[94] = " ¿Dedicarías parte de tu tiempo a ayudar a personas de zonas carenciadas?";
		numPregunta[94] = 95;
		fila[94] = 4;
		columna[94] = 1;

		textoPregunta[95] = " ¿Cuando elegís tu ropa o decoras un ambiente, tienes en cuenta la combinación de los colores, las telas o el estilo de los muebles?";
		numPregunta[95] = 96;
		fila[95] = 2;
		columna[95] = 2;

		textoPregunta[96] = " ¿Te gustaría trabajar como profesional dirigiendo la construcción de una empresa hidroeléctrica?";
		numPregunta[96] = 97;
		fila[96] = 9;
		columna[96] = 4;

		textoPregunta[97] = " ¿Sabes qué es el PBI?";
		numPregunta[97] = 98;
		fila[97] = 0;
		columna[97] = 0;

	}

	public int[][] responderCuestionario() {
		cuestionario = "";
		Interfaz inter = new Interfaz();
		String mostrar = "";
		int f = 0;
		int c = 0;
		int titulo = 0;
		int i = 0;
		int valeUnPunto = 0;

		int[][] llenar = new int[10][14];
		do {
			titulo = numPregunta[i];
			mostrar = textoPregunta[i];
			f = fila[i];
			c = columna[i];
			cuestionario = "Nro de pregunta: " + titulo + "\nPregunta: " + mostrar;
			valeUnPunto = 0;
			if (inter.hacerCuestionario(cuestionario).equalsIgnoreCase("Si")) {
				valeUnPunto = 1;
			} else {
				valeUnPunto = 0;
			}
			i++;

			llenar[f][c] = valeUnPunto;

		} while (i < numPregunta.length);

		return llenar;

	}

	public int[][] mostrarCHASIDE() {
		int[][] llenar = new int[10][14];
		int[][] x = responderCuestionario();
		int[] sumarCHASIDE;
	

		System.out.println("\nMatriz CHASIDE");

		for (int[] f : x) {
			for (int c : f) {

				System.out.print(String.valueOf(c) + "\t");
			}

			System.out.print("\n");
		}
		System.out.println("Suma CHASIDE");
		sumarCHASIDE = new int[14];
		for (int c = 0; c < 14; c++) {

			for (int f = 0; f < 10; f++) {
				sumarCHASIDE[c] = sumarCHASIDE[c] + x[f][c];

			}
			System.out.print(sumarCHASIDE[c] + "\t");

		}

		System.out.println("");

		int mayorInteres = 0;
		int mayorAptitud = 0;
		int posInteres = 0;
		int posAptitud = 0;
		Archivo ar = new Archivo();

		for (int z = 0; z < 7; z++) {

			if (sumarCHASIDE[z] > mayorInteres) {
				mayorInteres = sumarCHASIDE[z];
				posInteres = z;

			}
		}
		ar.prepararArchivo();
		ar.escribirArchivo("Resultado CHASIDE");
		ar.escribirArchivo("Intereses");
		if (posInteres == 0) {
			ar.escribirArchivo("C - Administrativas y Contables");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = IC[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}

		}

		if (posInteres == 1) {
			ar.escribirArchivo("H – Humanísticas y Sociales");
			String carrera = "";
			for (int i = 0; i < 7; i++) {
				carrera = IH[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}
		if (posInteres == 2) {
			ar.escribirArchivo("A - Artísticas");
			String carrera = "";
			for (int i = 0; i < 7; i++) {
				carrera = IA[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}
		if (posInteres == 3) {
			ar.escribirArchivo("S   – Medicina y Cs. De la Salud");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = IS[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}

		}
		if (posInteres == 4) {
			ar.escribirArchivo("I – Ingeniería y Computación");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = II[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}
		if (posInteres == 5) {
			ar.escribirArchivo("I – Ingeniería y Computación");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = ID[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}

		if (posInteres == 6) {
			ar.escribirArchivo("E - Ciencias Exactas y Agrarias ");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = IE[i];
				System.out.print(carrera + " \n");
				ar.escribirArchivo(carrera);

			}
		}

		for (int columna = 7; columna < 14; columna++) {
			if (sumarCHASIDE[columna] > mayorAptitud) {
				mayorAptitud = sumarCHASIDE[columna];
				posAptitud = columna;
			}

		}
		
		ar.escribirArchivo("Aptitudes");
		if (posAptitud == 7) {
			ar.escribirArchivo("C - Administrativas y Contables");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = AC[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}

		}
		if (posAptitud == 8) {
			ar.escribirArchivo("H – Humanísticas y Sociales");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = AH[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}
		if (posAptitud == 9) {
			ar.escribirArchivo("A - Artísticas");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = AA[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}
		if (posAptitud == 10) {
			ar.escribirArchivo("S   – Medicina y Cs. De la Salud");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = AS[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}

		}
		if (posAptitud == 11) {
			ar.escribirArchivo("I – Ingeniería y Computación");
			String carrera = "";
			for (int i = 0; i < 7; i++) {
				carrera = AI[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}
		if (posAptitud == 12) {
			ar.escribirArchivo("D - Defensa y Seguridad");
			String carrera = "";
			for (int i = 0; i < 7; i++) {
				carrera = AD[i];
				System.out.print(carrera + " \n");

				ar.escribirArchivo(carrera);

			}
		}

		if (posAptitud == 13) {
			ar.escribirArchivo("E - Ciencias Exactas y Agrarias ");
			String carrera = "";
			for (int i = 0; i < 8; i++) {
				carrera = AE[i];
				System.out.print(carrera + " \n");
				ar.escribirArchivo(carrera);

			}
		}
		ar.cerrarArchivo();

		System.out.println("Mayor Puntuaje Interes: "+mayorInteres + " " + "Posición: " + posInteres);
		System.out.println("Mayor Puntuaje Aptitud: "+mayorAptitud + " " + "Posición: " + posAptitud);

		return llenar;
	}

	public String[] getTextoPregunta() {
		return textoPregunta;
	}

	public void setTextoPregunta(String[] textoPregunta) {
		this.textoPregunta = textoPregunta;
	}

	public int[] getNumPregunta() {
		return numPregunta;
	}

	public void setNumPregunta(int[] numPregunta) {
		this.numPregunta = numPregunta;
	}

	public int[] getFila() {
		return fila;
	}

	public void setFila(int[] fila) {
		this.fila = fila;
	}

	public int[] getColumna() {
		return columna;
	}

	public void setColumna(int[] columna) {
		this.columna = columna;
	}

}
