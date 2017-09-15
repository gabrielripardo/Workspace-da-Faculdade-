algoritmo "Loja de artigos de R$ 1.99"
// Função : Escrever uma tabela de preços de 1,99 até a quantidade for igual a 50.
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Seção de Declarações 
var
cont : REAL

inicio
// Seção de Comandos

repita

cont <- cont + 1

escreval(cont, " - R$", cont * 1.99)
ate cont = 50

fimalgoritmo
