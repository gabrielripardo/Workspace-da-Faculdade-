algoritmo "Tabuada 2.0"
// Função :  Informar a tabuada desejada com início e fim determinados pelo usuário.
// Autor : GABRIEL RIPARDO DE SENA
// Data : 05/04/2016
// Seção de Declarações 
var
num : INTEIRO
num1 : INTEIRO
ini : INTEIRO
end : INTEIRO
cont : INTEIRO

inicio
// Seção de Comandos 
escreval("|###TABUADA###    |")
escreva("|Digite o número: ")
leia(num)

escreva("|Começar por: ")
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


