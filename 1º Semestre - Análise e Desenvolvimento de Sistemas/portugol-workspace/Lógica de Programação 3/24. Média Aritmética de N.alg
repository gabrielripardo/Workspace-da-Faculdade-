algoritmo "Média Aritmética de N notas"
// Função : Cálcular a média de n notas
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Seção de Declarações 
var
nota, soma, media, cont : REAL

inicio
// Seção de Comandos
repita
cont <- cont + 1
escreva("Digite a nota -",cont,": ")
leia(nota)
soma <- nota + soma
media <- soma / cont
escreval("Média Aritmética = ",media)
escreval
fimrepita
fimalgoritmo
