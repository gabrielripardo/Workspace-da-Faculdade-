algoritmo "Cáculo Fatorial Customizado"
// Função : Calcular o fatorial informado pelo usuário de no mínimo 1 e no máximo 16.
//          o número de ser positivo.
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
repita
escreva("Digite um número: ")
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
