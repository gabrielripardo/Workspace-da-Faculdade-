algoritmo "Gabarito"
// Função : Informar o total de acertos, a média e o total de pessoas que usaram
//          o programa para calcular as notas
// Autor :  Gabriel Ripardo de Sena
// Data : 06/04/2016
// Seção de Declarações 
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
// Seção de Comandos
escreval("<<<Crie o Gabarito>>>>")
escreva("Questão 01 é igual = ")
leia(p01)

escreva("Questão 02 é igual = ")
leia(p02)

escreva("Questão 03 é igual = ")
leia(p03)

escreva("Questão 04 é igual = ")
leia(p04)

escreva("Questão 05 é igual = ")
leia(p05)

escreva("Questão 06 é igual = ")
leia(p06)

escreva("Questão 07 é igual = ")
leia(p07)

escreva("Questão 08 é igual = ")
leia(p08)

escreva("Questão 09 é igual = ")
leia(p09)

escreva("Questão 10 é igual = ")
leia(p10)


limpatela
num1 <- 0

repita
limpatela
escreval("Aluno: ",num1)
escreval("Digite a resposta")
escreva("Questão 1: ")
leia(pergunta01)
escreva("Questão 2: ")
leia(pergunta02)

escreva("Questão 3: ")
leia(pergunta03)

escreva("Questão 4: ")
leia(pergunta04)

escreva("Questão 5: ")
leia(pergunta05)

escreva("Questão 6: ")
leia(pergunta06)

escreva("Questão 7: ")
leia(pergunta07)

escreva("Questão 8: ")
leia(pergunta08)

escreva("Questão 9: ")
leia(pergunta09)

escreva("Questão 10: ")
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

                          escreva("Se outro aluno irá usar o programa tecle 's' se não for usar tecle 'n':" )
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
                          escreval("Média das notas:",media)
            fimse
fimalgoritmo
