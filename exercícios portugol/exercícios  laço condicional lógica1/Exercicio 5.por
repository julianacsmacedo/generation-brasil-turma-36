programa
{
	
	funcao inicio()
	{
		real indice

		escreva("\nEscreva o índice de poluição: ")
		leia(indice)

		se (indice<=0.25) {
			escreva ("\nIndice de poluição aceitável")
		} senao se (indice>= 0.3 e indice<0.4) {
			escreva ("\nAs empresas do 1º grupo devem ter suas atividades suspensas")
		} senao se (indice>= 0.4 e indice<0.5) {
			escreva ("\nAs empresas do 1º e 2º grupo devem ter suas atividades suspensas")
		} senao {
			escreva ("\nTODAS as empresas devem ter suas atividades suspensas")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 475; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */