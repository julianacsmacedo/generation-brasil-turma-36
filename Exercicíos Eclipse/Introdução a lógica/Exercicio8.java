package Familia36;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double custoFab, porcDis, porcImp, custoCons;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite custo de f�brica do carro: ");
		custoFab = leia.nextDouble();

		porcDis = ((custoFab / 100) * 28);
		porcImp = ((custoFab / 100) * 45);

		custoCons = custoFab + porcDis + porcImp;
		System.out.println("\nO custo do carro ao consumidor � de: R$"+custoCons);
	}

}
