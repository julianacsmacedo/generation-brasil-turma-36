package Familia36;

import java.util.Scanner;

public class LaçoRepetição3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, cont=0, menor=0, maior=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com idade: ");
		idade = leia.nextInt();
		
		while(idade!= -99)
		{
			cont++;
			System.out.println("\nPara sair digite -99 ");
			System.out.println("\nEntre com a próxima idade: ");
			idade = leia.nextInt();
			
			if(idade<=21 && idade>0)
			{
				menor++;
			}
			else if(idade>=50)
			{
				maior ++;
			}
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos é de: "+menor);
		System.out.println("\nTotal de pessoas com mais de 50 anos é de: "+maior);

	}

}
