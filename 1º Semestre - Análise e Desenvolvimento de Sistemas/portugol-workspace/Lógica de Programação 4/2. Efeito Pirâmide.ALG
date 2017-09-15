algoritmo "Efeito Pirâmide"
// Função : Gerar uma sequência de número crescentes até o número informado
// Autor : Gabriel Ripardo de Sena
// Data : 19/04/2016
// Seção de Declarações
var
   n:inteiro
   procedimento Piramide(n:inteiro)
   inicio
   para n de 1 ate n faca
        para n de 1 ate n faca
             escreva(n)
        fimpara
        escreval
   fimpara
   fimprocedimento
inicio
   escreva("Digite o limite da numeração: ")
   leia(n)
   Piramide(n)
fimalgoritmo
