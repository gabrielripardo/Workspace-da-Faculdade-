algoritmo "N�meros primos"

var

n, divisores, c : INTEIRO
num : INTEIRO
num1 : INTEIRO
inicio

num <- 0

	repita
		escreval("Digite um n�mero: ")
		leia(n)
	ate (n > 0)
	divisores <- 0

	para c de 1 ate n faca
		se (n mod c = 0) entao
			divisores <- divisores + 1
		fimse
	fimpara
	se (divisores = 2) entao
		escreval("O n�mero",n," � primo")
	senao
		escreval("O n�mero", n," n�o � primo")
  fimse
       escreval("Seus divisores s�o:")
                  repita
		            num <- num + 1

                   se (n) mod num = 0 entao
		            escreval(num)
		             fimse
		            ate num > 20



fimalgoritmo
