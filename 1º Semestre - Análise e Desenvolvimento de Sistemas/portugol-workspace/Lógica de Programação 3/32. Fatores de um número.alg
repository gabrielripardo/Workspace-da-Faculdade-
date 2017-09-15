algoritmo "Fatorial de um número"
// Função : O programa irá fornecer o fatorial do número inserido pelo usuário
// Autor : Gabriel Ripardo de Sena
// Data : 07/04/2016
// Seção de Declarações 
var
inte : INTEIRO
num : INTEIRO
rs : INTEIRO


inicio
// Seção de Comandos
escreva("Digite um número: ")
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
