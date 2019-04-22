package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Archivo 
{
	private File f;
	private FileReader fr;
	private BufferedReader br;
	private String line;
	
	public Archivo()
	{
		
	}
	public String readQuestions()
	{
		String str = "";
		f = new File("./docs/resources/Questions.txt");
		try 
		{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			line = br.readLine();
			while(line != null)
			{
				String[] preguntas = br.readLine().split("\n");
				for (int i = 0; i < preguntas.length; i++) 
				{
					preguntas[i].trim();
				}
				str+=line+"\n";
				line = br.readLine();
			}
			fr.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return str;
	}
	public String getLine() {
		return line;
	}
}
