algoritmo "ANO BISSEXTO"
// Fun��o : Informar se o n�mero informado � bissexto ou n�o
// Autor : Gabriel Ripardo de Sena
// Data : 28/03/2016
// Se��o de Declara��es

var
year : INTEIRO

inicio
// Se��o de Comandos
escreva("Digite um ano: ")
leia(year)
       se (year % 4 = 0) entao
         escreval(year," � um ano bissexto.")
      senao
         escreval(year," n�o � um ano bissexto!")
fimse
fimalgoritmo
