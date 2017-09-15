algoritmo "Maior e o menor número"
// Função : Mostrar o maior e o menor número
// Autor :  GABRIEL RIPARDO DE SENA
// Data : 28/03/2016
// Seção de Declarações 
var
    num1, num2, num3 : REAL
inicio
// Seção de Comandos 
escreva("Digite o primeiro valor: ")
leia(num1)
escreva("Digite outro valor: ")
leia(num2)
escreva("Digite o último valor: ")
leia(num3)

Escreval(">>>>>>>>>>>>>>>>")

  ////////Comandos condicionais para o valor maior
se num1 > num2 entao                 //Uma condição de se a váriavel num1 for maior que a num2 imprima o valor da variável 'num1'
escreva("O maior número é o:" ,num1)
senao
se num1 > num3 entao
escreva("O maior número é o:" ,num1)

senao
se num2 > num1 entao
escreva("O maior número é o:",num2)
senao
se num2 > num3 entao
escreva("O maior número é o:",num2)

senao
se num3 > num1 entao
escreva("O maior número é o:",num3)
senao
se num3 >num2 entao
escreva("O maior número é o:",num3)

fimalgoritmo

fimse
fimse
fimse
fimse
fimse
fimse

/////////////////Comandos condicionais para o menor valor, ou seja, dois algoritmos em um programa.
se num1 < num2 entao
escreval
escreval("E o menor número é o :",num1)
senao
se num1 < num3 entao
escreval
escreval("E o menor número é o:",num1)

senao
se num2 < num1 entao
escreval
escreval("E o menor número é o:",num2)
senao
se num2 < num3 entao
escreval
escreval("E o menor número é o:",num2)

senao
se num3 < num1 entao
escreval
escreval("E o menor número é o:",num3)
senao
se num3 >num2 entao
escreval
escreval("E o menor número é o:",num3)

fimse
fimse
fimse
fimse
fimse
fimse

fimalgoritmo


