algoritmo "Colecionador de CDs"
// Fun��o :
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Se��o de Declara��es 
var
qtdcd, vlr, cont, soma : INTEIRO
media : REAL
inicio
// Se��o de Comandos
escreva("Digite a quantidade de CDs: ")
leia(qtdcd)

repita
cont <- cont + 1
escreva("Digite o valor pago no", cont,"� CD R$ ")
leia(vlr)

soma <- vlr + soma
ate cont = qtdcd

media <- soma / qtdcd
escreval
escreval("Investimento de CDs")
escreval("Valor total R$:",soma)
escreval("Valor m�dio R$:",media)


fimalgoritmo
