algoritmo "Conjunto de N números"
// Função :  Determinar o maior valor, menor valor e a soma dos números informados.
// Autor : Gabriel Ripardo de Sena
// Data : 09/04/2016
// Seção de Declarações 
var
numrs : INTEIRO
decis : INTEIRO
num : INTEIRO
maior_valor : INTEIRO
menor_valor: INTEIRO
soma : INTEIRO
cont : INTEIRO

inicio
// Seção de Comandos
escreva("Digite quantas números você precisa: ")
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
              escreval("A soma dos números é igual a : ",soma)
              escreval (" o maior numero é: ",maior_valor)
              escreval (" o menor numero é: ",menor_valor)
fimalgoritmo

