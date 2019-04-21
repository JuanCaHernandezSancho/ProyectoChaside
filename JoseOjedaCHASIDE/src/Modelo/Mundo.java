package Modelo;

import java.util.Arrays;
import java.util.Random;

public class Mundo {
	
	 int[]sumas = new int[7];
	 int[]sumas2 = new int[7];
	 String chas="";
	 int numeropregunta=0;
	
	public Mundo() {	 
	 for(int i=0; i<=6;i++) {
		 sumas[i]=0;
		 sumas2[i]=0;
	 }
	}
public void setRespuestas(String pRespuestas){	

if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==0 || numeropregunta==11 || numeropregunta==63 || numeropregunta==52 ||
numeropregunta==84 || numeropregunta==77 ||numeropregunta==19 ||numeropregunta==70 ||numeropregunta==90 ||numeropregunta==97)){
		sumas[0]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==8 || numeropregunta==33 || numeropregunta==79 || numeropregunta==24 ||
numeropregunta==94 || numeropregunta==66 ||numeropregunta==40 ||numeropregunta==73 ||numeropregunta==55 ||numeropregunta==88)){
		sumas[1]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==20 || numeropregunta==44 || numeropregunta==95 || numeropregunta==56 ||
numeropregunta==27 || numeropregunta==10 ||numeropregunta==4 ||numeropregunta==2 ||numeropregunta==80 ||numeropregunta==35)){
		sumas[2]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==32 || numeropregunta==91 || numeropregunta==69 || numeropregunta==7 ||
numeropregunta==86 || numeropregunta==61 ||numeropregunta==22 ||numeropregunta==43 ||numeropregunta==15 ||numeropregunta==51)){
		sumas[3]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==74 || numeropregunta==5 || numeropregunta==18 || numeropregunta==37 ||
numeropregunta==59 || numeropregunta==26 ||numeropregunta==82 ||numeropregunta==53 ||numeropregunta==46 ||numeropregunta==96)){
		sumas[4]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==83 || numeropregunta==30 || numeropregunta==47 || numeropregunta==72 ||
numeropregunta==4 || numeropregunta==64 ||numeropregunta==13 ||numeropregunta==36 ||numeropregunta==57 ||numeropregunta==23)){
		sumas[5]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==76 || numeropregunta==41 || numeropregunta==87 || numeropregunta==16 ||
numeropregunta==92 || numeropregunta==31 ||numeropregunta==67 ||numeropregunta==48 ||numeropregunta==34 ||numeropregunta==60)){
		sumas[6]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==14 || numeropregunta==50 || numeropregunta==1 || numeropregunta==45)){
		sumas2[0]++;
	}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==62 || numeropregunta==29 || numeropregunta==71 || numeropregunta==85)){
	sumas2[1]++;
}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==21 || numeropregunta==38 || numeropregunta==75 || numeropregunta==81)){
	sumas2[2]++;
}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==68 || numeropregunta==39 || numeropregunta==28 || numeropregunta==3)){
	sumas2[3]++;
}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==25 || numeropregunta==58 || numeropregunta==89 || numeropregunta==9)){
	sumas2[4]++;
}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==12 || numeropregunta==65 || numeropregunta==17 || numeropregunta==42)){
	sumas2[5]++;
}
if(pRespuestas.equalsIgnoreCase("si") && (numeropregunta==93 || numeropregunta==6 || numeropregunta==78 || numeropregunta==54)){
	sumas2[6]++;
}
	numeropregunta++;
}
public String getRespuestas(){
	chas+="   INTERESES   \n  C, H, A, S, I, D, E \n" +Arrays.toString(sumas) +"\n   APTITUDES   \n C, H, A, S, I, D, E \n" +Arrays.toString(sumas2) ;
	return chas;
}

}
