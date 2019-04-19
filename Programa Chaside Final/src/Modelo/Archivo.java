package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	private BufferedReader br;	
	private FileReader fr;
	
	public Archivo() {
		
	}
	
	
	
	public  String[] leerArchivo() {
		File f= new File("Preguntas.txt"); 		
	   String[] preguntas= new String[98];
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String linea=br.readLine();					
			int i = 0;
			while(linea!=null&&i<98) {					
				preguntas[i]=linea;
				linea=br.readLine();				
				i++;			}
			fr.close();
		}catch(IOException e) {
			System.out.println("no se leyo");
		}
		System.out.println();
		return preguntas;
	}

	
	
}
