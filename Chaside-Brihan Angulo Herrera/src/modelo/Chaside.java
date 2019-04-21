package modelo;

public class Chaside {
	
	int c = 0;
	int h = 0;
	int a = 0;
	int s = 0;
	int i = 0;
	int d = 0;
	int e = 0;
	String respuesta;
	
	public Chaside() {
		
	}
	
	public String calcularInteres(int x []) {
		
		if(x[98]==1) {	
			c++;
		}if(x[12]==1) {
			c++;
		}if(x[64]==1) {
			c++;
		}if(x[53]==1) {
			c++;
		}if(x[85]==1) {
			c++;
		}if(x[1]==1) {
			c++;
		}if(x[78]==1) {
			c++;
		}if(x[20]==1) {
			c++;
		}if(x[71]==1) {
			c++;
		}if(x[91]==1) {
			c++;
		}if(x[9]==1) {
			h++;
		}if(x[34]==1) {
			h++;
		}if(x[80]==1) {
			h++;
		}if(x[25]==1) {
			h++;
		}if(x[95]==1) {
			h++;
		}if(x[67]==1) {
			h++;
		}if(x[41]==1) {
			h++;
		}if(x[74]==1) {
			h++;
		}if(x[56]==1) {
			h++;
		}if(x[89]==1) {
			h++;
		}if(x[21]==1) {
			a++;
		}if(x[45]==1) {
			a++;
		}if(x[96]==1) {
			a++;
		}if(x[57]==1) {
			a++;
		}if(x[28]==1) {
			a++;
		}if(x[11]==1) {
			a++;
		}if(x[5]==1) {
			a++;
		}if(x[3]==1) {
			a++;
		}if(x[81]==1) {
			a++;
		}if(x[36]==1) {
			a++;
		}if(x[33]==1) {
			s++;
		}if(x[92]==1) {
			s++;
		}if(x[70]==1) {
			s++;
		}if(x[8]==1) {
			s++;
		}if(x[87]==1) {
			s++;
		}if(x[62]==1) {
			s++;
		}if(x[23]==1) {
			s++;
		}if(x[44]==1) {
			s++;
		}if(x[16]==1) {
			s++;
		}if(x[52]==1) {
			s++;
		}if(x[75]==1) {
			i++;
		}if(x[6]==1) {
			i++;
		}if(x[19]==1) {
			i++;
		}if(x[38]==1) {
			i++;
		}if(x[60]==1) {
			i++;
		}if(x[27]==1) {
			i++;
		}if(x[83]==1) {
			i++;
		}if(x[54]==1) {
			i++;
		}if(x[47]==1) {
			i++;
		}if(x[97]==1) {
			i++;
		}if(x[84]==1) {
			d++;
		}if(x[31]==1) {
			d++;
		}if(x[48]==1) {
			d++;
		}if(x[73]==1) {
			d++;
		}if(x[5]==1) {
			d++;
		}if(x[65]==1) {
			d++;
		}if(x[14]==1) {
			d++;
		}if(x[37]==1) {
			d++;
		}if(x[58]==1) {
			d++;
		}if(x[24]==1) {
			d++;
		}if(x[77]==1) {
			e++;
		}if(x[42]==1) {
			e++;
		}if(x[88]==1) {
			e++;
		}if(x[17]==1) {
			e++;
		}if(x[93]==1) {
			e++;
		}if(x[32]==1) {
			e++;
		}if(x[68]==1) {
			e++;
		}if(x[49]==1) {
			e++;
		}if(x[35]==1) {
			e++;
		}if(x[61]==1) {
			e++;
		}
		
		if(c>h && c>a && c>s && c>i && c>d && c>e) {	
			respuesta= "Para Administrator Y Contable, Tus Intereses Son:"+"\n"+"-Organizar"+"\n"+"-Supervision"+"\n"+"-orden"+"\n"+"-Analisis Y Sintesis"+"\n"+"-Colaboracion"+"\n"+"-Calculo"+"\n"+"-Liderazgo"+"\n"+"-Participacion Activa";
		}
		if(h>c && h>a && h>s && h>i && h>d && h>e) {
			respuesta= "Para Humanistica y Sociales, Tus Intereses Son:"+"\n"+"-Precision Verbal"+"\n"+"-Organizacion"+"\n"+"-Relacion De Hechos"+"\n"+"-Linguistica"+"\n"+"-Orden"+"\n"+"-Justicia"+"\n"+"-Analitico";
		}
		if(a>h && a>c && a>s && a>i && a>d && a>e) {
			respuesta= "Para Artisticas, Tus Intereses Son:"+"\n"+"-Estetico"+"\n"+"-Armonico"+"\n"+"-Manual"+"\n"+"-Visual"+"\n"+"-Auditivo"+"\n"+"-Observacion Y Analisis"+"\n"+"-Senso-Perceptivo";
		}
		if(s>h && s>a && s>c && s>i && s>d && s>e) {
			respuesta= "Para Medicina y Cs. De La Salud, Tus Intereses Son:"+"\n"+"-Asistir"+"\n"+"-Investigar"+"\n"+"-Precision"+"\n"+"-Senso-Perceptivo"+"\n"+"-Analitico"+"\n"+"-Ayuda"+"\n"+"-Curar"+"\n"+"-Rehabilitar";
		}
		if(i>h && i>a && i>s && i>c && i>d && i>e) {
			respuesta= "Para Ingeneria y Computacion, Tus Intereses Son:"+"\n"+"-Calculo"+"\n"+"-Cientifico"+"\n"+"-Manual"+"\n"+"-Exacto"+"\n"+"-Planificar"+"\n"+"-Organizar"+"\n"+"-Controlar";
		}
		if(d>h && d>a && d>s && d>i && d>c && d>e) {
			respuesta= "Para Defensa y Seguridad, Tus Intereses Son:"+"\n"+"-Justicia"+"\n"+"-Equidad"+"\n"+"-Colaboracion"+"\n"+"-Espiritu De Equipo"+"\n"+"-Liderazgo"+"\n"+"-Coordinacion"+"\n"+"-Destreza Fisica";
		}
		if(e>h && e>a && e>s && e>i && e>d && e>c) {
			respuesta= "Para Ciencias Exactas y Agrarias, Tus Intereses Son:"+"\n"+"-Investigacion"+"\n"+"-Orden"+"\n"+"-Organizacion"+"\n"+"-Analisis Y Sintesis"+"\n"+"-Numerico"+"\n"+"-Clasificar"+"\n"+"-Precision"+"\n"+"-Exacto";
		}
		
		System.out.println(c);
		System.out.println(h);
		System.out.println(a);
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		System.out.println(e);
		
		return respuesta;
	}
	
