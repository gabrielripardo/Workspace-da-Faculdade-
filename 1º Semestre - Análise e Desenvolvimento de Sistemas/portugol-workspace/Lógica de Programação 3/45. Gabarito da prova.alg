algoritmo "Gabarito"
// Fun��o : Informar o total de acertos, a m�dia e o total de pessoas que usaram
//          o programa para calcular as notas
// Autor :  Gabriel Ripardo de Sena
// Data : 06/04/2016
// Se��o de Declara��es 
var
pergunta01, pergunta02, pergunta03, pergunta04, pergunta05, pergunta06: CARACTERE
pergunta07, pergunta08, pergunta09, pergunta10: CARACTERE
p01, p02, p03, p04, p05, p06, p07, p08 ,p09 ,p10 : CARACTERE
total: INTEIRO
sn : CARACTERE
media : REAL
num : REAL
num1 : REAL
maior_valor : REAL
menor_valor : REAL
aluno1 : REAL
aluno2 : REAL
soma : REAL

inicio
// Se��o de Comandos
escreval("<<<Crie o Gabarito>>>>")
escreva("Quest�o 01 � igual = ")
leia(p01)

escreva("Quest�o 02 � igual = ")
leia(p02)

escreva("Quest�o 03 � igual = ")
leia(p03)

escreva("Quest�o 04 � igual = ")
leia(p04)

escreva("Quest�o 05 � igual = ")
leia(p05)

escreva("Quest�o 06 � igual = ")
leia(p06)

escreva("Quest�o 07 � igual = ")
leia(p07)

escreva("Quest�o 08 � igual = ")
leia(p08)

escreva("Quest�o 09 � igual = ")
leia(p09)

escreva("Quest�o 10 � igual = ")
leia(p10)


limpatela
num1 <- 0

repita
limpatela
escreval("Aluno: ",num1)
escreval("Digite a resposta")
escreva("Quest�o 1: ")
leia(pergunta01)
escreva("Quest�o 2: ")
leia(pergunta02)

escreva("Quest�o 3: ")
leia(pergunta03)

escreva("Quest�o 4: ")
leia(pergunta04)

escreva("Quest�o 5: ")
leia(pergunta05)

escreva("Quest�o 6: ")
leia(pergunta06)

escreva("Quest�o 7: ")
leia(pergunta07)

escreva("Quest�o 8: ")
leia(pergunta08)

escreva("Quest�o 9: ")
leia(pergunta09)

escreva("Quest�o 10: ")
leia(pergunta10)

total <- 0
                                /////Gabarito////

se pergunta01 = p01 entao
total <- total + 1
senao
se pergunta01 <> p01 entao
total <- total + 0
fimse
fimse
se pergunta02 = p02 entao
total <- total + 1
fimse
se pergunta03 = p03 entao
total <- total + 1
fimse
se pergunta04 = p04 entao
total <- total + 1
fimse
se pergunta05 = p05 entao
total <- total + 1
fimse
se pergunta06 = p06 entao
total <- total + 1
fimse
se pergunta07 = p07 entao
total <- total + 1
fimse
se pergunta08 = p08 entao
total <- total + 1
fimse
se pergunta09 = p09 entao
total <- total + 1
fimse
se pergunta10 = p10 entao
total <- total + 1
fimse

menor_valor <- 1

 ////////////////////////////////////////////////////////////////////
             se total > maior_valor entao
                  maior_valor <- total
                  aluno1 <- num1
             fimse
             se total < menor_valor entao
                  menor_valor <- total
                  aluno2 <- num1
             fimse
                           num <- 1
                           soma <- total + soma

                         escreval("O total de acertos:",total)

                          escreva("Se outro aluno ir� usar o programa tecle 's' se n�o for usar tecle 'n':" )
                          leia(sn)

                          num1 <- num1 + 1
                          num <- num + 1

                          ate sn <> "s"
                          se sn <> "s" entao
                          limpatela

                          media <- soma / num1
                          escreval("Maior acerto:",maior_valor," - Aluno:",aluno1)
                          escreval("Menor acerto:",menor_valor," - Aluno:",aluno2)
                          escreval("Total de alunos:",num1)
                          escreval("M�dia das notas:",media)
            fimse
fimalgoritmo
