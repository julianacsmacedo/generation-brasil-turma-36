package Familia36;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float anoA, mesA, diasA, dataDias;
		
			Scanner leia = new Scanner(System.in);
			System.out.println("\nEscreva quantos anos voc� tem: ");
			anoA = leia.nextFloat();
			System.out.println("\nEscreva quantos meses voc� tem: ");
			mesA = leia.nextFloat();
			System.out.println("\nEscreva quantos dias voc� tem: ");
			diasA = leia.nextFloat();
			
			dataDias = (anoA * 365) + (mesA * 30) + diasA;
			
			System.out.printf("\nSua idade em dias � de: ",dataDias);		

	}

}
