algoritmo "Equa��o do 2� grau"
// Fun��o : Verifificar se � uma equa��o do 2� grau. Verfificar se o valor do delta � negativo. Verfificar se equa��o possui duas ra�zes
// Autor :  GABRIEL RIPARDO DE SENA
// Data : 28/03/2016
// Se��o de Declara��es
algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 02/04/2016
// Se��o de Declara��es 
var
a : REAL
b : REAL
c : REAL
delta : REAL

inicio
// Se��o de Comandos 
escreva("Escreva o valor de a: ")
leia(a)
       se a = 0 entao
       escreva("A equa��o n�o � do segundo grau!")
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
            escreva("O resultado do delta � negativo")
            interrompa
            escreval

            senao
            se delta = 0 entao
            escreval
            escreva("A equa��o possui apenas uma raiz real")
            escreval

            senao
            se delta > 1 entao
            escreval
            escreva("A equa��o possui duas ra�zes")
            escreval
fimse
fimse
fimse
fimse
fimalgoritmo


  //  Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c.
  //  O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
  //  Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve fazer pedir os demais valores, sendo encerrado;
  //  Se o delta calculado for negativo, a equa��o n�o possui raizes reais. Informe ao usu�rio e encerre o programa;
  //  Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio;
  //  Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio;
