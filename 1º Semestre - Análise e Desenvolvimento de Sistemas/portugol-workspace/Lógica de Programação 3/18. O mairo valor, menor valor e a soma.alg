algoritmo "Conjunto de N n�meros"
// Fun��o :  Determinar o maior valor, menor valor e a soma dos n�meros informados.
// Autor : Gabriel Ripardo de Sena
// Data : 09/04/2016
// Se��o de Declara��es 
var
numrs : INTEIRO
decis : INTEIRO
num : INTEIRO
maior_valor : INTEIRO
menor_valor: INTEIRO
soma : INTEIRO
cont : INTEIRO

inicio
// Se��o de Comandos
escreva("Digite quantas n�meros voc� precisa: ")
leia(decis)

menor_valor <- 10000
num <- 0

Para cont de 1 ate decis passo 1 faca
  Escreva ("Digite o ",cont," numero ")
  leia(num)

    se num > maior_valor entao
      maior_valor <- num
    fimse
    se num < menor_valor entao
      menor_valor <- num
    fimse

  soma <- num + soma

fimpara
              escreval("A soma dos n�meros � igual a : ",soma)
              escreval (" o maior numero �: ",maior_valor)
              escreval (" o menor numero �: ",menor_valor)
fimalgoritmo

