Algoritmo "Firenheit para Celsius"
// Descri��o   : O programa ir� converter um valor em firenheit para Celsius
// Autor(a)    : Gabriel Ripardo de Sena
// Data atual  : 25/03/2016
Var
// Se��o de Declara��es das vari�veis 
farenheit : REAL
conversao : REAL

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Informe temperatura em Farenheit: ")
leia(farenheit)

conversao <- (5*(farenheit-32)/9)
escreva( farenheit, " F convertido para Celsius � igual a: ", conversao ," C")

Fimalgoritmo