	public String calcularAptitudes(int x[]) {
		
			if(x[15]==1) {	
				c++;
			}if(x[51]==1) {
				c++;
			}if(x[2]==1) {
				c++;
			}if(x[46]==1) {
				c++;
			}if(x[63]==1) {
				h++;
			}if(x[30]==1) {
				h++;
			}if(x[72]==1) {
				h++;
			}if(x[86]==1) {
				h++;
			}if(x[22]==1) {
				a++;
			}if(x[39]==1) {
				a++;
			}if(x[76]==1) {
				a++;
			}if(x[82]==1) {
				a++;
			}if(x[69]==1) {
				s++;
			}if(x[40]==1) {
				s++;
			}if(x[29]==1) {
				s++;
			}if(x[4]==1) {
				s++;
			}if(x[26]==1) {
				i++;
			}if(x[59]==1) {
				i++;
			}if(x[90]==1) {
				i++;
			}if(x[10]==1) {
				i++;
			}if(x[13]==1) {
				d++;
			}if(x[66]==1) {
				d++;
			}if(x[18]==1) {
				d++;
			}if(x[43]==1) {
				d++;
			}if(x[94]==1) {
				e++;
			}if(x[7]==1) {
				e++;
			}if(x[79]==1) {
				e++;
			}if(x[55]==1) {
				e++;
			}
			
			if(c>h && c>a && c>s && c>i && c>d && c>e) {	
				respuesta= "Para Administrator Y Contable, Tus Aptitutedes Son:"+"\n"+"-Persuasivo"+"\n"+"-Objetivo"+"\n"+"-Práctico"+"\n"+"-Tolerante"+"\n"+"-Responsabe"+"\n"+"-Ambicioso"+"\n"+"-Dinámico"+"\n"+"-Resolutivo";
			}
			if(h>c && h>a && h>s && h>i && h>d && h>e) {
				respuesta= "Para Humanistica Y Sociales, Tus Aptitutedes Son:"+"\n"+"-Responsable"+"\n"+"-Justo"+"\n"+"-Conciliador"+"\n"+"-Persuasivo"+"\n"+"-Sagaz"+"\n"+"-Imaginativo"+"\n"+"-Compresivo"+"\n"+"-Estable Emocionalmente";
			}
			if(a>h && a>c && a>s && a>i && a>d && a>e) {
				respuesta= "Para Artista, Tus Aptitutedes Son:"+"\n"+"-Sensible"+"\n"+"-Imaginativo"+"\n"+"-Creativo"+"\n"+"-Detallista"+"\n"+"-Innovador"+"\n"+"-Intuitivo"+"\n"+"-Paciente"+"\n"+"-Espontaneo";
			}
			if(s>h && s>a && s>c && s>i && s>d && s>e) {
				respuesta= "Para Medicina y Cs. De La Salud, Tus Aptitutedes Son:"+"\n"+"-Altruista"+"\n"+"-Solidario"+"\n"+"-Paciente"+"\n"+"-Compresivo"+"\n"+"-Respetuoso"+"\n"+"-Persuasivo"+"\n"+"-Servicial"+"\n"+"-Observador";
			}
			if(i>h && i>a && i>s && i>c && i>d && i>e) {
				respuesta= "Para Ingeneria y Computacion, Tus Aptitutedes Son:"+"\n"+"-Preciso"+"\n"+"-Practico"+"\n"+"-Critico"+"\n"+"-Analitico"+"\n"+"-Rigido"+"\n"+"-Racional"+"\n"+"-Indepediente";
			}
			if(d>h && d>a && d>s && d>i && d>c && d>e) {
				respuesta= "Para Defensa y Seguridad, Tus Aptitutedes Son:"+"\n"+"-Arriesgado"+"\n"+"-Solidario"+"\n"+"-Valiente"+"\n"+"-Agresivo"+"\n"+"-Persuasivo"+"\n"+"-Aventurero"+"\n"+"-Equilibrio Psiquico";
				}
			if(e>h && e>a && e>s && e>i && e>d && e>c) {
				respuesta= "Para Ciencias Exactas y Agrarias, Tus Aptitutedes Son:"+"\n"+"-Metodico"+"\n"+"-Analitico"+"\n"+"-Observador"+"\n"+"-Introvertido"+"\n"+"-Paciente"+"\n"+"-Seguro"+"\n"+"-Independiente"+"\n"+"-Intuitivo";	
				}
			
		System.out.println(c);
		System.out.println(h);
		System.out.println(a);
		System.out.println(s);
		System.out.println(i);
		System.out.println(d);
		System.out.println(e);
		
		return respuesta;
	}
}
