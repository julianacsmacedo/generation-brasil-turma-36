package Familia36;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("\nEscreva o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("\nEscreva o terceiro número: ");
		n3 = leia.nextFloat();
		
		if(n1>n2 && n1>n3 && n2>n3)
		{
			System.out.printf("\n1- %.2f \n2- %.2f \n3- %.2f",n1,n2,n3);
		}
		else if(n2>n1 && n2>n3 && n1>n3)
		{
			System.out.printf("\n1- %.2f \n2- %.2f \n3- %.2f",n2,n1,n3);
		}
		else
		{
			System.out.printf("\n1- %.2f \n2- %.2f \n3- %.2f",n3,n1,n2);
		}
	}

}
