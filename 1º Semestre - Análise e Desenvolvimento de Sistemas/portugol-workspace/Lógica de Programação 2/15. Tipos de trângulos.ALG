algoritmo "Tipos de triângulos"
// Função : Coletar três valores dos lados de um triângulo e informar qual é o tipo de triângulo.
// Autor : GABRIEL RIPARDO DE SENA
// Data : 29/03/2016
// Seção de Declarações

var
A : REAL
B : REAL
C : REAL
inicio
// Seção de Comandos
        escreval("         >>>>>> TIPOS DE TRIÂNGULOS <<<<<<")

        escreval("                       /\")
        escreval("                      /  \")
        escreval("                     /    \")
        escreval("                    /      \")
        escreval("                   /        \")
        escreval("                  /          \")
        escreval("                 /            \")
        escreval("                /              \")
        escreval("               /________________\")
escreval
escreva("Digite o valor do lado A : ")
leia(a)

escreva("Digite o valor do lado B : ")
leia(b)

escreva("Digite o valor dO lado C : ")
leia(c)

	 se (A < B + C) e (B < A + C) e (C < A + B) entao
	    escreval
       escreval("De acordo com os cálculos é um ")


    se (A = B) e (B = C) entao
       escreva ("'Triângulo Equilátero'")
       escreval
			senao
    se (A = B) ou (B = C) ou (A = C) entao
       escreva ("'Triângulo Isósceles'")
		 escreval		
				fimse
			fimse
senao
         escreval
			escreva ("De acordo com os cálculos é um 'Triângulo Escaleno'")
		   escreval
      fimse

fimalgoritmo
