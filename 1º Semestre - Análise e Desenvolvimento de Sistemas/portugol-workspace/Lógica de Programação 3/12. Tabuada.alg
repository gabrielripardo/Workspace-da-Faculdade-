algoritmo "Tabuada 2.0"
// Fun��o :  Informar a tabuada desejada com in�cio e fim determinados pelo usu�rio.
// Autor : GABRIEL RIPARDO DE SENA
// Data : 05/04/2016
// Se��o de Declara��es 
var
num : INTEIRO
num1 : INTEIRO
ini : INTEIRO
end : INTEIRO

inicio
// Se��o de Comandos 
escreval("|###TABUADA###    |")
escreva("|Digite o n�mero: ")
leia(num)


escreval
escreval("|____Tabuada_de_",num,"___|")


num1 <- 0


repita
   num1 <- num1 + 1
   escreval("|",num1," x",num," =",(num1*num),"   |")
ate num1 = 10
escreval("___________________")


fimalgoritmo


