algoritmo "N�meros primos"

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
		escreval("O n�mero",n," � primo")
      fimse

   ate n = 37
fimalgoritmo
