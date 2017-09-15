algoritmo "Salário líquido"
// Função :  Informar o salário após ser descontado pelos impostos
// Autor : Gabriel Ripardo de Sena
// Data : 02/04/2016
// Seção de Declarações 
var
hrs : REAL
qtdmes: REAL
sal : REAL
salliquid : REAL
fgts : REAL

inicio
escreva("Digite o valor da hora: ")
leia(hrs)

escreva("Digite o total de horas trabalhadas por mês: ")
leia(qtdmes)

sal <- hrs * qtdmes // o valor da horas em reais trabalhada multiplicada pelas horas trabalhada, isso vai dar o total do salário bruto
fgts <- sal * 0.10

     se sal <= 900 entao                                              ///// Como o salário foi baixo, não é descontado quase nada
     escreval
     escreval("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
     escreval("| Salário Bruto:                     : R$",sal)
     escreval("| (-) IR (insento)                   : R$ 0,00)
     escreval("| (-) INSS (10%)                     : R$",sal * 0.10)
     escreval("| FGTS (11%)                         : R$",sal * 0.11)
     escreval("| Total de descontos                 : R$",sal*0.10)
     escreval("| Salário Líquido                    : R$",sal - sal*0.10)
     escreval("---------------------------------------------------")

     senao
     se sal <= 1500 entao
     escreval                                                        /////Vai ser descontado 5 por cento do imposto de renda
     escreval("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
     escreval("| Salário Bruto:                     : R$",sal)
     escreval("| (-) IR (5%)                        : R$",sal*0.05)
     escreval("| (-) INSS (10%)                     : R$",sal * 0.10)
     escreval("| FGTS (11%)                         : R$",sal * 0.11)
     escreval("| Total de descontos                 : R$",(sal*0.10)+(sal*0.05))
     escreval("| Salário Líquido                    : R$",sal - ((sal*0.10) + (sal*0.05)))
     escreval("---------------------------------------------------")

     senao
     se sal <= 2500 entao
      escreval
     escreval("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
     escreval("| Salário Bruto:                     : R$",sal)
     escreval("| (-) IR (10%)                       : R$",sal*0.10)
     escreval("| (-) INSS (10%)                     : R$",sal * 0.10)
     escreval("| FGTS (11%)                         : R$",sal * 0.11)
     escreval("| Total de descontos                 : R$",(sal*0.10)+(sal*0.10))
     escreval("| Salário Líquido                    : R$",sal - ((sal*0.10) + (sal*0.10)))
     escreval("---------------------------------------------------")
     
     senao

     se sal > 2500 entao
      escreval
     escreval("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
     escreval("| Salário Bruto:                     : R$",sal)
     escreval("| (-) IR (20%)                       : R$",sal*0.20)
     escreval("| (-) INSS (10%)                     : R$",sal * 0.10)
     escreval("| FGTS (11%)                         : R$",sal * 0.11)
     escreval("| Total de descontos                 : R$",(sal*0.10) + (sal*0.20) )
     escreval("| Salário Líquido                    : R$",sal - ((sal*0.10) + (sal*0.20)))
     escreval("---------------------------------------------------")

     senao
     escreva("String não encontrada!")   /////Nessa string o programa fecha normal e não trava, caso o usuário forneça os valores incorretos.
fimse
fimse
fimse
fimse

fimalgoritmo
