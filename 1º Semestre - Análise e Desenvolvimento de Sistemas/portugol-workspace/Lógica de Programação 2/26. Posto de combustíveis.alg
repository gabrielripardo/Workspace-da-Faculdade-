algoritmo "Posto de combustíveis"
// Função : Calcular o total de litros com descontos ou sem descontos de combustíveis.
// Autor :  Gabriel Ripardo de Sena
// Data : 03/04/2016
// Seção de Declarações 
var
gas : REAL
alc : REAL
comb : CARACTERE
ltrs: REAL

inicio
// Seção de Comandos 
escreval("                           <<<<<< POSTO >>>>>>>>   ")
escreval("                            Ácool:     Gasolina    ")
escreval("                            1,90       2,50        ")
escreval
escreval("Informe qual o combustível que você irá colocar, 'a' para ácool ou 'g' para gasolina")
escreva("Digite o combustível: ")
leia(comb)
escreva("Digite a quantos litros: ")
leia(ltrs)

gas <- ltrs * 2.50
alc <- ltrs * 1.90

          se comb = "g" entao
          se ltrs > 20 entao
          escreva("Total a pagar: R$",gas - (gas*0.20))
          fimse
          fimse
          
          se comb = "g" entao
          se ltrs <= 20 entao
          escreva("Total a pagar: R$",gas - (gas*0.04))
          fimse
          fimse
          
          se comb = "a" entao
          se ltrs > 20 entao
          escreva("Total a pagar: R$",alc - (alc*0.05))
          fimse
          fimse
          
          se comb = "a" entao
          se ltrs <= 20 entao
          escreva("Total a pagar: R$",alc - (alc*0.04))
          fimse
          fimse
          

fimalgoritmo
