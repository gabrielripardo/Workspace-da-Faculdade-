algoritmo "Peso 2.0"
// Fun��o :   Declarar qual � o peso ideal de uma pessoa
// Autor :    Gabriel Ripardo de Sena
// Data : 31/03/2016
// Se��o de Declara��es 
var
sexo : CARACTERE
altura : REAL
homem: REAL
mulher: REAL
peso: REAL

inicio
// Se��o de Comandos
escreva("Digite o Sexo: ")
leia(sexo)

escreva("Digite a altura: ")
leia(altura)


            homem <- (72.7*altura) - 58
            mulher <-  (62.1*altura) - 44.7

            escolha sexo
            caso "h", "homem", "Homem", "H", "H-Homem
            escreva("Seu peso ideal �:", homem)


            outrocaso
            caso "m", "mulher", "Mulher", "M", "M-Mulher"
            escreva("Seu peso ideal �:", mulher)


fimescolha

escreval
escreval("Qual � o seu peso? ")
leia(peso)

             se homem entao
             escreva("Voc� est� abaixo do peso")
             
             se homem entao
             escreva("Voc� est� abaixo do peso")
             
             se homem entao
             escreva("Voc� est� abaixo do peso")


             senao
             escreva("String n�o indentificada!")

///////////////////////////////////////////////////////////////////

             caso "mulher"
             se peso < mulher entao
             escreva("Voc� est� abaixo do peso")

             senao
             se peso > mulher entao
             escreva("Voc� est� acima do peso")

             senao
             se peso = mulher entao
             escreva("Voc� est� dentro do peso")

             senao
             escreva("String n�o indentificada!")




          fimse
          fimse
          fimse
          fimse
          fimse
          fimse
fimescolha

fimalgoritmo
