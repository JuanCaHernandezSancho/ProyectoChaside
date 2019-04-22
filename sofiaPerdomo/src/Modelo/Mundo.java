package Modelo;
import Vista.PanelPreguntas;
import Modelo.Persistencia;

public class Mundo {

	int[] intereses;
	int[] aptitudes;
	Persistencia per;
	PanelPreguntas panpre;
	
	public Mundo() {
		int[] intereses = new int[7];
		int[] aptitudes = new int[7];
		per= new Persistencia();
		panpre = new PanelPreguntas();
		
		intereses[0]=panpre.getIntC();
		intereses[1]=panpre.getIntH();
		intereses[2]=panpre.getIntA();
		intereses[3]=panpre.getIntS();
		intereses[4]=panpre.getIntI();
		intereses[5]=panpre.getIntD();
		intereses[6]=panpre.getIntE();
		
		aptitudes[0]=panpre.getAptC();
		aptitudes[1]=panpre.getAptH();
		aptitudes[2]=panpre.getAptA();
		aptitudes[3]=panpre.getAptS();
		aptitudes[4]=panpre.getAptI();
		aptitudes[5]=panpre.getAptD();
		aptitudes[6]=panpre.getAptE();
				
	}
	

				
				


	
 
}
