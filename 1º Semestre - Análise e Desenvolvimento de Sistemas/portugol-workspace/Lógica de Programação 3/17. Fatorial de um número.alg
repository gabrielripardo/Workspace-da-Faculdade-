algoritmo "C�culo Fatorial"
// Fun��o : Calcular o fatorial informado pelo usu�rio
// Autor : Gabriel Ripardo de Sena
// Data : 11/04/2016
// Se��o de Declara��es
var
inte : INTEIRO
num : INTEIRO
rs : INTEIRO
cont : INTEIRO

inicio
// Se��o de Comandos
repita
repita
escreva("Digite um n�mero: ")
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
