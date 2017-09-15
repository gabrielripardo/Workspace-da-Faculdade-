algoritmo "Equação do 2º grau"
// Função : Verifificar se é uma equação do 2º grau. Verfificar se o valor do delta é negativo. Verfificar se equação possui duas raízes
// Autor :  GABRIEL RIPARDO DE SENA
// Data : 28/03/2016
// Seção de Declarações
algoritmo "semnome"
// Função :
// Autor :
// Data : 02/04/2016
// Seção de Declarações 
var
a : REAL
b : REAL
c : REAL
delta : REAL

inicio
// Seção de Comandos 
escreva("Escreva o valor de a: ")
leia(a)
       se a = 0 entao
       escreva("A equação não é do segundo grau!")
       interrompa
       
       
senao
escreva("Escreva o valor de b: ")
leia(b)
escreva("Escreva o valor de c: ")
leia(c)

delta <- (b*b) - 4 * a * c
                                                                                              //delta = b2-4ac
            se delta < 0 entao
            escreval
            escreva("O resultado do delta é negativo")
            interrompa
            escreval

            senao
            se delta = 0 entao
            escreval
            escreva("A equação possui apenas uma raiz real")
            escreval

            senao
            se delta > 1 entao
            escreval
            escreva("A equação possui duas raízes")
            escreval
fimse
fimse
fimse
fimse
fimalgoritmo


  //  Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
  //  O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
  //  Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
  //  Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
  //  Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
  //  Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
