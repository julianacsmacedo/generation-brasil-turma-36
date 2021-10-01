package Familia36;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float anoA, mesA, diasA, dataDias;
		
			Scanner leia = new Scanner(System.in);
			System.out.println("\nEscreva quantos anos você tem: ");
			anoA = leia.nextFloat();
			System.out.println("\nEscreva quantos meses você tem: ");
			mesA = leia.nextFloat();
			System.out.println("\nEscreva quantos dias você tem: ");
			diasA = leia.nextFloat();
			
			dataDias = (anoA * 365) + (mesA * 30) + diasA;
			
			System.out.printf("\nSua idade em dias é de: ",dataDias);		

	}

}
