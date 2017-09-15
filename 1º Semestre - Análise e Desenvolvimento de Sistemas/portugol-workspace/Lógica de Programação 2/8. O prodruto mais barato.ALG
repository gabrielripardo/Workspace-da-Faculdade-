algoritmo "Maior e o menor número"
// Função : Informar o produto mais barato
// Autor :  GABRIEL RIPARDO DE SENA
// Data : 28/03/2016
// Seção de Declarações

var
prd1 : REAL
prd2 : REAL
prd3 : REAL

inicio

escreva("Digite o preço 1 R$: ")
leia(prd1)

escreva("Digite o preço 2 R$: ")
leia(prd2)

escreva("Digite o preço 3 R$: ")
leia(prd3)

          se prd1 < prd2 entao             /////Condição se o produto 1 for de menor valor
          se prd1 < prd3  entao
             escreval( "O preço mais barato é o produto 1 que custa R$: " , prd1)
          fimse
          fimse

          se prd2 < prd3 entao
          se prd2 < prd1 entao             /////Condição se o produto 2 for de menor valor
             escreval( "O preço mais barato é o produto 2 que custa R$: " , prd2)

          fimse
          fimse
          se prd3 < prd1 entao
          se prd3 < prd2 entao              /////E por último se o produto 3 for mais barato
          escreval( "O preço mais barato é o produto 3 que custa R$: " , prd3)

fimse
fimse

fimalgoritmo
