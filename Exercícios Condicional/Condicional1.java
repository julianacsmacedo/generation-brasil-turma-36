package Familia36;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("\nEscreva o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.printf("O %d � o maior n�mero!!",n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.printf("O %d � o maior n�mero!!",n2);
		}
		else
		{
			System.out.printf("O %d � o maior n�mero!!",n3);
		}

	}

}
