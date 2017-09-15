algoritmo "Média de notas 2.0"
// Função : Informar a média a partir de duas notas
// Autor : Gabriel Ripardo
// Data : 28/03/2016
// Seção de Declarações 
var
nota1 : REAL
nota2 : REAL
resultado : REAL
inicio
// Seção de Comandos 
escreva("Escreva sua primeira nota: ")
leia(nota1)

escreva("Escreva sua segunda nota: ")
leia(nota2)

            resultado <- (nota1+nota2)/2
            se resultado = 10 entao
            escreva("Aluno aprovado com Distinção com média de",resultado)
            senao
            se resultado >= 7 entao
            escreva("Aluno aprovado com:",resultado)
            senao
            se resultado <= 7 entao
            escreva("Aluno reprovado com:",resultado)
            senao
            escreva("O valor fornecido está incorrecto, forneça os valores certos!")
fimse
            fimse
            fimse
fimalgoritmo
