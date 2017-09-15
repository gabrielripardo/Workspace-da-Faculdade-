algoritmo "O maior número"
// Função :
// Autor :  Gabriel Ripardo de Sena
// Data : 06/04/2016
// Seção de Declarações 
var
num1 : REAL
num2 : REAL
num3 : REAL
num4 : REAL
num5 : REAL
big : REAL
inicio
// Seção de Comandos
escreva("Digite um número: ")
leia(num1)
escreva("Digite um número: ")
leia(num2)
escreva("Digite um número: ")
leia(num3)
escreva("Digite um número: ")
leia(num4)
escreva("Digite um número: ")
leia(num5)

       se (num1 > num2) e (num1 > num3) e (num1 > num4) e (num1 > num5) entao
       escreval
       escreva (">>>> O maior número é", num1," <<<<<")
       escreval
       fimse
       
       se (num2 > num1) e (num2 > num3) e (num2 > num4) e (num2 > num5) entao
       escreval
       escreva (">>>> O maior número é", num2," <<<<<")
       escreval
       fimse
       
       se (num3 > num1) e (num3 > num3) e (num3 > num4) e (num3 > num5) entao
       escreval
       escreva (">>>> O maior número é", num3," <<<<<")
       escreval
       fimse
       
       se (num4 > num1) e (num4 > num3) e (num4 > num4) e (num4 > num5) entao
       escreval
       escreva (">>>> O maior número é", num4," <<<<<")
       escreval
       fimse
       
       se (num5 > num1) e (num5 > num3) e (num5 > num4) e (num5 > num5) entao
       escreval
       escreva (">>>> O maior número é", num5," <<<<<")
       escreval
       fimse
       
fimalgoritmo
