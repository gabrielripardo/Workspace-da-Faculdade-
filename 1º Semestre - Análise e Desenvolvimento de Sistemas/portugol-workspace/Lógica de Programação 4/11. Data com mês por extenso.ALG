algoritmo "Data com m�s por extenso"
// Fun��o :
// Autor : Gabriel Ripardo de Sena
// Data : 24/04/2016
// Se��o de Declara��es
var
   Dia,Mes,Ano:inteiro
   mesExtenso:caractere
funcao mesPorExtenso(Mes:inteiro):caractere
var
   mes1:vetor[1..12] de caractere
   mes2:caractere
   x:inteiro
inicio
   mes1[1]<-"Janeiro"
   mes1[2]<-"Fevereiro"
   mes1[3]<-"Mar�o"
   mes1[4]<-"Abril"
   mes1[5]<-"Maio"
   mes1[6]<-"Junho"
   mes1[7]<-"Julho"
   mes1[8]<-"Agosto"
   mes1[9]<-"Setembro
   mes1[10]<-"Outubro"
   mes1[11]<-"Novembro"
   mes1[12]<-"Dezembro"
   para x de 1 ate 12 faca
      se (Mes=x) entao
         mes2<-mes1[x]
         retorne mes2
      senao
         se (mes>12) entao
            retorne "Null"
         fimse
      fimse
   fimpara
fimfuncao
inicio
   Escreva("Digite o dia do m�s(Em n�meros): ")
   Leia(Dia)
   Escreva("Digite o m�s do ano(Em n�meros): ")
   leia(Mes)
   Escreva("Digite o ano da data: ")
   leia(Ano)
   mesExtenso<-mesPorExtenso(Mes)
   se (mesExtenso="Null") entao
      escreval("Mes: ",mesExtenso,"! O m�s n�o pode ser maior que 12.")
   senao
      escreval("Data: Dia(",Dia:1,") de (",mesExtenso,") de (",Ano:4,")")
   fimse
fimalgoritmo
