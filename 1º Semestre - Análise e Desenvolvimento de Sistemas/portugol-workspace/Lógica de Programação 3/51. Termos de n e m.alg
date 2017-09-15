algoritmo "Termos de n/m"
// Função : O progra irá fazer uma progressão de somas até o número informado
//          pelo usuário.
// Autor: Gabriel Ripardo de Sena
// Data : 19/04/2016
// Seção de Declarações 
var
vln : INTEIRO
vlm : INTEIRO
cont : inteiro
cont2 : inteiro
inicio
// Seção de Comandos
repita
escreva("Digite o termo n: ")
leia(vln)

escreva("Digite o termo m: ")
leia(vlm)
se vln > vlm entao
escreval("O termo n deverá ser maior do que m!")
fimse
ate vln < vlm

cont <- 1

repita

cont <- cont + 1
cont2 <- cont2 + 1
escreva(" + ",cont + vln,"/",(cont + cont2)+vlm)

ate cont >= (vln)
 
fimalgoritmo
