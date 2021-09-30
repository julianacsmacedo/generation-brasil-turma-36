programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a, b, c, d, quadradoa, quadradob, quadradoc, quadradod
		
		escreva("\nEscreva o primeiro número: ")
		leia(a)
		escreva("\nEscreva o segundo número: ")
		leia(b)
		escreva("\nEscreva o terceiro número: ")
		leia(c)
		escreva("\nEscreva o quarto número: ")
		leia(d)

		quadradoa = mat.potencia(a, 2.0)
		quadradob = mat.potencia(b, 2.0)
		quadradoc = mat.potencia(c, 2.0)
		quadradod = mat.potencia(d, 2.0)

		limpa()

		se (quadradoc >= 1000) {
			escreva(quadradoc)
		}
		senao {
			escreva("\nO quadrado de ",a, " é ",quadradoa,"\nO quadrado de ",b, " é ",quadradob,"\nO quadrado de ",c, " é ",quadradoc,"\nO quadrado de ",d, " é ",quadradod)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */