Algoritmo "Celsius para Farenheit (Conversão)"
// Descrição   : O programa irá converter um valor em Celsius para Farenheit
// Autor(a)    : Gabriel Ripardo de Sena
// Data atual  : 25/03/2016
Var
// Seção de Declarações das variáveis 
celsius : REAL
conversao : REAL

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Informe temperatura em Celsius: ")
leia(celsius)

conversao <- (celsius * 18000) + 32
escreva( celsius, " C convertido para Farenheit é igual a: ", conversao ," F")

Fimalgoritmo
