algoritmo "Termos de n/m"
// Fun��o : O progra ir� fazer uma progress�o de somas at� o n�mero informado
//          pelo usu�rio.
// Autor: Gabriel Ripardo de Sena
// Data : 19/04/2016
// Se��o de Declara��es 
var
vln : INTEIRO
vlm : INTEIRO
cont : inteiro
cont2 : inteiro
inicio
// Se��o de Comandos
repita
escreva("Digite o termo n: ")
leia(vln)

escreva("Digite o termo m: ")
leia(vlm)
se vln > vlm entao
escreval("O termo n dever� ser maior do que m!")
fimse
ate vln < vlm

cont <- 1

repita

cont <- cont + 1
cont2 <- cont2 + 1
escreva(" + ",cont + vln,"/",(cont + cont2)+vlm)

ate cont >= (vln)
 
fimalgoritmo
