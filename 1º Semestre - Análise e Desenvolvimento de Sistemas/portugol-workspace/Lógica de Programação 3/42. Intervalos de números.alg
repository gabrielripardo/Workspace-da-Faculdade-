algoritmo "Intervalos de números"
// Função : Programa que ler uma quantidade indeterminada de números
//          positivos e conta quantos deles estão nos seguintes intervalos inseridos.
// Autor : Gabriel Ripardo de Sena
// Data : 14/04/2016
// Seção de Declarações 
var
n, i1, i2, i3, i4 : INTEIRO
inicio
// Seção de Comandos 
repita
escreva("Digite um número: ")
leia(n)


     se (n <= 25) e (n >= 0) entao
        i1 <- i1 + 1
     fimse

     se (n >= 26) e (n <= 50) entao
        i2 <- i2 + 1
     fimse

     se (n >= 51) e (n <= 75) entao
        i3 <- i3 + 1
     fimse

     se (n >= 76) e (n <= 100) entao
        i4 <- i4 + 1
     fimse

escreval ("[0-25]=",i1," [26-50]=",i2," [51-75]=",i3," e [76-100]",i4)

ate  n < 0
fimalgoritmo

