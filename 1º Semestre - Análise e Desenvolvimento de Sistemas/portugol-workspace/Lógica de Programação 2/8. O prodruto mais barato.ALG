algoritmo "Maior e o menor n�mero"
// Fun��o : Informar o produto mais barato
// Autor :  GABRIEL RIPARDO DE SENA
// Data : 28/03/2016
// Se��o de Declara��es

var
prd1 : REAL
prd2 : REAL
prd3 : REAL

inicio

escreva("Digite o pre�o 1 R$: ")
leia(prd1)

escreva("Digite o pre�o 2 R$: ")
leia(prd2)

escreva("Digite o pre�o 3 R$: ")
leia(prd3)

          se prd1 < prd2 entao             /////Condi��o se o produto 1 for de menor valor
          se prd1 < prd3  entao
             escreval( "O pre�o mais barato � o produto 1 que custa R$: " , prd1)
          fimse
          fimse

          se prd2 < prd3 entao
          se prd2 < prd1 entao             /////Condi��o se o produto 2 for de menor valor
             escreval( "O pre�o mais barato � o produto 2 que custa R$: " , prd2)

          fimse
          fimse
          se prd3 < prd1 entao
          se prd3 < prd2 entao              /////E por �ltimo se o produto 3 for mais barato
          escreval( "O pre�o mais barato � o produto 3 que custa R$: " , prd3)

fimse
fimse

fimalgoritmo
