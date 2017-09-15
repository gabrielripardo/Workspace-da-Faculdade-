algoritmo "Números primos"

var

n, divisores, c : INTEIRO
num : INTEIRO
num1 : INTEIRO
inicio

num <- 0
n <- 1
   repita
   n <- n + 1

		se (n mod c = 1) entao
			divisores <- divisores + 1
		fimse

     	se (divisores = 2) entao
		escreval("O número",n," é primo")
      fimse

   ate n = 37
fimalgoritmo
