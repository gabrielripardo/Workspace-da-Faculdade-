algoritmo "Média de alunos por turma"
// Função : Calcular o número médio de alunos por turma
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Seção de Declarações 
var
qtdturm, qtdalun : INTEIRO
media : REAL
inicio
// Seção de Comandos 
escreva("Digite a quantidade de turmas: ")
leia(qtdturm)

repita
      escreva("Digite a quantidade de alunos de cada turma: ")
      leia(qtdalun)
             se qtdalun > 40 entao
             fimse
ate qtdalun <= 40

                 media <- qtdalun / qtdturm
                 escreval("O número médio de alunos por turma é: ", media)
fimalgoritmo
