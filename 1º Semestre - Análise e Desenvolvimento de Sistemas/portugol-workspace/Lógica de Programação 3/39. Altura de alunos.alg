algoritmo "Altura de alunos"
// Fun��o : Declarar o n�meros dos aluno mais baixo e do mais alto.
// Autor : Gabriel Ripardo de Sena
// Data : 10/04/2016
// Se��o de Declara��es 
var
num : REAL
numaluno : INTEIRO
maior_valor : REAL
menor_valor : REAL
aluno_maior : INTEIRO
aluno_menor : INTEIRO
cont : INTEIRO
inicio
// Se��o de Comandos 
menor_valor <- 10000


Para cont de 1 ate 4 passo 1 faca

  escreva("Digite o n�mero do aluno: ")
  leia(numaluno)
  
  escreva("Digite a altura: ")
  leia(num)

    se num > maior_valor entao
      maior_valor <- num
      aluno_maior <- numaluno
    fimse
    se num < menor_valor entao
      menor_valor <- num
      aluno_menor <- numaluno
    fimse

fimpara
              escreval("Maior aluno: Aluno -",aluno_maior," com Altura:",maior_valor)
              escreval("Menor aluno: Aluno -",aluno_menor," com Altura:",menor_valor)

fimalgoritmo

