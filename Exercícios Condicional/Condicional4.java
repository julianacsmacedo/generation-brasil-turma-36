package Familia36;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,raiz;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um número: ");
		n1 = leia.nextFloat();
		
		if(n1 % 2 == 0)
		{
			raiz = (float) Math.sqrt(n1);
			System.out.printf("\n%.1f é um número par e a raiz quadadra é %.2f",n1,raiz);
		}
		else
		{
			raiz = (float) Math.pow(n1, 2.0);
			System.out.printf("\n%.2f é um número ímpar e a raiz quadadra é %.2f",n1,raiz);
		}
		

	}

}
