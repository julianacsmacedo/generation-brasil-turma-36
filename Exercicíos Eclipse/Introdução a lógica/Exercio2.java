package Familia36;

import java.util.Scanner;

public class Exercio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totaldias,anos,meses,dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o total de dias vividos: ");
		totaldias = leia.nextInt();
		
		anos = totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) / 30;
		
		System.out.printf("A sua idade é de %d anos, %d meses e %d dias de vida",anos,meses,dias);	
	}

}
