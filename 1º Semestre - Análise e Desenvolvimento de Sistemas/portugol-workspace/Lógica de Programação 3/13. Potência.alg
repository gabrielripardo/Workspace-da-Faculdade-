algoritmo "Base e expoente"
// Fun��o : O programa ir� pedir a base e o expoente, depois ir� realizar o c�lculo
// Autor : Gabriel Ripardo
// Data : 08/04/2016
// Se��o de Declara��es 
var
base : INTEIRO
base1 : INTEIRO
expo : INTEIRO
num : INTEIRO
inicio
// Se��o de Comandos
escreva("Escreva a base: ")
leia(base)

escreva("Escreva o expoente: ")
leia(expo)

base1 <- 1
num <- 0

repita
num <- num + 1
base1 <- base1 * base
ate num = expo
escreva(base1)

fimalgoritmo
