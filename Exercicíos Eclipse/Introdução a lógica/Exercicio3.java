package Familia36;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundos, horas, minutos, segundosb;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva a duração do evento, em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600; 
		minutos = (segundos % 3600 ) / 60;
		segundosb = minutos % 60;
		
		System.out.printf("\nO evento durou: %d horas, %d minutos e %d segundos.",horas,minutos,segundosb);

	}

}
