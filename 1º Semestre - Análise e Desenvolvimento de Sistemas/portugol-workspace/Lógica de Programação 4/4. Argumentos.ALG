algoritmo "Valor v�lido ou inv�lido"
// Fun��o :
// Autor :  Gabriel Ripardo de Sena
// Data : 22/04/2016
// Se��o de Declara��es

var
   numero: inteiro
   descricao:caractere
   funcao PouN(A:inteiro): caractere
   inicio
         se (A<0) entao
            retorne "N"
         senao
            retorne "P"
         fimse
   fimfuncao
inicio
   escreval("Se for P � positivo se for N � negativo: ")
   escreval
   escreva("Digite um n�mero: ")
   leia(numero)
   descricao<-PouN(numero)
   escreva("Resultado: ",descricao)
fimalgoritmo
