programa
{
	
	funcao inicio()
	{
		//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o 
		//escreva em seguida. Encontre após a maior pontuação e a apresente. 
		inteiro vetor[5], maiorPont=0, x
		
		para(x=0;x<5;x++)
		{
			escreva("\nEntre um número: ")
			leia(vetor[x])

			se(vetor[x]>maiorPont) {
				maiorPont = vetor[x]
			}
			
		}

		para(x=0;x<5;x++)
		{
			escreva("\nOs valores digitados foram: ", vetor[x])
		}

		escreva("\nO maior valor digitado foi: ", maiorPont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 8, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */