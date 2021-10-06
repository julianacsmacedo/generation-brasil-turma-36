package Familia36;

import java.util.Scanner;

public class ExercicioArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
			(1) somar as duas matrizes 
			(2) subtrair a primeira matriz da segunda 
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes 
			Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser 
			lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
		*/

		float matrizA[][] = new float[2][2];
		float matrizB[][] = new float[2][2];
		float matrizC[][] = new float[2][2];
		int linha, coluna,op,constante;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("Entre com o n�mero da matriz A: [%d][%d]",linha+1,coluna+1);
				matrizA[linha][coluna] = leia.nextFloat();
			}
		}
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.printf("\tEntre com o n�mero da matriz B: [%d][%d]",linha+1,coluna+1);
				matrizB[linha][coluna] = leia.nextFloat();
			}
		}
		
		//MENU 
		System.out.println("\n\t\t\t MENU: \n\t(1) Somar as duas matrizes \n\t(2) Subtrair a primeira matriz da segunda \n\t(3) Adicionar uma vari�vel as duas matrizes\n\t(4) Imprimir as matrizes ");
		System.out.println("\nDigite uma op��o: ");
		op = leia.nextInt();
		
		System.out.println("A matriz ficou:");
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				if(op==1)
				{
					matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna]; //soma de matrizes
					System.out.printf("\t[%.2f] \t",matrizC[linha][coluna]);
				}
				else if(op==2)
				{
					matrizC[linha][coluna] = (matrizB[linha][coluna] - matrizA[linha][coluna]); //subtra��o
					System.out.printf("\t[%.2f] ",matrizC[linha][coluna]);
				}
				else if(op==3)
				{
					System.out.println("Digite a vari�vel que queira adicionar: ");
					constante = leia.nextInt();
					matrizA[linha][coluna] += constante;
					matrizB[linha][coluna] += constante;
					System.out.println("\n\tMatriz A: "+matrizA[linha][coluna]);
					System.out.println("\n\tMatriz B: "+matrizB[linha][coluna]);
					
				}
				else if(op==4)
				{
					System.out.printf("\t[%.2f] \t",matrizA[linha][coluna]);
					System.out.printf("\t[%.2f] \t",matrizB[linha][coluna]);
				}
				else
				{
					System.out.println("Op��o inv�lida!!");
					System.out.println("\n\t\t\t MENU: \n\t(1) Somar as duas matrizes \n\t(2) Subtrair a primeira matriz da segunda \n\t(3) Adicionar uma vari�vel as duas matrizes\n\t(4) Imprimir as matrizes ");
					System.out.println("\nDigite uma op��o novamente: ");
					op = leia.nextInt();
				}
			}
			System.out.println();
		}
		
	}
	

}
