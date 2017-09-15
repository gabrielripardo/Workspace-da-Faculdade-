algoritmo "Dígitos"
// Função :
// Autor : Gabriel Ripardo de Sena
// Data : 26/04/2016
// Seção de Declarações

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
   escreval("---QUANTIDADE-DE-DÍGITOS---")
   escreval
   escreva("Digite um número para saber a quantidade de dígitos: ")
   leia(numero)
   qdigitos<-Digitos(numero)
   escreval("A quantidade de digítos do número é: ",qdigitos)
fimalgoritmo
