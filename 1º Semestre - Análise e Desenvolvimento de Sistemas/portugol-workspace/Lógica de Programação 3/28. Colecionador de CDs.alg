algoritmo "Colecionador de CDs"
// Função :
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Seção de Declarações 
var
qtdcd, vlr, cont, soma : INTEIRO
media : REAL
inicio
// Seção de Comandos
escreva("Digite a quantidade de CDs: ")
leia(qtdcd)

repita
cont <- cont + 1
escreva("Digite o valor pago no", cont,"º CD R$ ")
leia(vlr)

soma <- vlr + soma
ate cont = qtdcd

media <- soma / qtdcd
escreval
escreval("Investimento de CDs")
escreval("Valor total R$:",soma)
escreval("Valor médio R$:",media)


fimalgoritmo
