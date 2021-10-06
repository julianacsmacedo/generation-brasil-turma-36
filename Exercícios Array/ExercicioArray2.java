package Familia36;

import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.
		 */
	
		int numeros[] = new int[6];
		int x,contpar=0,contimpar=0,somapar=0,somaimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Valores
		for(x=0;x<6;x++)
		{
			System.out.println("\nEntre com um número: ");
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
		
		//Mostrando os números pares
		System.out.println("\nOs números pares são: ");
		for(x=0;x<6;x++)
		{
			if(numeros[x] % 2 ==0)
			{
				System.out.println(numeros[x]+" ");
			}
		}
		//Mostrando os números ímpares
		System.out.println("\nOs números ímpares são: ");
		for(x=0;x<6;x++)
		{
			if(numeros[x] % 2 !=0)
			{
				System.out.println(numeros[x]+" ");
			}
		}
		System.out.printf("\n\tVocê digitou %d números pares e a soma deles é %d.\n",contpar,somapar);
		System.out.printf("\n\tVocê digitou %d números ímpares e a soma deles é %d.\n",contimpar,somaimpar);
	}

}
