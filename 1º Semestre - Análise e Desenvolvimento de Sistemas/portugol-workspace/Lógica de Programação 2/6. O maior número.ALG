algoritmo "O maior número"

// Função : Informar qual é o número maior
// Autor : GABRIEL RIPARDO DE SENA
// Data : 28/03/2016
// Seção de Declarações

var
num1 : REAL
num2 : REAL
num3 : REAL

inicio
escreva("Digite um valor: ")       //um valor será guardado na varável 'num1'.
leia(num1)

escreva("Digite outro valor: ")    //outro valor guardadará o número armazenado na variável 'num2'.
leia(num2)

escreva("Digite mais um valor: ")   //E um último número que será gravado na variável 'num3'.
leia(num3)
          /////Nesta linha estão as condições para que o programa comparar os três números e ver qual é o maior e informar para o usuário.

          se num1 > num2 entao
          se num1 > num3 entao
             escreva("O maior valor é: ",num1)

             fimse
             fimse
           se num2 > num3 entao
           se num2 > num1 entao
             escreva("O maior valor é: ",num2)
           fimse
           fimse
             se num3 > num2 entao
             se num3 > num1 entao
             escreva("O maior valor é: ",num3)
            fimse
            fimse
           
fimalgoritmo
