algoritmo "População de países"
// Função :  Declarar o total de anos para que a população do país A ultrapasse ou iguale a do B.
// Autor : Gabriel Ripardo de Sena
// Data : 05/04/2016
// Seção de Declarações 
var
a : REAL
b : REAL
c : REAL

inicio
// Seção de Comandos

a <- 80000
b <- 200000
c <- 0


     enquanto (a < b) faca
     a <- a + (0.03 * a)
     b <- b + (0.015 * b)
     c <- c + 1
fimenquanto

escreval("O total de anos necessário para que o País 'A' alcace o país 'B' é = ",c," anos")

fimalgoritmo
