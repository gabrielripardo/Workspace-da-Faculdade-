algoritmo "Fibonacci - LIMITE DE TERMOS"
// Função : O usário fornecer o limite de termos gerados pela sequência Fibonacci
// Autor : Gabriel Ripardo de Sena
// Data : 09/04/2016
// Seção de Declarações 
var
n1 : INTEIRO
n2 : INTEIRO
n3 : INTEIRO
limite : INTEIRO
inicio
// Seção de Comandos
escreva("Digite um n-nésimo termo: ")
leia(limite)

n1 <- -1
n2 <- 1
n3 <- 0

   enquanto (n3 < limite) faca
   n3 <- n1 + n2
   n1 <- n2
   n2 <- n3
   se n3 < limite entao
   escreva(n3)
   fimse
fimenquanto
fimalgoritmo
