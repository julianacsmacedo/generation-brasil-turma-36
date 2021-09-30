programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3], x, y, somaTotal=0, somaDiagonal=0

		para(x=0;x<3;x++)
		{
			para(y=0;y<3;y++)
			{
				escreva("\nDigite um valor: ")
				leia(numeros[x][y])
				somaTotal +=numeros[x][y]

			}
		}
		escreva("\n A soma dos números é: ", somaTotal)
			
		para(x=0;x<3;x++)
		{
			para(y=0;y<3;y++)
			{	
				se(x==y)
				{
					somaDiagonal += numeros[x][y]
			
				}
			}	
		}

		escreva("\nA soma da diagonal é de: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */