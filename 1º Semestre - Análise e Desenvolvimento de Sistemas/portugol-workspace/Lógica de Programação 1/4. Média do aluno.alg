Algoritmo "Média do aluno"
// Descrição   : O programa irá calcular a média de um aluno usando três notas.
// Autor(a)    : Gabriel Ripardo de Sena
// Data atual  : 25/03/2016
Var
// Seção de Declarações das variáveis 
nota1 : REAL
nota2 : REAL
nota3 : REAL
nota4 : REAL
mediaresultado : REAL

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite a primeira nota: ")
leia(nota1)
escreva("Digite a segunda nota: ")
leia(nota2)
escreva("Digite a terceira nota: ")
leia(nota3)
escreva("Digite a quarta e última nota: ")
escreval
                mediaresultado <- (nota1 + nota2 + nota3)/3
                
escreval("A média do aluno foi: ",mediaresultado)

Fimalgoritmo
