package Familia36;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o coeficiente a: ");
		a = leia.nextFloat();
		System.out.println("\nEscreva o coeficiente b: ");
		b = leia.nextFloat();
		System.out.println("\nEscreva o coeficiente c: ");
		c = leia.nextFloat();
		System.out.println("\nEscreva o coeficiente d: ");
		d = leia.nextFloat();
		System.out.println("\nEscreva o coeficiente e: ");
		e = leia.nextFloat();
		System.out.println("\nEscreva o coeficiente f: ");
		f = leia.nextFloat();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.printf("\n\tO valor de x é %.2f \nO valor de y é %.2f",x,y);

	}

}
