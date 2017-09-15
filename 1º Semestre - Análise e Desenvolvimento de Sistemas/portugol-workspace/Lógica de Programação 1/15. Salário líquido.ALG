algoritmo "João Pescador"

// Autor : Gabriel Ripardo de Sena
// Data : 31/03/2016
// Seção de Declarações

Var
valorhora         :REAL
horastrabalhadas  :REAL
ir    :REAL
inss  :REAL
sindic:REAL
sl    :REAL
media: REAL
Inicio
escreva ("digite o valor da hora: ")
leia(valorhora)
escreva ("digite horas trabalhadas: ")
leia(horastrabalhadas)

media <- (valorhora*horastrabalhadas)
sl <- media-ir-inss-sindic
sindic <- media/100*5
inss <- media/100*8
ir <- media/100*11

      escreval ( "salario bruto R$" , media)
      escreval (ir , " reais descontado de imposto de renda ")
      escreval (inss , " reais descontado de inss ")
      escreval (sindic , " reias descontado de sindicato ")
      escreval (sl , " reais seu salario liquido ")

Fimalgoritmo
