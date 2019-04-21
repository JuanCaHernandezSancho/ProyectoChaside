package modelo;

import java.util.ArrayList;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class Mundo {
	
	private Chaside aptitudes;
	private Chaside intereses;

	private ArrayList<Pregunta> preguntas; 
	private int numPreguntas;

	public Mundo() {
		preguntas = new ArrayList<Pregunta>();
		numPreguntas =0;
		aptitudes = new Chaside();
		intereses = new Chaside();
		
	}
	public boolean agregarpreguntas(String texto, int num, String clase, String letra){
		
		boolean agrego = false;
		Pregunta nueva = new Pregunta(texto, num, clase, letra);
		preguntas.add(nueva);
		agrego=true;
		numPreguntas++;
			
		return agrego;
	}
	public String ContarGanadorApti() {
		int max =aptitudes.getC();
		String letra = "c";
		
		if (max<aptitudes.getH()) {
			max =aptitudes.getH();
			letra = "h";
		} 
		else if(max<aptitudes.getA()) {
			max = aptitudes.getA();
			letra = "a";

		}
		else if(max<aptitudes.getS()) {
			max = aptitudes.getS();
			letra = "s";

		}
		else if(max<aptitudes.getI()) {
			max = aptitudes.getI();
			letra = "i";

		}
		else if(max<aptitudes.getD()) {
			max = aptitudes.getD();
			letra = "d";

		}
		else if(max<aptitudes.getE()) {
			max = aptitudes.getE();
			letra = "e";

		}
		
		return letra;
		
		
	}
	public String ContarGanadorInter() {
		int max =intereses.getC();
		String letra = "c";
		
		if (max<intereses.getH()) {
			max =intereses.getH();
			letra = "h";
		} 
		else if(max<intereses.getA()) {
			max = intereses.getA();
			letra = "a";

		}
		else if(max<intereses.getS()) {
			max = intereses.getS();
			letra = "s";

		}
		else if(max<intereses.getI()) {
			max = intereses.getI();
			letra = "i";

		}
		else if(max<intereses.getD()) {
			max = intereses.getD();
			letra = "d";

		}
		else if(max<intereses.getE()) {
			max = intereses.getE();
			letra = "e";
		}
		
		return letra;
	}
	
	public void hacerPreguntasAptitudes(int numero, int respuesta) {
		String letra = null;
		int c= aptitudes.getC();
		int h= aptitudes.getH();
		int a= aptitudes.getA();
		int s= aptitudes.getS();
		int i= aptitudes.getI();
		int d= aptitudes.getD();
		int e= aptitudes.getE();
		
			letra =preguntas.get(numero).getLetra();

			if (letra.equals("c") && respuesta == 0) {
				c++;
				aptitudes.setC(c); 
			}
			else if (letra.equals("h")&& respuesta == 0) {
				h ++;
				aptitudes.setH(h);
			}
			else if (letra.equals("a")&& respuesta == 0) {
				a++;
				aptitudes.setA(a);
			}
			else if (letra.equals("s")&& respuesta == 0) {
				s++;
				aptitudes.setS(s);
			}
			else if (letra.equals("i")&& respuesta == 0) {
				i++;
				aptitudes.setI(i);
			}
			else if (letra.equals("d")&& respuesta == 0) {
				d++;
				aptitudes.setD(d);
			}
			else if (letra.equals("e")&& respuesta == 0) {
				e++;
				aptitudes.setE(e);
			}
		
			System.out.print(c+" ");
			System.out.print(h+" ");
			System.out.print(a+" ");
			System.out.print(s+" ");
			System.out.print(i+" ");
			System.out.print(d+" ");
			System.out.println(e+"A");
		
	}
	public void hacerPreguntasIntereses(int numero, int respuesta) {
		String letra = null;
		int c= intereses.getC();
		int h= intereses.getH();
		int a= intereses.getA();
		int s= intereses.getS();
		int i= intereses.getI();
		int d= intereses.getD();
		int e= intereses.getE();
		
			letra =preguntas.get(numero).getLetra();

			if (letra.equals("c") && respuesta == 0) {
				c++;
				intereses.setC(c); 
			}
			else if (letra.equals("h")&& respuesta == 0) {
				h ++;
				intereses.setH(h);
			}
			else if (letra.equals("a")&& respuesta == 0) {
				a++;
				intereses.setA(a);
			}
			else if (letra.equals("s")&& respuesta == 0) {
				s++;
				intereses.setS(s);
			}
			else if (letra.equals("i")&& respuesta == 0) {
				i++;
				intereses.setI(i);
			}
			else if (letra.equals("d")&& respuesta == 0) {
				d++;
				intereses.setD(d);
			}
			else if (letra.equals("e")&& respuesta == 0) {
				e++;
				intereses.setE(e);
			}
		
			System.out.print(c+" ");
			System.out.print(h+" ");
			System.out.print(a+" ");
			System.out.print(s+" ");
			System.out.print(i+" ");
			System.out.print(d+" ");
			System.out.println(e+"I");
		
	}	
	
	
	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
	public int getNumPreguntas() {
		return numPreguntas;
	}
	public void setNumPreguntas(int numPreguntas) {
		this.numPreguntas = numPreguntas;
	}
	public Chaside getAptitudes() {
		return aptitudes;
	}
	public void setAptitudes(Chaside aptitudes) {
		this.aptitudes = aptitudes;
	}
	public Chaside getIntereses() {
		return intereses;
	}
	public void setIntereses(Chaside intereses) {
		this.intereses = intereses;
	}
	
	


	
	

}
