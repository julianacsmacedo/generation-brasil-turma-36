package Familia36;

import java.util.Scanner;

public class La�oRepeti��o2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, par=0, impar=0, cont;
		
		Scanner leia = new Scanner(System.in);
		
		for(cont=0;cont<10;cont++)
		{
			System.out.println("Digite um n�mero: ");
			x = leia.nextInt();
			
			if(x % 2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("Total de n�meros pares: %d\nTotal de n�meros �mpares: %d",par, impar);
		
		
	}

}
