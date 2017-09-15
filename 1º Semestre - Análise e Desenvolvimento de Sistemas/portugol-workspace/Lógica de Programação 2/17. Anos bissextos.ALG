algoritmo "ANO BISSEXTO"
// Função : Informar se o número informado é bissexto ou não
// Autor : Gabriel Ripardo de Sena
// Data : 28/03/2016
// Seção de Declarações

var
year : INTEIRO

inicio
// Seção de Comandos
escreva("Digite um ano: ")
leia(year)
       se (year % 4 = 0) entao
         escreval(year," é um ano bissexto.")
      senao
         escreval(year," não é um ano bissexto!")
fimse
fimalgoritmo
