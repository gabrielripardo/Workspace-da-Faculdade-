algoritmo "Inteiro, Decimal, �mpar, par, positivo ou negativo"

// Autor :  Gabriel Ripardo de Sena
// Data : 02/04/2016
// Se��o de Declara��es

var
result, x: real

inicio
escreva("digite o numero desejado para analisarmos:" )
leia(x)

result <- x

       se x < 0 entao
       escreval("valor(>",x," <)digitado � (negativo)")
       senao
       se x > 0 entao
       escreval("valor (>",x," <) digitado � (positivo)")
       fimse
       fimse



       se x mod 2 = 0 entao
       escreval ("Este n�mero � (> par <)")
       senao
       escreval ("Este n�mero � (> �mpar <)")
       fimse


       se (int (result) = result) entao
       escreval("o numero (>",result, "<) � inteiro")
       senao
       escreval("o numero (>",result, "<) � decimal")
       fimse

fimalgoritmo
