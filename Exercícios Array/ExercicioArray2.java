package Familia36;

import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.
		 */
	
		int numeros[] = new int[6];
		int x,contpar=0,contimpar=0,somapar=0,somaimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Valores
		for(x=0;x<6;x++)
		{
			System.out.println("\nEntre com um n�mero: ");
			numeros[x] = leia.nextInt();
			if(numeros[x] % 2 ==0)
			{
				somapar += numeros[x];
				contpar++;
			}
			else
			{
				somaimpar += numeros[x];
				contimpar++;
			}
		}
		
		//Mostrando os n�meros pares
		System.out.println("\nOs n�meros pares s�o: ");
		for(x=0;x<6;x++)
		{
			if(numeros[x] % 2 ==0)
			{
				System.out.println(numeros[x]+" ");
			}
		}
		//Mostrando os n�meros �mpares
		System.out.println("\nOs n�meros �mpares s�o: ");
		for(x=0;x<6;x++)
		{
			if(numeros[x] % 2 !=0)
			{
				System.out.println(numeros[x]+" ");
			}
		}
		System.out.printf("\n\tVoc� digitou %d n�meros pares e a soma deles � %d.\n",contpar,somapar);
		System.out.printf("\n\tVoc� digitou %d n�meros �mpares e a soma deles � %d.\n",contimpar,somaimpar);
	}

}
