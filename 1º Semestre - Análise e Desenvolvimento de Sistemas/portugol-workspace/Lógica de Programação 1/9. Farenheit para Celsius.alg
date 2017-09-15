Algoritmo "Firenheit para Celsius"
// Descrição   : O programa irá converter um valor em firenheit para Celsius
// Autor(a)    : Gabriel Ripardo de Sena
// Data atual  : 25/03/2016
Var
// Seção de Declarações das variáveis 
farenheit : REAL
conversao : REAL

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Informe temperatura em Farenheit: ")
leia(farenheit)

conversao <- (5*(farenheit-32)/9)
escreva( farenheit, " F convertido para Celsius é igual a: ", conversao ," C")

Fimalgoritmo
