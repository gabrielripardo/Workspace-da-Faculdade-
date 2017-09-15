algoritmo "Números ímpares e pares"
// Função :  O usuário irá digitar dez números e programa irá verfificar se é impar ou par.
// Autor : Gabriel Ripardo de Sena
// Data : 09/04/2016
// Seção de Declarações 
var
num, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, imp, par : INTEIRO

inicio
// Seção de Comandos
par <- 0
imp <- 0
num <- 0

escreva("Digite um número: ")
leia(num1)
        se (num1 mod 2 = 0) entao
        par <- par + 1
        senao
        imp <- par + 1
        fimse
repita
escreva("Digite outro número: ")
leia(num2)
        num <- num + 1
        se (num2 mod 2 = 0) entao
           par <- par + 1
        senao
           imp <- imp + 1
        fimse
ate num = 9
        
         escreva(par, " Números pares e")
         escreva(imp, " Números ímpares")


fimalgoritmo
