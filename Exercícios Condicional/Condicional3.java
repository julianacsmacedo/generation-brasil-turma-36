package Familia36;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva sua idade: ");
		id = leia.nextInt();
		
		if(id>=10 && id<=14)
		{
			System.out.printf("\nVoc� est� na categoria infantil");
		}
		else if(id>=15 && id<=17)
		{
			System.out.printf("\nVoc� est� na categoria juvenil");
		}
		else if(id>=18 && id<=25)
		{
			System.out.printf("\nVoc� est� na categoria adulto");
		}
		else
		{
			System.out.printf("\nN�o h� categoria");
		}

	}

}
