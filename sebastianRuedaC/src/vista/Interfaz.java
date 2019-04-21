package vista;

import modelo.Persistencia;
import javax.swing.JOptionPane;


public class Interfaz 
{
	private Persistencia per;
	private int contador1;
	private int contador2;
	private int contador3;
	private int contador4;
	private int contador5;
	private int contador6;
	private int contador7;
	private int contador8;
	private int contador9;
	private int contador10;
	private int contador11;
	private int contador12;
	private int contador13;
	private int contador14;
	private String respuesta;
   
	
    public Interfaz()
    {
    	per = new Persistencia();
    	contador1 = 0;
    	contador2 = 0;
    	contador3 = 0;
    	contador4 = 0;
    	contador5 = 0;
    	contador6 = 0;
    	contador7 = 0;
    	contador8 = 0;
    	contador9 = 0;
    	contador10 = 0;
    	contador11 = 0;
    	contador12 = 0;
    	contador13 = 0;
    	contador14 = 0;
    	respuesta = "";
     }
	
	public int hacerPreguntasInteresC() 
	{
	 boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.InteresC.length; i++) 
	    	{
	    		
	    		String re = per.InteresC[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE INTERES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador1++;	
	    	    }
	    	}
	    	
	    	terminado = true;
	    }
	    
	    return contador1;
	}
	
	public int hacerPreguntasInteresH() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.InteresH.length; i++) 
	    	{
	    		String re = per.InteresH[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE INTERES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador2++;	
	    	    }
	    		
	    	}
	    	
	    	terminado = true;
	    }
	    
	    return contador2;
	 }
	
	public int hacerPreguntasInteresA() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.InteresA.length; i++) 
	    	{
	    		String re = per.InteresA[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE INTERES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador3++;	
	    	    }
	        }
	    	terminado = true;
	  }
	    return contador3;
	 }
	
	public int hacerPreguntasInteresS() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.InteresS.length; i++) 
	    	{
	    		String re = per.InteresS[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE INTERES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador4++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador4;
	 }
	
	public int hacerPreguntasInteresI() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.InteresI.length; i++) 
	    	{
	    		String re = per.InteresI[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE INTERES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador5++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador5;
	 }
	
	public int hacerPreguntasInteresD() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.InteresD.length; i++) 
	    	{
	    		String re = per.InteresD[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE INTERES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador6++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador6;
	 }
	
	public int hacerPreguntasInteresE() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.InteresE.length; i++) 
	    	{
	    		String re = per.InteresE[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE INTERES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador7++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador7;
	}
	
	
	
	
	public int hacerPreguntasAptitudesC() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.AptitudesC.length; i++) 
	    	{
	    		String re = per.AptitudesC[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE APTITUDES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador8++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador8;
	}
	
	public int hacerPreguntasAptitudesH() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.AptitudesH.length; i++) 
	    	{
	    		String re = per.AptitudesH[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE APTITUDES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador9++;	
	    	    }
	    	}
	    	terminado = true;
	    	    	
	    }
	    return contador9;
	}
	
	public int hacerPreguntasAptitudesA() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.AptitudesA.length; i++) 
	    	{
	    		String re = per.AptitudesA[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE APTITUDES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador10++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador10;
	}
	
	public int hacerPreguntasAptitudesS() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.AptitudesS.length; i++) 
	    	{
	    		String re = per.AptitudesS[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE APTITUDES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador11++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador11;
	}
	
	public int hacerPreguntasAptitudesI() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.AptitudesI.length; i++) 
	    	{
	    		String re = per.AptitudesI[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE APTITUDES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador12++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador12;
	}
	
	public int hacerPreguntasAptitudesD() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.AptitudesD.length; i++) 
	    	{
	    		String re = per.AptitudesD[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE APTITUDES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador13++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador13;
	}
	
	public int hacerPreguntasAptitudesE() 
	{
		boolean terminado = false;
	    while(terminado == false) 
	    {
	    	for(int i = 0 ; i< per.AptitudesE.length; i++) 
	    	{
	    		String re = per.AptitudesE[i];
	    	    JOptionPane.showMessageDialog(null, re , "PREGUNTAS CHASIDE APTITUDES", JOptionPane.INFORMATION_MESSAGE);
	    	    respuesta = JOptionPane.showInputDialog("de acuerdo a la anterior pregunta responda si o no");
	    	    if(respuesta.equalsIgnoreCase("si")) 
	    	    {
	    	       contador14++;	
	    	    }
	    	}
	    	terminado = true;
	    }
	    return contador14;
	}

	
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}


}
