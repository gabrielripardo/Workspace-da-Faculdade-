algoritmo "Valor v�lido ou inv�lido"
// Fun��o :
// Autor :  Gabriel  Ripardo de Sena
// Data : 04/04/2016
// Se��o de Declara��es
var
num : REAL
num1 :REAL
inicio
// Se��o de Comandos
escreva("Digite um n�mero abaixo ou igual a 10: ")
leia(num)

se num <=10 entao
   escreval
   escreval("O valor � V�lido")
senao
   repita
      escreval
      escreval("O valor � Inv�lido")
      escreva("Digite novamente: ")
      leia(num1)
   ate num1 <=10

   se num1 <= 10 entao
      escreval
      escreval("O valor � Valido")
   fimse
fimse


fimalgoritmo


