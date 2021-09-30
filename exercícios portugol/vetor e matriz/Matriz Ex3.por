programa
{
	
	funcao inicio()
	{
		const inteiro linha=4, coluna=6
		inteiro n1[linha][coluna],n2[linha][coluna],m1[linha][coluna], m2[linha][coluna]
		inteiro x,y
		para(x=0;x<linha;x++)
		{
			para(y=0;y<coluna;y++)
			{
				escreva("\nN1: ")
				leia(n1[x][y])
				escreva("\nN2: ")
				leia(n2[x][y])
				
			}
		}
		limpa()
		para(x=0;x<linha;x++)
		{
			para(y=0;y<coluna;y++)
			{
				se(x==0 e y==1)
				{
				m1[x][y] = n1[x][y] + n2[x][y]
				}
				escreva("\nM1: [",m1[x][y],"]")
			}
			escreva("\n")
		}

		para(x=0;x<linha;x++)
		{
			para(y=0;y<coluna;y++)
			{
				m2[x][y] = n1[x][y] - n2[x][y]
				escreva("\nM2: [",m2[x][y], "]")
			}
			
			escreva("\n")
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 7, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */