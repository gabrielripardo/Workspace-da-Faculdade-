algoritmo "semnome"
// Fun��o : Calcular quantos anos um dos pa�ses demoraria para chegar no mesmo
//          a mesma quantidade de pessoas do outro
// Autor : Gabriel Ripardo de Sena
// Data : 09/04/2016
// Se��o de Declara��es 
var
anoa : REAL
     taxaa : REAL
anob : REAL
     taxab : REAL
c : REAL

inicio
// Se��o de Comandos
escreva("Digite a polu��o do pa�s A: ")
leia(anoa)
          escreva("    Digite a taxa anual de crescimento: ")
          leia(taxaa)

escreva("Digite a popula��o do pa�s B: ")
leia(anob)
          escreva("    Digite a taxa anual de crescimento: ")
          leia(taxab)

taxaa <- taxaa / 100
taxab <- taxab / 100
c <- 0

    se anoa < anob entao
       enquanto (anoa < anob) faca
        anoa <- anoa + (taxaa * anoa)
        anob <- anob + (taxab * anob)
        c <- c + 1
       fimenquanto
       escreval("O total de anos necess�rio para que o Pa�s 'A' alcace o pa�s 'B' � = ",c," anos")
     fimse
     
     se anoa > anob entao
     enquanto (anoa > anob) faca
        anoa <- anoa + (taxaa * anoa)
        anob <- anob + (taxab * anob)
        c <- c + 1
       fimenquanto
        escreval("O total de anos necess�rio para que o Pa�s 'B' alcace o pa�s 'A' � = ",c," anos")
     fimse



fimalgoritmo
