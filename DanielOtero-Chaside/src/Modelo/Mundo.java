package Modelo;

import java.util.Arrays;

public class Mundo {
	
	//Intereses !!!
	private int[] letraCIn = {97,11,63,52,84,0,77,19,70,90};
	private int[] letraHIn = {8,33,79,24,94,66,40,73,55,88};
	private int[] letraAIn = {20,44,95,56,27,10,4,2,80,37};
	private int[] letraSIn = {32,91,89,7,86,61,22,43,15,51};
	private int[] letraIIn = {74,5,18,39,59,26,82,53,46,96};
	private int[] letraDIn = {83,30,47,72,4,64,13,36,57,23};
	private int[] letraEIn = {76,41,87,16,92,31,67,48,34,60};

	
	//Aptitudes
	private int[] letraCAp = {14,50,1,45};
	private int[] letraHAp = {62,29,71,86};
	private int[] letraAAp = {21,38,75,81};
	private int[] letraSAp = {68,39,28,3};
	private int[] letraIAp = {25,58,89,9};
	private int[] letraDAp = {12,65,17,42};
	private int[] letraEAp = {93,6,78,54};
	
	
	// soluciones
	
	private int[] resI = {0,0,0,0,0,0,0};
	private int[] resA = {0,0,0,0,0,0,0};
	
	private int[] resIO;
	private int[] resAO;
	private String letraI;
	private String letraA;
	
	private String[] res;
	
	
	public Mundo() {
		
		//int[] letraC = {98,12,64,53,85,1,78,20,71,91,15,51,2,46};
		
		
	}
	public String[] comparar(int[] respuestas) {
		//comparar intereses
		
		for(int i = 0; i < this.letraCIn.length; i++) {
			if(respuestas[this.letraCIn[i]] == 0) {
				resI[0]+=1;
			}
		}
		for(int i = 0; i < this.letraHIn.length; i++) {
			if(respuestas[this.letraHIn[i]] == 0) {
				resI[1]+=1;
			}
		}
		for(int i = 0; i < this.letraAIn.length; i++) {
			if(respuestas[this.letraAIn[i]] == 0) {
				resI[2]+=1;
			}
		}
		for(int i = 0; i < this.letraSIn.length; i++) {
			if(respuestas[this.letraSIn[i]] == 0) {
				resI[3]+=1;
			}
		}
		for(int i = 0; i < this.letraIIn.length; i++) {
			if(respuestas[this.letraIIn[i]] == 0) {
				resI[4]+=1;
			}
		}
		for(int i = 0; i < this.letraDIn.length; i++) {
			if(respuestas[this.letraDIn[i]] == 0) {
				resI[5]+=1;
			}
		}
		for(int i = 0; i < this.letraEIn.length; i++) {
			if(respuestas[this.letraEIn[i]] == 0) {
				resI[6]+=1;
			}
		}
		resIO = new int[7];
		resIO = resI;
		Arrays.sort(resIO);
		System.out.println(resIO[0]);
		
		for(int i =0; i< resI.length;i++) {
			if(resI[i] == resIO[0]) {
				if(i == 0) {
					this.letraI = "c";
				}
				else if(i == 1) {
					this.letraI = "h";
				}
				else if(i == 2) {
					this.letraI = "a";
				}
				else if(i == 3) {
					this.letraI = "s";
				}
				else if(i == 4) {
					this.letraI = "i";
				}
				else if(i == 5) {
					this.letraI = "d";
				}
				else if(i == 6) {
					this.letraI = "e";
				}
				
			}
		}
		
		//comparar aptitudes
		
		for(int i = 0; i < this.letraCAp.length; i++) {
			if(respuestas[this.letraCAp[i]] == 0) {
				resA[0]+=1;
			}
		}
		for(int i = 0; i < this.letraHAp.length; i++) {
			if(respuestas[this.letraHAp[i]] == 0) {
				resA[1]+=1;
			}
		}
		for(int i = 0; i < this.letraAAp.length; i++) {
			if(respuestas[this.letraAAp[i]] == 0) {
				resA[2]+=1;
			}
		}
		for(int i = 0; i < this.letraSAp.length; i++) {
			if(respuestas[this.letraSAp[i]] == 0) {
				resA[3]+=1;
			}
		}
		for(int i = 0; i < this.letraIAp.length; i++) {
			if(respuestas[this.letraIAp[i]] == 0) {
				resA[4]+=1;
			}
		}
		for(int i = 0; i < this.letraDAp.length; i++) {
			if(respuestas[this.letraDAp[i]] == 0) {
				resA[5]+=1;
			}
		}
		for(int i = 0; i < this.letraEAp.length; i++) {
			if(respuestas[this.letraEAp[i]] == 0) {
				resA[6]+=1;
			}
		}
		
		resAO = new int[7];
		resAO = resI;
		Arrays.sort(resAO);
		
		for(int i =0; i< resA.length;i++) {
			if(resA[i] == resAO[0]) {
				if(i == 0) {
					this.letraA = "c";
				}
				else if(i == 1) {
					this.letraA = "h";
				}
				else if(i == 2) {
					this.letraA = "a";
				}
				else if(i == 3) {
					this.letraA = "s";
				}
				else if(i == 4) {
					this.letraA = "i";
				}
				else if(i == 5) {
					this.letraA = "d";
				}
				else if(i == 6) {
					this.letraA = "e";
				}
				
			}
		}
		
		res = new String[2];
		res[0] = letraI;
		res[1]=  letraA;
		System.out.println(res[0]);
		System.out.println(res[1]);
		
		return res;
		
		
		
	}
	

	

	
	

}
