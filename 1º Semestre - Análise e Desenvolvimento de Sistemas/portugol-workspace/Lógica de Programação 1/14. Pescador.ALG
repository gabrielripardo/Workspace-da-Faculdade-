algoritmo "João Pescador"
// Função :   Declarar se o peso informado execede ou não o limite de pesca.
// Autor :    Gabriel Ripardo de Sena
// Data : 31/03/2016
// Seção de Declarações

Var
fish : REAL
limite : REAL

Inicio
escreva ("Digite o peso da pescaria Kg: ")
leia(fish)

limite <- 4*(fish-50)

          se (fish <=50) entao
             escreva ("O peso está de dentro do limite de pesca")
          senao
          se (fish>50) entao
             escreval("O limite foi ultrapassado, irá pagar R$", limite)
fimse
fimse
Fimalgoritmo
