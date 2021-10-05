package Familia36;

import java.util.Scanner;

public class LaçoRepetição6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,cont=0;
		float media, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{	
			System.out.println("\nEscreva um número: ");
			x = leia.nextInt();
			
			if(x % 3 == 0 && x!=0)
			{
				soma += x;
				cont++;
			}
		}
		while(x != 0);
		
		media = soma / cont;
		System.out.printf("\nA média dos números múltiplos de 3 é: %.2f",media);
					
	}
	
}
