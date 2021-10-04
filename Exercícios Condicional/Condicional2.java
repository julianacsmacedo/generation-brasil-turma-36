package Familia36;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nEscreva o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1<n2 && n1<n3 && n2<n3)
		{
			System.out.printf("\n1- %d \n2- %d \n3- %d",n1,n2,n3);
		}
		else if(n2<n1 && n2<n3 && n1<n3)
		{
			System.out.printf("\n1- %d \n2- %d \n3- %d",n2,n1,n3);
		}
		else
		{
			System.out.printf("\nOrdem crescente: %d, %d, %d",n3,n1,n2);
		}
	}

}
