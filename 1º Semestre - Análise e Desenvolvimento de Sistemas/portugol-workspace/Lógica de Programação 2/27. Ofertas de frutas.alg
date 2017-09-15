algoritmo "Ofertas da Fruteira"
// Função : Dar o valor total de compras com desconto ou sem desconto
// Autor : GABRIEL RIPADO DE SENA
// Data : 03/04/2016
// Seção de Declarações 
var
tlfruit : REAL
apple : REAL
   apple1 : REAL
   apple2 : REAL
morang: REAL
   morang1 : REAL
   morang2 : REAL

inicio
// Seção de Comandos 
escreval("......................Ofertas da Frutieira.........................")
escreval("                                  Até 5 Kg           Acima de 5 Kg ")
escreval("             Morango         R$ 2,50 por Kg          R$ 2,20 por Kg")
escreval("             Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg")

escreval
escreva("Escreva a quantidade de Morangos: ")
leia(morang)
escreva("Escreva a quantidade de Maçães: ")
leia(apple)

morang1 <- morang * 2.50
morang2 <- morang * 2.20

apple1 <- apple * 1.80
apple2 <- apple * 1.50

tlfruit <- apple + morang

     ////////MORANDO + MAÇA -- BARATO
        se morang <= 5 entao
        se apple <= 5 entao
        se tlfruit > 8 entao
            escreval("Você recebeu 10% de desconto: R$",(morang1+apple1) * 0.10))
            escreval("O valor total da compra foi: R$",((morang1+morang2)-(morang1+apple1) * 0.10))
     senao
           escreval("Você recebeu 0% de desconto")
           escreval("O valor total da compra foi: R$",morang1+apple2)
     fimse
     fimse
     fimse

     ////////MORANGO + MAÇA -- CARO
        se morang > 5 entao
        se apple > 5 entao
        se tlfruit > 8 entao
            escreval("Você recebeu 10% de desconto: R$",((morang2+apple2) * 0.10))
            escreval("O valor total da compra foi: R$",(morang2+apple2)-((morang2+apple2) * 0.10))
     senao
           escreval("Você recebeu 0% de desconto")
           escreval("O valor total da compra foi: R$",(morang1+apple1))
     fimse
     fimse
     fimse

                   //////// BARATO /////
     ////////MORANGO
         se morang < 5 entao
         se apple = 0 entao
            escreval("Você recebeu 0 % de desconto")
            escreval("O valor total da compra foi: R$",morang1)
         fimse
         fimse
     ////////APPLE
          se morang = 0 entao
          se apple < 5 entao
            escreval("Você recebeu 0 % de desconto")
            escreval("O valor total da compra foi: R$",apple1)
          fimse
          fimse
                  //////// CARO ////////
     ////////MORANGO
          se morang > 5 entao
          se apple <= 0 entao
             escreval("Você recebeu 10% de deconto: R$",morang2 * 0.10)
             escreval("O valor total da compra foi: R$",morang2 - (morang2 * 0.10))
          fimse
          fimse
     ////////APPLE
          se apple > 5 entao
          se morang <= 0 entao
             escreval("Você recebeu 10% de deconto: R$",apple2 * 0.10)
             escreval("O valor total da compra foi: R$",apple2 - (apple2 * 0.10))
           fimse
           fimse
             
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar
//R$ 25,00, receberá ainda um desconto de 10% sobre este total.
//Escreva um algoritmo para ler a quantidade (em Kg) de morangos
//e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.


fimalgoritmo
