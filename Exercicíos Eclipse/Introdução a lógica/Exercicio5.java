package Familia36;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3, media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Escreva a primeira nota: ");
		n2 = leia.nextFloat();
		System.out.println("Escreva a primeira nota: ");
		n3 = leia.nextFloat();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5) / (2 + 3 + 5));
		
		System.out.printf("\n\tA média final é: %.2f", media);
	}

}
