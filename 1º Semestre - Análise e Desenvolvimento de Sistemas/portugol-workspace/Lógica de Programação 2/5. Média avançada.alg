algoritmo "M�dia de notas 2.0"
// Fun��o : Informar a m�dia a partir de duas notas
// Autor : Gabriel Ripardo
// Data : 28/03/2016
// Se��o de Declara��es 
var
nota1 : REAL
nota2 : REAL
resultado : REAL
inicio
// Se��o de Comandos 
escreva("Escreva sua primeira nota: ")
leia(nota1)

escreva("Escreva sua segunda nota: ")
leia(nota2)

            resultado <- (nota1+nota2)/2
            se resultado = 10 entao
            escreva("Aluno aprovado com Distin��o com m�dia de",resultado)
            senao
            se resultado >= 7 entao
            escreva("Aluno aprovado com:",resultado)
            senao
            se resultado <= 7 entao
            escreva("Aluno reprovado com:",resultado)
            senao
            escreva("O valor fornecido est� incorrecto, forne�a os valores certos!")
fimse
            fimse
            fimse
fimalgoritmo
