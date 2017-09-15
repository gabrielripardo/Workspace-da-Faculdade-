algoritmo "Base e expoente"
// Função : O programa irá pedir a base e o expoente, depois irá realizar o cálculo
// Autor : Gabriel Ripardo
// Data : 08/04/2016
// Seção de Declarações 
var
base : INTEIRO
base1 : INTEIRO
expo : INTEIRO
num : INTEIRO
inicio
// Seção de Comandos
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
