algoritmo "Panificadora - tabela de preços"
// Função : Escrever uma tabela de preços de 1,99 até a quantidade for igual a 50.
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Seção de Declarações 
var
cont, cont2 : REAL
bread, inic : REAL

inicio
// Seção de Comandos
escreva("Digite o preço do pão: ")
leia(bread)

repita      //0,36

cont <- cont + 1
inic <- cont * 0.18

ate inic >= bread

cont2 <- cont
repita
cont2 <- cont2 + 1

escreval(cont2, " - R$", cont2 * 0.18)
ate cont2 = 50

fimalgoritmo
