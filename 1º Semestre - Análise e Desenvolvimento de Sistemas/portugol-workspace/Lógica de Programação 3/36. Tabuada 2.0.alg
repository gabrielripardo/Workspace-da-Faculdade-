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
cont : INTEIRO

inicio
// Se��o de Comandos 
escreval("|###TABUADA###    |")
escreva("|Digite o n�mero: ")
leia(num)

escreva("|Come�ar por: ")
leia(ini)

escreva("|Terminar em: ")
leia(end)


escreval
escreval("|____Tabuada_de_",num,"___|")

cont <- (end - ini)+1


num1 <- 0

se ini > end entao
interrompa
 fimse
repita
   num1 <- num1 + 1
   ini <- ini + 1
   escreval("|",(ini-1)," x",num," =",((ini-1)*num),"   |")
ate num1 = cont
escreval("___________________")


fimalgoritmo


