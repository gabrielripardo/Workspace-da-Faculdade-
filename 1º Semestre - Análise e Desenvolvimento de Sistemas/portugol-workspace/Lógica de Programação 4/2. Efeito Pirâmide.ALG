algoritmo "Efeito Pir�mide"
// Fun��o : Gerar uma sequ�ncia de n�mero crescentes at� o n�mero informado
// Autor : Gabriel Ripardo de Sena
// Data : 19/04/2016
// Se��o de Declara��es
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
   escreva("Digite o limite da numera��o: ")
   leia(n)
   Piramide(n)
fimalgoritmo
