algoritmo "O maior n�mero"

// Fun��o : Informar qual � o n�mero maior
// Autor : GABRIEL RIPARDO DE SENA
// Data : 28/03/2016
// Se��o de Declara��es

var
num1 : REAL
num2 : REAL
num3 : REAL

inicio
escreva("Digite um valor: ")       //um valor ser� guardado na var�vel 'num1'.
leia(num1)

escreva("Digite outro valor: ")    //outro valor guardadar� o n�mero armazenado na vari�vel 'num2'.
leia(num2)

escreva("Digite mais um valor: ")   //E um �ltimo n�mero que ser� gravado na vari�vel 'num3'.
leia(num3)
          /////Nesta linha est�o as condi��es para que o programa comparar os tr�s n�meros e ver qual � o maior e informar para o usu�rio.

          se num1 > num2 entao
          se num1 > num3 entao
             escreva("O maior valor �: ",num1)

             fimse
             fimse
           se num2 > num3 entao
           se num2 > num1 entao
             escreva("O maior valor �: ",num2)
           fimse
           fimse
             se num3 > num2 entao
             se num3 > num1 entao
             escreva("O maior valor �: ",num3)
            fimse
            fimse
           
fimalgoritmo
