algoritmo "N�meros �mpares e pares"
// Fun��o :  O usu�rio ir� digitar dez n�meros e programa ir� verfificar se � impar ou par.
// Autor : Gabriel Ripardo de Sena
// Data : 09/04/2016
// Se��o de Declara��es 
var
num, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, imp, par : INTEIRO

inicio
// Se��o de Comandos
par <- 0
imp <- 0
num <- 0

escreva("Digite um n�mero: ")
leia(num1)
        se (num1 mod 2 = 0) entao
        par <- par + 1
        senao
        imp <- par + 1
        fimse
repita
escreva("Digite outro n�mero: ")
leia(num2)
        num <- num + 1
        se (num2 mod 2 = 0) entao
           par <- par + 1
        senao
           imp <- imp + 1
        fimse
ate num = 9
        
         escreva(par, " N�meros pares e")
         escreva(imp, " N�meros �mpares")


fimalgoritmo
