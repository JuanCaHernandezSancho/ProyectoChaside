package controlador;
import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo mu ;
	private Interfaz in;
    private String chaside;
    private String cha;
    private String de;

	
    public Controlador() 
    {
      	mu = new Mundo();
      	in = new Interfaz();
      	
      	mu.calcularChasideInteresC(in.hacerPreguntasInteresC() ,in.hacerPreguntasInteresH(), in.hacerPreguntasInteresA(), in.hacerPreguntasInteresS(), in.hacerPreguntasInteresI(), in.hacerPreguntasInteresD(), in.hacerPreguntasInteresE());     	
      	mu.calcularChasideAptitudes(in.hacerPreguntasAptitudesC(), in.hacerPreguntasAptitudesH(), in.hacerPreguntasAptitudesA(), in.hacerPreguntasAptitudesS(), in.hacerPreguntasAptitudesI(), in.hacerPreguntasAptitudesD(), in.hacerPreguntasAptitudesE());
      
        in.escribirDato(mu.opcionesDeCarrera1());
        in.escribirDato(mu.opcionesDeCarrera2());
        
        cha = mu.opcionesDeCarrera1() ;
        
        de = mu.opcionesDeCarrera2() ;
        
        chaside = cha + "\n"+  de;
        
        mu.getAr().escribirArchivo(chaside);
    	in.escribirDato(mu.getAr().leerArchivo());
    
    }
}
