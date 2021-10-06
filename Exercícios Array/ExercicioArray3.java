package Familia36;

import java.util.Scanner;

public class ExercicioArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */
		
		int matriz[][] = new int[3][3];
		int linha, coluna,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Entre com o número da Matriz: [%d][%d]",linha+1,coluna+1);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				if(matriz[linha][coluna]>10)
				{
					cont++;
				}
			}
		}
		
		System.out.println("\n\tA matriz ficou: ");
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t[%d] \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.printf("\n\tExistem %d números maiores que 10",cont);

	}

}
