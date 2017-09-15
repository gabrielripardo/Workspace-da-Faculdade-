algoritmo "Peso 2.0"
// Função :   Declarar qual é o peso ideal de uma pessoa
// Autor :    Gabriel Ripardo de Sena
// Data : 31/03/2016
// Seção de Declarações 
var
sexo : CARACTERE
altura : REAL
homem: REAL
mulher: REAL
peso: REAL

inicio
// Seção de Comandos
escreva("Digite o Sexo: ")
leia(sexo)

escreva("Digite a altura: ")
leia(altura)


            homem <- (72.7*altura) - 58
            mulher <-  (62.1*altura) - 44.7

            escolha sexo
            caso "h", "homem", "Homem", "H", "H-Homem
            escreva("Seu peso ideal é:", homem)


            outrocaso
            caso "m", "mulher", "Mulher", "M", "M-Mulher"
            escreva("Seu peso ideal é:", mulher)


fimescolha

escreval
escreval("Qual é o seu peso? ")
leia(peso)

             se homem entao
             escreva("Você está abaixo do peso")
             
             se homem entao
             escreva("Você está abaixo do peso")
             
             se homem entao
             escreva("Você está abaixo do peso")


             senao
             escreva("String não indentificada!")

///////////////////////////////////////////////////////////////////

             caso "mulher"
             se peso < mulher entao
             escreva("Você está abaixo do peso")

             senao
             se peso > mulher entao
             escreva("Você está acima do peso")

             senao
             se peso = mulher entao
             escreva("Você está dentro do peso")

             senao
             escreva("String não indentificada!")




          fimse
          fimse
          fimse
          fimse
          fimse
          fimse
fimescolha

fimalgoritmo
