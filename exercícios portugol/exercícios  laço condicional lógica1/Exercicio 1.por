programa
{
	
	funcao inicio()
	{
		inteiro peso, excesso, multa

		escreva("\nEscreva o peso do tomate: ")
		leia(peso)
		
		se (peso > 50) {
			excesso = peso - 50
			multa = excesso * 4
			escreva("\nVocê tem um excesso de ", excesso, " kilos e o valor da multa é: ", multa)
		}
		senao {
			escreva ("\nO peso está dentro do limite permitido")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */