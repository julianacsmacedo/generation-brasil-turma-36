package Familia36;

import java.util.Scanner;

public class La�oRepeti��o6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,cont=0;
		float media, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{	
			System.out.println("\nEscreva um n�mero: ");
			x = leia.nextInt();
			
			if(x % 3 == 0 && x!=0)
			{
				soma += x;
				cont++;
			}
		}
		while(x != 0);
		
		media = soma / cont;
		System.out.printf("\nA m�dia dos n�meros m�ltiplos de 3 �: %.2f",media);
					
	}
	
}
