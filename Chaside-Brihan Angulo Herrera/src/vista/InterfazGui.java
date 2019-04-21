package vista;

import javax.swing.JOptionPane;

public class InterfazGui {

	public InterfazGui() {
		
	}
	
	public int[] recibirDato() {
		
		int [] x = new int [99];
	
		x [0]=JOptionPane.showConfirmDialog(null, "Estas Listo, Para El Test", null, JOptionPane.YES_NO_OPTION);
		x [1]=JOptionPane.showConfirmDialog(null, "1 ¿Aceptarías trabajar escribiendo artículos en la sección económica de un diario?", null, JOptionPane.YES_NO_OPTION);
		x [2]=JOptionPane.showConfirmDialog(null, "2 ¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?", null, JOptionPane.YES_NO_OPTION);
		x [3]=JOptionPane.showConfirmDialog(null, "3 ¿Te gustaría dirigir un proyecto de urbanización en tu provincia?",null, JOptionPane.YES_NO_OPTION);
		x [4]=JOptionPane.showConfirmDialog(null, "4 ¿A una frustración siempre opones un pensamiento positivo?", null, JOptionPane.YES_NO_OPTION);
		x [5]=JOptionPane.showConfirmDialog(null, "5 ¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?", null, JOptionPane.YES_NO_OPTION);
		x [6]=JOptionPane.showConfirmDialog(null, "6 ¿Cuando eras chico, te interesaba saber cómo estaban construidos tus  juguetes?", null, JOptionPane.YES_NO_OPTION);
		x [7]=JOptionPane.showConfirmDialog(null, "7 ¿Te interesan más los misterios de la naturaleza que los secretos de la tecnología?", null, JOptionPane.YES_NO_OPTION);
		x [8]=JOptionPane.showConfirmDialog(null, "8 ¿Escuchas atentamente los problemas que te plantean tus amigos?", null, JOptionPane.YES_NO_OPTION);
		x [9]=JOptionPane.showConfirmDialog(null, "9 ¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos no entendieron?", null, JOptionPane.YES_NO_OPTION);
		x [10]=JOptionPane.showConfirmDialog(null, "10 ¿Eres exigente y crítico con tu equipo de trabajo?", null, JOptionPane.YES_NO_OPTION);
		x [11]=JOptionPane.showConfirmDialog(null, "11 ¿Te atrae armar rompecabezas o puzzles?", null, JOptionPane.YES_NO_OPTION);
		x [12]=JOptionPane.showConfirmDialog(null, "12 ¿Puedes establecer la diferencia conceptual entre macroeconomía y microeconomía?", null, JOptionPane.YES_NO_OPTION);
		x [13]=JOptionPane.showConfirmDialog(null, "13 ¿Usar uniforme te hace sentir distinto, importante?", null, JOptionPane.YES_NO_OPTION);
		x [14]=JOptionPane.showConfirmDialog(null, "14 ¿Participarías como profesional en un espectáculo de acrobacia aérea?", null, JOptionPane.YES_NO_OPTION);
		x [15]=JOptionPane.showConfirmDialog(null, "15 ¿Organizas tu dinero de manera que te alcance hasta el próximo cobro?", null, JOptionPane.YES_NO_OPTION);
		x [16]=JOptionPane.showConfirmDialog(null, "16 ¿Convences fácilmente a otras personas sobre la validez de tus argumentos?", null, JOptionPane.YES_NO_OPTION);
		x [17]=JOptionPane.showConfirmDialog(null, "17 ¿Estás informado sobre los nuevos descubrimientos que se están realizando sobre la Teoría del Big-Bang?", null, JOptionPane.YES_NO_OPTION);
		x [18]=JOptionPane.showConfirmDialog(null, "18 ¿Ante una situación de emergencia actúas rápidamente?", null, JOptionPane.YES_NO_OPTION);
		x [19]=JOptionPane.showConfirmDialog(null, "19 ¿Cuando tienes que resolver un problema matemático, perseveras hasta encontrar la solución?", null, JOptionPane.YES_NO_OPTION);
		x [20]=JOptionPane.showConfirmDialog(null, "20 ¿Si te convocara tu club preferido para planificar, organizar y dirigir un campo de deportes, aceptarías?", null, JOptionPane.YES_NO_OPTION);
		x [21]=JOptionPane.showConfirmDialog(null, "21 ¿Eres el que pone un toque de alegría en las fiestas?", null, JOptionPane.YES_NO_OPTION);
		x [22]=JOptionPane.showConfirmDialog(null, "22 ¿Crees que los detalles son tan importantes como el todo?", null, JOptionPane.YES_NO_OPTION);
		x [23]=JOptionPane.showConfirmDialog(null, "23 ¿Te sentirías a gusto trabajando en un ámbito hospitalario?", null, JOptionPane.YES_NO_OPTION);
		x [24]=JOptionPane.showConfirmDialog(null, "24 ¿Te gustaría participar para mantener el orden ante grandes desórdenes y cataclismos?", null, JOptionPane.YES_NO_OPTION);
		x [25]=JOptionPane.showConfirmDialog(null, "25 ¿Pasarías varias horas leyendo algún libro de tu interés?", null, JOptionPane.YES_NO_OPTION);
		x [26]=JOptionPane.showConfirmDialog(null, "26 ¿Planificas detalladamente tus trabajos antes de empezar?", null, JOptionPane.YES_NO_OPTION);
		x [27]=JOptionPane.showConfirmDialog(null, "27 ¿Entablas una relación casi personal con tu computadora?", null, JOptionPane.YES_NO_OPTION);
		x [28]=JOptionPane.showConfirmDialog(null, "28 ¿Disfrutas modelando con arcilla?", null, JOptionPane.YES_NO_OPTION);
		x [29]=JOptionPane.showConfirmDialog(null, "29 ¿Ayudas habitualmente a los no videntes a cruzar la calle?", null, JOptionPane.YES_NO_OPTION);
		x [30]=JOptionPane.showConfirmDialog(null, "30 ¿Consideras importante que desde la escuela primaria se fomente la actitud crítica y la participación activa?", null, JOptionPane.YES_NO_OPTION);
		x [31]=JOptionPane.showConfirmDialog(null, "31 ¿Aceptarías que las mujeres formaran parte de las fuerzas armadas bajo las mismas normas que los hombres?", null, JOptionPane.YES_NO_OPTION);
		x [32]=JOptionPane.showConfirmDialog(null, "32 ¿Te gustaría crear nuevas técnicas para descubrir las patologías de algunas enfermedades a través del microscopio?", null, JOptionPane.YES_NO_OPTION);
		x [33]=JOptionPane.showConfirmDialog(null, "33 ¿Participarías en una campaña de prevención contra la enfermedad de Chagas?", null, JOptionPane.YES_NO_OPTION);
		x [34]=JOptionPane.showConfirmDialog(null, "34 ¿Te interesan los temas relacionados al pasado y a la evolución del hombre?", null, JOptionPane.YES_NO_OPTION);
		x [35]=JOptionPane.showConfirmDialog(null, "35 ¿Te incluirías en un proyecto de investigación de los movimientos sísmicos y sus consecuencias?", null, JOptionPane.YES_NO_OPTION);
		x [36]=JOptionPane.showConfirmDialog(null, "36 ¿Fuera de los horarios escolares, dedicas algún día de la semana a la realización de actividades corporales?", null, JOptionPane.YES_NO_OPTION);
		x [37]=JOptionPane.showConfirmDialog(null, "37 ¿Te interesan las actividades de mucha acción y de reacción rápida en situaciones imprevistas y de peligro?", null, JOptionPane.YES_NO_OPTION);
		x [38]=JOptionPane.showConfirmDialog(null, "38 ¿Te ofrecerías para colaborar como voluntario en los gabinetes espaciales de la NASA?", null, JOptionPane.YES_NO_OPTION);
		x [39]=JOptionPane.showConfirmDialog(null, "39 ¿Te gusta más el trabajo manual que el trabajo intelectual?", null, JOptionPane.YES_NO_OPTION);
		x [40]=JOptionPane.showConfirmDialog(null, "40 ¿Estarías dispuesto a renunciar a un momento placentero para ofrecer tu servicio como profesional?" , null, JOptionPane.YES_NO_OPTION);
		x [41]=JOptionPane.showConfirmDialog(null, "41 ¿Participarías de una investigación sobre la violencia en el fútbol?" , null, JOptionPane.YES_NO_OPTION);
		x [42]=JOptionPane.showConfirmDialog(null, "42 ¿Te gustaría trabajar en un laboratorio mientras estudias?", null, JOptionPane.YES_NO_OPTION);
		x [43]=JOptionPane.showConfirmDialog(null, "43 ¿Arriesgarías tu vida para salvar la vida de otro que no conoces?", null, JOptionPane.YES_NO_OPTION );
		x [44]=JOptionPane.showConfirmDialog(null, "44 ¿Te agradaría hacer un curso de primeros auxilios?", null, JOptionPane.YES_NO_OPTION);
		x [45]=JOptionPane.showConfirmDialog(null, "45 ¿Tolerarías empezar tantas veces como fuere necesario hasta obtener el logro deseado?", null, JOptionPane.YES_NO_OPTION);
		x [46]=JOptionPane.showConfirmDialog(null, "46 ¿Distribuyes tus horarios del día adecuadamente para poder hacer todo lo planeado?", null, JOptionPane.YES_NO_OPTION);
		x [47]=JOptionPane.showConfirmDialog(null, "47 ¿Harías un curso para aprender a fabricar los instrumentos y/o piezas de las máquinas o aparatos con que trabajas?", null, JOptionPane.YES_NO_OPTION);
		x [48]=JOptionPane.showConfirmDialog(null, "48 ¿Elegirías una profesión en la tuvieras que estar algunos meses alejado de tu familia, por ejemplo el marino?", null, JOptionPane.YES_NO_OPTION);
		x [49]=JOptionPane.showConfirmDialog(null, "49 ¿Te radicarías en una zona agrícola-ganadera para desarrollar tus actividades como profesional?", null, JOptionPane.YES_NO_OPTION);
		x [50]=JOptionPane.showConfirmDialog(null, "50 ¿Cuando estás en un grupo trabajando, te entusiasma producir ideas originales y que sean tenidas en cuenta?", null, JOptionPane.YES_NO_OPTION);
		x [51]=JOptionPane.showConfirmDialog(null, "51 ¿Te resulta fácil coordinar un grupo de trabajo?", null, JOptionPane.YES_NO_OPTION);
		x [52]=JOptionPane.showConfirmDialog(null, "52 ¿Te resultó interesante el estudio de las ciencias biológicas?", null, JOptionPane.YES_NO_OPTION);
		x [53]=JOptionPane.showConfirmDialog(null, "53 ¿Si una gran empresa solicita un profesional como gerente de comercialización, te sentirías a gusto desempeñando ese rol?", null, JOptionPane.YES_NO_OPTION);
		x [54]=JOptionPane.showConfirmDialog(null, "54 ¿Te incluirías en un proyecto nacional de desarrollo de la principal fuente de recursos de tu provincia?", null, JOptionPane.YES_NO_OPTION);
		x [55]=JOptionPane.showConfirmDialog(null, "55 ¿Tenés interés por saber cuales son las causas que determinan ciertos fenómenos, aunque saberlo no altere tu vida?", null, JOptionPane.YES_NO_OPTION);
		x [56]=JOptionPane.showConfirmDialog(null, "56 ¿Descubriste algún filósofo o escritor que haya expresado tus mismas ideas con antelación?", null, JOptionPane.YES_NO_OPTION);
		x [57]=JOptionPane.showConfirmDialog(null, "57 ¿Desearías que te regalen algún instrumento musical para tu cumpleaños?", null, JOptionPane.YES_NO_OPTION);
		x [58]=JOptionPane.showConfirmDialog(null, "58 ¿Aceptarías colaborar con el cumplimiento de las normas en lugares públicos?", null, JOptionPane.YES_NO_OPTION);
		x [59]=JOptionPane.showConfirmDialog(null, "59 ¿Crees que tus ideas son importantes, y haces todo lo posible para ponerlas en práctica?", null, JOptionPane.YES_NO_OPTION);
		x [60]=JOptionPane.showConfirmDialog(null, "60 ¿Cuando se descompone un artefacto en tu casa, te dispones prontamente a repararlo?", null, JOptionPane.YES_NO_OPTION);
		x [61]=JOptionPane.showConfirmDialog(null, "61 ¿Formarías parte de un equipo de trabajo orientado a la preservación de la", null, JOptionPane.YES_NO_OPTION);
		x [62]=JOptionPane.showConfirmDialog(null, "62 ¿Acostumbras a leer revistas relacionadas con los últimos avance s científicos y tecnológicos en el área de la salud?", null, JOptionPane.YES_NO_OPTION);
		x [63]=JOptionPane.showConfirmDialog(null, "63 ¿Preservar las raíces culturales de nuestro país, te parece importante y necesario?", null, JOptionPane.YES_NO_OPTION);
		x [64]=JOptionPane.showConfirmDialog(null, "64 ¿Te gustaría realizar una investigación que contribuyera a hacer más justa la distribución de la riqueza?", null, JOptionPane.YES_NO_OPTION);
		x [65]=JOptionPane.showConfirmDialog(null, "65 ¿Te gustaría realizar tareas auxiliares en una nave, como por ejemplo izado y arriado de velas, pintura y conservación del casco, arreglo de averías,conservación de motores, etc?", null, JOptionPane.YES_NO_OPTION);
		x [66]=JOptionPane.showConfirmDialog(null, "66 ¿Crees que un país debe poseer la más alta tecnología armamentista, a cualquier precio?", null, JOptionPane.YES_NO_OPTION);
		x [67]=JOptionPane.showConfirmDialog(null, "67 ¿La libertad y la justicia son valores fundamentales en tu vida?", null, JOptionPane.YES_NO_OPTION);
		x [68]=JOptionPane.showConfirmDialog(null, "68 ¿Aceptarías hacer una práctica rentada en una industria de productos alimenticios en el sector de control de calidad?", null, JOptionPane.YES_NO_OPTION);
		x [69]=JOptionPane.showConfirmDialog(null, "69 ¿Consideras que la salud pública debe ser prioritaria, gratuita y eficiente para todos?", null, JOptionPane.YES_NO_OPTION);
		x [70]=JOptionPane.showConfirmDialog(null, "70 ¿Te interesaría investigar sobre alguna nueva vacuna?", null, JOptionPane.YES_NO_OPTION);
		x [71]=JOptionPane.showConfirmDialog(null, "71 ¿En un equipo de trabajo, preferís el rol de coordinador?", null, JOptionPane.YES_NO_OPTION);
		x [72]=JOptionPane.showConfirmDialog(null, "72 ¿En una discusión entre amigos, te ofreces como mediador?", null, JOptionPane.YES_NO_OPTION);
		x [73]=JOptionPane.showConfirmDialog(null, "73 ¿Estás de acuerdo con la formación de un cuerpo de soldados profesionales?", null, JOptionPane.YES_NO_OPTION);
		x [74]=JOptionPane.showConfirmDialog(null, "74 ¿Lucharías por una causa justa hasta las últimas consecuencias?", null, JOptionPane.YES_NO_OPTION);
		x [75]=JOptionPane.showConfirmDialog(null, "75 ¿Te gustaría investigar científicamente sobre cultivos agrícolas?", null, JOptionPane.YES_NO_OPTION);
		x [76]=JOptionPane.showConfirmDialog(null, "76 ¿Harías un nuevo diseño de una prenda pasada de moda, ante una reunión imprevista?", null, JOptionPane.YES_NO_OPTION);
		x [77]=JOptionPane.showConfirmDialog(null, "77 ¿Visitarías un observatorio astronómico para conocer en acción el funcionamiento de los aparatos?", null, JOptionPane.YES_NO_OPTION);
		x [78]=JOptionPane.showConfirmDialog(null, "78 ¿Dirigirías el área de importación y exportación de una empresa?", null, JOptionPane.YES_NO_OPTION);
		x [79]=JOptionPane.showConfirmDialog(null, "79 ¿Te inhibís al entrar a un lugar nuevo con gente desconocida?", null, JOptionPane.YES_NO_OPTION);
		x [80]=JOptionPane.showConfirmDialog(null, "80 ¿Te gratificaría el trabajar con niños?", null, JOptionPane.YES_NO_OPTION);
		x [81]=JOptionPane.showConfirmDialog(null, "81 ¿Harías el diseño de un afiche para una campaña contra el sida?" , null, JOptionPane.YES_NO_OPTION);
		x [82]=JOptionPane.showConfirmDialog(null, "82 ¿Dirigirías un grupo de teatro independiente?", null, JOptionPane.YES_NO_OPTION);
		x [83]=JOptionPane.showConfirmDialog(null, "83 ¿Enviarías tu currículum a una empresa automotriz que solicita gerente para su área de producción?", null, JOptionPane.YES_NO_OPTION);
		x [84]=JOptionPane.showConfirmDialog(null, "84 ¿Participarías en un grupo de defensa internacional dentro de alguna fuerza armada?", null, JOptionPane.YES_NO_OPTION);
		x [85]=JOptionPane.showConfirmDialog(null, "85 ¿Te costearías tus estudios trabajando en una auditoría?", null, JOptionPane.YES_NO_OPTION);
		x [86]=JOptionPane.showConfirmDialog(null, "86 ¿Eres de los que defiendes causas perdidas?", null, JOptionPane.YES_NO_OPTION);
		x [87]=JOptionPane.showConfirmDialog(null, "87 ¿Ante una emergencia epidémica participarías en una campaña brindando tu ayuda?", null, JOptionPane.YES_NO_OPTION);
		x [88]=JOptionPane.showConfirmDialog(null, "88 ¿Sabrías responder que significa ADN y ARN?", null, JOptionPane.YES_NO_OPTION);
		x [89]=JOptionPane.showConfirmDialog(null, "89 ¿Elegirías una carrera cuyo instrumento de trabajo fuere la utilización de un idioma extranjero?", null, JOptionPane.YES_NO_OPTION);
		x [90]=JOptionPane.showConfirmDialog(null, "90 ¿Trabajar con objetos te resulta más gratificante que trabajar con personas?", null, JOptionPane.YES_NO_OPTION);
		x [91]=JOptionPane.showConfirmDialog(null, "91 ¿Te resultaría gratificante ser asesor contable en una empresa reconocida?", null, JOptionPane.YES_NO_OPTION);
		x [92]=JOptionPane.showConfirmDialog(null, "92 ¿Ante un llamado solidario, te ofrecerías para cuidar a un enfermo?", null, JOptionPane.YES_NO_OPTION);
		x [93]=JOptionPane.showConfirmDialog(null, "93 ¿Te atrae investigar sobre los misterios del universo, por ejemplo los agujeros negros?", null, JOptionPane.YES_NO_OPTION);
		x [94]=JOptionPane.showConfirmDialog(null, "94 ¿El trabajo individual te resulta más rápido y efectivo que el trabajo grupal?", null, JOptionPane.YES_NO_OPTION);
		x [95]=JOptionPane.showConfirmDialog(null, "95 ¿Dedicarías parte de tu tiempo a ayudar a personas de zonas carenciadas?", null, JOptionPane.YES_NO_OPTION);
		x [96]=JOptionPane.showConfirmDialog(null, "96 ¿Cuando elegís tu ropa o decoras un ambiente, tienes en cuenta la combinación de los colores, las telas o el estilo de los muebles?", null, JOptionPane.YES_NO_OPTION);
		x [97]=JOptionPane.showConfirmDialog(null, "97 ¿Te gustaría trabajar como profesional dirigiendo la construcción de una empresa hidroeléctrica?", null, JOptionPane.YES_NO_OPTION);
		x [98]=JOptionPane.showConfirmDialog(null, "98 ¿Sabes qué es el PBI?", null, JOptionPane.YES_NO_OPTION);
		
		for(int q=0; q<x.length; q++) {

			if(x[q]==0) {
				x[q]=1;
			}
			else {
				x[q]=0;
			}
		}
		return x;
	}
	
	public void getMensaje(String mensaje) {
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
}

