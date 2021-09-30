programa
{
	
	funcao inicio()
	{
		inteiro media, valor, totalVal=0, x=0

		escreva("\nEntre com o valor desejado: ")
		leia(valor)

		enquanto(valor>=0) 
		{
			escreva("\nEntre com o valor desejado")
			escreva("\nSe deseja sair do programa insira um número negativo: ")

			leia(valor)
			x++
			totalVal +=valor
					
		} 

		media = totalVal / x
		escreva("\nMédia: ", media, "\nSoma dos valores: ", totalVal, "\nTotal de valores inseridos: ",x)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */