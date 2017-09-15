algoritmo "Inteiro, Decimal, Ímpar, par, positivo ou negativo"

// Autor :  Gabriel Ripardo de Sena
// Data : 02/04/2016
// Seção de Declarações

var
result, x: real

inicio
escreva("digite o numero desejado para analisarmos:" )
leia(x)

result <- x

       se x < 0 entao
       escreval("valor(>",x," <)digitado é (negativo)")
       senao
       se x > 0 entao
       escreval("valor (>",x," <) digitado é (positivo)")
       fimse
       fimse



       se x mod 2 = 0 entao
       escreval ("Este número é (> par <)")
       senao
       escreval ("Este número é (> ímpar <)")
       fimse


       se (int (result) = result) entao
       escreval("o numero (>",result, "<) é inteiro")
       senao
       escreval("o numero (>",result, "<) é decimal")
       fimse

fimalgoritmo
