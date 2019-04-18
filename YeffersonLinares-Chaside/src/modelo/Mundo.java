package modelo;

import java.io.IOException;

public class Mundo 
{

	private Test test;
	private Archivo archivo;
	
	public Mundo() throws IOException
	{
		test = new Test();
		archivo = new Archivo();
	}
	
	public Test getTest()
	{
		return test;
	}
	
	public Archivo getArchivo()
	{
		return archivo;
	}
	
}