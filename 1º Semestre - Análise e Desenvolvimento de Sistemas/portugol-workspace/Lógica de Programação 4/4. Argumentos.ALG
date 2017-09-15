algoritmo "Valor válido ou inválido"
// Função :
// Autor :  Gabriel Ripardo de Sena
// Data : 22/04/2016
// Seção de Declarações

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
   escreval("Se for P é positivo se for N é negativo: ")
   escreval
   escreva("Digite um número: ")
   leia(numero)
   descricao<-PouN(numero)
   escreva("Resultado: ",descricao)
fimalgoritmo
