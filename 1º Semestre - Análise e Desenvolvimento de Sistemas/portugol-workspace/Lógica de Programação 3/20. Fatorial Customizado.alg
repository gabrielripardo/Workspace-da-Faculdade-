algoritmo "C�culo Fatorial Customizado"
// Fun��o : Calcular o fatorial informado pelo usu�rio de no m�nimo 1 e no m�ximo 16.
//          o n�mero de ser positivo.
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
repita
escreva("Digite um n�mero: ")
leia(inte)

escreval("Fatorial de:", inte)
                   se (inte > 15) entao
                   escreval
                   escreval("Valor limite ultrapassado!")
                   escreval("Tente novamente!")
                   escreval
                   fimse
                   se (inte <= 0) entao
                   escreval
                   escreval("O valor deve ser positivo!")
                   escreva("Tente novamente!")
                   escreval
                   fimse
ate (inte < 16)
ate (inte > 0)
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
