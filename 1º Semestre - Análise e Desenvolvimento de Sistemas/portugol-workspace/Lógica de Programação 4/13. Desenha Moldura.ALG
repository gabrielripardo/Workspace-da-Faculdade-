algoritmo "Moldura Desenhada"
// Função : Desenhar figuras geométricas
// Autor :  Gabriel Ripardo de Sena
// Data : 28/04/2016
// Seção de Declarações
algoritmo "semnome"
var
   L,C:caractere
   procedimento quadrado(L,C:caractere)
   inicio
         Limpatela
         escreval("RETANGULO: ")
         escreval
         escreval(L,L,L,L,L,L,L,L,L,L,L,L,L)
         escreval(C,"           ",C)
         escreval(C,"           ",C)
         escreval(C,"           ",C)
         escreval(C,"           ",C)
         escreval(C,"           ",C)
         escreval(C,"           ",C)
         escreval(L,L,L,L,L,L,L,L,L,L,L,L,L)
   fimprocedimento
inicio
   Escreva("Digite o caractere para ser a linha(+,-,|): ")
   Leia(L)
   Escreva("Digite o caractere para ser a coluna(+,-,|): ")
   leia(C)
   escreval
   escolha L
           caso "+"
                L<-L
           caso "-"
                L<-L
           caso "|"
                L<-L
           OUTROcaso
                escreva("Erro! digite apenas os caracteres dos parenteses")
                fimalgoritmo
   fimescolha
   escolha C
           caso "+"
                C<-L
           caso "-"
                C<-L
           caso "|"
                C<-L
           OUTROcaso
                escreva("Erro! digite apenas os caracteres dos parenteses")
                fimalgoritmo
   fimescolha
   quadrado(L,C)
fimalgoritmo
