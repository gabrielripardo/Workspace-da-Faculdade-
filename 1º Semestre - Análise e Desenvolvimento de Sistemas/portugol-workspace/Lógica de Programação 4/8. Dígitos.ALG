algoritmo "D�gitos"
// Fun��o :
// Autor : Gabriel Ripardo de Sena
// Data : 26/04/2016
// Se��o de Declara��es

var
   numero,qdigitos:inteiro
   funcao Digitos(N:inteiro): inteiro
   var
   N2:caractere
   N3:inteiro
   inicio
         N2<-numpcarac(N)
         N3<-compr(N2)
         retorne N3
   fimfuncao
inicio
   escreval("---QUANTIDADE-DE-D�GITOS---")
   escreval
   escreva("Digite um n�mero para saber a quantidade de d�gitos: ")
   leia(numero)
   qdigitos<-Digitos(numero)
   escreval("A quantidade de dig�tos do n�mero �: ",qdigitos)
fimalgoritmo
