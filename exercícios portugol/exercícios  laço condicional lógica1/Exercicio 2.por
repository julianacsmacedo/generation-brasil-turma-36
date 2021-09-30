programa
{
	
	funcao inicio()
	{
		inteiro C
		real N, salario, horaextras, excesso

		escreva("\nEscreva o código do operário: ")
		leia(C)
		escreva("\nEscreva o número de horas trabalhadas: ")
		leia(N)

		se (N<=50) {
			salario = N * 10
			escreva("\nO salário do operário ",C, " é de ", salario, " e não há hora excedente.")
		} senao {
			excesso = N - 50
			salario = 50.0 * 10.0
			horaextras = excesso * 20
			escreva("\nO salário do operário ",C, " é de ", salario, " e o salário excedente é de ", horaextras)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */