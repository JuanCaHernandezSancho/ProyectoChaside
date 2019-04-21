package Modelo;

import java.io.*;


public class Archivo {
	private File miFile;
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private PrintWriter pw;
	private String termina;
	private BufferedWriter bw;
	
	public Archivo() {
		
	}
	
	public String leerArchivo() {
		String archivo="";
		miFile = new File("CHASIDE.txt");
		try {
			fr = new FileReader(miFile);
			br = new BufferedReader(fr);
			termina =br.readLine();
			while(termina!=null) {
				System.out.println(termina);
				termina =br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		}
		
		
		return archivo;
	}
	
	public void prepararArchivo() {
		miFile = new File("CHASIDE.txt");
		try {
			fw = new FileWriter(miFile);
			 bw =new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void escribirArchivo(String x) {
		try {
			
			pw.println(x);
			//pw.append(x);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void cerrarArchivo() {
		try {
			pw.close();
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
