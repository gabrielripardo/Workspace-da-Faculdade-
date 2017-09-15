algoritmo "semnome"
// Função : Calcular quantos anos um dos países demoraria para chegar no mesmo
//          a mesma quantidade de pessoas do outro
// Autor : Gabriel Ripardo de Sena
// Data : 09/04/2016
// Seção de Declarações 
var
anoa : REAL
     taxaa : REAL
anob : REAL
     taxab : REAL
c : REAL

inicio
// Seção de Comandos
escreva("Digite a polução do país A: ")
leia(anoa)
          escreva("    Digite a taxa anual de crescimento: ")
          leia(taxaa)

escreva("Digite a população do país B: ")
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
       escreval("O total de anos necessário para que o País 'A' alcace o país 'B' é = ",c," anos")
     fimse
     
     se anoa > anob entao
     enquanto (anoa > anob) faca
        anoa <- anoa + (taxaa * anoa)
        anob <- anob + (taxab * anob)
        c <- c + 1
       fimenquanto
        escreval("O total de anos necessário para que o País 'B' alcace o país 'A' é = ",c," anos")
     fimse



fimalgoritmo
