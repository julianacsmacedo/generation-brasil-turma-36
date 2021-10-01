package Familia36;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,c;
		double R,S,D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		a = leia.nextFloat();
		System.out.println("Escreva um número: ");
		b = leia.nextFloat();
		System.out.println("Escreva um número: ");
		c = leia.nextFloat();
		
		R = Math.pow((a + b), 2.0);
		S = Math.pow((b + c), 2.0);
		D = (R + S) / 2;

		System.out.printf("\n\tO resultado é: %.2f", D);
	}

}
