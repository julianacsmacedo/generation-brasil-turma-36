package Familia36;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um n�mero: ");
		n1 = leia.nextFloat();
		
		if(n1 % 2 == 0)
		{
			op = (float) Math.sqrt(n1);
			System.out.printf("\n%.1f � um n�mero par e a raiz quadadra � %.2f",n1,op);
		}
		else
		{
			op = (float) Math.pow(n1, 2.0);
			System.out.printf("\n%.2f � um n�mero �mpar e a raiz quadadra � %.2f",n1,op);
		}
		

	}

}
