programa
{
	
	funcao inicio()
	{
		/* Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e 
		imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
		*/

		inteiro vetor[10],x, media, soma=0

		para(x=0;x<10;x++)
		{
			escreva("Escreva o valor do lançamento: ")
			leia(vetor[x])
			soma += vetor[x]

		}

		media = soma / 10
		escreva("\nA média dos lançamentos é: ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 11, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */