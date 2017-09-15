algoritmo "Reverso do número"
// Função :
// Autor : Gabriel Ripardo
// Data : 25/04/2016
// Seção de Declarações
var
   numero,contrario:inteiro
   funcao Reverso(N:inteiro): inteiro
   var
      N2,N1:caractere
      C,N3:inteiro
   inicio
      N2<-numpcarac(N)
      para C de compr(N2) ate 1 passo -1 faca
           N1<-N1+copia(N2,C,1)
      fimpara
      N3<-caracpnum(N1)
      retorne N3
   fimfuncao
inicio
   escreval(" NUMERO DE TRAZ PARA FRENTE")
   escreval
   escreva("Digite um número: ")
   leia(numero)
   contrario<-reverso(numero)
   escreva("O número de traz pra frente é:",contrario)
fimalgoritmo
