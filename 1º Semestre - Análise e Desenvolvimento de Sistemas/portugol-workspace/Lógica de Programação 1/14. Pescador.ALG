algoritmo "Jo�o Pescador"
// Fun��o :   Declarar se o peso informado execede ou n�o o limite de pesca.
// Autor :    Gabriel Ripardo de Sena
// Data : 31/03/2016
// Se��o de Declara��es

Var
fish : REAL
limite : REAL

Inicio
escreva ("Digite o peso da pescaria Kg: ")
leia(fish)

limite <- 4*(fish-50)

          se (fish <=50) entao
             escreva ("O peso est� de dentro do limite de pesca")
          senao
          se (fish>50) entao
             escreval("O limite foi ultrapassado, ir� pagar R$", limite)
fimse
fimse
Fimalgoritmo
