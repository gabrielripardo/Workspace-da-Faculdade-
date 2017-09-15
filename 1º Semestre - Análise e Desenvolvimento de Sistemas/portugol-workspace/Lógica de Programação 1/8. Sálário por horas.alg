Algoritmo "O salário no mês"
// Descrição   : A partir do valor da hora e o total de horas trabalhadas, o programa irá calcular o salário mensal.
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/03/2016
Var
// Seção de Declarações das variáveis 
mes : REAL
horas : REAL
salario : REAL

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite quanto você ganha por cada hora: ")
leia(mes)
escreva("Digite o total de horas trabalhadas por mês: ")
leia(horas)

salario <-  mes * horas

escreva("Seu salário é de", salario, " reais")

Fimalgoritmo
