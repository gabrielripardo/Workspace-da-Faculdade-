algoritmo "O maior n�mero"
// Fun��o :
// Autor :  Gabriel Ripardo de Sena
// Data : 06/04/2016
// Se��o de Declara��es 
var
num1 : REAL
num2 : REAL
num3 : REAL
num4 : REAL
num5 : REAL
big : REAL
inicio
// Se��o de Comandos
escreva("Digite um n�mero: ")
leia(num1)
escreva("Digite um n�mero: ")
leia(num2)
escreva("Digite um n�mero: ")
leia(num3)
escreva("Digite um n�mero: ")
leia(num4)
escreva("Digite um n�mero: ")
leia(num5)

       se (num1 > num2) e (num1 > num3) e (num1 > num4) e (num1 > num5) entao
       escreval
       escreva (">>>> O maior n�mero �", num1," <<<<<")
       escreval
       fimse
       
       se (num2 > num1) e (num2 > num3) e (num2 > num4) e (num2 > num5) entao
       escreval
       escreva (">>>> O maior n�mero �", num2," <<<<<")
       escreval
       fimse
       
       se (num3 > num1) e (num3 > num3) e (num3 > num4) e (num3 > num5) entao
       escreval
       escreva (">>>> O maior n�mero �", num3," <<<<<")
       escreval
       fimse
       
       se (num4 > num1) e (num4 > num3) e (num4 > num4) e (num4 > num5) entao
       escreval
       escreva (">>>> O maior n�mero �", num4," <<<<<")
       escreval
       fimse
       
       se (num5 > num1) e (num5 > num3) e (num5 > num4) e (num5 > num5) entao
       escreval
       escreva (">>>> O maior n�mero �", num5," <<<<<")
       escreval
       fimse
       
fimalgoritmo
