algoritmo "N�meros em ordem e sua soma"
// Fun��o : Preencher com n�meros os dois n�meros que foi informado pelo
//          usu�rio. Completando at� chega no maior n�meros informado pelo usupario
//          e no final gera o toal da soma desses n�meros
// Autor : Gabriel Ripardo de Sena
// Data : 06/04/2016
// Se��o de Declara��es
var
num1 : INTEIRO
num2 : INTEIRO
num : INTEIRO
vv : INTEIRO
vv2 : INTEIRO
inicio
// Se��o de Comandos
escreva("Digite um n�mero inteiro: ") //7000
leia(num1)
escreva("Digite outro n�mero inteiro: ") //8000
leia(num2)

vv <- 0
      se num1 < num2 entao
      repita
      vv <- vv + 1
      vv2 <- vv + num1
      escreval(vv2)
      ate vv2 = num2

      senao
      repita
      vv <- vv + 1
      vv2 <- vv + num2
      escreval(vv2)
      ate vv2 = num1

      fimse

      se num1 < num2 entao
      escreva("De", num1, " at�", num2, " a soma dos n�meros entre esses intervalos � igual a:", num2 - num1)
fimse
     se num1 > num2 entao
      escreva("De", num2, " at�", num1, " a soma dos n�meros entre esses intervalos � igual a:", num1 - num2)
fimse
fimalgoritmo
