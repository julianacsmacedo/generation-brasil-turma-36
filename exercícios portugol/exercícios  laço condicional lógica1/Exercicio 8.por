programa
{	
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		//Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
		//caso contrário imprimi-la com o valor zero.

		real n

		escreva("\nEscreva um número: ")
		leia(n)

		se (n>=100) {
			escreva("\nA váriavel é: ",mat.arredondar(n,2))
		} senao {
			escreva("\n Valor zero")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */