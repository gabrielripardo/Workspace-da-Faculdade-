algoritmo "Efeito Escada"
// Fun��o : Gerar uma sequ�ncia de n�mero at� o limite informado, formando um
// efeito escada de sequ�ncias de n�meros.
// Autor : Gabriel Ripardo
// Data : 04/04/2016
// Se��o de Declara��es

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
   escreva("Digite um n�mero: ")
   leia(valor)
   Piramide(valor)
fimalgoritmo
