algoritmo "Termos de H"
// Função : O progra irá fazer uma progressão de somas até o número informado
//          pelo usuário.
// Autor: Gabriel Ripardo de Sena
// Data : 19/04/2016
// Seção de Declarações 
var
h : INTEIRO
n : INTEIRO
cont : inteiro
cont2 : inteiro
inicio
// Seção de Comandos
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
