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

inicio
// Seção de Comandos 
escreval("|###TABUADA###    |")
escreva("|Digite o número: ")
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


