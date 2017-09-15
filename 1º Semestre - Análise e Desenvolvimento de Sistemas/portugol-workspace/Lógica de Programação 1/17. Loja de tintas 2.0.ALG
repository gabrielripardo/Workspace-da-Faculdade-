algoritmo "Loja de tintas 2.0"

// Autor : Gabriel Ripardo de Sena
// Data : 31/03/2016
// Seção de Declarações


Var

latas,   : INTEIRO
misturar : INTEIRO
misturar2: INTEIRO
m : REAL
galoes: REAL
inicio
escreval("      >>>>>>>>>   Loja de tintas 2.0   <<<<<<<")
escreva("            Digite o tamanho da área: ")
leia(metros)

latas <- int (metros/6/18)
galoes <- int (metros/6/3.6)
misturar <- int (metros/6/18*80/6/3.6*25)
misturar2 <- int (misturar/100*10)


          escreval("Serão compradas ",latas," de tintas" )

          escreval("O valor a ser pago é R$: " , latas*80)

          escreval("Serão comprada ",galoes," de tintas")

          escreval("O preço do galão pela quantidade pedida R$: " , galoes*25)

          escreval("Preço da lata e do galão com preço menor R$: ", misturar-misturar2)

fimalgoritmo
