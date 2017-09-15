algoritmo "Cáculo Fatorial"
// Função : Calcular o fatorial informado pelo usuário
// Autor : Gabriel Ripardo de Sena
// Data : 11/04/2016
// Seção de Declarações
var
inte : INTEIRO
num : INTEIRO
rs : INTEIRO
cont : INTEIRO

inicio
// Seção de Comandos
repita
repita
escreva("Digite um número: ")
leia(inte)

escreval("Fatorial de:", inte)

                   se inte = 1 entao
                      escreval("1 = 1 . 1 = 1")
senao

      escreva("!",inte, " =", inte)
num <- inte
rs <- inte

repita
     cont <- cont + 1
     num <- num - 1
     rs <- rs * num
       escreva(" .",num)
ate num = 1


    escreval(" =",rs)
    escreval
fimse
fimrepita

fimalgoritmo
