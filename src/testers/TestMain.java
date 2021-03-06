package testers;

import java.util.Scanner;

import dandObjects.*;

public class TestMain {
	
	public static Galaxy galaxia;
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Bem Vindo!");
		System.out.println("Iniciando a galaxia!");
		
		galaxia = new Galaxy();
		
		System.out.println("1: Conta sistemas na galaxia\n2: explora sistemas");
		
		int o = s.nextInt();
		
		if(o==1){
			countNumberOfStarsInGalaxy();
		}else{
			
			
			createQuadrant();
		
			while(true){
				printStarsInQuadrant();
			}
		}

		
		
	}
	
	public static void countNumberOfStarsInGalaxy(){
		long number = 0;
		
		for(int y=0;y<1000;y++){
			
			for(int x=0;x<1000;x++){
				
				System.out.println("\n==========\nX:"+x+"/1000\nY:"+y+"/1000\nStars so far: "+number);
				
				for(int z=0;z<=30;z++){
					
					galaxia.generateQuadrant(x, y, z);
					number+=galaxia.getNumberOfStarsInQuadrant();
					
					System.out.print(".");
				}//Z
			}//Y
		}//X
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(number);
	}//countNumberOfStarsInGalaxy
	
	
	public static void createQuadrant(){
		
		System.out.println("Entre com as coordenadas no quadrante.");
		
		System.out.println("X(de 0 a 999):");
		int x = s.nextInt();
		
		System.out.println("Y(de 0 a 999):");
		int y = s.nextInt();
		
		System.out.println("Z(de 0 a 30):");
		int z = s.nextInt();
		
		System.out.println("Criando o quadrante...");
		galaxia.generateQuadrant(x, y, z);
		
		System.out.println("Quadrante criado!");
		
	}
	
	
	public static void printStarsInQuadrant(){
		
		
		System.out.println("Estrelas no quadrante: "+galaxia.getNumberOfStarsInQuadrant());
		
		System.out.println("Qual estrela deseja ver? (entre com o número da mesma.)");
		
		int i=s.nextInt();
		i++;
		System.out.println("=========================================================");
		System.out.println("Nome da estrela: "+galaxia.getQuadrant().getSolarSys(i).getSolarSysName());
		System.out.println("Seed da estrela: "+galaxia.getQuadrant().getSolarSys(i).getSolarSysSeed());
		System.out.println("Cood X da estrela: "+galaxia.getQuadrant().getSolarSys(i).getSolarSysXCoord());
		System.out.println("Cood Y da estrela: "+galaxia.getQuadrant().getSolarSys(i).getSolarSysYCoord());
		System.out.println("Cood Z da estrela: "+galaxia.getQuadrant().getSolarSys(i).getSolarSysZCoord());
		
		
		
		
		
		
		
	}

}
