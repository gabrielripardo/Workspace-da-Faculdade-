algoritmo "Loja de tintas 2.0"

// Autor : Gabriel Ripardo de Sena
// Data : 31/03/2016
// Se��o de Declara��es


Var

latas,   : INTEIRO
misturar : INTEIRO
misturar2: INTEIRO
m : REAL
galoes: REAL
inicio
escreval("      >>>>>>>>>   Loja de tintas 2.0   <<<<<<<")
escreva("            Digite o tamanho da �rea: ")
leia(metros)

latas <- int (metros/6/18)
galoes <- int (metros/6/3.6)
misturar <- int (metros/6/18*80/6/3.6*25)
misturar2 <- int (misturar/100*10)


          escreval("Ser�o compradas ",latas," de tintas" )

          escreval("O valor a ser pago � R$: " , latas*80)

          escreval("Ser�o comprada ",galoes," de tintas")

          escreval("O pre�o do gal�o pela quantidade pedida R$: " , galoes*25)

          escreval("Pre�o da lata e do gal�o com pre�o menor R$: ", misturar-misturar2)

fimalgoritmo
