programa
{
	
	funcao inicio()
	{
		real salario, somasalario=0.0, mediasalario, medianfilho, maiorsalario=0.0, perc
		inteiro nfilho, somanfilho=0, cont100=0,x
		
		 
		para (x=1;x<=4;x++) {
			escreva("\nEntre com o seu salário: ")
			leia(salario)

			enquanto(salario<0)
			{
				escreva("\nEntre com um novo salário: ")
				leia(salario)
			}
			escreva("\nEntre com o número de filhos: ")
			leia(nfilho)

			somasalario += salario
			somanfilho += nfilho

			se(maiorsalario<salario) 
			{
				maiorsalario = salario
			}
			
			se(salario<=100)
			{
				cont100++
			}
		}
		mediasalario = somasalario / 4
		medianfilho = somanfilho / 4
		perc = (cont100 * 100)/ 4

		escreva("\nMédia salarial: ",mediasalario)
		escreva("\nMédia do número de filhos: ",medianfilho)
		escreva("\nMaior salário: ",maiorsalario)
		escreva("\nPercentual de pessoas que recebem até 100 reais: ",perc)

	}
}		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 761; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */