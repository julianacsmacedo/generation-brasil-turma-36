package Familia36;

import java.util.Scanner;

public class La�odeRepeti��o5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, somanumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("\nEscreva um n�mero: ");
			numero = leia.nextInt();
			somanumero += numero;
		}
		while(numero != 0);
		
		System.out.printf("\nA soma dos n�meros � %d",somanumero);

	}

}
