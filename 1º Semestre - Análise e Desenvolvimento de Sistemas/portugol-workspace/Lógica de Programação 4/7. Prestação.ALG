algoritmo "Prestação"
// Função :
// Autor : Gabriel Ripardo de Sena
// Data : 24/04/2016
// Seção de Declarações

var
   atraso,prestacao,valort:real
funcao valorPagamento(A,B:real): real
var
   multa,dias,resultado:real
inicio
   se (B>0) entao
      multa<-A*3/100
      dias<-(A*0.1/100)*B
   senao
      multa<-0
      dias<-0
   fimse
   resultado<-A+multa+dias
   retorne resultado
fimfuncao
   procedimento Logo
   inicio
         escreval("-Valor da prestação com dias de atraso")
         escreval
   fimprocedimento
inicio
   repita
      Logo
      escreva("Digite o valor da prestação: R$")
      leia(prestacao)
      se (prestacao=0) entao
         fimalgoritmo
      fimse
      escreva("Digite os dias de atraso: ")
      leia(atraso)
      valort<-valorPagamento(prestacao,atraso)
      limpatela
      logo
      escreval("O valor total a ser pago é: R$",valort:2:2)
      escreval
   ate (prestacao=0)
fimalgoritmo
