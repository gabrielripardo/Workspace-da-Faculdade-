algoritmo "M�dia de alunos por turma"
// Fun��o : Calcular o n�mero m�dio de alunos por turma
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Se��o de Declara��es 
var
qtdturm, qtdalun : INTEIRO
media : REAL
inicio
// Se��o de Comandos 
escreva("Digite a quantidade de turmas: ")
leia(qtdturm)

repita
      escreva("Digite a quantidade de alunos de cada turma: ")
      leia(qtdalun)
             se qtdalun > 40 entao
             fimse
ate qtdalun <= 40

                 media <- qtdalun / qtdturm
                 escreval("O n�mero m�dio de alunos por turma �: ", media)
fimalgoritmo
