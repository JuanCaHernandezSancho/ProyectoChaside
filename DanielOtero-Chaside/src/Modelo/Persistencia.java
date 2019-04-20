package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistencia {

	ArrayList<String> preguntas; 
	
	public void crearArchivo() {
		File f  = new File("preguntas.txt");
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			fw.close();
			
		}catch(IOException e) {
			System.out.println("error");
		}
		
	}
	public ArrayList<String> leerArchivo() {
		preguntas = new ArrayList<String>();
		File f  = new File("preguntas.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			preguntas.add(linea);
			while(linea !=null) {
				linea = br.readLine();
				if(linea != null || linea == "") {
					preguntas.add(linea);
				}
				
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
		
		
		System.out.println(preguntas.size());
		return preguntas;
		
	}
	
	
}
