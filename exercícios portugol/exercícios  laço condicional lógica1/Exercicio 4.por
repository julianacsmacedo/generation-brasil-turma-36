programa
{
	
	funcao inicio()
	{
		inteiro numero, resto

		escreva("\nEscreva um número inteiro: ")
		leia(numero)

		resto = numero % 2

		se (resto==0 e numero>=0) {
			escreva("\nO número escolhido é par e positivo")
		} senao se (resto==0 e numero<=0) {
			escreva("\nO número escolhido é par e negativo")
			
		} senao se (resto!=0 e numero<=0) {
			escreva("\nO número escolhido é ímpar e negativo")
			
		} senao {
			escreva("\nO número escolhido é ímpar e positivo")
			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */