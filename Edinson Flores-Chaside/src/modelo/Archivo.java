package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

	private File f= new File("data\\Cuestionario.txt");
	private FileReader fr;
	private BufferedReader br;
	//private FileWriter fw;
	//private PrintWriter pw;
	private String linea;
	private String [] cuestionario;
	private int preguntas = 0;
	
	public Archivo () {
		
	}
	
	public void contarLineas () {
		try {
			fr=new FileReader(f);
			br = new BufferedReader(fr);
			linea=br.readLine();
			
			while(linea!=null) {
			preguntas++;	
			linea=br.readLine();
				
			}
					
		
			fr.close();
		}catch(IOException e) {
			System.out.println("error");
		}
	}
	
	public String [] leerArchivo() {
		try {
			cuestionario = new String [preguntas];
			fr=new FileReader(f);
			br = new BufferedReader(fr);
			linea=br.readLine();
			int i = 0;
			while(linea!=null) {
				
				cuestionario[i] = linea;
				linea = br.readLine();
				i++;
		
			}
			fr.close();
		}catch(IOException e) {
			System.out.println("error");
		}
		
		
		return cuestionario;
	}

}
