algoritmo "Efeito Escada"
// Função : Gerar uma sequência de número até o limite informado, formando um
// efeito escada de sequências de números.
// Autor : Gabriel Ripardo
// Data : 04/04/2016
// Seção de Declarações

var
   valor:inteiro
   procedimento Piramide(valor:inteiro)
   inicio
   para valor de 1 ate valor faca
        para valor de 1 ate valor faca
             escreva(valor)
        fimpara
        escreval
   fimpara
   fimprocedimento
   
inicio
   escreva("Digite um número: ")
   leia(valor)
   Piramide(valor)
fimalgoritmo
