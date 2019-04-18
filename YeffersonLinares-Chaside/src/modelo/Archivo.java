package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Archivo 
{
	private String[] testVocacional;
	private File input;
	private FileReader archivoLectura;
	private BufferedReader lector;

	public Archivo()
	{
		testVocacional = new String[98];
		input = new File("src/Test.txt");
	}
	
	public String[] llenarArreglo() throws IOException
	{
		archivoLectura = new FileReader(input);
		lector = new BufferedReader(archivoLectura);
		String cadena = lector.readLine();
		for(int x=0;x<testVocacional.length && cadena!=null;x++)
		{
			testVocacional[x] = cadena+"\n";
			cadena = lector.readLine();
		}
		return testVocacional;
	}
	
	public String[] getTestVocacional()
	{
		return testVocacional;
	}
}