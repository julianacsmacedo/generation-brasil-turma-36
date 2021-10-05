package Familia36;

import java.util.Scanner;

public class LaçoRepetição1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=1000;x<1999;x++)
		{
			if(x % 11 == 5)
			{
				System.out.println("\n"+x);
			}
		}
	}

}
