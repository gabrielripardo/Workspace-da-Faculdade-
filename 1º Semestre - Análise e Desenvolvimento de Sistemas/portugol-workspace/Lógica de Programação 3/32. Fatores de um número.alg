algoritmo "Fatorial de um n�mero"
// Fun��o : O programa ir� fornecer o fatorial do n�mero inserido pelo usu�rio
// Autor : Gabriel Ripardo de Sena
// Data : 07/04/2016
// Se��o de Declara��es 
var
inte : INTEIRO
num : INTEIRO
rs : INTEIRO


inicio
// Se��o de Comandos
escreva("Digite um n�mero: ")
leia(inte)
escreval("Fatorial de:", inte)

num <- inte - 1
rs <- inte * num
      escreva("!",inte, " =")
      escreva(num, " .")
      
repita
     num <- num - 1
     rs <- rs * num
     escreva(num, " .")

ate num = 1
    escreva("=",rs)



fimalgoritmo
