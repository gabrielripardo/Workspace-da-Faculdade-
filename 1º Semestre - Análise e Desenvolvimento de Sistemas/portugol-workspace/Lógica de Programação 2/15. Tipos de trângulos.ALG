algoritmo "Tipos de tri�ngulos"
// Fun��o : Coletar tr�s valores dos lados de um tri�ngulo e informar qual � o tipo de tri�ngulo.
// Autor : GABRIEL RIPARDO DE SENA
// Data : 29/03/2016
// Se��o de Declara��es

var
A : REAL
B : REAL
C : REAL
inicio
// Se��o de Comandos
        escreval("         >>>>>> TIPOS DE TRI�NGULOS <<<<<<")

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
       escreval("De acordo com os c�lculos � um ")


    se (A = B) e (B = C) entao
       escreva ("'Tri�ngulo Equil�tero'")
       escreval
			senao
    se (A = B) ou (B = C) ou (A = C) entao
       escreva ("'Tri�ngulo Is�sceles'")
		 escreval		
				fimse
			fimse
senao
         escreval
			escreva ("De acordo com os c�lculos � um 'Tri�ngulo Escaleno'")
		   escreval
      fimse

fimalgoritmo
