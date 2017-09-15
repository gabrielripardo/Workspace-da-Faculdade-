algoritmo "Lanchonete"
// Função :
// Autor : Gabriel Ripardo de Sena
// Data : 08/04/2016
// Seção de Declarações 
var
code : INTEIRO
qtd : INTEIRO
decs : CARACTERE
decs1 : INTEIRO
num : INTEIRO
valor : REAL
total : REAL
total2 : REAL
inicio
// Seção de Comandos 
escreval(">>>>>>>>>>Lanchonete<<<<<<<<<<<")
escreval("Especificação:  Código: Preço:")
escreval("Cachorro Quente 100     R$ 1,20")
escreval("Bauru Simples   101     R$ 1.30")
escreval("Bauru com ovo   102     R$ 1.50")
escreval("Hambúrguer      103     R$ 1.20")
escreval("Cheeseburguer   104     R$ 1.30")
escreval("Refrigerante    105     R$ 1.00")
repita
escreval
escreva("Digite o código: ")
leia(code)

escreva("Digite a quantidade: ")
leia(qtd)


      se code = 100 entao
        valor <- 1.20
      fimse

      se code = 101 entao
        valor <- 1.30
      fimse
      
      se code = 102 entao
        valor <- 1.50
      fimse
      
      se code = 103 entao
        valor <- 1.20
      fimse
      
      se code = 104 entao
        valor <- 1.30
      fimse
      
      se code = 105 entao
        valor <- 1.00
      fimse
           total <- valor * qtd
           escreval("Valor = R$",valor)
           escreval("Total = R$", total + total2)
escreva("Deseja encerrar o pedido? S ou N: ")
leia(decs)
             se decs <> "s" entao
             se decs <> "n" entao
                decs1 <- 1
             fimse
             fimse
             total2 <- total2 + total
ate decs1 = 1
fimalgoritmo
