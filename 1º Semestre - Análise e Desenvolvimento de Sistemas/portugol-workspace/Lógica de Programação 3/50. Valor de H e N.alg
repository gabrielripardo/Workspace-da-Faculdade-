algoritmo "Termos de H"
// Fun��o : O progra ir� fazer uma progress�o de somas at� o n�mero informado
//          pelo usu�rio.
// Autor: Gabriel Ripardo de Sena
// Data : 19/04/2016
// Se��o de Declara��es 
var
h : INTEIRO
n : INTEIRO
cont : inteiro
cont2 : inteiro
inicio
// Se��o de Comandos
escreva("Digite o termo H: ")
leia(h)

escreva("Digite quantos termos: ")
leia(n)

repita
se cont2 >= 1 entao
escreva("   +  ")
fimse
cont <- cont + 1
cont2 <- cont2 + h
escreva(h," /",cont2)

ate cont = n

fimalgoritmo
