package Familia36;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nEscreva o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.printf("O %d é o maior número!!",n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.printf("O %d é o maior número!!",n2);
		}
		else
		{
			System.out.printf("O %d é o maior número!!",n3);
		}

	}

}
