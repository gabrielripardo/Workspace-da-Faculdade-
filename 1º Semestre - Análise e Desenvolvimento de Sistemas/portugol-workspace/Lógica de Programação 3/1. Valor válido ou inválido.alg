algoritmo "Valor válido ou inválido"
// Função :
// Autor :  Gabriel  Ripardo de Sena
// Data : 04/04/2016
// Seção de Declarações
var
num : REAL
num1 :REAL
inicio
// Seção de Comandos
escreva("Digite um número abaixo ou igual a 10: ")
leia(num)

se num <=10 entao
   escreval
   escreval("O valor é Válido")
senao
   repita
      escreval
      escreval("O valor é Inválido")
      escreva("Digite novamente: ")
      leia(num1)
   ate num1 <=10

   se num1 <= 10 entao
      escreval
      escreval("O valor é Valido")
   fimse
fimse


fimalgoritmo


