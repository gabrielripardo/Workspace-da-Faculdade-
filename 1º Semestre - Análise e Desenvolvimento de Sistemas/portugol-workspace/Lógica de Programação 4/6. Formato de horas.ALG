algoritmo "Valor v�lido ou inv�lido"
// Fun��o :
// Autor : Gabriel Ripardo de Sena
// Data : 24/04/2016
// Se��o de Declara��es

Var
   horas,minutos,convertido:real
   turno:caracter
   funcao Convert(H:real): real
   var
      x:inteiro
   inicio
      se (H>=12) e (H<24) entao
         para x de 1 ate 12 faca
         H<-H-1
	      fimpara
      fimse
      retorne H
   fimfuncao
   funcao Turn(N:real): caracter
   inicio
         se (N<12) entao
            retorne "A.M"
         senao
            retorne "P.M"
         fimse
   fimfuncao
Inicio
   escreva("Digite que horas s�o. Horas: ")
   leia(horas)
   escreva("Digite os minutos. Minutos: ")
   leia(minutos)
   convertido<-Convert(horas)
   turno<-Turn(horas)
   escreva("As horas depois da convers�o �:",convertido,":",minutos:2," ",turno)
Fimalgoritmo
