algoritmo "Soma de argumentos"
// Função : O programa irá pedir três argumentos e depois irá soma-los.
// Autor : Gabriel Ripardo de Sena
// Data : 20/04/2016
// Seção de Declarações

var
   N1:vetor[1..3] de inteiro
   x,resultado:inteiro
   funcao Soma(A,B,C:inteiro): inteiro

   inicio

         retorne A+B+C

   fimfuncao

inicio
   para x de 1 ate 3 faca
        escreva("Digite o",x,"° número: ")
        leia(N1[x])
   fimpara

   resultado<-Soma(N1[1],N1[2],N1[3])
     escreva("Resultado:",resultado)
fimalgoritmo
