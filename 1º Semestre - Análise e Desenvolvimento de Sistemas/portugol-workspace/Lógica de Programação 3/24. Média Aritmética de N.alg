algoritmo "M�dia Aritm�tica de N notas"
// Fun��o : C�lcular a m�dia de n notas
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Se��o de Declara��es 
var
nota, soma, media, cont : REAL

inicio
// Se��o de Comandos
repita
cont <- cont + 1
escreva("Digite a nota -",cont,": ")
leia(nota)
soma <- nota + soma
media <- soma / cont
escreval("M�dia Aritm�tica = ",media)
escreval
fimrepita
fimalgoritmo
