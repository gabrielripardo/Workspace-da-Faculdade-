algoritmo "Popula��o de pa�ses"
// Fun��o :  Declarar o total de anos para que a popula��o do pa�s A ultrapasse ou iguale a do B.
// Autor : Gabriel Ripardo de Sena
// Data : 05/04/2016
// Se��o de Declara��es 
var
a : REAL
b : REAL
c : REAL

inicio
// Se��o de Comandos

a <- 80000
b <- 200000
c <- 0


     enquanto (a < b) faca
     a <- a + (0.03 * a)
     b <- b + (0.015 * b)
     c <- c + 1
fimenquanto

escreval("O total de anos necess�rio para que o Pa�s 'A' alcace o pa�s 'B' � = ",c," anos")

fimalgoritmo
