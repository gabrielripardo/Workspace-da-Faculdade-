algoritmo "Números em ordem e sua soma"
// Função : Preencher com números os dois números que foi informado pelo
//          usuário. Completando até chega no maior números informado pelo usupario
//          e no final gera o toal da soma desses números
// Autor : Gabriel Ripardo de Sena
// Data : 06/04/2016
// Seção de Declarações
var
num1 : INTEIRO
num2 : INTEIRO
num : INTEIRO
vv : INTEIRO
vv2 : INTEIRO
inicio
// Seção de Comandos
escreva("Digite um número inteiro: ") //7000
leia(num1)
escreva("Digite outro número inteiro: ") //8000
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
      escreva("De", num1, " até", num2, " a soma dos números entre esses intervalos é igual a:", num2 - num1)
fimse
     se num1 > num2 entao
      escreva("De", num2, " até", num1, " a soma dos números entre esses intervalos é igual a:", num1 - num2)
fimse
fimalgoritmo
