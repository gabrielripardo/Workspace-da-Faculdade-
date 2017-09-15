algoritmo "Números primos"

var

n, divisores, c : INTEIRO

inicio

	repita
		escreval("Digite um número: ")
		leia(n)
	ate (n > 0)
	divisores <- 0

	para c de 1 ate n faca
		se (n mod c = 0) entao
			divisores <- divisores + 1
		fimse
	fimpara
	se (divisores = 2) entao
		escreval("O número",n," é primo")
	senao
		escreval("O número", n," não é primo")
    fimse


fimalgoritmo
