algoritmo "Fibonacci"

var 
num1 : INTEIRO
num2 : INTEIRO
num3 : INTEIRO
inicio

num1 <- -1
num2 <- 1
num3 <- 0


     enquanto (num3 <= 500) faca
      num3 <- num1 + num2
      num1 <- num2
      num2 <- num3
      se num3 < 500 entao
      escreva(num3)
      fimse
      fimenquanto


fimalgoritmo
