algoritmo "Panificadora - tabela de pre�os"
// Fun��o : Escrever uma tabela de pre�os de 1,99 at� a quantidade for igual a 50.
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Se��o de Declara��es 
var
cont, cont2 : REAL
bread, inic : REAL

inicio
// Se��o de Comandos
escreva("Digite o pre�o do p�o: ")
leia(bread)

repita      //0,36

cont <- cont + 1
inic <- cont * 0.18

ate inic >= bread

cont2 <- cont
repita
cont2 <- cont2 + 1

escreval(cont2, " - R$", cont2 * 0.18)
ate cont2 = 50

fimalgoritmo
