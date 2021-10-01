package Familia36;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int x1,x2,y1,y2;
		double d;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva o primeiro ponto:");
		x1 = leia.nextInt();
		System.out.println("\nEscreva o segundo ponto:");
		x2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro ponto:");
		y1 = leia.nextInt();
		System.out.println("\nEscreva o quarto ponto:");
		y2 = leia.nextInt();
		
		d = Math.sqrt(((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2))));
		
		System.out.println("\n\tA distância entre os pontos é: "+d);

	}

}
