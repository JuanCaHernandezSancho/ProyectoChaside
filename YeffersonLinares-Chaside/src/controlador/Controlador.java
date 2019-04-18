package controlador;

import java.io.IOException;

import modelo.Mundo;
import vista.Interfaz;

/**
 * @author Yefferson Linares
 */
public class Controlador 
{

	private Interfaz inter;
	private Mundo m;
	
	public Controlador() throws IOException
	{
		inter = new Interfaz();
		m = new Mundo();
		this.ejecutar();
	}
	
	public void pasarArreglo() throws IOException
	{
		m.getArchivo().llenarArreglo();
	}
	
	public void pasarRespuestas()
	{
		int[] z = new int[98];
		String[] pro = m.getArchivo().getTestVocacional();
		for(int x=0;x<pro.length;x++)
		{
			z[x] = inter.capturarDato(pro[x]);
		}
		m.getTest().guardarRespuestas(z);
	}
	
	public void mostarResultados()
	{
		inter.getMensaje(m.getTest().calificarRespuestas());
	}
	
	public void ejecutar() throws IOException
	{
		this.pasarArreglo();
		this.pasarRespuestas();
		this.mostarResultados();
	}
}